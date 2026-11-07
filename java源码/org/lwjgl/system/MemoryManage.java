package org.lwjgl.system;

import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.commons.lang3.StringUtils;
import org.lwjgl.system.Callback;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.libc.LibCStdlib;
import org.lwjgl.system.libffi.FFICIF;
import org.lwjgl.system.libffi.LibFFI;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/MemoryManage.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/MemoryManage.class */
final class MemoryManage {
    private MemoryManage() {
    }

    static MemoryUtil.MemoryAllocator getInstance() {
        String className;
        Object allocator = Configuration.MEMORY_ALLOCATOR.get();
        if (allocator instanceof MemoryUtil.MemoryAllocator) {
            return (MemoryUtil.MemoryAllocator) allocator;
        }
        if (!"system".equals(allocator)) {
            if (allocator == null || "jemalloc".equals(allocator)) {
                className = "org.lwjgl.system.jemalloc.JEmallocAllocator";
            } else if ("rpmalloc".equals(allocator)) {
                className = "org.lwjgl.system.rpmalloc.RPmallocAllocator";
            } else {
                className = allocator.toString();
            }
            try {
                Class<?> allocatorClass = Class.forName(className);
                return (MemoryUtil.MemoryAllocator) allocatorClass.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable t) {
                if (Checks.DEBUG && (allocator != null || !(t instanceof ClassNotFoundException))) {
                    t.printStackTrace(APIUtil.DEBUG_STREAM);
                }
                APIUtil.apiLog(String.format("Warning: Failed to instantiate memory allocator: %s. Using the system default.", className));
            }
        }
        return new StdlibAllocator();
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/MemoryManage$StdlibAllocator.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/MemoryManage$StdlibAllocator.class */
    private static class StdlibAllocator implements MemoryUtil.MemoryAllocator {
        private StdlibAllocator() {
        }

        @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
        public long getMalloc() {
            return MemoryAccessJNI.malloc;
        }

        @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
        public long getCalloc() {
            return MemoryAccessJNI.calloc;
        }

        @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
        public long getRealloc() {
            return MemoryAccessJNI.realloc;
        }

        @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
        public long getFree() {
            return MemoryAccessJNI.free;
        }

        @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
        public long getAlignedAlloc() {
            return MemoryAccessJNI.aligned_alloc;
        }

        @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
        public long getAlignedFree() {
            return MemoryAccessJNI.aligned_free;
        }

        @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
        public long malloc(long size) {
            return LibCStdlib.nmalloc(size);
        }

        @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
        public long calloc(long num, long size) {
            return LibCStdlib.ncalloc(num, size);
        }

        @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
        public long realloc(long ptr, long size) {
            return LibCStdlib.nrealloc(ptr, size);
        }

        @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
        public void free(long ptr) {
            LibCStdlib.nfree(ptr);
        }

        @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
        public long aligned_alloc(long alignment, long size) {
            return LibCStdlib.naligned_alloc(alignment, size);
        }

        @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
        public void aligned_free(long ptr) {
            LibCStdlib.naligned_free(ptr);
        }
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/MemoryManage$DebugAllocator.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/MemoryManage$DebugAllocator.class */
    static class DebugAllocator implements MemoryUtil.MemoryAllocator {
        private static final ConcurrentMap<Allocation, Allocation> ALLOCATIONS = new ConcurrentHashMap();
        private static final ConcurrentMap<Long, String> THREADS = new ConcurrentHashMap();
        private final MemoryUtil.MemoryAllocator allocator;
        private final long[] callbacks;

        DebugAllocator(MemoryUtil.MemoryAllocator allocator) {
            this.allocator = allocator;
            CallbackPP callbackPP = this::malloc;
            CallbackPPP callbackPPP = this::calloc;
            CallbackPPP callbackPPP2 = this::realloc;
            CallbackIV callbackIV = this::free;
            CallbackPPP callbackPPP3 = this::aligned_alloc;
            CallbackIV callbackIV2 = this::aligned_free;
            this.callbacks = new long[]{callbackPP.address(), callbackPPP.address(), callbackPPP2.address(), callbackIV.address(), callbackPPP3.address(), callbackIV2.address()};
            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                long[] arr$ = this.callbacks;
                for (long callback : arr$) {
                    Callback.free(callback);
                }
                if (ALLOCATIONS.isEmpty()) {
                    return;
                }
                boolean missingStacktrace = false;
                for (Allocation allocation : ALLOCATIONS.keySet()) {
                    StringBuilder sb = new StringBuilder(512);
                    sb.append("[LWJGL] ").append(allocation.size).append(" bytes leaked, thread ").append(allocation.threadId).append(" (").append(THREADS.get(Long.valueOf(allocation.threadId))).append("), address: 0x").append(Long.toHexString(allocation.address).toUpperCase()).append(StringUtils.LF);
                    Object[] stackTrace = allocation.getElements();
                    if (stackTrace != null) {
                        for (Object el : stackTrace) {
                            sb.append("\tat ").append(el).append(StringUtils.LF);
                        }
                    } else {
                        missingStacktrace = true;
                    }
                    APIUtil.DEBUG_STREAM.print(sb);
                }
                if (missingStacktrace) {
                    APIUtil.DEBUG_STREAM.print("[LWJGL] Reminder: disable Configuration.DEBUG_MEMORY_ALLOCATOR_FAST to get stacktraces of leaking allocations.\n");
                }
            }));
        }

