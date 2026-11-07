package com.mio.libpatcher.transformer;

import java.util.ArrayList;
import java.util.List;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/game/MioLibPatcher.jar:com/mio/libpatcher/transformer/ASMTransformer.class */
public class ASMTransformer implements BaseTransformer {
    private final boolean asm504Enabled = Boolean.parseBoolean(System.getProperty("miolibpatcher.asmBackport", "false"));

    @Override // com.mio.libpatcher.transformer.BaseTransformer
    public List<String> getTargetClassNames() {
        List<String> list = new ArrayList<>();
        if (!this.asm504Enabled) {
            return list;
        }
        list.add("org.objectweb.asm.ClassVisitor");
        list.add("org.objectweb.asm.MethodVisitor");
        list.add("org.objectweb.asm.FieldVisitor");
        list.add("org.objectweb.asm.AnnotationVisitor");
        list.add("org.objectweb.asm.signature.SignatureVisitor");
        return list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c3, code lost:
    
        continue;
     */
    @Override // com.mio.libpatcher.transformer.BaseTransformer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void transform(javassist.CtClass r6) throws javassist.CannotCompileException {
        /*
            r5 = this;
            r0 = r5
            boolean r0 = r0.asm504Enabled
            if (r0 != 0) goto L8
            return
        L8:
            r0 = r6
            javassist.CtConstructor[] r0 = r0.getDeclaredConstructors()
            r7 = r0
            r0 = r7
            int r0 = r0.length
            r8 = r0
            r0 = 0
            r9 = r0
        L13:
            r0 = r9
            r1 = r8
            if (r0 >= r1) goto Lc9
            r0 = r7
            r1 = r9
            r0 = r0[r1]
            r10 = r0
            r0 = r10
            boolean r0 = r0.isClassInitializer()
            if (r0 != 0) goto Lc3
            r0 = r10
            javassist.bytecode.MethodInfo r0 = r0.getMethodInfo()
            javassist.bytecode.CodeAttribute r0 = r0.getCodeAttribute()
            javassist.bytecode.CodeIterator r0 = r0.iterator()
            r11 = r0
        L34:
            r0 = r11
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto Lc3
            r0 = r11
            int r0 = r0.next()     // Catch: javassist.bytecode.BadBytecode -> Lb5
            r12 = r0
            r0 = r11
            r1 = r12
            int r0 = r0.byteAt(r1)     // Catch: javassist.bytecode.BadBytecode -> Lb5
            r1 = 187(0xbb, float:2.62E-43)
            if (r0 == r1) goto L53
            goto L34
        L53:
            r0 = r11
            int r0 = r0.next()     // Catch: javassist.bytecode.BadBytecode -> Lb5
            r13 = r0
            r0 = r11
            r1 = r13
            int r0 = r0.byteAt(r1)     // Catch: javassist.bytecode.BadBytecode -> Lb5
            r1 = 89
            if (r0 == r1) goto L69
            goto L34
        L69:
            r0 = r11
            int r0 = r0.next()     // Catch: javassist.bytecode.BadBytecode -> Lb5
            r14 = r0
            r0 = r11
            r1 = r14
            int r0 = r0.byteAt(r1)     // Catch: javassist.bytecode.BadBytecode -> Lb5
            r1 = 183(0xb7, float:2.56E-43)
            if (r0 == r1) goto L80
            goto L34
        L80:
            r0 = r11
            int r0 = r0.next()     // Catch: javassist.bytecode.BadBytecode -> Lb5
            r15 = r0
            r0 = r11
            r1 = r15
            int r0 = r0.byteAt(r1)     // Catch: javassist.bytecode.BadBytecode -> Lb5
            r1 = 191(0xbf, float:2.68E-43)
            if (r0 == r1) goto L97
            goto L34
        L97:
            r0 = r12
            r16 = r0
        L9b:
            r0 = r16
            r1 = r15
            r2 = 1
            int r1 = r1 + r2
            if (r0 >= r1) goto Lb2
            r0 = r11
            r1 = 0
            r2 = r16
            r0.writeByte(r1, r2)     // Catch: javassist.bytecode.BadBytecode -> Lb5
            int r16 = r16 + 1
            goto L9b
        Lb2:
            goto Lc3
        Lb5:
            r12 = move-exception
            javassist.CannotCompileException r0 = new javassist.CannotCompileException
            r1 = r0
            java.lang.String r2 = "Failed to parse bytecode while searching for theIllegalArgumentException pattern, is this ASM 5.0.4?"
            r3 = r12
            r1.<init>(r2, r3)
            throw r0
        Lc3:
            int r9 = r9 + 1
            goto L13
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mio.libpatcher.transformer.ASMTransformer.transform(javassist.CtClass):void");
    }
}
