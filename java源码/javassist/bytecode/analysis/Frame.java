package javassist.bytecode.analysis;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/game/MioLibPatcher.jar:javassist/bytecode/analysis/Frame.class */
public class Frame {
    private Type[] locals;
    private Type[] stack;

    /* renamed from: top, reason: collision with root package name */
    private int f115top;
    private boolean jsrMerged;
    private boolean retMerged;

    public Frame(int locals, int stack) {
        this.locals = new Type[locals];
        this.stack = new Type[stack];
    }

    public Type getLocal(int index) {
        return this.locals[index];
    }

    public void setLocal(int index, Type type) {
        this.locals[index] = type;
    }

    public Type getStack(int index) {
        return this.stack[index];
    }

    public void setStack(int index, Type type) {
        this.stack[index] = type;
    }

    public void clearStack() {
        this.f115top = 0;
    }

    public int getTopIndex() {
        return this.f115top - 1;
    }

    public int localsLength() {
        return this.locals.length;
    }

    public Type peek() {
        if (this.f115top < 1) {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        return this.stack[this.f115top - 1];
    }

    public Type pop() {
        if (this.f115top < 1) {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        Type[] typeArr = this.stack;
        int i = this.f115top - 1;
        this.f115top = i;
        return typeArr[i];
    }

    public void push(Type type) {
        Type[] typeArr = this.stack;
        int i = this.f115top;
        this.f115top = i + 1;
        typeArr[i] = type;
    }

    public Frame copy() {
        Frame frame = new Frame(this.locals.length, this.stack.length);
        System.arraycopy(this.locals, 0, frame.locals, 0, this.locals.length);
        System.arraycopy(this.stack, 0, frame.stack, 0, this.stack.length);
        frame.f115top = this.f115top;
        return frame;
    }

    public Frame copyStack() {
        Frame frame = new Frame(this.locals.length, this.stack.length);
        System.arraycopy(this.stack, 0, frame.stack, 0, this.stack.length);
        frame.f115top = this.f115top;
        return frame;
    }

    public boolean mergeStack(Frame frame) {
        boolean changed = false;
        if (this.f115top != frame.f115top) {
            throw new RuntimeException("Operand stacks could not be merged, they are different sizes!");
        }
        for (int i = 0; i < this.f115top; i++) {
            if (this.stack[i] != null) {
                Type prev = this.stack[i];
                Type merged = prev.merge(frame.stack[i]);
                if (merged == Type.BOGUS) {
                    throw new RuntimeException("Operand stacks could not be merged due to differing primitive types: pos = " + i);
                }
                this.stack[i] = merged;
                if (!merged.equals(prev) || merged.popChanged()) {
                    changed = true;
                }
            }
        }
        return changed;
    }

    public boolean merge(Frame frame) {
        boolean changed = false;
        for (int i = 0; i < this.locals.length; i++) {
            if (this.locals[i] != null) {
                Type prev = this.locals[i];
                Type merged = prev.merge(frame.locals[i]);
                this.locals[i] = merged;
                if (!merged.equals(prev) || merged.popChanged()) {
                    changed = true;
                }
            } else if (frame.locals[i] != null) {
                this.locals[i] = frame.locals[i];
                changed = true;
            }
        }
        return changed | mergeStack(frame);
    }

    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("locals = [");
        for (int i = 0; i < this.locals.length; i++) {
            buffer.append(this.locals[i] == null ? "empty" : this.locals[i].toString());
            if (i < this.locals.length - 1) {
                buffer.append(", ");
            }
        }
        buffer.append("] stack = [");
        for (int i2 = 0; i2 < this.f115top; i2++) {
            buffer.append(this.stack[i2]);
            if (i2 < this.f115top - 1) {
                buffer.append(", ");
            }
        }
        buffer.append(']');
        return buffer.toString();
    }

    boolean isJsrMerged() {
        return this.jsrMerged;
    }

    void setJsrMerged(boolean jsrMerged) {
        this.jsrMerged = jsrMerged;
    }

    boolean isRetMerged() {
        return this.retMerged;
    }

    void setRetMerged(boolean retMerged) {
        this.retMerged = retMerged;
    }
}
