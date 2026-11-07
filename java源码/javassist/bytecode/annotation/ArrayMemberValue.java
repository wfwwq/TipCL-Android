package javassist.bytecode.annotation;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Map;
import javassist.ClassPool;
import javassist.bytecode.ConstPool;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/game/MioLibPatcher.jar:javassist/bytecode/annotation/ArrayMemberValue.class */
public class ArrayMemberValue extends MemberValue {
    MemberValue type;
    MemberValue[] values;

    public ArrayMemberValue(ConstPool cp) {
        super('[', cp);
        this.type = null;
        this.values = null;
    }

    public ArrayMemberValue(MemberValue t, ConstPool cp) {
        super('[', cp);
        this.type = t;
        this.values = null;
    }

    @Override // javassist.bytecode.annotation.MemberValue
    Object getValue(ClassLoader cl, ClassPool cp, Method method) throws ClassNotFoundException, ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        Class<?> clazz;
        if (this.values == null) {
            throw new ClassNotFoundException("no array elements found: " + method.getName());
        }
        int size = this.values.length;
        if (this.type == null) {
            clazz = method.getReturnType().getComponentType();
            if (clazz == null || size > 0) {
                throw new ClassNotFoundException("broken array type: " + method.getName());
            }
        } else {
            clazz = this.type.getType(cl);
        }
        Object a = Array.newInstance(clazz, size);
        for (int i = 0; i < size; i++) {
            Array.set(a, i, this.values[i].getValue(cl, cp, method));
        }
        return a;
    }

    @Override // javassist.bytecode.annotation.MemberValue
    Class<?> getType(ClassLoader cl) throws ClassNotFoundException, NegativeArraySizeException {
        if (this.type == null) {
            throw new ClassNotFoundException("no array type specified");
        }
        Object a = Array.newInstance(this.type.getType(cl), 0);
        return a.getClass();
    }

    @Override // javassist.bytecode.annotation.MemberValue
    public void renameClass(String oldname, String newname) {
        if (this.type != null) {
            this.type.renameClass(oldname, newname);
        }
        if (this.values != null) {
            for (MemberValue value : this.values) {
                value.renameClass(oldname, newname);
            }
        }
    }

    @Override // javassist.bytecode.annotation.MemberValue
    public void renameClass(Map<String, String> classnames) {
        if (this.type != null) {
            this.type.renameClass(classnames);
        }
        if (this.values != null) {
            for (MemberValue value : this.values) {
                value.renameClass(classnames);
            }
        }
    }

    public MemberValue getType() {
        return this.type;
    }

    public MemberValue[] getValue() {
        return this.values;
    }

    public void setValue(MemberValue[] elements) {
        this.values = elements;
        if (elements != null && elements.length > 0) {
            this.type = elements[0];
        }
    }

    public String toString() {
        StringBuilder buf = new StringBuilder();
        buf.append('{');
        if (this.values != null) {
            for (int i = 0; i < this.values.length; i++) {
                buf.append(this.values[i].toString());
                if (i + 1 < this.values.length) {
                    buf.append(", ");
                }
            }
        }
        buf.append('}');
        return buf.toString();
    }

    @Override // javassist.bytecode.annotation.MemberValue
    public void write(AnnotationsWriter writer) throws IOException {
        int num = this.values == null ? 0 : this.values.length;
        writer.arrayValue(num);
        for (int i = 0; i < num; i++) {
            this.values[i].write(writer);
        }
    }

    @Override // javassist.bytecode.annotation.MemberValue
    public void accept(MemberValueVisitor visitor) {
        visitor.visitArrayMemberValue(this);
    }
}
