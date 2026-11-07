package org.lwjgl.system.linux.liburing;

import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.Checks;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.NativeResource;
import org.lwjgl.system.NativeType;
import org.lwjgl.system.Struct;
import org.lwjgl.system.StructBuffer;

/* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingSQE.class
 */
@NativeType("struct io_uring_sqe")
/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingSQE.class */
public class IOURingSQE extends Struct<IOURingSQE> implements NativeResource {
    public static final int SIZEOF;
    public static final int ALIGNOF;
    public static final int OPCODE;
    public static final int FLAGS;
    public static final int IOPRIO;
    public static final int FD;
    public static final int OFF;
    public static final int ADDR2;
    public static final int CMD_OP;
    public static final int __PAD1;
    public static final int ADDR;
    public static final int SPLICE_OFF_IN;
    public static final int LEVEL;
    public static final int OPTNAME;
    public static final int LEN;
    public static final int RW_FLAGS;
    public static final int FSYNC_FLAGS;
    public static final int POLL_EVENTS;
    public static final int POLL32_EVENTS;
    public static final int SYNC_RANGE_FLAGS;
    public static final int MSG_FLAGS;
    public static final int TIMEOUT_FLAGS;
    public static final int ACCEPT_FLAGS;
    public static final int CANCEL_FLAGS;
    public static final int OPEN_FLAGS;
    public static final int STATX_FLAGS;
    public static final int FADVISE_ADVICE;
    public static final int SPLICE_FLAGS;
    public static final int RENAME_FLAGS;
    public static final int UNLINK_FLAGS;
    public static final int HARDLINK_FLAGS;
    public static final int XATTR_FLAGS;
    public static final int MSG_RING_FLAGS;
    public static final int URING_CMD_FLAGS;
    public static final int WAITID_FLAGS;
    public static final int FUTEX_FLAGS;
    public static final int INSTALL_FD_FLAGS;
    public static final int NOP_FLAGS;
    public static final int PIPE_FLAGS;
    public static final int USER_DATA;
    public static final int BUF_INDEX;
    public static final int BUF_GROUP;
    public static final int PERSONALITY;
    public static final int SPLICE_FD_IN;
    public static final int FILE_INDEX;
    public static final int ZCRX_IFQ_IDX;
    public static final int OPTLEN;
    public static final int ADDR_LEN;
    public static final int __PAD3;
    public static final int ADDR3;
    public static final int __PAD2;
    public static final int ATTR_PTR;
    public static final int ATTR_TYPE_MASK;
    public static final int OPTVAL;
    public static final int CMD;

