package org.lwjgl.system.linux.liburing;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.Checks;
import org.lwjgl.system.CustomBuffer;
import org.lwjgl.system.Library;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.linux.CMsghdr;
import org.lwjgl.system.linux.EpollEvent;
import org.lwjgl.system.linux.IOVec;
import org.lwjgl.system.linux.KernelTimespec;
import org.lwjgl.system.linux.Msghdr;
import org.lwjgl.system.linux.OpenHow;
import org.lwjgl.system.linux.Sockaddr;
import org.lwjgl.system.linux.Statx;
import org.lwjgl.system.linux.liburing.IOURingRestriction;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/liburing/LibURing.class
 */
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/LibURing.class */
public class LibURing {
    public static final long LIBURING_UDATA_TIMEOUT = -1;

    public static native long nio_uring_get_probe_ring(long j);

    public static native long nio_uring_get_probe();

    public static native void nio_uring_free_probe(long j);

    public static native int nio_uring_opcode_supported(long j, int i);

    public static native int nio_uring_queue_init_mem(int i, long j, long j2, long j3, long j4);

    public static native int nio_uring_queue_init_params(int i, long j, long j2);

    public static native int nio_uring_queue_init(int i, long j, int i2);

    public static native int nio_uring_queue_mmap(int i, long j, long j2);

    public static native int nio_uring_ring_dontfork(long j);

    public static native void nio_uring_queue_exit(long j);

    public static native int nio_uring_peek_batch_cqe(long j, long j2, int i);

    public static native int nio_uring_wait_cqes(long j, long j2, int i, long j3, long j4);

    public static native int nio_uring_wait_cqes_min_timeout(long j, long j2, int i, long j3, int i2, long j4);

    public static native int nio_uring_wait_cqe_timeout(long j, long j2, long j3);

    public static native int nio_uring_submit(long j);

    public static native int nio_uring_submit_and_wait(long j, int i);

    public static native int nio_uring_submit_and_wait_timeout(long j, long j2, int i, long j3, long j4);

    public static native int nio_uring_submit_and_wait_min_timeout(long j, long j2, int i, long j3, int i2, long j4);

    public static native int nio_uring_submit_and_wait_reg(long j, long j2, int i, int i2);

    public static native int nio_uring_register_wait_reg(long j, long j2, int i);

    public static native int nio_uring_resize_rings(long j, long j2);

    public static native int nio_uring_clone_buffers_offset(long j, long j2, int i, int i2, int i3, int i4);

    public static native int nio_uring_clone_buffers(long j, long j2);

    public static native int nio_uring_register_buffers(long j, long j2, int i);

    public static native int nio_uring_register_buffers_tags(long j, long j2, long j3, int i);

    public static native int nio_uring_register_buffers_sparse(long j, int i);

    public static native int nio_uring_register_buffers_update_tag(long j, int i, long j2, long j3, int i2);

    public static native int nio_uring_unregister_buffers(long j);

    public static native int nio_uring_register_files(long j, long j2, int i);

    public static native int nio_uring_register_files_tags(long j, long j2, long j3, int i);

    public static native int nio_uring_register_files_sparse(long j, int i);

    public static native int nio_uring_register_files_update_tag(long j, int i, long j2, long j3, int i2);

    public static native int nio_uring_unregister_files(long j);

    public static native int nio_uring_register_files_update(long j, int i, long j2, int i2);

    public static native int nio_uring_register_eventfd(long j, int i);

    public static native int nio_uring_register_eventfd_async(long j, int i);

    public static native int nio_uring_unregister_eventfd(long j);

    public static native int nio_uring_register_probe(long j, long j2, int i);

    public static native int nio_uring_register_personality(long j);

    public static native int nio_uring_unregister_personality(long j, int i);

    public static native int nio_uring_register_restrictions(long j, long j2, int i);

    public static native int nio_uring_enable_rings(long j);

    public static native int n__io_uring_sqring_wait(long j);

    public static native int nio_uring_register_iowq_aff(long j, long j2, long j3);

    public static native int nio_uring_unregister_iowq_aff(long j);

    public static native int nio_uring_register_iowq_max_workers(long j, long j2);

    public static native int nio_uring_register_ring_fd(long j);

    public static native int nio_uring_unregister_ring_fd(long j);

    public static native int nio_uring_close_ring_fd(long j);

    public static native int nio_uring_register_buf_ring(long j, long j2, int i);

    public static native int nio_uring_unregister_buf_ring(long j, int i);

    public static native int nio_uring_buf_ring_head(long j, int i, long j2);

    public static native int nio_uring_register_sync_cancel(long j, long j2);

    public static native int nio_uring_register_file_alloc_range(long j, int i, int i2);

    public static native int nio_uring_register_napi(long j, long j2);

    public static native int nio_uring_unregister_napi(long j, long j2);

    public static native int nio_uring_register_ifq(long j, long j2);

    public static native int nio_uring_register_clock(long j, long j2);

    public static native int nio_uring_get_events(long j);

    public static native int nio_uring_submit_and_get_events(long j);

    public static native int nio_uring_enter(int i, int i2, int i3, int i4, long j);

    public static native int nio_uring_enter2(int i, int i2, int i3, int i4, long j, long j2);

    public static native int nio_uring_setup(int i, long j);

    public static native int io_uring_register(@NativeType("unsigned int") int i, @NativeType("unsigned int") int i2, @NativeType("void *") long j, @NativeType("unsigned int") int i3);

    public static native int nio_uring_register_region(long j, long j2);

    public static native long nio_uring_setup_buf_ring(long j, int i, int i2, int i3, long j2);

    public static native int nio_uring_free_buf_ring(long j, long j2, int i, int i2);

    public static native int nio_uring_set_iowait(long j, boolean z);

    @NativeType("unsigned")
    public static native int io_uring_cqe_shift_from_flags(@NativeType("unsigned") int i);

    public static native int nio_uring_cqe_shift(long j);

    public static native int nio_uring_cqe_nr(long j);

    public static native void nio_uring_cq_advance(long j, int i);

    public static native void nio_uring_cqe_seen(long j, long j2);

    public static native void nio_uring_sqe_set_data(long j, long j2);

    public static native long nio_uring_cqe_get_data(long j);

    public static native void nio_uring_sqe_set_data64(long j, long j2);

    public static native long nio_uring_cqe_get_data64(long j);

    public static native void nio_uring_sqe_set_flags(long j, int i);

    public static native void nio_uring_sqe_set_buf_group(long j, int i);

    public static native void nio_uring_initialize_sqe(long j);

    public static native void nio_uring_prep_splice(long j, int i, long j2, int i2, long j3, int i3, int i4);

    public static native void nio_uring_prep_tee(long j, int i, int i2, int i3, int i4);

    public static native void nio_uring_prep_readv(long j, int i, long j2, int i2, int i3);

    public static native void nio_uring_prep_readv2(long j, int i, long j2, int i2, int i3, int i4);

    public static native void nio_uring_prep_read_fixed(long j, int i, long j2, int i2, long j3, int i3);

    public static native void nio_uring_prep_readv_fixed(long j, int i, long j2, int i2, long j3, int i3, int i4);

    public static native void nio_uring_prep_writev(long j, int i, long j2, int i2, long j3);

    public static native void nio_uring_prep_writev2(long j, int i, long j2, int i2, long j3, int i3);

    public static native void nio_uring_prep_write_fixed(long j, int i, long j2, int i2, long j3, int i3);

    public static native void nio_uring_prep_writev_fixed(long j, int i, long j2, int i2, long j3, int i3, int i4);

    public static native void nio_uring_prep_recvmsg(long j, int i, long j2, int i2);

    public static native void nio_uring_prep_recvmsg_multishot(long j, int i, long j2, int i2);

    public static native void nio_uring_prep_sendmsg(long j, int i, long j2, int i2);

    public static native void nio_uring_prep_poll_add(long j, int i, int i2);

    public static native void nio_uring_prep_poll_multishot(long j, int i, int i2);

    public static native void nio_uring_prep_poll_remove(long j, long j2);

    public static native void nio_uring_prep_poll_update(long j, long j2, long j3, int i, int i2);

    public static native void nio_uring_prep_fsync(long j, int i, int i2);

    public static native void nio_uring_prep_nop(long j);

    public static native void nio_uring_prep_nop128(long j);

    public static native void nio_uring_prep_timeout(long j, long j2, int i, int i2);

    public static native void nio_uring_prep_timeout_remove(long j, long j2, int i);

    public static native void nio_uring_prep_timeout_update(long j, long j2, long j3, int i);

    public static native void nio_uring_prep_accept(long j, int i, long j2, long j3, int i2);

    public static native void nio_uring_prep_accept_direct(long j, int i, long j2, long j3, int i2, int i3);

    public static native void nio_uring_prep_multishot_accept(long j, int i, long j2, long j3, int i2);

    public static native void nio_uring_prep_multishot_accept_direct(long j, int i, long j2, long j3, int i2);

    public static native void nio_uring_prep_cancel64(long j, long j2, int i);

    public static native void nio_uring_prep_cancel(long j, long j2, int i);

    public static native void nio_uring_prep_cancel_fd(long j, int i, int i2);

    public static native void nio_uring_prep_link_timeout(long j, long j2, int i);

    public static native void nio_uring_prep_connect(long j, int i, long j2, int i2);

    public static native void nio_uring_prep_bind(long j, int i, long j2, int i2);

    public static native void nio_uring_prep_listen(long j, int i, int i2);

    public static native void nio_uring_prep_epoll_wait(long j, int i, long j2, int i2, int i3);

    public static native void nio_uring_prep_files_update(long j, long j2, int i, int i2);

    public static native void nio_uring_prep_fallocate(long j, int i, int i2, long j2, long j3);

    public static native void nio_uring_prep_openat(long j, int i, long j2, int i2, int i3);

    public static native void nio_uring_prep_openat_direct(long j, int i, long j2, int i2, int i3, int i4);

    public static native void nio_uring_prep_open(long j, long j2, int i, int i2);

    public static native void nio_uring_prep_open_direct(long j, long j2, int i, int i2, int i3);

    public static native void nio_uring_prep_close(long j, int i);

    public static native void nio_uring_prep_close_direct(long j, int i);

    public static native void nio_uring_prep_read(long j, int i, long j2, int i2, long j3);