        /* renamed from: org.lwjgl.system.MemoryManage$DebugAllocator$1, reason: invalid class name */
        /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/MemoryManage$DebugAllocator$1.class */
        class AnonymousClass1 implements CallbackI {
            AnonymousClass1() {
            }

            public FFICIF getCallInterface() {
                return APIUtil.apiCreateCIF(LibFFI.FFI_DEFAULT_ABI, LibFFI.ffi_type_pointer, LibFFI.ffi_type_pointer);
            }

            @Override // org.lwjgl.system.CallbackI
            public void callback(long ret, long args) {
                long size = MemoryUtil.memGetAddress(MemoryUtil.memGetAddress(args));
                MemoryUtil.memPutAddress(ret, DebugAllocator.this.malloc(size));
            }
        }

        /* renamed from: org.lwjgl.system.MemoryManage$DebugAllocator$2, reason: invalid class name */
        /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/MemoryManage$DebugAllocator$2.class */
        class AnonymousClass2 implements CallbackI {
            AnonymousClass2() {
            }

            public FFICIF getCallInterface() {
                return APIUtil.apiCreateCIF(LibFFI.FFI_DEFAULT_ABI, LibFFI.ffi_type_pointer, LibFFI.ffi_type_pointer, LibFFI.ffi_type_pointer);
            }

            @Override // org.lwjgl.system.CallbackI
            public void callback(long ret, long args) {
                long num = MemoryUtil.memGetAddress(MemoryUtil.memGetAddress(args));
                long size = MemoryUtil.memGetAddress(MemoryUtil.memGetAddress(args + POINTER_SIZE));
                MemoryUtil.memPutAddress(ret, DebugAllocator.this.calloc(num, size));
            }
        }

        /* renamed from: org.lwjgl.system.MemoryManage$DebugAllocator$3, reason: invalid class name */
        /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/MemoryManage$DebugAllocator$3.class */
        class AnonymousClass3 implements CallbackI {
            AnonymousClass3() {
            }

            public FFICIF getCallInterface() {
                return APIUtil.apiCreateCIF(LibFFI.FFI_DEFAULT_ABI, LibFFI.ffi_type_pointer, LibFFI.ffi_type_pointer, LibFFI.ffi_type_pointer);
            }

