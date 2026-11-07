package org.apache.commons.compress.harmony.unpack200.bytecode;

import androidx.autofill.HintConstants;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/* loaded from: classes24.dex */
public class CPMember extends ClassFileEntry {
    List<Attribute> attributes;
    protected final CPUTF8 descriptor;
    transient int descriptorIndex;
    short flags;
    CPUTF8 name;
    transient int nameIndex;

    public CPMember(CPUTF8 name, CPUTF8 descriptor, long flags, List<Attribute> attributes) {
        this.name = (CPUTF8) Objects.requireNonNull(name, HintConstants.AUTOFILL_HINT_NAME);
        this.descriptor = (CPUTF8) Objects.requireNonNull(descriptor, "descriptor");
        this.flags = (short) flags;
        this.attributes = attributes == null ? Collections.EMPTY_LIST : attributes;
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    protected void doWrite(DataOutputStream dos) throws IOException {
        dos.writeShort(this.flags);
        dos.writeShort(this.nameIndex);
        dos.writeShort(this.descriptorIndex);
        int attributeCount = this.attributes.size();
        dos.writeShort(attributeCount);
        for (int i = 0; i < attributeCount; i++) {
            Attribute attribute = this.attributes.get(i);
            attribute.doWrite(dos);
        }
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CPMember other = (CPMember) obj;
        if (this.attributes.equals(other.attributes) && this.descriptor.equals(other.descriptor) && this.flags == other.flags && this.name.equals(other.name)) {
            return true;
        }
        return false;
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    protected ClassFileEntry[] getNestedClassFileEntries() {
        int attributeCount = this.attributes.size();
        ClassFileEntry[] entries = new ClassFileEntry[attributeCount + 2];
        entries[0] = this.name;
        entries[1] = this.descriptor;
        for (int i = 0; i < attributeCount; i++) {
            entries[i + 2] = this.attributes.get(i);
        }
        return entries;
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public int hashCode() {
        int result = (1 * 31) + this.attributes.hashCode();
        return (((((result * 31) + this.descriptor.hashCode()) * 31) + this.flags) * 31) + this.name.hashCode();
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    protected void resolve(final ClassConstantPool pool) {
        super.resolve(pool);
        this.nameIndex = pool.indexOf(this.name);
        this.descriptorIndex = pool.indexOf(this.descriptor);
        this.attributes.forEach(new Consumer() { // from class: org.apache.commons.compress.harmony.unpack200.bytecode.CPMember$$ExternalSyntheticLambda0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((Attribute) obj).resolve(pool);
            }
        });
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public String toString() {
        return "CPMember: " + this.name + "(" + this.descriptor + ")";
    }
}
