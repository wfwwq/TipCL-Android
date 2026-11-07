/* hostcheck_main.c — host 上验证 glfw_stub 纯逻辑（无 EGL/JNI/Android）。
 *
 * 覆盖 M2 风险项的可 host 验证部分：
 *  1. 事件队列 push/pop、光标事件合并语义（队尾连续光标只留最新，与点击保序）
 *  2. 溢出丢最旧策略
 *  3. 窗口槽位回收复用（destroy 后 create 复用槽位，句柄仍有效）
 *  4. GLFW_CURSOR 状态机：DISABLED 差分累积 / 退出对齐 / 首帧校准
 *  5. 回调旧值返回语义（C 层）
 * 编译：build_host.bat（见同目录）
 */
#include "../glfw_stub.h"

#include <stdio.h>
#include <string.h>

static int g_failures = 0;

#define CHECK(cond, msg) do { \
    if (cond) { printf("  PASS: %s\n", msg); } \
    else { printf("  FAIL: %s\n", msg); g_failures++; } \
} while (0)

/* 记录回调轨迹 */
#define TRACE_MAX 64
static char g_trace[TRACE_MAX][32];
static int g_trace_n = 0;
static void trace_reset(void) { g_trace_n = 0; }
static void trace_push(const char* tag) {
    if (g_trace_n < TRACE_MAX) snprintf(g_trace[g_trace_n++], 32, "%s", tag);
}
static int trace_count(const char* tag) {
    int n = 0;
    for (int i = 0; i < g_trace_n; i++)
        if (strcmp(g_trace[i], tag) == 0) n++;
    return n;
}

static void on_key(void* w, int key, int sc, int action, int mods) {
    (void)w; (void)sc; (void)mods;
    char buf[32];
    snprintf(buf, sizeof(buf), "key:%d:%d", key, action);
    trace_push(buf);
}
static void on_cursor(void* w, double x, double y) {
    (void)w;
    char buf[32];
    snprintf(buf, sizeof(buf), "cur:%.0f,%.0f", x, y);
    trace_push(buf);
}
static void on_mouse(void* w, int button, int action, int mods) {
    (void)w; (void)mods;
    char buf[32];
    snprintf(buf, sizeof(buf), "mb:%d:%d", button, action);
    trace_push(buf);
}
static void on_error(int code, const char* msg) {
    (void)code; (void)msg;
    trace_push("err");
}

static void push_move(double x, double y) {
    glfw_stub_event ev; memset(&ev, 0, sizeof(ev));
    ev.type = GLFW_STUB_EVENT_CURSOR_POS; ev.d0 = x; ev.d1 = y;
    glfw_stub_push_event(&ev);
}
static void push_click(int button, int action) {
    glfw_stub_event ev; memset(&ev, 0, sizeof(ev));
    ev.type = GLFW_STUB_EVENT_MOUSE_BUTTON; ev.i0 = button; ev.i1 = action;
    glfw_stub_push_event(&ev);
}
static void push_key(int key, int action) {
    glfw_stub_event ev; memset(&ev, 0, sizeof(ev));
    ev.type = GLFW_STUB_EVENT_KEY; ev.i0 = key; ev.i2 = action;
    glfw_stub_push_event(&ev);
}

static void test_cursor_merge(void) {
    printf("[test] cursor event coalescing\n");
    glfw_stub_reset();
    void* win = glfwCreateWindow(100, 100, "t", NULL, NULL);
    glfwSetCursorPosCallback(win, on_cursor);
    glfwSetMouseButtonCallback(win, on_mouse);
    glfwSetKeyCallback(win, on_key);

    trace_reset();
    push_move(1, 1);
    push_move(2, 2);
    push_move(3, 3);
    push_click(0, GLFW_PRESS);
    push_move(4, 4);
    push_move(5, 5);
    push_key(32, GLFW_PRESS);
    glfwPollEvents();

    /* 合并后队列：move(3,3), click, move(5,5), key —— 顺序保持，move 各只留一个 */
    CHECK(g_trace_n == 4, "queue collapsed to 4 events");
    CHECK(strcmp(g_trace[0], "cur:3,3") == 0, "first move merged to latest (3,3)");
    CHECK(strcmp(g_trace[1], "mb:0:1") == 0, "click keeps order after preceding move");
    CHECK(strcmp(g_trace[2], "cur:5,5") == 0, "trailing move merged to (5,5)");
    CHECK(strcmp(g_trace[3], "key:32:1") == 0, "key event intact after moves");

    /* 单独连续 move 全合并 */
    trace_reset();
    push_move(10, 10); push_move(11, 11); push_move(12, 12);
    glfwPollEvents();
    CHECK(g_trace_n == 1 && strcmp(g_trace[0], "cur:12,12") == 0,
          "3 consecutive moves coalesce to last only");
    glfwDestroyWindow(win);
}

static void test_queue_overflow(void) {
    printf("[test] queue overflow drops oldest\n");
    glfw_stub_reset();
    glfwSetErrorCallback(on_error);
    /* 环形容量 512-1=511：塞 600 个 key 事件，最旧的被丢弃 */
    for (int i = 0; i < 600; i++) push_key(32 + (i % 8), GLFW_PRESS);
    int popped = 0;
    glfw_stub_event ev;
    while (glfw_stub_pop_event(&ev)) popped++;
    CHECK(popped == 511, "overflow keeps newest 511 events (ring capacity)");
    glfwSetErrorCallback(NULL);
    glfw_stub_reset();
}