            @Override // org.lwjgl.system.CallbackI
            public void callback(long ret, long args) {
                long ptr = MemoryUtil.memGetAddress(MemoryUtil.memGetAddress(args));
                long size = MemoryUtil.memGetAddress(MemoryUtil.memGetAddress(args + POINTER_SIZE));
                MemoryUtil.memPutAddress(ret, DebugAllocator.this.realloc(ptr, size));
            }
        }

        /* renamed from: org.lwjgl.system.MemoryManage$DebugAllocator$4, reason: invalid class name */
        /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/MemoryManage$DebugAllocator$4.class */
        class AnonymousClass4 implements CallbackI {
            AnonymousClass4() {
            }

            public FFICIF getCallInterface() {
                return APIUtil.apiCreateCIF(LibFFI.FFI_DEFAULT_ABI, LibFFI.ffi_type_void, LibFFI.ffi_type_pointer);
            }

            @Override // org.lwjgl.system.CallbackI
            public void callback(long ret, long args) {
                long ptr = MemoryUtil.memGetAddress(MemoryUtil.memGetAddress(args));
                DebugAllocator.this.free(ptr);
            }
        }

        /* renamed from: org.lwjgl.system.MemoryManage$DebugAllocator$5, reason: invalid class name */
        /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/MemoryManage$DebugAllocator$5.class */
        class AnonymousClass5 implements CallbackI {
            AnonymousClass5() {
            }

            public FFICIF getCallInterface() {
                return APIUtil.apiCreateCIF(LibFFI.FFI_DEFAULT_ABI, LibFFI.ffi_type_pointer, LibFFI.ffi_type_pointer, LibFFI.ffi_type_pointer);
            }

            @Override // org.lwjgl.system.CallbackI
            public void callback(long ret, long args) {
                long alignment = MemoryUtil.memGetAddress(MemoryUtil.memGetAddress(args));
                long size = MemoryUtil.memGetAddress(MemoryUtil.memGetAddress(args + POINTER_SIZE));
                MemoryUtil.memPutAddress(ret, DebugAllocator.this.aligned_alloc(alignment, size));
            }
        }

        /* renamed from: org.lwjgl.system.MemoryManage$DebugAllocator$6, reason: invalid class name */
        /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/MemoryManage$DebugAllocator$6.class */
        class AnonymousClass6 implements CallbackI {
            AnonymousClass6() {
            }

            public FFICIF getCallInterface() {
                return APIUtil.apiCreateCIF(LibFFI.FFI_DEFAULT_ABI, LibFFI.ffi_type_void, LibFFI.ffi_type_pointer);
            }

            @Override // org.lwjgl.system.CallbackI
            public void callback(long ret, long args) {
                long ptr = MemoryUtil.memGetAddress(MemoryUtil.memGetAddress(args));
                DebugAllocator.this.aligned_free(ptr);
            }
        }

        @FunctionalInterface
        /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/MemoryManage$DebugAllocator$CallbackPP.class */
        public interface CallbackPP extends CallbackI {
            public static final Callback.Descriptor DESCRIPTOR = new Callback.Descriptor(MethodHandles.lookup(), APIUtil.apiCreateCIF(LibFFI.ffi_type_pointer, LibFFI.ffi_type_pointer));

            long invoke(long j);

            @Override // org.lwjgl.system.CallbackI
            default Callback.Descriptor getDescriptor() {
                return DESCRIPTOR;
            }

            @Override // org.lwjgl.system.CallbackI
            default void callback(long ret, long args) {
                long size = MemoryUtil.memGetAddress(MemoryUtil.memGetAddress(args));
                MemoryUtil.memPutAddress(ret, invoke(size));
            }
        }

        @FunctionalInterface
        /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/MemoryManage$DebugAllocator$CallbackPPP.class */
        public interface CallbackPPP extends CallbackI {
            public static final Callback.Descriptor DESCRIPTOR = new Callback.Descriptor(MethodHandles.lookup(), APIUtil.apiCreateCIF(LibFFI.ffi_type_pointer, LibFFI.ffi_type_pointer, LibFFI.ffi_type_pointer));