    static {
        Struct.Layout layout = __struct(__member(1), __member(1), __member(2), __member(4), __union(__member(8), __member(8), __struct(__member(4), __member(4))), __union(__member(8), __member(8), __struct(__member(4), __member(4))), __member(4), __union(__member(4), __member(4), __member(2), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4), __member(4)), __member(8), __union(__member(2), __member(2)), __member(2), __union(__member(4), __member(4), __member(4), __member(4), __struct(__member(2), __array(2, 1))), __union(__struct(__member(8), __array(8, 1)), __struct(__member(8), __member(8)), __member(8), __array(1, 0)));
        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();
        OPCODE = layout.offsetof(0);
        FLAGS = layout.offsetof(1);
        IOPRIO = layout.offsetof(2);
        FD = layout.offsetof(3);
        OFF = layout.offsetof(5);
        ADDR2 = layout.offsetof(6);
        CMD_OP = layout.offsetof(8);
        __PAD1 = layout.offsetof(9);
        ADDR = layout.offsetof(11);
        SPLICE_OFF_IN = layout.offsetof(12);
        LEVEL = layout.offsetof(14);
        OPTNAME = layout.offsetof(15);
        LEN = layout.offsetof(16);
        RW_FLAGS = layout.offsetof(18);
        FSYNC_FLAGS = layout.offsetof(19);
        POLL_EVENTS = layout.offsetof(20);
        POLL32_EVENTS = layout.offsetof(21);
        SYNC_RANGE_FLAGS = layout.offsetof(22);
        MSG_FLAGS = layout.offsetof(23);
        TIMEOUT_FLAGS = layout.offsetof(24);
        ACCEPT_FLAGS = layout.offsetof(25);
        CANCEL_FLAGS = layout.offsetof(26);
        OPEN_FLAGS = layout.offsetof(27);
        STATX_FLAGS = layout.offsetof(28);
        FADVISE_ADVICE = layout.offsetof(29);
        SPLICE_FLAGS = layout.offsetof(30);
        RENAME_FLAGS = layout.offsetof(31);
        UNLINK_FLAGS = layout.offsetof(32);
        HARDLINK_FLAGS = layout.offsetof(33);
        XATTR_FLAGS = layout.offsetof(34);
        MSG_RING_FLAGS = layout.offsetof(35);
        URING_CMD_FLAGS = layout.offsetof(36);
        WAITID_FLAGS = layout.offsetof(37);
        FUTEX_FLAGS = layout.offsetof(38);
        INSTALL_FD_FLAGS = layout.offsetof(39);
        NOP_FLAGS = layout.offsetof(40);
        PIPE_FLAGS = layout.offsetof(41);
        USER_DATA = layout.offsetof(42);
        BUF_INDEX = layout.offsetof(44);
        BUF_GROUP = layout.offsetof(45);
        PERSONALITY = layout.offsetof(46);
        SPLICE_FD_IN = layout.offsetof(48);
        FILE_INDEX = layout.offsetof(49);
        ZCRX_IFQ_IDX = layout.offsetof(50);
        OPTLEN = layout.offsetof(51);
        ADDR_LEN = layout.offsetof(53);
        __PAD3 = layout.offsetof(54);
        ADDR3 = layout.offsetof(57);
        __PAD2 = layout.offsetof(58);
        ATTR_PTR = layout.offsetof(60);
        ATTR_TYPE_MASK = layout.offsetof(61);
        OPTVAL = layout.offsetof(62);
        CMD = layout.offsetof(63);
    }

    protected IOURingSQE(long address, ByteBuffer container) {
        super(address, container);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.lwjgl.system.Struct
    public IOURingSQE create(long address, ByteBuffer container) {
        return new IOURingSQE(address, container);
    }

    public IOURingSQE(ByteBuffer container) {
        super(MemoryUtil.memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
        return SIZEOF;
    }

    @NativeType("__u8")
    public byte opcode() {
        return nopcode(address());
    }

    @NativeType("__u8")
    public byte flags() {
        return nflags(address());
    }

    @NativeType("__u16")
    public short ioprio() {
        return nioprio(address());
    }

    @NativeType("__s32")
    public int fd() {
        return nfd(address());
    }

    @NativeType("__u64")
    public long off() {
        return noff(address());
    }

    @NativeType("__u64")
    public long addr2() {
        return naddr2(address());
    }

    @NativeType("__u32")
    public int cmd_op() {
        return ncmd_op(address());
    }

    @NativeType("__u32")
    public int __pad1() {
        return n__pad1(address());
    }

    @NativeType("__u64")
    public long addr() {
        return naddr(address());
    }

    @NativeType("__u64")
    public long splice_off_in() {
        return nsplice_off_in(address());
    }

    @NativeType("__u32")
    public int level() {
        return nlevel(address());
    }

    @NativeType("__u32")
    public int optname() {
        return noptname(address());
    }

    @NativeType("__u32")
    public int len() {
        return nlen(address());
    }

    @NativeType("__kernel_rwf_t")
    public int rw_flags() {
        return nrw_flags(address());
    }

    @NativeType("__u32")
    public int fsync_flags() {
        return nfsync_flags(address());
    }

    @NativeType("__u16")
    public short poll_events() {
        return npoll_events(address());
    }

    @NativeType("__u32")
    public int poll32_events() {
        return npoll32_events(address());
    }

    @NativeType("__u32")
    public int sync_range_flags() {
        return nsync_range_flags(address());
    }

    @NativeType("__u32")
    public int msg_flags() {
        return nmsg_flags(address());
    }

    @NativeType("__u32")
    public int timeout_flags() {
        return ntimeout_flags(address());
    }

    @NativeType("__u32")
    public int accept_flags() {
        return naccept_flags(address());
    }

    @NativeType("__u32")
    public int cancel_flags() {
        return ncancel_flags(address());
    }

    @NativeType("__u32")
    public int open_flags() {
        return nopen_flags(address());
    }

    @NativeType("__u32")
    public int statx_flags() {
        return nstatx_flags(address());
    }

    @NativeType("__u32")
    public int fadvise_advice() {
        return nfadvise_advice(address());
    }

    @NativeType("__u32")
    public int splice_flags() {
        return nsplice_flags(address());
    }

    @NativeType("__u32")
    public int rename_flags() {
        return nrename_flags(address());
    }

    @NativeType("__u32")
    public int unlink_flags() {
        return nunlink_flags(address());
    }

    @NativeType("__u32")
    public int hardlink_flags() {
        return nhardlink_flags(address());
    }

    @NativeType("__u32")
    public int xattr_flags() {
        return nxattr_flags(address());
    }

    @NativeType("__u32")
    public int msg_ring_flags() {
        return nmsg_ring_flags(address());
    }

    @NativeType("__u32")
    public int uring_cmd_flags() {
        return nuring_cmd_flags(address());
    }

    @NativeType("__u32")
    public int waitid_flags() {
        return nwaitid_flags(address());
    }

    @NativeType("__u32")
    public int futex_flags() {
        return nfutex_flags(address());
    }

    @NativeType("__u32")
    public int install_fd_flags() {
        return ninstall_fd_flags(address());
    }

    @NativeType("__u32")
    public int nop_flags() {
        return nnop_flags(address());
    }

    @NativeType("__u32")
    public int pipe_flags() {
        return npipe_flags(address());
    }

    @NativeType("__u64")
    public long user_data() {
        return nuser_data(address());
    }

    @NativeType("__u16")
    public short buf_index() {
        return nbuf_index(address());
    }

    @NativeType("__u16")
    public short buf_group() {
        return nbuf_group(address());
    }

    @NativeType("__u16")
    public short personality() {
        return npersonality(address());
    }

    @NativeType("__s32")
    public int splice_fd_in() {
        return nsplice_fd_in(address());
    }

    @NativeType("__u32")
    public int file_index() {
        return nfile_index(address());
    }

    @NativeType("__u32")
    public int zcrx_ifq_idx() {
        return nzcrx_ifq_idx(address());
    }

    @NativeType("__u32")
    public int optlen() {
        return noptlen(address());
    }

    @NativeType("__u16")
    public short addr_len() {
        return naddr_len(address());
    }

    @NativeType("__u16[1]")
    public ShortBuffer __pad3() {
        return n__pad3(address());
    }

    @NativeType("__u16")
    public short __pad3(int index) {
        return n__pad3(address(), index);
    }

    @NativeType("__u64")
    public long addr3() {
        return naddr3(address());
    }

    @NativeType("__u64[1]")
    public LongBuffer __pad2() {
        return n__pad2(address());
    }

    @NativeType("__u64")
    public long __pad2(int index) {
        return n__pad2(address(), index);
    }

    @NativeType("__u64")
    public long attr_ptr() {
        return nattr_ptr(address());
    }

    @NativeType("__u64")
    public long attr_type_mask() {
        return nattr_type_mask(address());
    }

    @NativeType("__u64")
    public long optval() {
        return noptval(address());
    }

    @NativeType("__u8[0]")
    public ByteBuffer cmd() {
        return ncmd(address());
    }

    @NativeType("__u8")
    public byte cmd(int index) {
        return ncmd(address(), index);
    }

    public IOURingSQE opcode(@NativeType("__u8") byte value) {
        nopcode(address(), value);
        return this;
    }

    public IOURingSQE flags(@NativeType("__u8") byte value) {
        nflags(address(), value);
        return this;
    }

    public IOURingSQE ioprio(@NativeType("__u16") short value) {
        nioprio(address(), value);
        return this;
    }

    public IOURingSQE fd(@NativeType("__s32") int value) {
        nfd(address(), value);
        return this;
    }

    public IOURingSQE off(@NativeType("__u64") long value) {
        noff(address(), value);
        return this;
    }

    public IOURingSQE addr2(@NativeType("__u64") long value) {
        naddr2(address(), value);
        return this;
    }

    public IOURingSQE cmd_op(@NativeType("__u32") int value) {
        ncmd_op(address(), value);
        return this;
    }

    public IOURingSQE __pad1(@NativeType("__u32") int value) {
        n__pad1(address(), value);
        return this;
    }

    public IOURingSQE addr(@NativeType("__u64") long value) {
        naddr(address(), value);
        return this;
    }

    public IOURingSQE splice_off_in(@NativeType("__u64") long value) {
        nsplice_off_in(address(), value);
        return this;
    }

    public IOURingSQE level(@NativeType("__u32") int value) {
        nlevel(address(), value);
        return this;
    }

    public IOURingSQE optname(@NativeType("__u32") int value) {
        noptname(address(), value);
        return this;
    }

    public IOURingSQE len(@NativeType("__u32") int value) {
        nlen(address(), value);
        return this;
    }

    public IOURingSQE rw_flags(@NativeType("__kernel_rwf_t") int value) {
        nrw_flags(address(), value);
        return this;
    }

    public IOURingSQE fsync_flags(@NativeType("__u32") int value) {
        nfsync_flags(address(), value);
        return this;
    }

    public IOURingSQE poll_events(@NativeType("__u16") short value) {
        npoll_events(address(), value);
        return this;
    }

    public IOURingSQE poll32_events(@NativeType("__u32") int value) {
        npoll32_events(address(), value);
        return this;
    }

    public IOURingSQE sync_range_flags(@NativeType("__u32") int value) {
        nsync_range_flags(address(), value);
        return this;
    }

    public IOURingSQE msg_flags(@NativeType("__u32") int value) {
        nmsg_flags(address(), value);
        return this;
    }

    public IOURingSQE timeout_flags(@NativeType("__u32") int value) {
        ntimeout_flags(address(), value);
        return this;
    }

    public IOURingSQE accept_flags(@NativeType("__u32") int value) {
        naccept_flags(address(), value);
        return this;
    }

    public IOURingSQE cancel_flags(@NativeType("__u32") int value) {
        ncancel_flags(address(), value);
        return this;
    }

    public IOURingSQE open_flags(@NativeType("__u32") int value) {
        nopen_flags(address(), value);
        return this;
    }

    public IOURingSQE statx_flags(@NativeType("__u32") int value) {
        nstatx_flags(address(), value);
        return this;
    }

    public IOURingSQE fadvise_advice(@NativeType("__u32") int value) {
        nfadvise_advice(address(), value);
        return this;
    }

    public IOURingSQE splice_flags(@NativeType("__u32") int value) {
        nsplice_flags(address(), value);
        return this;
    }

    public IOURingSQE rename_flags(@NativeType("__u32") int value) {
        nrename_flags(address(), value);
        return this;
    }

    public IOURingSQE unlink_flags(@NativeType("__u32") int value) {
        nunlink_flags(address(), value);
        return this;
    }

    public IOURingSQE hardlink_flags(@NativeType("__u32") int value) {
        nhardlink_flags(address(), value);
        return this;
    }

    public IOURingSQE xattr_flags(@NativeType("__u32") int value) {
        nxattr_flags(address(), value);
        return this;
    }

    public IOURingSQE msg_ring_flags(@NativeType("__u32") int value) {
        nmsg_ring_flags(address(), value);
        return this;
    }

    public IOURingSQE uring_cmd_flags(@NativeType("__u32") int value) {
        nuring_cmd_flags(address(), value);
        return this;
    }

    public IOURingSQE waitid_flags(@NativeType("__u32") int value) {
        nwaitid_flags(address(), value);
        return this;
    }

    public IOURingSQE futex_flags(@NativeType("__u32") int value) {
        nfutex_flags(address(), value);
        return this;
    }

    public IOURingSQE install_fd_flags(@NativeType("__u32") int value) {
        ninstall_fd_flags(address(), value);
        return this;
    }

    public IOURingSQE nop_flags(@NativeType("__u32") int value) {
        nnop_flags(address(), value);
        return this;
    }

    public IOURingSQE pipe_flags(@NativeType("__u32") int value) {
        npipe_flags(address(), value);
        return this;
    }

    public IOURingSQE user_data(@NativeType("__u64") long value) {
        nuser_data(address(), value);
        return this;
    }

    public IOURingSQE buf_index(@NativeType("__u16") short value) {
        nbuf_index(address(), value);
        return this;
    }

    public IOURingSQE buf_group(@NativeType("__u16") short value) {
        nbuf_group(address(), value);
        return this;
    }

    public IOURingSQE personality(@NativeType("__u16") short value) {
        npersonality(address(), value);
        return this;
    }

    public IOURingSQE splice_fd_in(@NativeType("__s32") int value) {
        nsplice_fd_in(address(), value);
        return this;
    }

    public IOURingSQE file_index(@NativeType("__u32") int value) {
        nfile_index(address(), value);
        return this;
    }

    public IOURingSQE zcrx_ifq_idx(@NativeType("__u32") int value) {
        nzcrx_ifq_idx(address(), value);
        return this;
    }

    public IOURingSQE optlen(@NativeType("__u32") int value) {
        noptlen(address(), value);
        return this;
    }

    public IOURingSQE addr_len(@NativeType("__u16") short value) {
        naddr_len(address(), value);
        return this;
    }

    public IOURingSQE __pad3(@NativeType("__u16[1]") ShortBuffer value) {
        n__pad3(address(), value);
        return this;
    }

    public IOURingSQE __pad3(int index, @NativeType("__u16") short value) {
        n__pad3(address(), index, value);
        return this;
    }

    public IOURingSQE addr3(@NativeType("__u64") long value) {
        naddr3(address(), value);
        return this;
    }

    public IOURingSQE __pad2(@NativeType("__u64[1]") LongBuffer value) {
        n__pad2(address(), value);
        return this;
    }

    public IOURingSQE __pad2(int index, @NativeType("__u64") long value) {
        n__pad2(address(), index, value);
        return this;
    }

    public IOURingSQE attr_ptr(@NativeType("__u64") long value) {
        nattr_ptr(address(), value);
        return this;
    }

    public IOURingSQE attr_type_mask(@NativeType("__u64") long value) {
        nattr_type_mask(address(), value);
        return this;
    }

    public IOURingSQE optval(@NativeType("__u64") long value) {
        noptval(address(), value);
        return this;
    }

    public IOURingSQE cmd(@NativeType("__u8[0]") ByteBuffer value) {
        ncmd(address(), value);
        return this;
    }

    public IOURingSQE cmd(int index, @NativeType("__u8") byte value) {
        ncmd(address(), index, value);
        return this;
    }

    public IOURingSQE set(IOURingSQE src) {
        MemoryUtil.memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    public static IOURingSQE malloc() {
        return new IOURingSQE(MemoryUtil.nmemAllocChecked(SIZEOF), null);
    }

    public static IOURingSQE calloc() {
        return new IOURingSQE(MemoryUtil.nmemCallocChecked(1L, SIZEOF), null);
    }

    public static IOURingSQE create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new IOURingSQE(MemoryUtil.memAddress(container), container);
    }

    public static IOURingSQE create(long address) {
        return new IOURingSQE(address, null);
    }

    public static IOURingSQE createSafe(long address) {
        if (address == 0) {
            return null;
        }
        return new IOURingSQE(address, null);
    }

    public static Buffer malloc(int capacity) {
        return new Buffer(MemoryUtil.nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    public static Buffer calloc(int capacity) {
        return new Buffer(MemoryUtil.nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    public static Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(MemoryUtil.memAddress(container), container, -1, 0, capacity, capacity);
    }

    public static Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    public static Buffer createSafe(long address, int capacity) {
        if (address == 0) {
            return null;
        }
        return new Buffer(address, capacity);
    }

    public static IOURingSQE malloc(MemoryStack stack) {
        return new IOURingSQE(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    public static IOURingSQE calloc(MemoryStack stack) {
        return new IOURingSQE(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    public static Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    public static Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    public static byte nopcode(long struct) {
        return MemoryUtil.memGetByte(struct + OPCODE);
    }

    public static byte nflags(long struct) {
        return MemoryUtil.memGetByte(struct + FLAGS);
    }

    public static short nioprio(long struct) {
        return MemoryUtil.memGetShort(struct + IOPRIO);
    }

    public static int nfd(long struct) {
        return MemoryUtil.memGetInt(struct + FD);
    }

    public static long noff(long struct) {
        return MemoryUtil.memGetLong(struct + OFF);
    }

    public static long naddr2(long struct) {
        return MemoryUtil.memGetLong(struct + ADDR2);
    }

    public static int ncmd_op(long struct) {
        return MemoryUtil.memGetInt(struct + CMD_OP);
    }

    public static int n__pad1(long struct) {
        return MemoryUtil.memGetInt(struct + __PAD1);
    }

    public static long naddr(long struct) {
        return MemoryUtil.memGetLong(struct + ADDR);
    }

    public static long nsplice_off_in(long struct) {
        return MemoryUtil.memGetLong(struct + SPLICE_OFF_IN);
    }

    public static int nlevel(long struct) {
        return MemoryUtil.memGetInt(struct + LEVEL);
    }

    public static int noptname(long struct) {
        return MemoryUtil.memGetInt(struct + OPTNAME);
    }

    public static int nlen(long struct) {
        return MemoryUtil.memGetInt(struct + LEN);
    }

    public static int nrw_flags(long struct) {
        return MemoryUtil.memGetInt(struct + RW_FLAGS);
    }

    public static int nfsync_flags(long struct) {
        return MemoryUtil.memGetInt(struct + FSYNC_FLAGS);
    }

    public static short npoll_events(long struct) {
        return MemoryUtil.memGetShort(struct + POLL_EVENTS);
    }

    public static int npoll32_events(long struct) {
        return MemoryUtil.memGetInt(struct + POLL32_EVENTS);
    }

    public static int nsync_range_flags(long struct) {
        return MemoryUtil.memGetInt(struct + SYNC_RANGE_FLAGS);
    }

    public static int nmsg_flags(long struct) {
        return MemoryUtil.memGetInt(struct + MSG_FLAGS);
    }

    public static int ntimeout_flags(long struct) {
        return MemoryUtil.memGetInt(struct + TIMEOUT_FLAGS);
    }

    public static int naccept_flags(long struct) {
        return MemoryUtil.memGetInt(struct + ACCEPT_FLAGS);
    }

    public static int ncancel_flags(long struct) {
        return MemoryUtil.memGetInt(struct + CANCEL_FLAGS);
    }

    public static int nopen_flags(long struct) {
        return MemoryUtil.memGetInt(struct + OPEN_FLAGS);
    }

    public static int nstatx_flags(long struct) {
        return MemoryUtil.memGetInt(struct + STATX_FLAGS);
    }

    public static int nfadvise_advice(long struct) {
        return MemoryUtil.memGetInt(struct + FADVISE_ADVICE);
    }

    public static int nsplice_flags(long struct) {
        return MemoryUtil.memGetInt(struct + SPLICE_FLAGS);
    }

    public static int nrename_flags(long struct) {
        return MemoryUtil.memGetInt(struct + RENAME_FLAGS);
    }

    public static int nunlink_flags(long struct) {
        return MemoryUtil.memGetInt(struct + UNLINK_FLAGS);
    }

    public static int nhardlink_flags(long struct) {
        return MemoryUtil.memGetInt(struct + HARDLINK_FLAGS);
    }

    public static int nxattr_flags(long struct) {
        return MemoryUtil.memGetInt(struct + XATTR_FLAGS);
    }

    public static int nmsg_ring_flags(long struct) {
        return MemoryUtil.memGetInt(struct + MSG_RING_FLAGS);
    }

    public static int nuring_cmd_flags(long struct) {
        return MemoryUtil.memGetInt(struct + URING_CMD_FLAGS);
    }

    public static int nwaitid_flags(long struct) {
        return MemoryUtil.memGetInt(struct + WAITID_FLAGS);
    }

    public static int nfutex_flags(long struct) {
        return MemoryUtil.memGetInt(struct + FUTEX_FLAGS);
    }

    public static int ninstall_fd_flags(long struct) {
        return MemoryUtil.memGetInt(struct + INSTALL_FD_FLAGS);
    }

    public static int nnop_flags(long struct) {
        return MemoryUtil.memGetInt(struct + NOP_FLAGS);
    }

    public static int npipe_flags(long struct) {
        return MemoryUtil.memGetInt(struct + PIPE_FLAGS);
    }

    public static long nuser_data(long struct) {
        return MemoryUtil.memGetLong(struct + USER_DATA);
    }

    public static short nbuf_index(long struct) {
        return MemoryUtil.memGetShort(struct + BUF_INDEX);
    }

    public static short nbuf_group(long struct) {
        return MemoryUtil.memGetShort(struct + BUF_GROUP);
    }

    public static short npersonality(long struct) {
        return MemoryUtil.memGetShort(struct + PERSONALITY);
    }

    public static int nsplice_fd_in(long struct) {
        return MemoryUtil.memGetInt(struct + SPLICE_FD_IN);
    }

    public static int nfile_index(long struct) {
        return MemoryUtil.memGetInt(struct + FILE_INDEX);
    }

    public static int nzcrx_ifq_idx(long struct) {
        return MemoryUtil.memGetInt(struct + ZCRX_IFQ_IDX);
    }

    public static int noptlen(long struct) {
        return MemoryUtil.memGetInt(struct + OPTLEN);
    }

    public static short naddr_len(long struct) {
        return MemoryUtil.memGetShort(struct + ADDR_LEN);
    }

    public static ShortBuffer n__pad3(long struct) {
        return MemoryUtil.memShortBuffer(struct + __PAD3, 1);
    }

    public static short n__pad3(long struct, int index) {
        return MemoryUtil.memGetShort(struct + __PAD3 + (Checks.check(index, 1) * 2));
    }

    public static long naddr3(long struct) {
        return MemoryUtil.memGetLong(struct + ADDR3);
    }

    public static LongBuffer n__pad2(long struct) {
        return MemoryUtil.memLongBuffer(struct + __PAD2, 1);
    }

    public static long n__pad2(long struct, int index) {
        return MemoryUtil.memGetLong(struct + __PAD2 + (Checks.check(index, 1) * 8));
    }

    public static long nattr_ptr(long struct) {
        return MemoryUtil.memGetLong(struct + ATTR_PTR);
    }

    public static long nattr_type_mask(long struct) {
        return MemoryUtil.memGetLong(struct + ATTR_TYPE_MASK);
    }

    public static long noptval(long struct) {
        return MemoryUtil.memGetLong(struct + OPTVAL);
    }

    public static ByteBuffer ncmd(long struct) {
        return MemoryUtil.memByteBuffer(struct + CMD, 0);
    }

    public static byte ncmd(long struct, int index) {
        return MemoryUtil.memGetByte(struct + CMD + (Checks.check(index, 0) * 1));
    }

    public static void nopcode(long struct, byte value) {
        MemoryUtil.memPutByte(struct + OPCODE, value);
    }

    public static void nflags(long struct, byte value) {
        MemoryUtil.memPutByte(struct + FLAGS, value);
    }

    public static void nioprio(long struct, short value) {
        MemoryUtil.memPutShort(struct + IOPRIO, value);
    }

    public static void nfd(long struct, int value) {
        MemoryUtil.memPutInt(struct + FD, value);
    }

    public static void noff(long struct, long value) {
        MemoryUtil.memPutLong(struct + OFF, value);
    }

    public static void naddr2(long struct, long value) {
        MemoryUtil.memPutLong(struct + ADDR2, value);
    }

    public static void ncmd_op(long struct, int value) {
        MemoryUtil.memPutInt(struct + CMD_OP, value);
    }

    public static void n__pad1(long struct, int value) {
        MemoryUtil.memPutInt(struct + __PAD1, value);
    }

    public static void naddr(long struct, long value) {
        MemoryUtil.memPutLong(struct + ADDR, value);
    }

    public static void nsplice_off_in(long struct, long value) {
        MemoryUtil.memPutLong(struct + SPLICE_OFF_IN, value);
    }

    public static void nlevel(long struct, int value) {
        MemoryUtil.memPutInt(struct + LEVEL, value);
    }

    public static void noptname(long struct, int value) {
        MemoryUtil.memPutInt(struct + OPTNAME, value);
    }

    public static void nlen(long struct, int value) {
        MemoryUtil.memPutInt(struct + LEN, value);
    }

    public static void nrw_flags(long struct, int value) {
        MemoryUtil.memPutInt(struct + RW_FLAGS, value);
    }

    public static void nfsync_flags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FSYNC_FLAGS, value);
    }

    public static void npoll_events(long struct, short value) {
        MemoryUtil.memPutShort(struct + POLL_EVENTS, value);
    }

    public static void npoll32_events(long struct, int value) {
        MemoryUtil.memPutInt(struct + POLL32_EVENTS, value);
    }

    public static void nsync_range_flags(long struct, int value) {
        MemoryUtil.memPutInt(struct + SYNC_RANGE_FLAGS, value);
    }

    public static void nmsg_flags(long struct, int value) {
        MemoryUtil.memPutInt(struct + MSG_FLAGS, value);
    }

    public static void ntimeout_flags(long struct, int value) {
        MemoryUtil.memPutInt(struct + TIMEOUT_FLAGS, value);
    }

    public static void naccept_flags(long struct, int value) {
        MemoryUtil.memPutInt(struct + ACCEPT_FLAGS, value);
    }

    public static void ncancel_flags(long struct, int value) {
        MemoryUtil.memPutInt(struct + CANCEL_FLAGS, value);
    }

    public static void nopen_flags(long struct, int value) {
        MemoryUtil.memPutInt(struct + OPEN_FLAGS, value);
    }

    public static void nstatx_flags(long struct, int value) {
        MemoryUtil.memPutInt(struct + STATX_FLAGS, value);
    }

    public static void nfadvise_advice(long struct, int value) {
        MemoryUtil.memPutInt(struct + FADVISE_ADVICE, value);
    }

    public static void nsplice_flags(long struct, int value) {
        MemoryUtil.memPutInt(struct + SPLICE_FLAGS, value);
    }

    public static void nrename_flags(long struct, int value) {
        MemoryUtil.memPutInt(struct + RENAME_FLAGS, value);
    }

    public static void nunlink_flags(long struct, int value) {
        MemoryUtil.memPutInt(struct + UNLINK_FLAGS, value);
    }

    public static void nhardlink_flags(long struct, int value) {
        MemoryUtil.memPutInt(struct + HARDLINK_FLAGS, value);
    }

    public static void nxattr_flags(long struct, int value) {
        MemoryUtil.memPutInt(struct + XATTR_FLAGS, value);
    }

    public static void nmsg_ring_flags(long struct, int value) {
        MemoryUtil.memPutInt(struct + MSG_RING_FLAGS, value);
    }

    public static void nuring_cmd_flags(long struct, int value) {
        MemoryUtil.memPutInt(struct + URING_CMD_FLAGS, value);
    }

    public static void nwaitid_flags(long struct, int value) {
        MemoryUtil.memPutInt(struct + WAITID_FLAGS, value);
    }

    public static void nfutex_flags(long struct, int value) {
        MemoryUtil.memPutInt(struct + FUTEX_FLAGS, value);
    }

    public static void ninstall_fd_flags(long struct, int value) {
        MemoryUtil.memPutInt(struct + INSTALL_FD_FLAGS, value);
    }

    public static void nnop_flags(long struct, int value) {
        MemoryUtil.memPutInt(struct + NOP_FLAGS, value);
    }

    public static void npipe_flags(long struct, int value) {
        MemoryUtil.memPutInt(struct + PIPE_FLAGS, value);
    }

    public static void nuser_data(long struct, long value) {
        MemoryUtil.memPutLong(struct + USER_DATA, value);
    }

    public static void nbuf_index(long struct, short value) {
        MemoryUtil.memPutShort(struct + BUF_INDEX, value);
    }

    public static void nbuf_group(long struct, short value) {
        MemoryUtil.memPutShort(struct + BUF_GROUP, value);
    }

    public static void npersonality(long struct, short value) {
        MemoryUtil.memPutShort(struct + PERSONALITY, value);
    }

    public static void nsplice_fd_in(long struct, int value) {
        MemoryUtil.memPutInt(struct + SPLICE_FD_IN, value);
    }

    public static void nfile_index(long struct, int value) {
        MemoryUtil.memPutInt(struct + FILE_INDEX, value);
    }

    public static void nzcrx_ifq_idx(long struct, int value) {
        MemoryUtil.memPutInt(struct + ZCRX_IFQ_IDX, value);
    }

    public static void noptlen(long struct, int value) {
        MemoryUtil.memPutInt(struct + OPTLEN, value);
    }

    public static void naddr_len(long struct, short value) {
        MemoryUtil.memPutShort(struct + ADDR_LEN, value);
    }

    public static void n__pad3(long struct, ShortBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 1);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + __PAD3, value.remaining() * 2);
    }

    public static void n__pad3(long struct, int index, short value) {
        MemoryUtil.memPutShort(struct + __PAD3 + (Checks.check(index, 1) * 2), value);
    }

    public static void naddr3(long struct, long value) {
        MemoryUtil.memPutLong(struct + ADDR3, value);
    }

    public static void n__pad2(long struct, LongBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 1);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + __PAD2, value.remaining() * 8);
    }

    public static void n__pad2(long struct, int index, long value) {
        MemoryUtil.memPutLong(struct + __PAD2 + (Checks.check(index, 1) * 8), value);
    }

    public static void nattr_ptr(long struct, long value) {
        MemoryUtil.memPutLong(struct + ATTR_PTR, value);
    }

    public static void nattr_type_mask(long struct, long value) {
        MemoryUtil.memPutLong(struct + ATTR_TYPE_MASK, value);
    }

    public static void noptval(long struct, long value) {
        MemoryUtil.memPutLong(struct + OPTVAL, value);
    }

    public static void ncmd(long struct, ByteBuffer value) {
        if (Checks.CHECKS) {
            Checks.checkGT(value, 0);
        }
        MemoryUtil.memCopy(MemoryUtil.memAddress(value), struct + CMD, value.remaining() * 1);
    }

    public static void ncmd(long struct, int index, byte value) {
        MemoryUtil.memPutByte(struct + CMD + (Checks.check(index, 0) * 1), value);
    }

    /* JADX WARN: Classes with same name are omitted:
  PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.3.3/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingSQE$Buffer.class
 */
    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/lwjgl/3.4.1/lwjgl.jar:org/lwjgl/system/linux/liburing/IOURingSQE$Buffer.class */
    public static class Buffer extends StructBuffer<IOURingSQE, Buffer> implements NativeResource {
        private static final IOURingSQE ELEMENT_FACTORY = IOURingSQE.create(-1L);

        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / IOURingSQE.SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.CustomBuffer
        public Buffer self() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.CustomBuffer
        public Buffer create(long address, ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // org.lwjgl.system.StructBuffer
        public IOURingSQE getElementFactory() {
            return ELEMENT_FACTORY;
        }

        @NativeType("__u8")
        public byte opcode() {
            return IOURingSQE.nopcode(address());
        }

        @NativeType("__u8")
        public byte flags() {
            return IOURingSQE.nflags(address());
        }

        @NativeType("__u16")
        public short ioprio() {
            return IOURingSQE.nioprio(address());
        }

        @NativeType("__s32")
        public int fd() {
            return IOURingSQE.nfd(address());
        }

        @NativeType("__u64")
        public long off() {
            return IOURingSQE.noff(address());
        }

        @NativeType("__u64")
        public long addr2() {
            return IOURingSQE.naddr2(address());
        }

        @NativeType("__u32")
        public int cmd_op() {
            return IOURingSQE.ncmd_op(address());
        }

        @NativeType("__u32")
        public int __pad1() {
            return IOURingSQE.n__pad1(address());
        }

        @NativeType("__u64")
        public long addr() {
            return IOURingSQE.naddr(address());
        }

        @NativeType("__u64")
        public long splice_off_in() {
            return IOURingSQE.nsplice_off_in(address());
        }

        @NativeType("__u32")
        public int level() {
            return IOURingSQE.nlevel(address());
        }

        @NativeType("__u32")
        public int optname() {
            return IOURingSQE.noptname(address());
        }

        @NativeType("__u32")
        public int len() {
            return IOURingSQE.nlen(address());
        }

        @NativeType("__kernel_rwf_t")
        public int rw_flags() {
            return IOURingSQE.nrw_flags(address());
        }

        @NativeType("__u32")
        public int fsync_flags() {
            return IOURingSQE.nfsync_flags(address());
        }

        @NativeType("__u16")
        public short poll_events() {
            return IOURingSQE.npoll_events(address());
        }

        @NativeType("__u32")
        public int poll32_events() {
            return IOURingSQE.npoll32_events(address());
        }

        @NativeType("__u32")
        public int sync_range_flags() {
            return IOURingSQE.nsync_range_flags(address());
        }

        @NativeType("__u32")
        public int msg_flags() {
            return IOURingSQE.nmsg_flags(address());
        }

        @NativeType("__u32")
        public int timeout_flags() {
            return IOURingSQE.ntimeout_flags(address());
        }

        @NativeType("__u32")
        public int accept_flags() {
            return IOURingSQE.naccept_flags(address());
        }

        @NativeType("__u32")
        public int cancel_flags() {
            return IOURingSQE.ncancel_flags(address());
        }

        @NativeType("__u32")
        public int open_flags() {
            return IOURingSQE.nopen_flags(address());
        }

        @NativeType("__u32")
        public int statx_flags() {
            return IOURingSQE.nstatx_flags(address());
        }

        @NativeType("__u32")
        public int fadvise_advice() {
            return IOURingSQE.nfadvise_advice(address());
        }

        @NativeType("__u32")
        public int splice_flags() {
            return IOURingSQE.nsplice_flags(address());
        }

        @NativeType("__u32")
        public int rename_flags() {
            return IOURingSQE.nrename_flags(address());
        }

        @NativeType("__u32")
        public int unlink_flags() {
            return IOURingSQE.nunlink_flags(address());
        }

        @NativeType("__u32")
        public int hardlink_flags() {
            return IOURingSQE.nhardlink_flags(address());
        }

        @NativeType("__u32")
        public int xattr_flags() {
            return IOURingSQE.nxattr_flags(address());
        }

        @NativeType("__u32")
        public int msg_ring_flags() {
            return IOURingSQE.nmsg_ring_flags(address());
        }

        @NativeType("__u32")
        public int uring_cmd_flags() {
            return IOURingSQE.nuring_cmd_flags(address());
        }

        @NativeType("__u32")
        public int waitid_flags() {
            return IOURingSQE.nwaitid_flags(address());
        }

        @NativeType("__u32")
        public int futex_flags() {
            return IOURingSQE.nfutex_flags(address());
        }

        @NativeType("__u32")
        public int install_fd_flags() {
            return IOURingSQE.ninstall_fd_flags(address());
        }

        @NativeType("__u32")
        public int nop_flags() {
            return IOURingSQE.nnop_flags(address());
        }

        @NativeType("__u32")
        public int pipe_flags() {
            return IOURingSQE.npipe_flags(address());
        }

        @NativeType("__u64")
        public long user_data() {
            return IOURingSQE.nuser_data(address());
        }

        @NativeType("__u16")
        public short buf_index() {
            return IOURingSQE.nbuf_index(address());
        }

        @NativeType("__u16")
        public short buf_group() {
            return IOURingSQE.nbuf_group(address());
        }

        @NativeType("__u16")
        public short personality() {
            return IOURingSQE.npersonality(address());
        }

        @NativeType("__s32")
        public int splice_fd_in() {
            return IOURingSQE.nsplice_fd_in(address());
        }

        @NativeType("__u32")
        public int file_index() {
            return IOURingSQE.nfile_index(address());
        }

        @NativeType("__u32")
        public int zcrx_ifq_idx() {
            return IOURingSQE.nzcrx_ifq_idx(address());
        }

        @NativeType("__u32")
        public int optlen() {
            return IOURingSQE.noptlen(address());
        }

        @NativeType("__u16")
        public short addr_len() {
            return IOURingSQE.naddr_len(address());
        }

        @NativeType("__u16[1]")
        public ShortBuffer __pad3() {
            return IOURingSQE.n__pad3(address());
        }

        @NativeType("__u16")
        public short __pad3(int index) {
            return IOURingSQE.n__pad3(address(), index);
        }

        @NativeType("__u64")
        public long addr3() {
            return IOURingSQE.naddr3(address());
        }

        @NativeType("__u64[1]")
        public LongBuffer __pad2() {
            return IOURingSQE.n__pad2(address());
        }

        @NativeType("__u64")
        public long __pad2(int index) {
            return IOURingSQE.n__pad2(address(), index);
        }

        @NativeType("__u64")
        public long attr_ptr() {
            return IOURingSQE.nattr_ptr(address());
        }

        @NativeType("__u64")
        public long attr_type_mask() {
            return IOURingSQE.nattr_type_mask(address());
        }

        @NativeType("__u64")
        public long optval() {
            return IOURingSQE.noptval(address());
        }

        @NativeType("__u8[0]")
        public ByteBuffer cmd() {
            return IOURingSQE.ncmd(address());
        }

        @NativeType("__u8")
        public byte cmd(int index) {
            return IOURingSQE.ncmd(address(), index);
        }

        public Buffer opcode(@NativeType("__u8") byte value) {
            IOURingSQE.nopcode(address(), value);
            return this;
        }

        public Buffer flags(@NativeType("__u8") byte value) {
            IOURingSQE.nflags(address(), value);
            return this;
        }

        public Buffer ioprio(@NativeType("__u16") short value) {
            IOURingSQE.nioprio(address(), value);
            return this;
        }

        public Buffer fd(@NativeType("__s32") int value) {
            IOURingSQE.nfd(address(), value);
            return this;
        }

        public Buffer off(@NativeType("__u64") long value) {
            IOURingSQE.noff(address(), value);
            return this;
        }

        public Buffer addr2(@NativeType("__u64") long value) {
            IOURingSQE.naddr2(address(), value);
            return this;
        }

        public Buffer cmd_op(@NativeType("__u32") int value) {
            IOURingSQE.ncmd_op(address(), value);
            return this;
        }

        public Buffer __pad1(@NativeType("__u32") int value) {
            IOURingSQE.n__pad1(address(), value);
            return this;
        }

        public Buffer addr(@NativeType("__u64") long value) {
            IOURingSQE.naddr(address(), value);
            return this;
        }

        public Buffer splice_off_in(@NativeType("__u64") long value) {
            IOURingSQE.nsplice_off_in(address(), value);
            return this;
        }

        public Buffer level(@NativeType("__u32") int value) {
            IOURingSQE.nlevel(address(), value);
            return this;
        }

        public Buffer optname(@NativeType("__u32") int value) {
            IOURingSQE.noptname(address(), value);
            return this;
        }

        public Buffer len(@NativeType("__u32") int value) {
            IOURingSQE.nlen(address(), value);
            return this;
        }

        public Buffer rw_flags(@NativeType("__kernel_rwf_t") int value) {
            IOURingSQE.nrw_flags(address(), value);
            return this;
        }

        public Buffer fsync_flags(@NativeType("__u32") int value) {
            IOURingSQE.nfsync_flags(address(), value);
            return this;
        }

        public Buffer poll_events(@NativeType("__u16") short value) {
            IOURingSQE.npoll_events(address(), value);
            return this;
        }

        public Buffer poll32_events(@NativeType("__u32") int value) {
            IOURingSQE.npoll32_events(address(), value);
            return this;
        }

        public Buffer sync_range_flags(@NativeType("__u32") int value) {
            IOURingSQE.nsync_range_flags(address(), value);
            return this;
        }

        public Buffer msg_flags(@NativeType("__u32") int value) {
            IOURingSQE.nmsg_flags(address(), value);
            return this;
        }

        public Buffer timeout_flags(@NativeType("__u32") int value) {
            IOURingSQE.ntimeout_flags(address(), value);
            return this;
        }

        public Buffer accept_flags(@NativeType("__u32") int value) {
            IOURingSQE.naccept_flags(address(), value);
            return this;
        }

        public Buffer cancel_flags(@NativeType("__u32") int value) {
            IOURingSQE.ncancel_flags(address(), value);
            return this;
        }

        public Buffer open_flags(@NativeType("__u32") int value) {
            IOURingSQE.nopen_flags(address(), value);
            return this;
        }

        public Buffer statx_flags(@NativeType("__u32") int value) {
            IOURingSQE.nstatx_flags(address(), value);
            return this;
        }

        public Buffer fadvise_advice(@NativeType("__u32") int value) {
            IOURingSQE.nfadvise_advice(address(), value);
            return this;
        }

        public Buffer splice_flags(@NativeType("__u32") int value) {
            IOURingSQE.nsplice_flags(address(), value);
            return this;
        }

        public Buffer rename_flags(@NativeType("__u32") int value) {
            IOURingSQE.nrename_flags(address(), value);
            return this;
        }

        public Buffer unlink_flags(@NativeType("__u32") int value) {
            IOURingSQE.nunlink_flags(address(), value);
            return this;
        }

        public Buffer hardlink_flags(@NativeType("__u32") int value) {
            IOURingSQE.nhardlink_flags(address(), value);
            return this;
        }

        public Buffer xattr_flags(@NativeType("__u32") int value) {
            IOURingSQE.nxattr_flags(address(), value);
            return this;
        }

        public Buffer msg_ring_flags(@NativeType("__u32") int value) {
            IOURingSQE.nmsg_ring_flags(address(), value);
            return this;
        }

        public Buffer uring_cmd_flags(@NativeType("__u32") int value) {
            IOURingSQE.nuring_cmd_flags(address(), value);
            return this;
        }

        public Buffer waitid_flags(@NativeType("__u32") int value) {
            IOURingSQE.nwaitid_flags(address(), value);
            return this;
        }

        public Buffer futex_flags(@NativeType("__u32") int value) {
            IOURingSQE.nfutex_flags(address(), value);
            return this;
        }

        public Buffer install_fd_flags(@NativeType("__u32") int value) {
            IOURingSQE.ninstall_fd_flags(address(), value);
            return this;
        }

        public Buffer nop_flags(@NativeType("__u32") int value) {
            IOURingSQE.nnop_flags(address(), value);
            return this;
        }

        public Buffer pipe_flags(@NativeType("__u32") int value) {
            IOURingSQE.npipe_flags(address(), value);
            return this;
        }

        public Buffer user_data(@NativeType("__u64") long value) {
            IOURingSQE.nuser_data(address(), value);
            return this;
        }

        public Buffer buf_index(@NativeType("__u16") short value) {
            IOURingSQE.nbuf_index(address(), value);
            return this;
        }

        public Buffer buf_group(@NativeType("__u16") short value) {
            IOURingSQE.nbuf_group(address(), value);
            return this;
        }

        public Buffer personality(@NativeType("__u16") short value) {
            IOURingSQE.npersonality(address(), value);
            return this;
        }

        public Buffer splice_fd_in(@NativeType("__s32") int value) {
            IOURingSQE.nsplice_fd_in(address(), value);
            return this;
        }

        public Buffer file_index(@NativeType("__u32") int value) {
            IOURingSQE.nfile_index(address(), value);
            return this;
        }

        public Buffer zcrx_ifq_idx(@NativeType("__u32") int value) {
            IOURingSQE.nzcrx_ifq_idx(address(), value);
            return this;
        }

        public Buffer optlen(@NativeType("__u32") int value) {
            IOURingSQE.noptlen(address(), value);
            return this;
        }

        public Buffer addr_len(@NativeType("__u16") short value) {
            IOURingSQE.naddr_len(address(), value);
            return this;
        }

        public Buffer __pad3(@NativeType("__u16[1]") ShortBuffer value) {
            IOURingSQE.n__pad3(address(), value);
            return this;
        }

        public Buffer __pad3(int index, @NativeType("__u16") short value) {
            IOURingSQE.n__pad3(address(), index, value);
            return this;
        }

        public Buffer addr3(@NativeType("__u64") long value) {
            IOURingSQE.naddr3(address(), value);
            return this;
        }

        public Buffer __pad2(@NativeType("__u64[1]") LongBuffer value) {
            IOURingSQE.n__pad2(address(), value);
            return this;
        }

        public Buffer __pad2(int index, @NativeType("__u64") long value) {
            IOURingSQE.n__pad2(address(), index, value);
            return this;
        }

        public Buffer attr_ptr(@NativeType("__u64") long value) {
            IOURingSQE.nattr_ptr(address(), value);
            return this;
        }

        public Buffer attr_type_mask(@NativeType("__u64") long value) {
            IOURingSQE.nattr_type_mask(address(), value);
            return this;
        }

        public Buffer optval(@NativeType("__u64") long value) {
            IOURingSQE.noptval(address(), value);
            return this;
        }

        public Buffer cmd(@NativeType("__u8[0]") ByteBuffer value) {
            IOURingSQE.ncmd(address(), value);
            return this;
        }

        public Buffer cmd(int index, @NativeType("__u8") byte value) {
            IOURingSQE.ncmd(address(), index, value);
            return this;
        }
    }
}