    public static native void nio_uring_prep_read_multishot(long j, int i, int i2, long j2, int i3);

    public static native void nio_uring_prep_write(long j, int i, long j2, int i2, long j3);

    public static native void nio_uring_prep_statx(long j, int i, long j2, int i2, int i3, long j3);

    public static native void nio_uring_prep_fadvise(long j, int i, long j2, int i2, int i3);

    public static native void nio_uring_prep_madvise(long j, long j2, int i, int i2);

    public static native void nio_uring_prep_fadvise64(long j, int i, long j2, long j3, int i2);

    public static native void nio_uring_prep_madvise64(long j, long j2, long j3, int i);

    public static native void nio_uring_prep_send(long j, int i, long j2, long j3, int i2);

    public static native void nio_uring_prep_send_bundle(long j, int i, long j2, int i2);

    public static native void nio_uring_prep_send_set_addr(long j, long j2, short s);

    public static native void nio_uring_prep_sendto(long j, int i, long j2, long j3, int i2, long j4, int i3);

    public static native void nio_uring_prep_send_zc(long j, int i, long j2, long j3, int i2, int i3);

    public static native void nio_uring_prep_send_zc_fixed(long j, int i, long j2, long j3, int i2, int i3, int i4);

    public static native void nio_uring_prep_sendmsg_zc(long j, int i, long j2, int i2);

    public static native void nio_uring_prep_sendmsg_zc_fixed(long j, int i, long j2, int i2, int i3);

    public static native void nio_uring_prep_recv(long j, int i, long j2, long j3, int i2);

    public static native void nio_uring_prep_recv_multishot(long j, int i, long j2, long j3, int i2);

    public static native long nio_uring_recvmsg_validate(long j, int i, long j2);

    public static native long nio_uring_recvmsg_name(long j);

    public static native long nio_uring_recvmsg_cmsg_firsthdr(long j, long j2);

    public static native long nio_uring_recvmsg_cmsg_nexthdr(long j, long j2, long j3);

    public static native long nio_uring_recvmsg_payload(long j, long j2);

    public static native int nio_uring_recvmsg_payload_length(long j, int i, long j2);

    public static native void nio_uring_prep_openat2(long j, int i, long j2, long j3);

    public static native void nio_uring_prep_openat2_direct(long j, int i, long j2, long j3, int i2);

    public static native void nio_uring_prep_epoll_ctl(long j, int i, int i2, int i3, long j2);

    public static native void nio_uring_prep_provide_buffers(long j, long j2, int i, int i2, int i3, int i4);

    public static native void nio_uring_prep_remove_buffers(long j, int i, int i2);

    public static native void nio_uring_prep_shutdown(long j, int i, int i2);

    public static native void nio_uring_prep_unlinkat(long j, int i, long j2, int i2);

    public static native void nio_uring_prep_unlink(long j, long j2, int i);

    public static native void nio_uring_prep_renameat(long j, int i, long j2, int i2, long j3, int i3);

    public static native void nio_uring_prep_rename(long j, long j2, long j3);

    public static native void nio_uring_prep_sync_file_range(long j, int i, int i2, long j2, int i3);

    public static native void nio_uring_prep_mkdirat(long j, int i, long j2, int i2);

    public static native void nio_uring_prep_mkdir(long j, long j2, int i);

    public static native void nio_uring_prep_symlinkat(long j, long j2, int i, long j3);

    public static native void nio_uring_prep_symlink(long j, long j2, long j3);

    public static native void nio_uring_prep_linkat(long j, int i, long j2, int i2, long j3, int i3);

    public static native void nio_uring_prep_link(long j, long j2, long j3, int i);

    public static native void nio_uring_prep_msg_ring_cqe_flags(long j, int i, int i2, long j2, int i3, int i4);

    public static native void nio_uring_prep_msg_ring(long j, int i, int i2, long j2, int i3);

    public static native void nio_uring_prep_msg_ring_fd(long j, int i, int i2, int i3, long j2, int i4);

    public static native void nio_uring_prep_msg_ring_fd_alloc(long j, int i, int i2, long j2, int i3);

    public static native void nio_uring_prep_getxattr(long j, long j2, long j3, long j4, int i);

    public static native void nio_uring_prep_setxattr(long j, long j2, long j3, long j4, int i, int i2);

    public static native void nio_uring_prep_fgetxattr(long j, int i, long j2, long j3, int i2);

    public static native void nio_uring_prep_fsetxattr(long j, int i, long j2, long j3, int i2, int i3);

    public static native void nio_uring_prep_socket(long j, int i, int i2, int i3, int i4);

    public static native void nio_uring_prep_socket_direct(long j, int i, int i2, int i3, int i4, int i5);

    public static native void nio_uring_prep_socket_direct_alloc(long j, int i, int i2, int i3, int i4);

    public static native void nio_uring_prep_uring_cmd(long j, int i, int i2);

    public static native void nio_uring_prep_uring_cmd128(long j, int i, int i2);

    public static native void nio_uring_prep_cmd_sock(long j, int i, int i2, int i3, int i4, long j2, int i5);

    public static native void nio_uring_prep_cmd_getsockname(long j, int i, long j2, long j3, int i2);

    public static native void nio_uring_prep_waitid(long j, int i, int i2, long j2, int i3, int i4);

    public static native void nio_uring_prep_futex_wake(long j, long j2, long j3, long j4, int i, int i2);

    public static native void nio_uring_prep_futex_wait(long j, long j2, long j3, long j4, int i, int i2);

    public static native void nio_uring_prep_futex_waitv(long j, long j2, int i, int i2);

    public static native void nio_uring_prep_fixed_fd_install(long j, int i, int i2);

    public static native void nio_uring_prep_ftruncate(long j, int i, long j2);

    public static native void nio_uring_prep_cmd_discard(long j, int i, long j2, long j3);

    public static native void nio_uring_prep_pipe(long j, long j2, int i);

    public static native void nio_uring_prep_pipe_direct(long j, long j2, int i, int i2);

    public static native int nio_uring_load_sq_head(long j);

    public static native int nio_uring_sq_ready(long j);

    public static native int nio_uring_sq_space_left(long j);

    @NativeType("unsigned")
    public static native int io_uring_sqe_shift_from_flags(@NativeType("unsigned") int i);

    public static native int nio_uring_sqe_shift(long j);

    public static native int nio_uring_sqring_wait(long j);

    public static native int nio_uring_cq_ready(long j);

    public static native boolean nio_uring_cq_has_overflow(long j);

    public static native boolean nio_uring_cq_eventfd_enabled(long j);

    public static native int nio_uring_cq_eventfd_toggle(long j, boolean z);

    public static native int nio_uring_wait_cqe_nr(long j, long j2, int i);

    public static native int nio_uring_peek_cqe(long j, long j2);

    public static native int nio_uring_wait_cqe(long j, long j2);

    public static native void nio_uring_buf_ring_advance(long j, int i);

    public static native void nio_uring_buf_ring_cq_advance(long j, long j2, int i);

    public static native int nio_uring_buf_ring_available(long j, long j2, short s);

    public static native long nio_uring_get_sqe(long j);

    public static native long nio_uring_get_sqe128(long j);

    public static native int io_uring_mlock_size(@NativeType("unsigned") int i, @NativeType("unsigned") int i2);

    public static native int nio_uring_mlock_size_params(int i, long j);

    @NativeType("ssize_t")
    public static native long io_uring_memory_size(@NativeType("unsigned") int i, @NativeType("unsigned") int i2);

    public static native long nio_uring_memory_size_params(int i, long j);

    public static native int io_uring_major_version();

    public static native int io_uring_minor_version();

    @NativeType("bool")
    public static native boolean io_uring_check_version(int i, int i2);

    static {
        Library.initialize();
    }

    protected LibURing() {
        throw new UnsupportedOperationException();
    }

    @NativeType("struct io_uring_probe *")
    public static IOURingProbe io_uring_get_probe_ring(@NativeType("struct io_uring *") IOURing ring) {
        long __result = nio_uring_get_probe_ring(ring.address());
        return IOURingProbe.createSafe(__result);
    }

    @NativeType("struct io_uring_probe *")
    public static IOURingProbe io_uring_get_probe() {
        long __result = nio_uring_get_probe();
        return IOURingProbe.createSafe(__result);
    }

    public static void io_uring_free_probe(@NativeType("struct io_uring_probe *") IOURingProbe probe) {
        nio_uring_free_probe(probe.address());
    }

    public static int io_uring_opcode_supported(@NativeType("struct io_uring_probe const *") IOURingProbe p, int op) {
        return nio_uring_opcode_supported(p.address(), op);
    }

    public static int io_uring_queue_init_mem(@NativeType("unsigned") int entries, @NativeType("struct io_uring *") IOURing ring, @NativeType("struct io_uring_params *") IOURingParams p, @NativeType("void *") ByteBuffer buf) {
        return nio_uring_queue_init_mem(entries, ring.address(), p.address(), MemoryUtil.memAddress(buf), buf.remaining());
    }

    public static int io_uring_queue_init_params(@NativeType("unsigned") int entries, @NativeType("struct io_uring *") IOURing ring, @NativeType("struct io_uring_params *") IOURingParams p) {
        return nio_uring_queue_init_params(entries, ring.address(), p.address());
    }

    public static int io_uring_queue_init(@NativeType("unsigned") int entries, @NativeType("struct io_uring *") IOURing ring, @NativeType("unsigned") int flags) {
        return nio_uring_queue_init(entries, ring.address(), flags);
    }

    public static int io_uring_queue_mmap(int fd, @NativeType("struct io_uring_params *") IOURingParams p, @NativeType("struct io_uring *") IOURing ring) {
        return nio_uring_queue_mmap(fd, p.address(), ring.address());
    }

    public static int io_uring_ring_dontfork(@NativeType("struct io_uring *") IOURing ring) {
        return nio_uring_ring_dontfork(ring.address());
    }

    public static void io_uring_queue_exit(@NativeType("struct io_uring *") IOURing ring) {
        nio_uring_queue_exit(ring.address());
    }

    @NativeType("unsigned")
    public static int io_uring_peek_batch_cqe(@NativeType("struct io_uring *") IOURing ring, @NativeType("struct io_uring_cqe **") PointerBuffer cqes) {
        return nio_uring_peek_batch_cqe(ring.address(), MemoryUtil.memAddress(cqes), cqes.remaining());
    }