            long invoke(long j, long j2);

            @Override // org.lwjgl.system.CallbackI
            default Callback.Descriptor getDescriptor() {
                return DESCRIPTOR;
            }

            @Override // org.lwjgl.system.CallbackI
            default void callback(long ret, long args) {
                long num = MemoryUtil.memGetAddress(MemoryUtil.memGetAddress(args));
                long size = MemoryUtil.memGetAddress(MemoryUtil.memGetAddress(args + POINTER_SIZE));
                MemoryUtil.memPutAddress(ret, invoke(num, size));
            }
        }

        @FunctionalInterface
        /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/MemoryManage$DebugAllocator$CallbackIV.class */
        public interface CallbackIV extends CallbackI {
            public static final Callback.Descriptor DESCRIPTOR = new Callback.Descriptor(MethodHandles.lookup(), APIUtil.apiCreateCIF(LibFFI.ffi_type_void, LibFFI.ffi_type_pointer));

            void invoke(long j);

            @Override // org.lwjgl.system.CallbackI
            default Callback.Descriptor getDescriptor() {
                return DESCRIPTOR;
            }

            @Override // org.lwjgl.system.CallbackI
            default void callback(long ret, long args) {
                long ptr = MemoryUtil.memGetAddress(MemoryUtil.memGetAddress(args));
                invoke(ptr);
            }
        }

        @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
        public long getMalloc() {
            return this.callbacks[0];
        }

        @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
        public long getCalloc() {
            return this.callbacks[1];
        }

        @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
        public long getRealloc() {
            return this.callbacks[2];
        }

        @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
        public long getFree() {
            return this.callbacks[3];
        }

        @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
        public long getAlignedAlloc() {
            return this.callbacks[4];
        }

        @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
        public long getAlignedFree() {
            return this.callbacks[5];
        }

        @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
        public long malloc(long size) {
            return track(this.allocator.malloc(size), size);
        }

        @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
        public long calloc(long num, long size) {
            return track(this.allocator.calloc(num, size), num * size);
        }

        @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
        public long realloc(long ptr, long size) {
            long oldSize = untrack(ptr);
            long address = this.allocator.realloc(ptr, size);
            if (address != 0) {
                track(address, size);
            } else if (size != 0) {
                track(ptr, oldSize);
            }
            return address;
        }

        @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
        public void free(long ptr) {
            untrack(ptr);
            this.allocator.free(ptr);
        }

        @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
        public long aligned_alloc(long alignment, long size) {
            return track(this.allocator.aligned_alloc(alignment, size), size);
        }

        @Override // org.lwjgl.system.MemoryUtil.MemoryAllocator
        public void aligned_free(long ptr) {
            untrack(ptr);
            this.allocator.aligned_free(ptr);
        }

        static long track(long address, long size) {
            if (address != 0) {
                Thread t = Thread.currentThread();
                THREADS.putIfAbsent(Long.valueOf(t.getId()), t.getName());
                Allocation allocationNew = new Allocation(address, size, t.getId(), Configuration.DEBUG_MEMORY_ALLOCATOR_FAST.get(false).booleanValue() ? null : StackWalkUtil.stackWalkGetTrace());
                Allocation allocationOld = ALLOCATIONS.put(allocationNew, allocationNew);
                if (allocationOld != null) {
                    trackAbort(address, allocationOld, allocationNew);
                }
            }
            return address;
        }

        private static void trackAbort(long address, Allocation allocationOld, Allocation allocationNew) {
            String addressHex = Long.toHexString(address).toUpperCase();
            trackAbortPrint(allocationOld, "Old", addressHex);
            trackAbortPrint(allocationNew, "New", addressHex);
            throw new IllegalStateException("The memory address specified is already being tracked: 0x" + addressHex);
        }