static void test_slot_recycle(void) {
    printf("[test] window slot recycling\n");
    glfw_stub_reset();
    void* w1 = glfwCreateWindow(64, 64, "a", NULL, NULL);
    void* w2 = glfwCreateWindow(64, 64, "b", NULL, NULL);
    void* w3 = glfwCreateWindow(64, 64, "c", NULL, NULL);
    void* w4 = glfwCreateWindow(64, 64, "d", NULL, NULL);
    CHECK(w1 && w2 && w3 && w4, "4 windows created");
    CHECK(glfw_stub_window_count() == 4, "window count == 4");

    void* w5 = glfwCreateWindow(64, 64, "e", NULL, NULL);
    CHECK(w5 == NULL, "5th window rejected (limit)");

    glfwDestroyWindow(w2);
    CHECK(glfw_stub_window_count() == 3, "count drops after destroy");
    void* w6 = glfwCreateWindow(64, 64, "f", NULL, NULL);
    CHECK(w6 != NULL, "slot reused after destroy");
    CHECK((uintptr_t)w6 == (uintptr_t)w2, "reused handle equals freed slot handle");

    /* 旧句柄 w2 已失效：shouldClose 对失效句柄安全返回 FALSE */
    CHECK(glfwWindowShouldClose(w2) == GLFW_FALSE, "stale handle reads safely");

    glfwSetWindowShouldClose(w6, GLFW_TRUE);
    CHECK(glfwWindowShouldClose(w6) == GLFW_TRUE, "reused window state is independent");
    glfw_stub_reset();
}

static void test_cursor_disabled_mode(void) {
    printf("[test] GLFW_CURSOR_DISABLED state machine\n");
    glfw_stub_reset();
    void* win = glfwCreateWindow(100, 100, "t", NULL, NULL);
    glfwSetCursorPosCallback(win, on_cursor);

    /* NORMAL：绝对坐标直通 */
    push_move(50, 60);
    glfwPollEvents();
    double x = 0, y = 0;
    glfwGetCursorPos(win, &x, &y);
    CHECK(x == 50.0 && y == 60.0, "NORMAL mode reports absolute coords");

    /* 进入捕获：首事件为校准帧，不上报跳变 */
    glfwSetInputMode(win, GLFW_CURSOR, GLFW_CURSOR_DISABLED);
    CHECK(glfwGetInputMode(win, GLFW_CURSOR) == GLFW_CURSOR_DISABLED, "mode set to DISABLED");
    trace_reset();
    push_move(500, 400);   /* 校准帧：跳变不触发回调 */
    glfwPollEvents();
    CHECK(g_trace_n == 0, "first event after capture is calibration (no callback)");

    /* 之后上报差分累积：基准 virt=(50,60)，Δ=(+5,-5)x2 → (60,50) */
    push_move(505, 395);
    push_move(510, 390);
    glfwPollEvents();
    glfwGetCursorPos(win, &x, &y);
    CHECK(x == 60.0 && y == 50.0, "disabled mode accumulates deltas (50+5+5, 60-5-5)");
    CHECK(trace_count("cur:60,50") == 1, "cursor callback reports accumulated pos");

    /* raw motion 标志可设置读取 */
    glfwSetInputMode(win, GLFW_RAW_MOUSE_MOTION, GLFW_TRUE);
    CHECK(glfwGetInputMode(win, GLFW_RAW_MOUSE_MOTION) == GLFW_TRUE, "raw motion flag set");

    /* 退出捕获：坐标对齐回绝对值 */
    glfwSetInputMode(win, GLFW_CURSOR, GLFW_CURSOR_NORMAL);
    push_move(200, 200);
    glfwPollEvents();
    glfwGetCursorPos(win, &x, &y);
    CHECK(x == 200.0 && y == 200.0, "NORMAL mode re-aligns to absolute coords");
    CHECK(glfwGetInputMode(win, GLFW_CURSOR) == GLFW_CURSOR_NORMAL, "mode back to NORMAL");
    glfwDestroyWindow(win);
}

static void test_callback_return_semantics(void) {
    printf("[test] C-level callback old-value return\n");
    glfw_stub_reset();
    void* win = glfwCreateWindow(100, 100, "t", NULL, NULL);
    GLFWkeyfun old1 = glfwSetKeyCallback(win, on_key);
    CHECK(old1 == NULL, "first set returns NULL");
    GLFWkeyfun old2 = glfwSetKeyCallback(win, NULL);
    CHECK(old2 == on_key, "second set returns previous callback");
    GLFWkeyfun old3 = glfwSetKeyCallback(win, on_key);
    CHECK(old3 == NULL, "clearing returns NULL");
    glfwDestroyWindow(win);
}

static void test_proc_address_hook(void) {
    printf("[test] glfwGetProcAddress platform hook\n");
    glfw_stub_reset();
    /* host 上无 EGL：未注入钩子时返回 NULL（安全默认），不崩溃 */
    CHECK(glfwGetProcAddress("glClear") == NULL, "no hook -> NULL, no crash");
    CHECK(glfwGetProcAddress(NULL) == NULL, "NULL name -> NULL");
}

int main(void) {
    printf("TipCL core-runtime hostcheck (glfw_stub pure logic)\n");
    printf("===================================================\n");
    test_cursor_merge();
    test_queue_overflow();
    test_slot_recycle();
    test_cursor_disabled_mode();
    test_callback_return_semantics();
    test_proc_address_hook();
    printf("===================================================\n");
    if (g_failures == 0) {
        printf("RESULT: ALL TESTS PASSED\n");
        return 0;
    }
    printf("RESULT: %d FAILURE(S)\n", g_failures);
    return 1;
}