    public static int io_uring_wait_cqes(@NativeType("struct io_uring *") IOURing ring, @NativeType("struct io_uring_cqe **") PointerBuffer cqe_ptr, @NativeType("struct __kernel_timespec *") KernelTimespec ts, @NativeType("sigset_t *") long sigmask) {
        return nio_uring_wait_cqes(ring.address(), MemoryUtil.memAddress(cqe_ptr), cqe_ptr.remaining(), MemoryUtil.memAddressSafe(ts), sigmask);
    }

    public static int io_uring_wait_cqes_min_timeout(@NativeType("struct io_uring *") IOURing ring, @NativeType("struct io_uring_cqe **") PointerBuffer cqe_ptr, @NativeType("struct __kernel_timespec *") KernelTimespec ts, @NativeType("unsigned int") int min_ts_usec, @NativeType("sigset_t *") long sigmask) {
        return nio_uring_wait_cqes_min_timeout(ring.address(), MemoryUtil.memAddress(cqe_ptr), cqe_ptr.remaining(), MemoryUtil.memAddressSafe(ts), min_ts_usec, sigmask);
    }

    public static int io_uring_wait_cqe_timeout(@NativeType("struct io_uring *") IOURing ring, @NativeType("struct io_uring_cqe **") PointerBuffer cqe_ptr, @NativeType("struct __kernel_timespec *") KernelTimespec ts) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) cqe_ptr, 1);
        }
        return nio_uring_wait_cqe_timeout(ring.address(), MemoryUtil.memAddress(cqe_ptr), MemoryUtil.memAddressSafe(ts));
    }

    public static int io_uring_submit(@NativeType("struct io_uring *") IOURing ring) {
        return nio_uring_submit(ring.address());
    }

    public static int io_uring_submit_and_wait(@NativeType("struct io_uring *") IOURing ring, @NativeType("unsigned") int wait_nr) {
        return nio_uring_submit_and_wait(ring.address(), wait_nr);
    }

    public static int io_uring_submit_and_wait_timeout(@NativeType("struct io_uring *") IOURing ring, @NativeType("struct io_uring_cqe **") PointerBuffer cqe_ptr, @NativeType("struct __kernel_timespec *") KernelTimespec ts, @NativeType("sigset_t *") long sigmask) {
        return nio_uring_submit_and_wait_timeout(ring.address(), MemoryUtil.memAddress(cqe_ptr), cqe_ptr.remaining(), MemoryUtil.memAddressSafe(ts), sigmask);
    }

    public static int io_uring_submit_and_wait_min_timeout(@NativeType("struct io_uring *") IOURing ring, @NativeType("struct io_uring_cqe **") PointerBuffer cqe_ptr, @NativeType("struct __kernel_timespec *") KernelTimespec ts, @NativeType("unsigned") int min_wait, @NativeType("sigset_t *") long sigmask) {
        return nio_uring_submit_and_wait_min_timeout(ring.address(), MemoryUtil.memAddress(cqe_ptr), cqe_ptr.remaining(), MemoryUtil.memAddressSafe(ts), min_wait, sigmask);
    }

    public static int io_uring_submit_and_wait_reg(@NativeType("struct io_uring *") IOURing ring, @NativeType("struct io_uring_cqe **") PointerBuffer cqe_ptr, int reg_index) {
        return nio_uring_submit_and_wait_reg(ring.address(), MemoryUtil.memAddress(cqe_ptr), cqe_ptr.remaining(), reg_index);
    }

    public static int io_uring_register_wait_reg(@NativeType("struct io_uring *") IOURing ring, @NativeType("struct io_uring_reg_wait *") IOURingRegWait reg, int nr) {
        return nio_uring_register_wait_reg(ring.address(), reg.address(), nr);
    }

    public static int io_uring_resize_rings(@NativeType("struct io_uring *") IOURing ring, @NativeType("struct io_uring_params *") IOURingParams p) {
        return nio_uring_resize_rings(ring.address(), p.address());
    }

    public static int io_uring_clone_buffers_offset(@NativeType("struct io_uring *") IOURing dst, @NativeType("struct io_uring *") IOURing src, @NativeType("unsigned") int dst_off, @NativeType("unsigned") int src_off, @NativeType("unsigned") int nr, @NativeType("unsigned") int flags) {
        return nio_uring_clone_buffers_offset(dst.address(), src.address(), dst_off, src_off, nr, flags);
    }

    public static int io_uring_clone_buffers(@NativeType("struct io_uring *") IOURing dst, @NativeType("struct io_uring *") IOURing src) {
        return nio_uring_clone_buffers(dst.address(), src.address());
    }

    public static int io_uring_register_buffers(@NativeType("struct io_uring *") IOURing ring, @NativeType("struct iovec const *") IOVec.Buffer iovecs) {
        return nio_uring_register_buffers(ring.address(), iovecs.address(), iovecs.remaining());
    }

    public static int io_uring_register_buffers_tags(@NativeType("struct io_uring *") IOURing ring, @NativeType("struct iovec const *") IOVec.Buffer iovecs, @NativeType("__u64 const *") LongBuffer tags) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) tags, iovecs.remaining());
        }
        return nio_uring_register_buffers_tags(ring.address(), iovecs.address(), MemoryUtil.memAddress(tags), iovecs.remaining());
    }

    public static int io_uring_register_buffers_sparse(@NativeType("struct io_uring *") IOURing ring, @NativeType("unsigned") int nr_iovecs) {
        return nio_uring_register_buffers_sparse(ring.address(), nr_iovecs);
    }

    public static int io_uring_register_buffers_update_tag(@NativeType("struct io_uring *") IOURing ring, @NativeType("unsigned") int off, @NativeType("struct iovec const *") IOVec.Buffer iovecs, @NativeType("__u64 const *") LongBuffer tags) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) tags, iovecs.remaining());
        }
        return nio_uring_register_buffers_update_tag(ring.address(), off, iovecs.address(), MemoryUtil.memAddress(tags), iovecs.remaining());
    }

    public static int io_uring_unregister_buffers(@NativeType("struct io_uring *") IOURing ring) {
        return nio_uring_unregister_buffers(ring.address());
    }

    public static int io_uring_register_files(@NativeType("struct io_uring *") IOURing ring, @NativeType("int const *") IntBuffer files) {
        return nio_uring_register_files(ring.address(), MemoryUtil.memAddress(files), files.remaining());
    }

    public static int io_uring_register_files_tags(@NativeType("struct io_uring *") IOURing ring, @NativeType("int const *") IntBuffer files, @NativeType("__u64 const *") LongBuffer tags) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) tags, files.remaining());
        }
        return nio_uring_register_files_tags(ring.address(), MemoryUtil.memAddress(files), MemoryUtil.memAddress(tags), files.remaining());
    }

    public static int io_uring_register_files_sparse(@NativeType("struct io_uring *") IOURing ring, @NativeType("unsigned") int nr_files) {
        return nio_uring_register_files_sparse(ring.address(), nr_files);
    }

    public static int io_uring_register_files_update_tag(@NativeType("struct io_uring *") IOURing ring, @NativeType("unsigned") int off, @NativeType("int const *") IntBuffer files, @NativeType("__u64 const *") LongBuffer tags) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) tags, files.remaining());
        }
        return nio_uring_register_files_update_tag(ring.address(), off, MemoryUtil.memAddress(files), MemoryUtil.memAddress(tags), files.remaining());
    }

    public static int io_uring_unregister_files(@NativeType("struct io_uring *") IOURing ring) {
        return nio_uring_unregister_files(ring.address());
    }

    public static int io_uring_register_files_update(@NativeType("struct io_uring *") IOURing ring, @NativeType("unsigned") int off, @NativeType("int const *") IntBuffer files) {
        return nio_uring_register_files_update(ring.address(), off, MemoryUtil.memAddress(files), files.remaining());
    }

    public static int io_uring_register_eventfd(@NativeType("struct io_uring *") IOURing ring, int fd) {
        return nio_uring_register_eventfd(ring.address(), fd);
    }

    public static int io_uring_register_eventfd_async(@NativeType("struct io_uring *") IOURing ring, int fd) {
        return nio_uring_register_eventfd_async(ring.address(), fd);
    }

    public static int io_uring_unregister_eventfd(@NativeType("struct io_uring *") IOURing ring) {
        return nio_uring_unregister_eventfd(ring.address());
    }

    public static int io_uring_register_probe(@NativeType("struct io_uring *") IOURing ring, @NativeType("struct io_uring_probe *") IOURingProbe p, @NativeType("unsigned") int nr) {
        return nio_uring_register_probe(ring.address(), p.address(), nr);
    }

    public static int io_uring_register_personality(@NativeType("struct io_uring *") IOURing ring) {
        return nio_uring_register_personality(ring.address());
    }

    public static int io_uring_unregister_personality(@NativeType("struct io_uring *") IOURing ring, int id) {
        return nio_uring_unregister_personality(ring.address(), id);
    }

    public static int io_uring_register_restrictions(@NativeType("struct io_uring *") IOURing ring, @NativeType("struct io_uring_restriction *") IOURingRestriction.Buffer res) {
        return nio_uring_register_restrictions(ring.address(), res.address(), res.remaining());
    }

    public static int io_uring_enable_rings(@NativeType("struct io_uring *") IOURing ring) {
        return nio_uring_enable_rings(ring.address());
    }

    public static int __io_uring_sqring_wait(@NativeType("struct io_uring *") IOURing ring) {
        return n__io_uring_sqring_wait(ring.address());
    }

    public static int io_uring_register_iowq_aff(@NativeType("struct io_uring *") IOURing ring, @NativeType("size_t") long cpusz, @NativeType("cpu_set_t const *") long mask) {
        if (Checks.CHECKS) {
            Checks.check(mask);
        }
        return nio_uring_register_iowq_aff(ring.address(), cpusz, mask);
    }

    public static int io_uring_unregister_iowq_aff(@NativeType("struct io_uring *") IOURing ring) {
        return nio_uring_unregister_iowq_aff(ring.address());
    }

    public static int io_uring_register_iowq_max_workers(@NativeType("struct io_uring *") IOURing ring, @NativeType("unsigned int *") IntBuffer values) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) values, 2);
        }
        return nio_uring_register_iowq_max_workers(ring.address(), MemoryUtil.memAddress(values));
    }

    public static int io_uring_register_ring_fd(@NativeType("struct io_uring *") IOURing ring) {
        return nio_uring_register_ring_fd(ring.address());
    }

    public static int io_uring_unregister_ring_fd(@NativeType("struct io_uring *") IOURing ring) {
        return nio_uring_unregister_ring_fd(ring.address());
    }

    public static int io_uring_close_ring_fd(@NativeType("struct io_uring *") IOURing ring) {
        return nio_uring_close_ring_fd(ring.address());
    }

    public static int io_uring_register_buf_ring(@NativeType("struct io_uring *") IOURing ring, @NativeType("struct io_uring_buf_reg *") IOURingBufReg reg, @NativeType("unsigned int") int flags) {
        return nio_uring_register_buf_ring(ring.address(), reg.address(), flags);
    }

    public static int io_uring_unregister_buf_ring(@NativeType("struct io_uring *") IOURing ring, int bgid) {
        return nio_uring_unregister_buf_ring(ring.address(), bgid);
    }

    public static int io_uring_buf_ring_head(@NativeType("struct io_uring *") IOURing ring, int buf_group, @NativeType("unsigned short *") ShortBuffer head) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) head, 1);
        }
        return nio_uring_buf_ring_head(ring.address(), buf_group, MemoryUtil.memAddress(head));
    }

    public static int io_uring_register_sync_cancel(@NativeType("struct io_uring *") IOURing ring, @NativeType("struct io_uring_sync_cancel_reg *") IOURingSyncCancelReg reg) {
        return nio_uring_register_sync_cancel(ring.address(), reg.address());
    }

    public static int io_uring_register_file_alloc_range(@NativeType("struct io_uring *") IOURing ring, @NativeType("unsigned") int off, @NativeType("unsigned") int len) {
        return nio_uring_register_file_alloc_range(ring.address(), off, len);
    }

    public static int io_uring_register_napi(@NativeType("struct io_uring *") IOURing ring, @NativeType("struct io_uring_napi *") IOURingNAPI napi) {
        return nio_uring_register_napi(ring.address(), napi.address());
    }

    public static int io_uring_unregister_napi(@NativeType("struct io_uring *") IOURing ring, @NativeType("struct io_uring_napi *") IOURingNAPI napi) {
        return nio_uring_unregister_napi(ring.address(), napi.address());
    }

    public static int io_uring_register_ifq(@NativeType("struct io_uring *") IOURing ring, @NativeType("struct io_uring_zcrx_ifq_reg *") IOURingZCRXIfqReg reg) {
        return nio_uring_register_ifq(ring.address(), reg.address());
    }

    public static int io_uring_register_clock(@NativeType("struct io_uring *") IOURing ring, @NativeType("struct io_uring_clock_register *") IOURingClockRegister arg) {
        return nio_uring_register_clock(ring.address(), arg.address());
    }

    public static int io_uring_get_events(@NativeType("struct io_uring *") IOURing ring) {
        return nio_uring_get_events(ring.address());
    }

    public static int io_uring_submit_and_get_events(@NativeType("struct io_uring *") IOURing ring) {
        return nio_uring_submit_and_get_events(ring.address());
    }

    public static int io_uring_enter(@NativeType("unsigned int") int fd, @NativeType("unsigned int") int to_submit, @NativeType("unsigned int") int min_complete, @NativeType("unsigned int") int flags, @NativeType("sigset_t *") long sig) {
        if (Checks.CHECKS) {
            Checks.check(sig);
        }
        return nio_uring_enter(fd, to_submit, min_complete, flags, sig);
    }

    public static int io_uring_enter2(@NativeType("unsigned int") int fd, @NativeType("unsigned int") int to_submit, @NativeType("unsigned int") int min_complete, @NativeType("unsigned int") int flags, @NativeType("void *") ByteBuffer arg) {
        return nio_uring_enter2(fd, to_submit, min_complete, flags, MemoryUtil.memAddress(arg), arg.remaining());
    }

    public static int io_uring_setup(@NativeType("unsigned int") int entries, @NativeType("struct io_uring_params *") IOURingParams p) {
        return nio_uring_setup(entries, p.address());
    }

    public static int io_uring_register_region(@NativeType("struct io_uring *") IOURing ring, @NativeType("struct io_uring_mem_region_reg *") IOURingMemRegionReg reg) {
        return nio_uring_register_region(ring.address(), reg.address());
    }

    @NativeType("struct io_uring_buf_ring *")
    public static IOURingBufRing io_uring_setup_buf_ring(@NativeType("struct io_uring *") IOURing ring, @NativeType("unsigned int") int nentries, int bgid, @NativeType("unsigned int") int flags, @NativeType("int *") IntBuffer err) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) err, 1);
        }
        long __result = nio_uring_setup_buf_ring(ring.address(), nentries, bgid, flags, MemoryUtil.memAddress(err));
        return IOURingBufRing.createSafe(__result);
    }

    public static int io_uring_free_buf_ring(@NativeType("struct io_uring *") IOURing ring, @NativeType("struct io_uring_buf_ring *") IOURingBufRing br, @NativeType("unsigned int") int nentries, int bgid) {
        return nio_uring_free_buf_ring(ring.address(), br.address(), nentries, bgid);
    }

    public static int io_uring_set_iowait(@NativeType("struct io_uring *") IOURing ring, @NativeType("bool") boolean enable_iowait) {
        return nio_uring_set_iowait(ring.address(), enable_iowait);
    }

    @NativeType("unsigned")
    public static int io_uring_cqe_shift(@NativeType("struct io_uring const *") IOURing ring) {
        if (Checks.CHECKS) {
            IOURing.validate(ring.address());
        }
        return nio_uring_cqe_shift(ring.address());
    }

    @NativeType("unsigned")
    public static int io_uring_cqe_nr(@NativeType("struct io_uring_cqe const *") IOURingCQE cqe) {
        return nio_uring_cqe_nr(cqe.address());
    }

    public static void io_uring_cq_advance(@NativeType("struct io_uring *") IOURing ring, @NativeType("unsigned") int nr) {
        nio_uring_cq_advance(ring.address(), nr);
    }

    public static void io_uring_cqe_seen(@NativeType("struct io_uring *") IOURing ring, @NativeType("struct io_uring_cqe *") IOURingCQE cqe) {
        nio_uring_cqe_seen(ring.address(), cqe.address());
    }

    public static void io_uring_sqe_set_data(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("void *") long data) {
        if (Checks.CHECKS) {
            Checks.check(data);
        }
        nio_uring_sqe_set_data(sqe.address(), data);
    }

    @NativeType("void *")
    public static long io_uring_cqe_get_data(@NativeType("struct io_uring_cqe const *") IOURingCQE cqe) {
        return nio_uring_cqe_get_data(cqe.address());
    }

    public static void io_uring_sqe_set_data64(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("__u64") long data) {
        nio_uring_sqe_set_data64(sqe.address(), data);
    }

    @NativeType("__u64")
    public static long io_uring_cqe_get_data64(@NativeType("struct io_uring_cqe const *") IOURingCQE cqe) {
        return nio_uring_cqe_get_data64(cqe.address());
    }

    public static void io_uring_sqe_set_flags(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("unsigned int") int flags) {
        nio_uring_sqe_set_flags(sqe.address(), flags);
    }

    public static void io_uring_sqe_set_buf_group(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int bgid) {
        nio_uring_sqe_set_buf_group(sqe.address(), bgid);
    }

    public static void io_uring_initialize_sqe(@NativeType("struct io_uring_sqe *") IOURingSQE sqe) {
        nio_uring_initialize_sqe(sqe.address());
    }

    public static void io_uring_prep_splice(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd_in, @NativeType("int64_t") long off_in, int fd_out, @NativeType("int64_t") long off_out, @NativeType("unsigned int") int nbytes, @NativeType("unsigned int") int splice_flags) {
        nio_uring_prep_splice(sqe.address(), fd_in, off_in, fd_out, off_out, nbytes, splice_flags);
    }

    public static void io_uring_prep_tee(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd_in, int fd_out, @NativeType("unsigned int") int nbytes, @NativeType("unsigned int") int splice_flags) {
        nio_uring_prep_tee(sqe.address(), fd_in, fd_out, nbytes, splice_flags);
    }

    public static void io_uring_prep_readv(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("struct iovec const *") IOVec.Buffer iovecs, int offset) {
        nio_uring_prep_readv(sqe.address(), fd, iovecs.address(), iovecs.remaining(), offset);
    }

    public static void io_uring_prep_readv2(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("struct iovec const *") IOVec.Buffer iovecs, int offset, int flags) {
        nio_uring_prep_readv2(sqe.address(), fd, iovecs.address(), iovecs.remaining(), offset, flags);
    }

    public static void io_uring_prep_read_fixed(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("void *") ByteBuffer buf, @NativeType("__u64") long offset, int buf_index) {
        nio_uring_prep_read_fixed(sqe.address(), fd, MemoryUtil.memAddress(buf), buf.remaining(), offset, buf_index);
    }

    public static void io_uring_prep_readv_fixed(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("struct iovec const *") IOVec.Buffer iovecs, @NativeType("__u64") long offset, int flags, int buf_index) {
        nio_uring_prep_readv_fixed(sqe.address(), fd, iovecs.address(), iovecs.remaining(), offset, flags, buf_index);
    }

    public static void io_uring_prep_writev(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("struct iovec const *") IOVec.Buffer iovecs, @NativeType("__u64") long offset) {
        nio_uring_prep_writev(sqe.address(), fd, iovecs.address(), iovecs.remaining(), offset);
    }

    public static void io_uring_prep_writev2(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("struct iovec const *") IOVec.Buffer iovecs, @NativeType("__u64") long offset, int flags) {
        nio_uring_prep_writev2(sqe.address(), fd, iovecs.address(), iovecs.remaining(), offset, flags);
    }

    public static void io_uring_prep_write_fixed(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("void const *") ByteBuffer buf, @NativeType("__u64") long offset, int buf_index) {
        nio_uring_prep_write_fixed(sqe.address(), fd, MemoryUtil.memAddress(buf), buf.remaining(), offset, buf_index);
    }

    public static void io_uring_prep_writev_fixed(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("struct iovec const *") IOVec.Buffer iovecs, @NativeType("__u64") long offset, int flags, int buf_index) {
        nio_uring_prep_writev_fixed(sqe.address(), fd, iovecs.address(), iovecs.remaining(), offset, flags, buf_index);
    }

    public static void io_uring_prep_recvmsg(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("struct msghdr *") Msghdr msg, @NativeType("unsigned") int flags) {
        nio_uring_prep_recvmsg(sqe.address(), fd, msg.address(), flags);
    }

    public static void io_uring_prep_recvmsg_multishot(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("struct msghdr *") Msghdr msg, @NativeType("unsigned") int flags) {
        nio_uring_prep_recvmsg_multishot(sqe.address(), fd, msg.address(), flags);
    }

    public static void io_uring_prep_sendmsg(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("struct msghdr const *") Msghdr msg, @NativeType("unsigned") int flags) {
        if (Checks.CHECKS) {
            Msghdr.validate(msg.address());
        }
        nio_uring_prep_sendmsg(sqe.address(), fd, msg.address(), flags);
    }

    public static void io_uring_prep_poll_add(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("unsigned") int poll_mask) {
        nio_uring_prep_poll_add(sqe.address(), fd, poll_mask);
    }

    public static void io_uring_prep_poll_multishot(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("unsigned") int poll_mask) {
        nio_uring_prep_poll_multishot(sqe.address(), fd, poll_mask);
    }

    public static void io_uring_prep_poll_remove(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("__u64") long user_data) {
        nio_uring_prep_poll_remove(sqe.address(), user_data);
    }

    public static void io_uring_prep_poll_update(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("__u64") long old_user_data, @NativeType("__u64") long new_user_data, @NativeType("unsigned") int poll_mask, @NativeType("unsigned") int flags) {
        nio_uring_prep_poll_update(sqe.address(), old_user_data, new_user_data, poll_mask, flags);
    }

    public static void io_uring_prep_fsync(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("unsigned") int fsync_flags) {
        nio_uring_prep_fsync(sqe.address(), fd, fsync_flags);
    }

    public static void io_uring_prep_nop(@NativeType("struct io_uring_sqe *") IOURingSQE sqe) {
        nio_uring_prep_nop(sqe.address());
    }

    public static void io_uring_prep_nop128(@NativeType("struct io_uring_sqe *") IOURingSQE sqe) {
        nio_uring_prep_nop128(sqe.address());
    }

    public static void io_uring_prep_timeout(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("struct __kernel_timespec const *") KernelTimespec ts, @NativeType("unsigned") int count, @NativeType("unsigned") int flags) {
        nio_uring_prep_timeout(sqe.address(), ts.address(), count, flags);
    }

    public static void io_uring_prep_timeout_remove(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("__u64") long user_data, @NativeType("unsigned") int flags) {
        nio_uring_prep_timeout_remove(sqe.address(), user_data, flags);
    }

    public static void io_uring_prep_timeout_update(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("struct __kernel_timespec const *") KernelTimespec ts, @NativeType("__u64") long user_data, @NativeType("unsigned") int flags) {
        nio_uring_prep_timeout_update(sqe.address(), ts.address(), user_data, flags);
    }

    public static void io_uring_prep_accept(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("struct sockaddr *") Sockaddr addr, @NativeType("socklen_t *") IntBuffer addrlen, int flags) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) addrlen, 1);
        }
        nio_uring_prep_accept(sqe.address(), fd, addr.address(), MemoryUtil.memAddress(addrlen), flags);
    }

    public static void io_uring_prep_accept_direct(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("struct sockaddr *") Sockaddr addr, @NativeType("socklen_t *") IntBuffer addrlen, int flags, @NativeType("unsigned int") int file_index) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) addrlen, 1);
        }
        nio_uring_prep_accept_direct(sqe.address(), fd, addr.address(), MemoryUtil.memAddress(addrlen), flags, file_index);
    }

    public static void io_uring_prep_multishot_accept(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("struct sockaddr *") Sockaddr addr, @NativeType("socklen_t *") IntBuffer addrlen, int flags) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) addrlen, 1);
        }
        nio_uring_prep_multishot_accept(sqe.address(), fd, addr.address(), MemoryUtil.memAddress(addrlen), flags);
    }

    public static void io_uring_prep_multishot_accept_direct(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("struct sockaddr *") Sockaddr addr, @NativeType("socklen_t *") IntBuffer addrlen, int flags) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) addrlen, 1);
        }
        nio_uring_prep_multishot_accept_direct(sqe.address(), fd, addr.address(), MemoryUtil.memAddress(addrlen), flags);
    }

    public static void io_uring_prep_cancel64(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("__u64") long user_data, int flags) {
        nio_uring_prep_cancel64(sqe.address(), user_data, flags);
    }

    public static void io_uring_prep_cancel(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("void *") long user_data, int flags) {
        nio_uring_prep_cancel(sqe.address(), user_data, flags);
    }

    public static void io_uring_prep_cancel_fd(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("unsigned int") int flags) {
        nio_uring_prep_cancel_fd(sqe.address(), fd, flags);
    }

    public static void io_uring_prep_link_timeout(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("struct __kernel_timespec const *") KernelTimespec ts, @NativeType("unsigned") int flags) {
        nio_uring_prep_link_timeout(sqe.address(), ts.address(), flags);
    }

    public static void io_uring_prep_connect(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("struct sockaddr const *") Sockaddr addr, @NativeType("socklen_t") int addrlen) {
        nio_uring_prep_connect(sqe.address(), fd, addr.address(), addrlen);
    }

    public static void io_uring_prep_bind(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("struct sockaddr const *") Sockaddr addr, @NativeType("socklen_t") int addrlen) {
        nio_uring_prep_bind(sqe.address(), fd, addr.address(), addrlen);
    }

    public static void io_uring_prep_listen(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, int backlog) {
        nio_uring_prep_listen(sqe.address(), fd, backlog);
    }

    public static void io_uring_prep_epoll_wait(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("struct epoll_event *") EpollEvent.Buffer events, @NativeType("unsigned") int flags) {
        nio_uring_prep_epoll_wait(sqe.address(), fd, events.address(), events.remaining(), flags);
    }

    public static void io_uring_prep_files_update(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("int const *") IntBuffer fds, int offset) {
        nio_uring_prep_files_update(sqe.address(), MemoryUtil.memAddress(fds), fds.remaining(), offset);
    }

    public static void io_uring_prep_fallocate(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, int mode, @NativeType("__u64") long offset, @NativeType("__u64") long len) {
        nio_uring_prep_fallocate(sqe.address(), fd, mode, offset, len);
    }

    public static void io_uring_prep_openat(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int dfd, @NativeType("char const *") ByteBuffer path, int flags, int mode) {
        if (Checks.CHECKS) {
            Checks.checkNT1(path);
        }
        nio_uring_prep_openat(sqe.address(), dfd, MemoryUtil.memAddress(path), flags, mode);
    }

    public static void io_uring_prep_openat(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int dfd, @NativeType("char const *") CharSequence path, int flags, int mode) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            nio_uring_prep_openat(sqe.address(), dfd, pathEncoded, flags, mode);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void io_uring_prep_openat_direct(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int dfd, @NativeType("char const *") ByteBuffer path, int flags, int mode, @NativeType("unsigned int") int file_index) {
        if (Checks.CHECKS) {
            Checks.checkNT1(path);
        }
        nio_uring_prep_openat_direct(sqe.address(), dfd, MemoryUtil.memAddress(path), flags, mode, file_index);
    }

    public static void io_uring_prep_openat_direct(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int dfd, @NativeType("char const *") CharSequence path, int flags, int mode, @NativeType("unsigned int") int file_index) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            nio_uring_prep_openat_direct(sqe.address(), dfd, pathEncoded, flags, mode, file_index);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void io_uring_prep_open(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("char const *") ByteBuffer path, int flags, @NativeType("mode_t") int mode) {
        if (Checks.CHECKS) {
            Checks.checkNT1(path);
        }
        nio_uring_prep_open(sqe.address(), MemoryUtil.memAddress(path), flags, mode);
    }

    public static void io_uring_prep_open(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("char const *") CharSequence path, int flags, @NativeType("mode_t") int mode) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            nio_uring_prep_open(sqe.address(), pathEncoded, flags, mode);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void io_uring_prep_open_direct(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("char const *") ByteBuffer path, int flags, @NativeType("mode_t") int mode, @NativeType("unsigned") int file_index) {
        if (Checks.CHECKS) {
            Checks.checkNT1(path);
        }
        nio_uring_prep_open_direct(sqe.address(), MemoryUtil.memAddress(path), flags, mode, file_index);
    }

    public static void io_uring_prep_open_direct(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("char const *") CharSequence path, int flags, @NativeType("mode_t") int mode, @NativeType("unsigned") int file_index) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            nio_uring_prep_open_direct(sqe.address(), pathEncoded, flags, mode, file_index);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void io_uring_prep_close(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd) {
        nio_uring_prep_close(sqe.address(), fd);
    }

    public static void io_uring_prep_close_direct(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("unsigned int") int file_index) {
        nio_uring_prep_close_direct(sqe.address(), file_index);
    }

    public static void io_uring_prep_read(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("void *") ByteBuffer buf, @NativeType("__u64") long offset) {
        nio_uring_prep_read(sqe.address(), fd, MemoryUtil.memAddress(buf), buf.remaining(), offset);
    }

    public static void io_uring_prep_read_multishot(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("unsigned int") int nbytes, @NativeType("__u64") long offset, int buf_group) {
        nio_uring_prep_read_multishot(sqe.address(), fd, nbytes, offset, buf_group);
    }

    public static void io_uring_prep_write(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("void const *") ByteBuffer buf, @NativeType("__u64") long offset) {
        nio_uring_prep_write(sqe.address(), fd, MemoryUtil.memAddress(buf), buf.remaining(), offset);
    }

    public static void io_uring_prep_statx(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int dfd, @NativeType("char const *") ByteBuffer path, int flags, @NativeType("unsigned") int mask, @NativeType("struct statx *") Statx statxbuf) {
        if (Checks.CHECKS) {
            Checks.checkNT1(path);
        }
        nio_uring_prep_statx(sqe.address(), dfd, MemoryUtil.memAddress(path), flags, mask, statxbuf.address());
    }

    public static void io_uring_prep_statx(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int dfd, @NativeType("char const *") CharSequence path, int flags, @NativeType("unsigned") int mask, @NativeType("struct statx *") Statx statxbuf) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            nio_uring_prep_statx(sqe.address(), dfd, pathEncoded, flags, mask, statxbuf.address());
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void io_uring_prep_fadvise(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("__u64") long offset, @NativeType("__u32") int len, int advice) {
        nio_uring_prep_fadvise(sqe.address(), fd, offset, len, advice);
    }

    public static void io_uring_prep_madvise(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("void *") ByteBuffer addr, int advice) {
        nio_uring_prep_madvise(sqe.address(), MemoryUtil.memAddress(addr), addr.remaining(), advice);
    }

    public static void io_uring_prep_fadvise64(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("__u64") long offset, @NativeType("off_t") long len, int advice) {
        nio_uring_prep_fadvise64(sqe.address(), fd, offset, len, advice);
    }

    public static void io_uring_prep_madvise64(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("void *") ByteBuffer addr, int advice) {
        nio_uring_prep_madvise64(sqe.address(), MemoryUtil.memAddress(addr), addr.remaining(), advice);
    }

    public static void io_uring_prep_send(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int sockfd, @NativeType("void const *") ByteBuffer buf, int flags) {
        nio_uring_prep_send(sqe.address(), sockfd, MemoryUtil.memAddress(buf), buf.remaining(), flags);
    }

    public static void io_uring_prep_send_bundle(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int sockfd, @NativeType("size_t") long len, int flags) {
        nio_uring_prep_send_bundle(sqe.address(), sockfd, len, flags);
    }

    public static void io_uring_prep_send_set_addr(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("struct sockaddr const *") Sockaddr dest_addr, @NativeType("__u16") short addr_len) {
        nio_uring_prep_send_set_addr(sqe.address(), dest_addr.address(), addr_len);
    }

    public static void io_uring_prep_sendto(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int sockfd, @NativeType("void const *") ByteBuffer buf, int flags, @NativeType("struct sockaddr const *") Sockaddr addr, @NativeType("socklen_t") int addrlen) {
        nio_uring_prep_sendto(sqe.address(), sockfd, MemoryUtil.memAddress(buf), buf.remaining(), flags, addr.address(), addrlen);
    }

    public static void io_uring_prep_send_zc(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int sockfd, @NativeType("void const *") ByteBuffer buf, int flags, @NativeType("unsigned") int zc_flags) {
        nio_uring_prep_send_zc(sqe.address(), sockfd, MemoryUtil.memAddress(buf), buf.remaining(), flags, zc_flags);
    }

    public static void io_uring_prep_send_zc_fixed(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int sockfd, @NativeType("void const *") ByteBuffer buf, int flags, @NativeType("unsigned") int zc_flags, @NativeType("unsigned") int buf_index) {
        nio_uring_prep_send_zc_fixed(sqe.address(), sockfd, MemoryUtil.memAddress(buf), buf.remaining(), flags, zc_flags, buf_index);
    }

    public static void io_uring_prep_sendmsg_zc(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("struct msghdr const *") Msghdr msg, @NativeType("unsigned") int flags) {
        if (Checks.CHECKS) {
            Msghdr.validate(msg.address());
        }
        nio_uring_prep_sendmsg_zc(sqe.address(), fd, msg.address(), flags);
    }

    public static void io_uring_prep_sendmsg_zc_fixed(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("struct msghdr const *") Msghdr msg, @NativeType("unsigned") int flags, @NativeType("unsigned") int buf_index) {
        if (Checks.CHECKS) {
            Msghdr.validate(msg.address());
        }
        nio_uring_prep_sendmsg_zc_fixed(sqe.address(), fd, msg.address(), flags, buf_index);
    }

    public static void io_uring_prep_recv(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int sockfd, @NativeType("void *") ByteBuffer buf, int flags) {
        nio_uring_prep_recv(sqe.address(), sockfd, MemoryUtil.memAddress(buf), buf.remaining(), flags);
    }

    public static void io_uring_prep_recv_multishot(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int sockfd, @NativeType("void *") ByteBuffer buf, int flags) {
        nio_uring_prep_recv_multishot(sqe.address(), sockfd, MemoryUtil.memAddress(buf), buf.remaining(), flags);
    }

    @NativeType("struct io_uring_recvmsg_out *")
    public static IOURingRecvmsgOut io_uring_recvmsg_validate(@NativeType("void *") ByteBuffer buf, @NativeType("struct msghdr *") Msghdr msgh) {
        long __result = nio_uring_recvmsg_validate(MemoryUtil.memAddress(buf), buf.remaining(), msgh.address());
        return IOURingRecvmsgOut.createSafe(__result);
    }

    @NativeType("void *")
    public static long io_uring_recvmsg_name(@NativeType("struct io_uring_recvmsg_out *") IOURingRecvmsgOut o) {
        return nio_uring_recvmsg_name(o.address());
    }

    @NativeType("struct cmsghdr *")
    public static CMsghdr io_uring_recvmsg_cmsg_firsthdr(@NativeType("struct io_uring_recvmsg_out *") IOURingRecvmsgOut o, @NativeType("struct msghdr *") Msghdr msgh) {
        long __result = nio_uring_recvmsg_cmsg_firsthdr(o.address(), msgh.address());
        return CMsghdr.createSafe(__result);
    }

    @NativeType("struct cmsghdr *")
    public static CMsghdr io_uring_recvmsg_cmsg_nexthdr(@NativeType("struct io_uring_recvmsg_out *") IOURingRecvmsgOut o, @NativeType("struct msghdr *") Msghdr msgh, @NativeType("struct cmsghdr *") CMsghdr cmsg) {
        long __result = nio_uring_recvmsg_cmsg_nexthdr(o.address(), msgh.address(), cmsg.address());
        return CMsghdr.createSafe(__result);
    }

    @NativeType("void *")
    public static long io_uring_recvmsg_payload(@NativeType("struct io_uring_recvmsg_out *") IOURingRecvmsgOut o, @NativeType("struct msghdr *") Msghdr msgh) {
        return nio_uring_recvmsg_payload(o.address(), msgh.address());
    }

    @NativeType("unsigned int")
    public static int io_uring_recvmsg_payload_length(@NativeType("struct io_uring_recvmsg_out *") IOURingRecvmsgOut o, int buf_len, @NativeType("struct msghdr *") Msghdr msgh) {
        return nio_uring_recvmsg_payload_length(o.address(), buf_len, msgh.address());
    }

    public static void io_uring_prep_openat2(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int dfd, @NativeType("char const *") ByteBuffer path, @NativeType("struct open_how const *") OpenHow how) {
        if (Checks.CHECKS) {
            Checks.checkNT1(path);
        }
        nio_uring_prep_openat2(sqe.address(), dfd, MemoryUtil.memAddress(path), how.address());
    }

    public static void io_uring_prep_openat2(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int dfd, @NativeType("char const *") CharSequence path, @NativeType("struct open_how const *") OpenHow how) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            nio_uring_prep_openat2(sqe.address(), dfd, pathEncoded, how.address());
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void io_uring_prep_openat2_direct(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int dfd, @NativeType("char const *") ByteBuffer path, @NativeType("struct open_how const *") OpenHow how, @NativeType("unsigned") int file_index) {
        if (Checks.CHECKS) {
            Checks.checkNT1(path);
        }
        nio_uring_prep_openat2_direct(sqe.address(), dfd, MemoryUtil.memAddress(path), how.address(), file_index);
    }

    public static void io_uring_prep_openat2_direct(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int dfd, @NativeType("char const *") CharSequence path, @NativeType("struct open_how const *") OpenHow how, @NativeType("unsigned") int file_index) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            nio_uring_prep_openat2_direct(sqe.address(), dfd, pathEncoded, how.address(), file_index);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void io_uring_prep_epoll_ctl(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int epfd, int fd, int op, @NativeType("struct epoll_event const *") EpollEvent ev) {
        nio_uring_prep_epoll_ctl(sqe.address(), epfd, fd, op, ev.address());
    }

    public static void io_uring_prep_provide_buffers(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("void *") ByteBuffer addr, int nr, int bgid, int bid) {
        nio_uring_prep_provide_buffers(sqe.address(), MemoryUtil.memAddress(addr), addr.remaining(), nr, bgid, bid);
    }

    public static void io_uring_prep_remove_buffers(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int nr, int bgid) {
        nio_uring_prep_remove_buffers(sqe.address(), nr, bgid);
    }

    public static void io_uring_prep_shutdown(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, int how) {
        nio_uring_prep_shutdown(sqe.address(), fd, how);
    }

    public static void io_uring_prep_unlinkat(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int dfd, @NativeType("char const *") ByteBuffer path, int flags) {
        if (Checks.CHECKS) {
            Checks.checkNT1(path);
        }
        nio_uring_prep_unlinkat(sqe.address(), dfd, MemoryUtil.memAddress(path), flags);
    }

    public static void io_uring_prep_unlinkat(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int dfd, @NativeType("char const *") CharSequence path, int flags) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            nio_uring_prep_unlinkat(sqe.address(), dfd, pathEncoded, flags);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void io_uring_prep_unlink(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("char const *") ByteBuffer path, int flags) {
        if (Checks.CHECKS) {
            Checks.checkNT1(path);
        }
        nio_uring_prep_unlink(sqe.address(), MemoryUtil.memAddress(path), flags);
    }

    public static void io_uring_prep_unlink(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("char const *") CharSequence path, int flags) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            nio_uring_prep_unlink(sqe.address(), pathEncoded, flags);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void io_uring_prep_renameat(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int olddfd, @NativeType("char const *") ByteBuffer oldpath, int newdfd, @NativeType("char const *") ByteBuffer newpath, @NativeType("unsigned int") int flags) {
        if (Checks.CHECKS) {
            Checks.checkNT1(oldpath);
            Checks.checkNT1(newpath);
        }
        nio_uring_prep_renameat(sqe.address(), olddfd, MemoryUtil.memAddress(oldpath), newdfd, MemoryUtil.memAddress(newpath), flags);
    }

    public static void io_uring_prep_renameat(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int olddfd, @NativeType("char const *") CharSequence oldpath, int newdfd, @NativeType("char const *") CharSequence newpath, @NativeType("unsigned int") int flags) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(oldpath, true);
            long oldpathEncoded = stack.getPointerAddress();
            stack.nUTF8(newpath, true);
            long newpathEncoded = stack.getPointerAddress();
            nio_uring_prep_renameat(sqe.address(), olddfd, oldpathEncoded, newdfd, newpathEncoded, flags);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void io_uring_prep_rename(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("char const *") ByteBuffer oldpath, @NativeType("char const *") ByteBuffer newpath) {
        if (Checks.CHECKS) {
            Checks.checkNT1(oldpath);
            Checks.checkNT1(newpath);
        }
        nio_uring_prep_rename(sqe.address(), MemoryUtil.memAddress(oldpath), MemoryUtil.memAddress(newpath));
    }

    public static void io_uring_prep_rename(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("char const *") CharSequence oldpath, @NativeType("char const *") CharSequence newpath) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(oldpath, true);
            long oldpathEncoded = stack.getPointerAddress();
            stack.nUTF8(newpath, true);
            long newpathEncoded = stack.getPointerAddress();
            nio_uring_prep_rename(sqe.address(), oldpathEncoded, newpathEncoded);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void io_uring_prep_sync_file_range(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("unsigned") int len, @NativeType("__u64") long offset, int flags) {
        nio_uring_prep_sync_file_range(sqe.address(), fd, len, offset, flags);
    }

    public static void io_uring_prep_mkdirat(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int dfd, @NativeType("char const *") ByteBuffer path, int mode) {
        if (Checks.CHECKS) {
            Checks.checkNT1(path);
        }
        nio_uring_prep_mkdirat(sqe.address(), dfd, MemoryUtil.memAddress(path), mode);
    }

    public static void io_uring_prep_mkdirat(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int dfd, @NativeType("char const *") CharSequence path, int mode) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            nio_uring_prep_mkdirat(sqe.address(), dfd, pathEncoded, mode);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void io_uring_prep_mkdir(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("char const *") ByteBuffer path, int mode) {
        if (Checks.CHECKS) {
            Checks.checkNT1(path);
        }
        nio_uring_prep_mkdir(sqe.address(), MemoryUtil.memAddress(path), mode);
    }

    public static void io_uring_prep_mkdir(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("char const *") CharSequence path, int mode) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            nio_uring_prep_mkdir(sqe.address(), pathEncoded, mode);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void io_uring_prep_symlinkat(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("char const *") ByteBuffer target, int newdirfd, @NativeType("char const *") ByteBuffer linkpath) {
        if (Checks.CHECKS) {
            Checks.checkNT1(target);
            Checks.checkNT1(linkpath);
        }
        nio_uring_prep_symlinkat(sqe.address(), MemoryUtil.memAddress(target), newdirfd, MemoryUtil.memAddress(linkpath));
    }

    public static void io_uring_prep_symlinkat(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("char const *") CharSequence target, int newdirfd, @NativeType("char const *") CharSequence linkpath) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(target, true);
            long targetEncoded = stack.getPointerAddress();
            stack.nUTF8(linkpath, true);
            long linkpathEncoded = stack.getPointerAddress();
            nio_uring_prep_symlinkat(sqe.address(), targetEncoded, newdirfd, linkpathEncoded);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void io_uring_prep_symlink(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("char const *") ByteBuffer target, @NativeType("char const *") ByteBuffer linkpath) {
        if (Checks.CHECKS) {
            Checks.checkNT1(target);
            Checks.checkNT1(linkpath);
        }
        nio_uring_prep_symlink(sqe.address(), MemoryUtil.memAddress(target), MemoryUtil.memAddress(linkpath));
    }

    public static void io_uring_prep_symlink(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("char const *") CharSequence target, @NativeType("char const *") CharSequence linkpath) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(target, true);
            long targetEncoded = stack.getPointerAddress();
            stack.nUTF8(linkpath, true);
            long linkpathEncoded = stack.getPointerAddress();
            nio_uring_prep_symlink(sqe.address(), targetEncoded, linkpathEncoded);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void io_uring_prep_linkat(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int olddfd, @NativeType("char const *") ByteBuffer oldpath, int newdfd, @NativeType("char const *") ByteBuffer newpath, int flags) {
        if (Checks.CHECKS) {
            Checks.checkNT1(oldpath);
            Checks.checkNT1(newpath);
        }
        nio_uring_prep_linkat(sqe.address(), olddfd, MemoryUtil.memAddress(oldpath), newdfd, MemoryUtil.memAddress(newpath), flags);
    }

    public static void io_uring_prep_linkat(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int olddfd, @NativeType("char const *") CharSequence oldpath, int newdfd, @NativeType("char const *") CharSequence newpath, int flags) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(oldpath, true);
            long oldpathEncoded = stack.getPointerAddress();
            stack.nUTF8(newpath, true);
            long newpathEncoded = stack.getPointerAddress();
            nio_uring_prep_linkat(sqe.address(), olddfd, oldpathEncoded, newdfd, newpathEncoded, flags);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void io_uring_prep_link(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("char const *") ByteBuffer oldpath, @NativeType("char const *") ByteBuffer newpath, int flags) {
        if (Checks.CHECKS) {
            Checks.checkNT1(oldpath);
            Checks.checkNT1(newpath);
        }
        nio_uring_prep_link(sqe.address(), MemoryUtil.memAddress(oldpath), MemoryUtil.memAddress(newpath), flags);
    }

    public static void io_uring_prep_link(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("char const *") CharSequence oldpath, @NativeType("char const *") CharSequence newpath, int flags) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(oldpath, true);
            long oldpathEncoded = stack.getPointerAddress();
            stack.nUTF8(newpath, true);
            long newpathEncoded = stack.getPointerAddress();
            nio_uring_prep_link(sqe.address(), oldpathEncoded, newpathEncoded, flags);
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void io_uring_prep_msg_ring_cqe_flags(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("unsigned int") int len, @NativeType("__u64") long data, @NativeType("unsigned int") int flags, @NativeType("unsigned int") int cqe_flags) {
        nio_uring_prep_msg_ring_cqe_flags(sqe.address(), fd, len, data, flags, cqe_flags);
    }

    public static void io_uring_prep_msg_ring(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("unsigned int") int len, @NativeType("__u64") long data, @NativeType("unsigned int") int flags) {
        nio_uring_prep_msg_ring(sqe.address(), fd, len, data, flags);
    }

    public static void io_uring_prep_msg_ring_fd(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, int source_fd, int target_fd, @NativeType("__u64") long data, @NativeType("unsigned int") int flags) {
        nio_uring_prep_msg_ring_fd(sqe.address(), fd, source_fd, target_fd, data, flags);
    }

    public static void io_uring_prep_msg_ring_fd_alloc(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, int source_fd, @NativeType("__u64") long data, @NativeType("unsigned int") int flags) {
        nio_uring_prep_msg_ring_fd_alloc(sqe.address(), fd, source_fd, data, flags);
    }

    public static void io_uring_prep_getxattr(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("char const *") ByteBuffer name, @NativeType("char *") ByteBuffer value, @NativeType("char const *") ByteBuffer path) {
        if (Checks.CHECKS) {
            Checks.checkNT1(name);
            Checks.checkNT1(path);
        }
        nio_uring_prep_getxattr(sqe.address(), MemoryUtil.memAddress(name), MemoryUtil.memAddress(value), MemoryUtil.memAddress(path), value.remaining());
    }

    public static void io_uring_prep_getxattr(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("char const *") CharSequence name, @NativeType("char *") ByteBuffer value, @NativeType("char const *") CharSequence path) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            nio_uring_prep_getxattr(sqe.address(), nameEncoded, MemoryUtil.memAddress(value), pathEncoded, value.remaining());
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void io_uring_prep_setxattr(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("char const *") ByteBuffer name, @NativeType("char const *") ByteBuffer value, @NativeType("char const *") ByteBuffer path, int flags) {
        if (Checks.CHECKS) {
            Checks.checkNT1(name);
            Checks.checkNT1(path);
        }
        nio_uring_prep_setxattr(sqe.address(), MemoryUtil.memAddress(name), MemoryUtil.memAddress(value), MemoryUtil.memAddress(path), flags, value.remaining());
    }

    public static void io_uring_prep_setxattr(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("char const *") CharSequence name, @NativeType("char const *") ByteBuffer value, @NativeType("char const *") CharSequence path, int flags) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            stack.nUTF8(path, true);
            long pathEncoded = stack.getPointerAddress();
            nio_uring_prep_setxattr(sqe.address(), nameEncoded, MemoryUtil.memAddress(value), pathEncoded, flags, value.remaining());
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void io_uring_prep_fgetxattr(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("char const *") ByteBuffer name, @NativeType("char *") ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkNT1(name);
        }
        nio_uring_prep_fgetxattr(sqe.address(), fd, MemoryUtil.memAddress(name), MemoryUtil.memAddress(value), value.remaining());
    }

    public static void io_uring_prep_fgetxattr(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("char const *") CharSequence name, @NativeType("char *") ByteBuffer value) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            nio_uring_prep_fgetxattr(sqe.address(), fd, nameEncoded, MemoryUtil.memAddress(value), value.remaining());
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void io_uring_prep_fsetxattr(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("char const *") ByteBuffer name, @NativeType("char const *") ByteBuffer value, int flags) {
        if (Checks.CHECKS) {
            Checks.checkNT1(name);
        }
        nio_uring_prep_fsetxattr(sqe.address(), fd, MemoryUtil.memAddress(name), MemoryUtil.memAddress(value), flags, value.remaining());
    }

    public static void io_uring_prep_fsetxattr(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("char const *") CharSequence name, @NativeType("char const *") ByteBuffer value, int flags) {
        MemoryStack stack = MemoryStack.stackGet();
        int stackPointer = stack.getPointer();
        try {
            stack.nUTF8(name, true);
            long nameEncoded = stack.getPointerAddress();
            nio_uring_prep_fsetxattr(sqe.address(), fd, nameEncoded, MemoryUtil.memAddress(value), flags, value.remaining());
            stack.setPointer(stackPointer);
        } catch (Throwable th) {
            stack.setPointer(stackPointer);
            throw th;
        }
    }

    public static void io_uring_prep_socket(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int domain, int type, int protocol, @NativeType("unsigned int") int flags) {
        nio_uring_prep_socket(sqe.address(), domain, type, protocol, flags);
    }

    public static void io_uring_prep_socket_direct(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int domain, int type, int protocol, @NativeType("unsigned") int file_index, @NativeType("unsigned int") int flags) {
        nio_uring_prep_socket_direct(sqe.address(), domain, type, protocol, file_index, flags);
    }

    public static void io_uring_prep_socket_direct_alloc(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int domain, int type, int protocol, @NativeType("unsigned int") int flags) {
        nio_uring_prep_socket_direct_alloc(sqe.address(), domain, type, protocol, flags);
    }

    public static void io_uring_prep_uring_cmd(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int cmd_op, int fd) {
        nio_uring_prep_uring_cmd(sqe.address(), cmd_op, fd);
    }

    public static void io_uring_prep_uring_cmd128(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int cmd_op, int fd) {
        nio_uring_prep_uring_cmd128(sqe.address(), cmd_op, fd);
    }

    public static void io_uring_prep_cmd_sock(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int cmd_op, int fd, int level, int optname, @NativeType("void *") ByteBuffer optval) {
        nio_uring_prep_cmd_sock(sqe.address(), cmd_op, fd, level, optname, MemoryUtil.memAddress(optval), optval.remaining());
    }

    public static void io_uring_prep_cmd_getsockname(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("struct sockaddr *") Sockaddr sockaddr, @NativeType("socklen_t *") IntBuffer sockaddr_len, int peer) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) sockaddr_len, 1);
        }
        nio_uring_prep_cmd_getsockname(sqe.address(), fd, sockaddr.address(), MemoryUtil.memAddress(sockaddr_len), peer);
    }

    public static void io_uring_prep_waitid(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("idtype_t") int idtype, @NativeType("id_t") int id, @NativeType("siginfo_t *") long infop, int options, @NativeType("unsigned int") int flags) {
        if (Checks.CHECKS) {
            Checks.check(infop);
        }
        nio_uring_prep_waitid(sqe.address(), idtype, id, infop, options, flags);
    }

    public static void io_uring_prep_futex_wake(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("uint32_t const *") IntBuffer futex, @NativeType("uint64_t") long val, @NativeType("uint64_t") long mask, @NativeType("uint32_t") int futex_flags, @NativeType("unsigned int") int flags) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) futex, 1);
        }
        nio_uring_prep_futex_wake(sqe.address(), MemoryUtil.memAddress(futex), val, mask, futex_flags, flags);
    }

    public static void io_uring_prep_futex_wait(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("uint32_t const *") IntBuffer futex, @NativeType("uint64_t") long val, @NativeType("uint64_t") long mask, @NativeType("uint32_t") int futex_flags, @NativeType("unsigned int") int flags) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) futex, 1);
        }
        nio_uring_prep_futex_wait(sqe.address(), MemoryUtil.memAddress(futex), val, mask, futex_flags, flags);
    }

    public static void io_uring_prep_futex_waitv(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("struct futex_waitv const *") PointerBuffer futex, @NativeType("unsigned int") int flags) {
        nio_uring_prep_futex_waitv(sqe.address(), MemoryUtil.memAddress(futex), futex.remaining(), flags);
    }

    public static void io_uring_prep_fixed_fd_install(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("unsigned int") int flags) {
        nio_uring_prep_fixed_fd_install(sqe.address(), fd, flags);
    }

    public static void io_uring_prep_ftruncate(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("loff_t") long len) {
        nio_uring_prep_ftruncate(sqe.address(), fd, len);
    }

    public static void io_uring_prep_cmd_discard(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, int fd, @NativeType("uint64_t") long offset, @NativeType("uint64_t") long nbytes) {
        nio_uring_prep_cmd_discard(sqe.address(), fd, offset, nbytes);
    }

    public static void io_uring_prep_pipe(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("int *") IntBuffer fds, int pipe_flags) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) fds, 2);
        }
        nio_uring_prep_pipe(sqe.address(), MemoryUtil.memAddress(fds), pipe_flags);
    }

    public static void io_uring_prep_pipe_direct(@NativeType("struct io_uring_sqe *") IOURingSQE sqe, @NativeType("int *") IntBuffer fds, int pipe_flags, @NativeType("unsigned int") int file_index) {
        if (Checks.CHECKS) {
            Checks.check((Buffer) fds, 2);
        }
        nio_uring_prep_pipe_direct(sqe.address(), MemoryUtil.memAddress(fds), pipe_flags, file_index);
    }

    @NativeType("unsigned")
    public static int io_uring_load_sq_head(@NativeType("struct io_uring const *") IOURing ring) {
        if (Checks.CHECKS) {
            IOURing.validate(ring.address());
        }
        return nio_uring_load_sq_head(ring.address());
    }

    @NativeType("unsigned int")
    public static int io_uring_sq_ready(@NativeType("struct io_uring const *") IOURing ring) {
        if (Checks.CHECKS) {
            IOURing.validate(ring.address());
        }
        return nio_uring_sq_ready(ring.address());
    }

    @NativeType("unsigned int")
    public static int io_uring_sq_space_left(@NativeType("struct io_uring const *") IOURing ring) {
        if (Checks.CHECKS) {
            IOURing.validate(ring.address());
        }
        return nio_uring_sq_space_left(ring.address());
    }

    @NativeType("unsigned")
    public static int io_uring_sqe_shift(@NativeType("struct io_uring const *") IOURing ring) {
        if (Checks.CHECKS) {
            IOURing.validate(ring.address());
        }
        return nio_uring_sqe_shift(ring.address());
    }

    public static int io_uring_sqring_wait(@NativeType("struct io_uring *") IOURing ring) {
        return nio_uring_sqring_wait(ring.address());
    }

    @NativeType("unsigned int")
    public static int io_uring_cq_ready(@NativeType("struct io_uring const *") IOURing ring) {
        if (Checks.CHECKS) {
            IOURing.validate(ring.address());
        }
        return nio_uring_cq_ready(ring.address());
    }

    @NativeType("bool")
    public static boolean io_uring_cq_has_overflow(@NativeType("struct io_uring const *") IOURing ring) {
        if (Checks.CHECKS) {
            IOURing.validate(ring.address());
        }
        return nio_uring_cq_has_overflow(ring.address());
    }

    @NativeType("bool")
    public static boolean io_uring_cq_eventfd_enabled(@NativeType("struct io_uring const *") IOURing ring) {
        if (Checks.CHECKS) {
            IOURing.validate(ring.address());
        }
        return nio_uring_cq_eventfd_enabled(ring.address());
    }

    public static int io_uring_cq_eventfd_toggle(@NativeType("struct io_uring *") IOURing ring, @NativeType("bool") boolean enabled) {
        return nio_uring_cq_eventfd_toggle(ring.address(), enabled);
    }

    public static int io_uring_wait_cqe_nr(@NativeType("struct io_uring *") IOURing ring, @NativeType("struct io_uring_cqe **") PointerBuffer cqe_ptr) {
        return nio_uring_wait_cqe_nr(ring.address(), MemoryUtil.memAddress(cqe_ptr), cqe_ptr.remaining());
    }

    public static int io_uring_peek_cqe(@NativeType("struct io_uring *") IOURing ring, @NativeType("struct io_uring_cqe **") PointerBuffer cqe_ptr) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) cqe_ptr, 1);
        }
        return nio_uring_peek_cqe(ring.address(), MemoryUtil.memAddress(cqe_ptr));
    }

    public static int io_uring_wait_cqe(@NativeType("struct io_uring *") IOURing ring, @NativeType("struct io_uring_cqe **") PointerBuffer cqe_ptr) {
        if (Checks.CHECKS) {
            Checks.check((CustomBuffer<?>) cqe_ptr, 1);
        }
        return nio_uring_wait_cqe(ring.address(), MemoryUtil.memAddress(cqe_ptr));
    }

    public static void io_uring_buf_ring_advance(@NativeType("struct io_uring_buf_ring *") IOURingBufRing br, int count) {
        nio_uring_buf_ring_advance(br.address(), count);
    }

    public static void io_uring_buf_ring_cq_advance(@NativeType("struct io_uring *") IOURing ring, @NativeType("struct io_uring_buf_ring *") IOURingBufRing br, int count) {
        nio_uring_buf_ring_cq_advance(ring.address(), br.address(), count);
    }

    public static int io_uring_buf_ring_available(@NativeType("struct io_uring *") IOURing ring, @NativeType("struct io_uring_buf_ring *") IOURingBufRing br, @NativeType("unsigned short") short bgid) {
        return nio_uring_buf_ring_available(ring.address(), br.address(), bgid);
    }

    @NativeType("struct io_uring_sqe *")
    public static IOURingSQE io_uring_get_sqe(@NativeType("struct io_uring *") IOURing ring) {
        long __result = nio_uring_get_sqe(ring.address());
        return IOURingSQE.createSafe(__result);
    }

    @NativeType("struct io_uring_sqe *")
    public static IOURingSQE io_uring_get_sqe128(@NativeType("struct io_uring *") IOURing ring) {
        long __result = nio_uring_get_sqe128(ring.address());
        return IOURingSQE.createSafe(__result);
    }

    public static int io_uring_mlock_size_params(@NativeType("unsigned") int entries, @NativeType("struct io_uring_params *") IOURingParams p) {
        return nio_uring_mlock_size_params(entries, p.address());
    }

    @NativeType("ssize_t")
    public static long io_uring_memory_size_params(@NativeType("unsigned") int entries, @NativeType("struct io_uring_params *") IOURingParams p) {
        return nio_uring_memory_size_params(entries, p.address());
    }

    public static int io_uring_buf_ring_mask(@NativeType("__u32") int ring_entries) {
        return ring_entries - 1;
    }

    public static void io_uring_buf_ring_init(@NativeType("struct io_uring_buf_ring *") IOURingBufRing br) {
        br.tail((short) 0);
    }

    public static void io_uring_buf_ring_add(@NativeType("struct io_uring_buf_ring *") IOURingBufRing br, @NativeType("void *") ByteBuffer addr, @NativeType("unsigned short") short bid, int mask, int buf_offset) {
        IOURingBuf buf = br.bufs((br.tail() + buf_offset) & mask);
        buf.addr(MemoryUtil.memAddress(addr));
        buf.len(addr.remaining());
        buf.bid(bid);
    }
}