        private static void trackAbortPrint(Allocation allocation, String name, String address) {
            StringBuilder sb = new StringBuilder(512);
            sb.append("[LWJGL] ").append(name).append(" allocation with size ").append(allocation.size).append(", thread ").append(allocation.threadId).append(" (").append(THREADS.get(Long.valueOf(allocation.threadId))).append("), address: 0x").append(address).append(StringUtils.LF);
            Object[] stackTrace = allocation.getElements();
            if (stackTrace != null) {
                for (Object el : stackTrace) {
                    sb.append("\tat ").append(el).append(StringUtils.LF);
                }
            }
            APIUtil.DEBUG_STREAM.print(sb);
        }

        static long untrack(long address) {
            if (address == 0) {
                return 0L;
            }
            Allocation allocation = ALLOCATIONS.remove(new Allocation(address, 0L, 0L, null));
            if (allocation == null) {
                throw untrackAbort(address);
            }
            return allocation.size;
        }

        private static IllegalStateException untrackAbort(long address) {
            String addressHex = Long.toHexString(address).toUpperCase();
            return new IllegalStateException("The memory address specified is not being tracked: 0x" + addressHex);
        }

        /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/MemoryManage$DebugAllocator$Allocation.class
 */
        /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/MemoryManage$DebugAllocator$Allocation.class */
        private static class Allocation {
            final long address;
            final long size;
            final long threadId;
            private final Object[] stacktrace;

            Allocation(long address, long size, long threadId, Object[] stacktrace) {
                this.address = address;
                this.size = size;
                this.threadId = threadId;
                this.stacktrace = stacktrace;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public StackTraceElement[] getElements() {
                if (this.stacktrace == null) {
                    return null;
                }
                return StackWalkUtil.stackWalkArray(this.stacktrace);
            }

            public boolean equals(Object other) {
                return this.address == ((Allocation) other).address;
            }

            public int hashCode() {
                return Long.hashCode(this.address);
            }
        }

        static void report(MemoryUtil.MemoryAllocationReport report) {
            for (Allocation allocation : ALLOCATIONS.keySet()) {
                report.invoke(allocation.address, allocation.size, allocation.threadId, THREADS.get(Long.valueOf(allocation.threadId)), allocation.getElements());
            }
        }

        private static <T> void aggregate(T t, long size, Map<T, AtomicLong> map) {
            AtomicLong node = map.computeIfAbsent(t, k -> {
                return new AtomicLong();
            });
            node.set(node.get() + size);
        }

        static void report(MemoryUtil.MemoryAllocationReport report, MemoryUtil.MemoryAllocationReport.Aggregate groupByStackTrace, boolean groupByThread) {
            switch (groupByStackTrace) {
                case ALL:
                    reportAll(report, groupByThread);
                    break;
                case GROUP_BY_METHOD:
                    reportByMethod(report, groupByThread);
                    break;
                case GROUP_BY_STACKTRACE:
                    reportByStacktrace(report, groupByThread);
                    break;
            }
        }

        private static void reportAll(MemoryUtil.MemoryAllocationReport report, boolean groupByThread) {
            if (groupByThread) {
                Map<Long, AtomicLong> mapThread = new HashMap<>();
                for (Allocation allocation : ALLOCATIONS.values()) {
                    aggregate(Long.valueOf(allocation.threadId), allocation.size, mapThread);
                }
                for (Map.Entry<Long, AtomicLong> entry : mapThread.entrySet()) {
                    report.invoke(0L, entry.getValue().get(), entry.getKey().longValue(), THREADS.get(entry.getKey()), (StackTraceElement[]) null);
                }
                return;
            }
            long total = 0;
            Iterator<Allocation> it = ALLOCATIONS.values().iterator();
            while (it.hasNext()) {
                total += it.next().size;
            }
            report.invoke(0L, total, 0L, null, (StackTraceElement[]) null);
        }

