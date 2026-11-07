package org.apache.commons.compress.harmony.unpack200.bytecode;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.compress.harmony.unpack200.bytecode.AnnotationsAttribute;

/* loaded from: classes24.dex */
public class RuntimeVisibleorInvisibleParameterAnnotationsAttribute extends AnnotationsAttribute {
    private final int numParameters;
    private final ParameterAnnotation[] parameterAnnotations;

    public static class ParameterAnnotation {
        private final AnnotationsAttribute.Annotation[] annotations;
        private final int numAnnotations;

        public ParameterAnnotation(AnnotationsAttribute.Annotation[] annotations) {
            this.numAnnotations = annotations.length;
            this.annotations = annotations;
        }

        public List<Object> getClassFileEntries() {
            List<Object> nested = new ArrayList<>();
            for (AnnotationsAttribute.Annotation annotation : this.annotations) {
                nested.addAll(annotation.getClassFileEntries());
            }
            return nested;
        }

        public int getLength() {
            int length = 2;
            for (AnnotationsAttribute.Annotation annotation : this.annotations) {
                length += annotation.getLength();
            }
            return length;
        }

        public void resolve(ClassConstantPool pool) {
            for (AnnotationsAttribute.Annotation annotation : this.annotations) {
                annotation.resolve(pool);
            }
        }

        public void writeBody(DataOutputStream dos) throws IOException {
            dos.writeShort(this.numAnnotations);
            for (AnnotationsAttribute.Annotation annotation : this.annotations) {
                annotation.writeBody(dos);
            }
        }
    }

    public RuntimeVisibleorInvisibleParameterAnnotationsAttribute(CPUTF8 name, ParameterAnnotation[] parameterAnnotations) {
        super(name);
        this.numParameters = parameterAnnotations.length;
        this.parameterAnnotations = parameterAnnotations;
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute
    protected int getLength() {
        int length = 1;
        for (int i = 0; i < this.numParameters; i++) {
            length += this.parameterAnnotations[i].getLength();
        }
        return length;
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    protected ClassFileEntry[] getNestedClassFileEntries() {
        List<Object> nested = new ArrayList<>();
        nested.add(this.attributeName);
        for (ParameterAnnotation parameterAnnotation : this.parameterAnnotations) {
            nested.addAll(parameterAnnotation.getClassFileEntries());
        }
        return (ClassFileEntry[]) nested.toArray(ClassFileEntry.NONE);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public void resolve(ClassConstantPool pool) {
        super.resolve(pool);
        for (ParameterAnnotation parameterAnnotation : this.parameterAnnotations) {
            parameterAnnotation.resolve(pool);
        }
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public String toString() {
        return this.attributeName.underlyingString() + ": " + this.numParameters + " parameter annotations";
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute
    protected void writeBody(DataOutputStream dos) throws IOException {
        dos.writeByte(this.numParameters);
        for (int i = 0; i < this.numParameters; i++) {
            this.parameterAnnotations[i].writeBody(dos);
        }
    }
}