        private static void reportByMethod(MemoryUtil.MemoryAllocationReport report, boolean groupByThread) {
            if (groupByThread) {
                Map<Long, Map<StackTraceElement, AtomicLong>> mapThreadMethod = new HashMap<>();
                for (Allocation allocation : ALLOCATIONS.keySet()) {
                    StackTraceElement[] elements = allocation.getElements();
                    if (elements != null) {
                        aggregate(elements[0], allocation.size, mapThreadMethod.computeIfAbsent(Long.valueOf(allocation.threadId), k -> {
                            return new HashMap();
                        }));
                    }
                }
                for (Map.Entry<Long, Map<StackTraceElement, AtomicLong>> tms : mapThreadMethod.entrySet()) {
                    long threadId = tms.getKey().longValue();
                    String threadName = THREADS.get(Long.valueOf(threadId));
                    for (Map.Entry<StackTraceElement, AtomicLong> ms : tms.getValue().entrySet()) {
                        report.invoke(0L, ms.getValue().get(), threadId, threadName, ms.getKey());
                    }
                }
                return;
            }
            Map<StackTraceElement, AtomicLong> mapMethod = new HashMap<>();
            for (Allocation allocation2 : ALLOCATIONS.keySet()) {
                StackTraceElement[] elements2 = allocation2.getElements();
                if (elements2 != null) {
                    aggregate(elements2[0], allocation2.size, mapMethod);
                }
            }
            for (Map.Entry<StackTraceElement, AtomicLong> ms2 : mapMethod.entrySet()) {
                report.invoke(0L, ms2.getValue().get(), 0L, null, ms2.getKey());
            }
        }

        private static void reportByStacktrace(MemoryUtil.MemoryAllocationReport report, boolean groupByThread) {
            if (groupByThread) {
                Map<Long, Map<AllocationKey, AtomicLong>> mapThreadStackTrace = new HashMap<>();
                for (Allocation allocation : ALLOCATIONS.keySet()) {
                    StackTraceElement[] elements = allocation.getElements();
                    if (elements != null) {
                        aggregate(new AllocationKey(elements), allocation.size, mapThreadStackTrace.computeIfAbsent(Long.valueOf(allocation.threadId), k -> {
                            return new HashMap();
                        }));
                    }
                }
                for (Map.Entry<Long, Map<AllocationKey, AtomicLong>> tss : mapThreadStackTrace.entrySet()) {
                    long threadId = tss.getKey().longValue();
                    for (Map.Entry<AllocationKey, AtomicLong> ss : tss.getValue().entrySet()) {
                        report.invoke(0L, ss.getValue().get(), threadId, THREADS.get(Long.valueOf(threadId)), ss.getKey().elements);
                    }
                }
                return;
            }
            Map<AllocationKey, AtomicLong> mapStackTrace = new HashMap<>();
            for (Allocation allocation2 : ALLOCATIONS.keySet()) {
                StackTraceElement[] elements2 = allocation2.getElements();
                if (elements2 != null) {
                    aggregate(new AllocationKey(elements2), allocation2.size, mapStackTrace);
                }
            }
            for (Map.Entry<AllocationKey, AtomicLong> ss2 : mapStackTrace.entrySet()) {
                report.invoke(0L, ss2.getValue().get(), 0L, null, ss2.getKey().elements);
            }
        }

        /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/MemoryManage$DebugAllocator$AllocationKey.class
 */
        /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/MemoryManage$DebugAllocator$AllocationKey.class */
        private static class AllocationKey {
            final StackTraceElement[] elements;

            AllocationKey(StackTraceElement[] elements) {
                this.elements = elements;
            }

            public boolean equals(Object other) {
                return this == other || Arrays.equals(this.elements, ((AllocationKey) other).elements);
            }

            public int hashCode() {
                return Arrays.hashCode(this.elements);
            }
        }
    }
}
