package javassist.bytecode;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javassist.CtClass;
import kotlin.text.Typography;
import org.apache.commons.io.IOUtils;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/game/MioLibPatcher.jar:javassist/bytecode/SignatureAttribute.class */
public class SignatureAttribute extends AttributeInfo {
    public static final String tag = "Signature";

    SignatureAttribute(ConstPool cp, int n, DataInputStream in) throws IOException {
        super(cp, n, in);
    }

    public SignatureAttribute(ConstPool cp, String signature) {
        super(cp, "Signature");
        int index = cp.addUtf8Info(signature);
        byte[] bvalue = {(byte) (index >>> 8), (byte) index};
        set(bvalue);
    }

    public String getSignature() {
        return getConstPool().getUtf8Info(ByteArray.readU16bit(get(), 0));
    }

    public void setSignature(String sig) {
        int index = getConstPool().addUtf8Info(sig);
        ByteArray.write16bit(index, this.info, 0);
    }

    @Override // javassist.bytecode.AttributeInfo
    public AttributeInfo copy(ConstPool newCp, Map<String, String> classnames) {
        return new SignatureAttribute(newCp, getSignature());
    }

    @Override // javassist.bytecode.AttributeInfo
    void renameClass(String oldname, String newname) {
        String sig = renameClass(getSignature(), oldname, newname);
        setSignature(sig);
    }

    @Override // javassist.bytecode.AttributeInfo
    void renameClass(Map<String, String> classnames) {
        String sig = renameClass(getSignature(), classnames);
        setSignature(sig);
    }

    static String renameClass(String desc, String oldname, String newname) {
        Map<String, String> map = new HashMap<>();
        map.put(oldname, newname);
        return renameClass(desc, map);
    }

    static String renameClass(String desc, Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return desc;
        }
        StringBuilder newdesc = new StringBuilder();
        int head = 0;
        int i = 0;
        while (true) {
            int j = desc.indexOf(76, i);
            if (j < 0) {
                break;
            }
            ArrayList<StringBuilder> nameBufs = new ArrayList<>();
            ArrayList<StringBuilder> genericParamBufs = new ArrayList<>();
            i = parseClassName(nameBufs, genericParamBufs, desc, j) + 1;
            if (i < 0) {
                break;
            }
            String name = String.join("$", (CharSequence[]) nameBufs.toArray(new StringBuilder[0]));
            String newname = map.get(name);
            if (newname != null) {
                if (makeNewClassName(desc, map, name, newname, newdesc, head, j, nameBufs, genericParamBufs)) {
                    head = i;
                }
            } else if (replaceTypeArguments(desc, map, newdesc, head, j, nameBufs, genericParamBufs)) {
                head = i;
            }
        }
        if (head == 0) {
            return desc;
        }
        int len = desc.length();
        if (head < len) {
            newdesc.append(desc.substring(head, len));
        }
        return newdesc.toString();
    }

    private static int parseClassName(ArrayList<StringBuilder> nameBufs, ArrayList<StringBuilder> genericParamBufs, String desc, int j) {
        StringBuilder nameBuf = new StringBuilder();
        StringBuilder genericParamBuf = new StringBuilder();
        int k = j;
        while (true) {
            try {
                k++;
                char c = desc.charAt(k);
                if (c != ';') {
                    if (c == '<') {
                        genericParamBuf.append(c);
                        int level = 1;
                        while (level > 0) {
                            k++;
                            char c2 = desc.charAt(k);
                            genericParamBuf.append(c2);
                            if (c2 == '<') {
                                level++;
                            } else if (c2 == '>') {
                                level--;
                            }
                        }
                    } else if (c == '.') {
                        nameBufs.add(nameBuf);
                        genericParamBufs.add(genericParamBuf);
                        nameBuf = new StringBuilder();
                        genericParamBuf = new StringBuilder();
                    } else {
                        nameBuf.append(c);
                    }
                } else {
                    nameBufs.add(nameBuf);
                    genericParamBufs.add(genericParamBuf);
                    return k;
                }
            } catch (IndexOutOfBoundsException e) {
                return -2;
            }
        }
    }

    private static boolean makeNewClassName(String desc, Map<String, String> map, String name, String newname, StringBuilder newdesc, int head, int j, ArrayList<StringBuilder> nameBufs, ArrayList<StringBuilder> genericParamBufs) {
        String string;
        String[] nameSplit = name.split("\\$");
        String[] newnameSplit = newname.split("\\$");
        if (nameSplit.length == newnameSplit.length) {
            String[] newnames = new String[nameBufs.size()];
            int start = 0;
            for (int z = 0; z < nameBufs.size(); z++) {
                int toAggregate = ((int) nameBufs.get(z).chars().filter(ch -> {
                    return ch == 36;
                }).count()) + 1;
                String s = String.join("$", (CharSequence[]) Arrays.copyOfRange(newnameSplit, start, start + toAggregate));
                start += toAggregate;
                newnames[z] = s;
            }
            newdesc.append(desc.substring(head, j));
            newdesc.append('L');
            for (int z2 = 0; z2 < newnames.length; z2++) {
                if (z2 > 0) {
                    newdesc.append('.');
                }
                newdesc.append(newnames[z2]);
                StringBuilder genericParamBufCurrent = genericParamBufs.get(z2);
                if (genericParamBufCurrent.length() > 0) {
                    string = "<" + renameClass(genericParamBufCurrent.substring(1, genericParamBufCurrent.length() - 1), map) + ">";
                } else {
                    string = genericParamBufCurrent.toString();
                }
                String newgenericParam = string;
                newdesc.append(newgenericParam);
            }
            newdesc.append(';');
            return true;
        }
        return false;
    }

    private static boolean replaceTypeArguments(String desc, Map<String, String> map, StringBuilder newdesc, int head, int j, ArrayList<StringBuilder> nameBufs, ArrayList<StringBuilder> genericParamBufs) {
        String newGenericParam;
        ArrayList<String> newGenericParamBufs = new ArrayList<>();
        boolean changed = false;
        for (int z = 0; z < genericParamBufs.size(); z++) {
            StringBuilder genericParamBufCurrent = genericParamBufs.get(z);
            if (genericParamBufCurrent.length() > 0) {
                newGenericParam = "<" + renameClass(genericParamBufCurrent.substring(1, genericParamBufCurrent.length() - 1), map) + ">";
                changed = changed || !genericParamBufCurrent.toString().equals(newGenericParam);
            } else {
                newGenericParam = genericParamBufCurrent.toString();
            }
            newGenericParamBufs.add(newGenericParam);
        }
        if (changed) {
            newdesc.append(desc.substring(head, j));
            newdesc.append('L');
            for (int z2 = 0; z2 < genericParamBufs.size(); z2++) {
                if (z2 > 0) {
                    newdesc.append('.');
                }
                newdesc.append((CharSequence) nameBufs.get(z2));
                newdesc.append(newGenericParamBufs.get(z2));
            }
            newdesc.append(';');
            return true;
        }
        return false;
    }

    private static boolean isNamePart(int c) {
        return (c == 59 || c == 60) ? false : true;
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/game/MioLibPatcher.jar:javassist/bytecode/SignatureAttribute$Cursor.class */
    private static class Cursor {
        int position;

        private Cursor() {
            this.position = 0;
        }

        int indexOf(String s, int ch) throws BadBytecode {
            int i = s.indexOf(ch, this.position);
            if (i < 0) {
                throw SignatureAttribute.error(s);
            }
            this.position = i + 1;
            return i;
        }
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/game/MioLibPatcher.jar:javassist/bytecode/SignatureAttribute$ClassSignature.class */
    public static class ClassSignature {
        TypeParameter[] params;
        ClassType superClass;
        ClassType[] interfaces;

        public ClassSignature(TypeParameter[] params, ClassType superClass, ClassType[] interfaces) {
            this.params = params == null ? new TypeParameter[0] : params;
            this.superClass = superClass == null ? ClassType.OBJECT : superClass;
            this.interfaces = interfaces == null ? new ClassType[0] : interfaces;
        }

        public ClassSignature(TypeParameter[] p) {
            this(p, null, null);
        }

        public TypeParameter[] getParameters() {
            return this.params;
        }

        public ClassType getSuperClass() {
            return this.superClass;
        }

        public ClassType[] getInterfaces() {
            return this.interfaces;
        }

        public String toString() {
            StringBuilder sbuf = new StringBuilder();
            TypeParameter.toString(sbuf, this.params);
            sbuf.append(" extends ").append(this.superClass);
            if (this.interfaces.length > 0) {
                sbuf.append(" implements ");
                Type.toString(sbuf, this.interfaces);
            }
            return sbuf.toString();
        }

        public String encode() {
            StringBuilder sbuf = new StringBuilder();
            if (this.params.length > 0) {
                sbuf.append(Typography.less);
                for (int i = 0; i < this.params.length; i++) {
                    this.params[i].encode(sbuf);
                }
                sbuf.append(Typography.greater);
            }
            this.superClass.encode(sbuf);
            for (int i2 = 0; i2 < this.interfaces.length; i2++) {
                this.interfaces[i2].encode(sbuf);
            }
            return sbuf.toString();
        }
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/game/MioLibPatcher.jar:javassist/bytecode/SignatureAttribute$MethodSignature.class */
    public static class MethodSignature {
        TypeParameter[] typeParams;
        Type[] params;
        Type retType;
        ObjectType[] exceptions;

        public MethodSignature(TypeParameter[] tp, Type[] params, Type ret, ObjectType[] ex) {
            this.typeParams = tp == null ? new TypeParameter[0] : tp;
            this.params = params == null ? new Type[0] : params;
            this.retType = ret == null ? new BaseType("void") : ret;
            this.exceptions = ex == null ? new ObjectType[0] : ex;
        }

        public TypeParameter[] getTypeParameters() {
            return this.typeParams;
        }

        public Type[] getParameterTypes() {
            return this.params;
        }

        public Type getReturnType() {
            return this.retType;
        }

        public ObjectType[] getExceptionTypes() {
            return this.exceptions;
        }

        public String toString() {
            StringBuilder sbuf = new StringBuilder();
            TypeParameter.toString(sbuf, this.typeParams);
            sbuf.append(" (");
            Type.toString(sbuf, this.params);
            sbuf.append(") ");
            sbuf.append(this.retType);
            if (this.exceptions.length > 0) {
                sbuf.append(" throws ");
                Type.toString(sbuf, this.exceptions);
            }
            return sbuf.toString();
        }

        public String encode() {
            StringBuilder sbuf = new StringBuilder();
            if (this.typeParams.length > 0) {
                sbuf.append(Typography.less);
                for (int i = 0; i < this.typeParams.length; i++) {
                    this.typeParams[i].encode(sbuf);
                }
                sbuf.append(Typography.greater);
            }
            sbuf.append('(');
            for (int i2 = 0; i2 < this.params.length; i2++) {
                this.params[i2].encode(sbuf);
            }
            sbuf.append(')');
            this.retType.encode(sbuf);
            if (this.exceptions.length > 0) {
                for (int i3 = 0; i3 < this.exceptions.length; i3++) {
                    sbuf.append('^');
                    this.exceptions[i3].encode(sbuf);
                }
            }
            return sbuf.toString();
        }
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/game/MioLibPatcher.jar:javassist/bytecode/SignatureAttribute$TypeParameter.class */
    public static class TypeParameter {
        String name;
        ObjectType superClass;
        ObjectType[] superInterfaces;

        TypeParameter(String sig, int nb, int ne, ObjectType sc, ObjectType[] si) {
            this.name = sig.substring(nb, ne);
            this.superClass = sc;
            this.superInterfaces = si;
        }

        public TypeParameter(String name, ObjectType superClass, ObjectType[] superInterfaces) {
            this.name = name;
            this.superClass = superClass;
            if (superInterfaces == null) {
                this.superInterfaces = new ObjectType[0];
            } else {
                this.superInterfaces = superInterfaces;
            }
        }

        public TypeParameter(String name) {
            this(name, null, null);
        }

        public String getName() {
            return this.name;
        }

        public ObjectType getClassBound() {
            return this.superClass;
        }

        public ObjectType[] getInterfaceBound() {
            return this.superInterfaces;
        }

        public String toString() {
            StringBuilder sbuf = new StringBuilder(getName());
            if (this.superClass != null) {
                sbuf.append(" extends ").append(this.superClass.toString());
            }
            int len = this.superInterfaces.length;
            if (len > 0) {
                for (int i = 0; i < len; i++) {
                    if (i > 0 || this.superClass != null) {
                        sbuf.append(" & ");
                    } else {
                        sbuf.append(" extends ");
                    }
                    sbuf.append(this.superInterfaces[i].toString());
                }
            }
            return sbuf.toString();
        }

        static void toString(StringBuilder sbuf, TypeParameter[] tp) {
            sbuf.append(Typography.less);
            for (int i = 0; i < tp.length; i++) {
                if (i > 0) {
                    sbuf.append(", ");
                }
                sbuf.append(tp[i]);
            }
            sbuf.append(Typography.greater);
        }

        void encode(StringBuilder sb) {
            sb.append(this.name);
            if (this.superClass == null) {
                sb.append(":Ljava/lang/Object;");
            } else {
                sb.append(':');
                this.superClass.encode(sb);
            }
            for (int i = 0; i < this.superInterfaces.length; i++) {
                sb.append(':');
                this.superInterfaces[i].encode(sb);
            }
        }
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/game/MioLibPatcher.jar:javassist/bytecode/SignatureAttribute$TypeArgument.class */
    public static class TypeArgument {
        ObjectType arg;
        char wildcard;

        TypeArgument(ObjectType a, char w) {
            this.arg = a;
            this.wildcard = w;
        }

        public TypeArgument(ObjectType t) {
            this(t, ' ');
        }

        public TypeArgument() {
            this(null, '*');
        }

        public static TypeArgument subclassOf(ObjectType t) {
            return new TypeArgument(t, '+');
        }

        public static TypeArgument superOf(ObjectType t) {
            return new TypeArgument(t, '-');
        }

        public char getKind() {
            return this.wildcard;
        }

        public boolean isWildcard() {
            return this.wildcard != ' ';
        }

        public ObjectType getType() {
            return this.arg;
        }

        public String toString() {
            if (this.wildcard == '*') {
                return "?";
            }
            String type = this.arg.toString();
            if (this.wildcard == ' ') {
                return type;
            }
            if (this.wildcard == '+') {
                return "? extends " + type;
            }
            return "? super " + type;
        }

        static void encode(StringBuilder sb, TypeArgument[] args) {
            sb.append(Typography.less);
            for (TypeArgument ta : args) {
                if (ta.isWildcard()) {
                    sb.append(ta.wildcard);
                }
                if (ta.getType() != null) {
                    ta.getType().encode(sb);
                }
            }
            sb.append(Typography.greater);
        }
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/game/MioLibPatcher.jar:javassist/bytecode/SignatureAttribute$Type.class */
    public static abstract class Type {
        abstract void encode(StringBuilder sb);

        static void toString(StringBuilder sbuf, Type[] ts) {
            for (int i = 0; i < ts.length; i++) {
                if (i > 0) {
                    sbuf.append(", ");
                }
                sbuf.append(ts[i]);
            }
        }

        public String jvmTypeName() {
            return toString();
        }
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/game/MioLibPatcher.jar:javassist/bytecode/SignatureAttribute$BaseType.class */
    public static class BaseType extends Type {
        char descriptor;

        BaseType(char c) {
            this.descriptor = c;
        }

        public BaseType(String typeName) {
            this(Descriptor.of(typeName).charAt(0));
        }

        public char getDescriptor() {
            return this.descriptor;
        }

        public CtClass getCtlass() {
            return Descriptor.toPrimitiveClass(this.descriptor);
        }

        public String toString() {
            return Descriptor.toClassName(Character.toString(this.descriptor));
        }

        @Override // javassist.bytecode.SignatureAttribute.Type
        void encode(StringBuilder sb) {
            sb.append(this.descriptor);
        }
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/game/MioLibPatcher.jar:javassist/bytecode/SignatureAttribute$ObjectType.class */
    public static abstract class ObjectType extends Type {
        public String encode() {
            StringBuilder sb = new StringBuilder();
            encode(sb);
            return sb.toString();
        }
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/game/MioLibPatcher.jar:javassist/bytecode/SignatureAttribute$ClassType.class */
    public static class ClassType extends ObjectType {
        String name;
        TypeArgument[] arguments;
        public static ClassType OBJECT = new ClassType("java.lang.Object", null);

        static ClassType make(String s, int b, int e, TypeArgument[] targs, ClassType parent) {
            if (parent == null) {
                return new ClassType(s, b, e, targs);
            }
            return new NestedClassType(s, b, e, targs, parent);
        }

        ClassType(String signature, int begin, int end, TypeArgument[] targs) {
            this.name = signature.substring(begin, end).replace(IOUtils.DIR_SEPARATOR_UNIX, '.');
            this.arguments = targs;
        }

        public ClassType(String className, TypeArgument[] args) {
            this.name = className;
            this.arguments = args;
        }

        public ClassType(String className) {
            this(className, null);
        }

        public String getName() {
            return this.name;
        }

        public TypeArgument[] getTypeArguments() {
            return this.arguments;
        }

        public ClassType getDeclaringClass() {
            return null;
        }

        public String toString() {
            StringBuilder sbuf = new StringBuilder();
            ClassType parent = getDeclaringClass();
            if (parent != null) {
                sbuf.append(parent.toString()).append('.');
            }
            return toString2(sbuf);
        }

        private String toString2(StringBuilder sbuf) {
            sbuf.append(this.name);
            if (this.arguments != null) {
                sbuf.append(Typography.less);
                int n = this.arguments.length;
                for (int i = 0; i < n; i++) {
                    if (i > 0) {
                        sbuf.append(", ");
                    }
                    sbuf.append(this.arguments[i].toString());
                }
                sbuf.append(Typography.greater);
            }
            return sbuf.toString();
        }

        @Override // javassist.bytecode.SignatureAttribute.Type
        public String jvmTypeName() {
            StringBuilder sbuf = new StringBuilder();
            ClassType parent = getDeclaringClass();
            if (parent != null) {
                sbuf.append(parent.jvmTypeName()).append('$');
            }
            return toString2(sbuf);
        }

        @Override // javassist.bytecode.SignatureAttribute.Type
        void encode(StringBuilder sb) {
            sb.append('L');
            encode2(sb);
            sb.append(';');
        }

        void encode2(StringBuilder sb) {
            ClassType parent = getDeclaringClass();
            if (parent != null) {
                parent.encode2(sb);
                sb.append('$');
            }
            sb.append(this.name.replace('.', IOUtils.DIR_SEPARATOR_UNIX));
            if (this.arguments != null) {
                TypeArgument.encode(sb, this.arguments);
            }
        }
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/game/MioLibPatcher.jar:javassist/bytecode/SignatureAttribute$NestedClassType.class */
    public static class NestedClassType extends ClassType {
        ClassType parent;

        NestedClassType(String s, int b, int e, TypeArgument[] targs, ClassType p) {
            super(s, b, e, targs);
            this.parent = p;
        }

        public NestedClassType(ClassType parent, String className, TypeArgument[] args) {
            super(className, args);
            this.parent = parent;
        }

        @Override // javassist.bytecode.SignatureAttribute.ClassType
        public ClassType getDeclaringClass() {
            return this.parent;
        }
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/game/MioLibPatcher.jar:javassist/bytecode/SignatureAttribute$ArrayType.class */
    public static class ArrayType extends ObjectType {
        int dim;
        Type componentType;

        public ArrayType(int d, Type comp) {
            this.dim = d;
            this.componentType = comp;
        }

        public int getDimension() {
            return this.dim;
        }

        public Type getComponentType() {
            return this.componentType;
        }

        public String toString() {
            StringBuilder sbuf = new StringBuilder(this.componentType.toString());
            for (int i = 0; i < this.dim; i++) {
                sbuf.append("[]");
            }
            return sbuf.toString();
        }

        @Override // javassist.bytecode.SignatureAttribute.Type
        void encode(StringBuilder sb) {
            for (int i = 0; i < this.dim; i++) {
                sb.append('[');
            }
            this.componentType.encode(sb);
        }
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/game/MioLibPatcher.jar:javassist/bytecode/SignatureAttribute$TypeVariable.class */
    public static class TypeVariable extends ObjectType {
        String name;

        TypeVariable(String sig, int begin, int end) {
            this.name = sig.substring(begin, end);
        }

        public TypeVariable(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return this.name;
        }

        @Override // javassist.bytecode.SignatureAttribute.Type
        void encode(StringBuilder sb) {
            sb.append('T').append(this.name).append(';');
        }
    }

    public static ClassSignature toClassSignature(String sig) throws BadBytecode {
        try {
            return parseSig(sig);
        } catch (IndexOutOfBoundsException e) {
            throw error(sig);
        }
    }

    public static MethodSignature toMethodSignature(String sig) throws BadBytecode {
        try {
            return parseMethodSig(sig);
        } catch (IndexOutOfBoundsException e) {
            throw error(sig);
        }
    }

    public static ObjectType toFieldSignature(String sig) throws BadBytecode {
        try {
            return parseObjectType(sig, new Cursor(), false);
        } catch (IndexOutOfBoundsException e) {
            throw error(sig);
        }
    }

    public static Type toTypeSignature(String sig) throws BadBytecode {
        try {
            return parseType(sig, new Cursor());
        } catch (IndexOutOfBoundsException e) {
            throw error(sig);
        }
    }

    private static ClassSignature parseSig(String sig) throws IndexOutOfBoundsException, BadBytecode {
        Cursor cur = new Cursor();
        TypeParameter[] tp = parseTypeParams(sig, cur);
        ClassType superClass = parseClassType(sig, cur);
        int sigLen = sig.length();
        List<ClassType> ifArray = new ArrayList<>();
        while (cur.position < sigLen && sig.charAt(cur.position) == 'L') {
            ifArray.add(parseClassType(sig, cur));
        }
        ClassType[] ifs = (ClassType[]) ifArray.toArray(new ClassType[ifArray.size()]);
        return new ClassSignature(tp, superClass, ifs);
    }

    private static MethodSignature parseMethodSig(String sig) throws BadBytecode {
        Cursor cur = new Cursor();
        TypeParameter[] tp = parseTypeParams(sig, cur);
        int i = cur.position;
        cur.position = i + 1;
        if (sig.charAt(i) != '(') {
            throw error(sig);
        }
        List<Type> params = new ArrayList<>();
        while (sig.charAt(cur.position) != ')') {
            params.add(parseType(sig, cur));
        }
        cur.position++;
        Type ret = parseType(sig, cur);
        int sigLen = sig.length();
        List<ObjectType> exceptions = new ArrayList<>();
        while (cur.position < sigLen && sig.charAt(cur.position) == '^') {
            cur.position++;
            ObjectType t = parseObjectType(sig, cur, false);
            if (t instanceof ArrayType) {
                throw error(sig);
            }
            exceptions.add(t);
        }
        Type[] p = (Type[]) params.toArray(new Type[params.size()]);
        ObjectType[] ex = (ObjectType[]) exceptions.toArray(new ObjectType[exceptions.size()]);
        return new MethodSignature(tp, p, ret, ex);
    }

    private static TypeParameter[] parseTypeParams(String sig, Cursor cur) throws BadBytecode {
        List<TypeParameter> typeParam = new ArrayList<>();
        if (sig.charAt(cur.position) == '<') {
            cur.position++;
            while (sig.charAt(cur.position) != '>') {
                int nameBegin = cur.position;
                int nameEnd = cur.indexOf(sig, 58);
                ObjectType classBound = parseObjectType(sig, cur, true);
                List<ObjectType> ifBound = new ArrayList<>();
                while (sig.charAt(cur.position) == ':') {
                    cur.position++;
                    ObjectType t = parseObjectType(sig, cur, false);
                    ifBound.add(t);
                }
                TypeParameter p = new TypeParameter(sig, nameBegin, nameEnd, classBound, (ObjectType[]) ifBound.toArray(new ObjectType[ifBound.size()]));
                typeParam.add(p);
            }
            cur.position++;
        }
        return (TypeParameter[]) typeParam.toArray(new TypeParameter[typeParam.size()]);
    }

    private static ObjectType parseObjectType(String sig, Cursor c, boolean dontThrow) throws BadBytecode {
        int begin = c.position;
        switch (sig.charAt(begin)) {
            case 'L':
                return parseClassType2(sig, c, null);
            case 'T':
                int i = c.indexOf(sig, 59);
                return new TypeVariable(sig, begin + 1, i);
            case '[':
                return parseArray(sig, c);
            default:
                if (dontThrow) {
                    return null;
                }
                throw error(sig);
        }
    }

    private static ClassType parseClassType(String sig, Cursor c) throws BadBytecode {
        if (sig.charAt(c.position) == 'L') {
            return parseClassType2(sig, c, null);
        }
        throw error(sig);
    }

    private static ClassType parseClassType2(String sig, Cursor c, ClassType parent) throws BadBytecode {
        char t;
        TypeArgument[] targs;
        int start = c.position + 1;
        c.position = start;
        do {
            int i = c.position;
            c.position = i + 1;
            t = sig.charAt(i);
            if (t == '$' || t == '<') {
                break;
            }
        } while (t != ';');
        int end = c.position - 1;
        if (t == '<') {
            targs = parseTypeArgs(sig, c);
            int i2 = c.position;
            c.position = i2 + 1;
            t = sig.charAt(i2);
        } else {
            targs = null;
        }
        ClassType thisClass = ClassType.make(sig, start, end, targs, parent);
        if (t == '$' || t == '.') {
            c.position--;
            return parseClassType2(sig, c, thisClass);
        }
        return thisClass;
    }

    private static TypeArgument[] parseTypeArgs(String sig, Cursor c) throws BadBytecode {
        TypeArgument typeArgument;
        List<TypeArgument> args = new ArrayList<>();
        while (true) {
            int i = c.position;
            c.position = i + 1;
            char cCharAt = sig.charAt(i);
            char t = cCharAt;
            if (cCharAt != '>') {
                if (t == '*') {
                    typeArgument = new TypeArgument(null, '*');
                } else {
                    if (t != '+' && t != '-') {
                        t = ' ';
                        c.position--;
                    }
                    typeArgument = new TypeArgument(parseObjectType(sig, c, false), t);
                }
                TypeArgument ta = typeArgument;
                args.add(ta);
            } else {
                return (TypeArgument[]) args.toArray(new TypeArgument[args.size()]);
            }
        }
    }

    private static ObjectType parseArray(String sig, Cursor c) throws BadBytecode {
        int dim = 1;
        while (true) {
            int i = c.position + 1;
            c.position = i;
            if (sig.charAt(i) == '[') {
                dim++;
            } else {
                return new ArrayType(dim, parseType(sig, c));
            }
        }
    }

    private static Type parseType(String sig, Cursor c) throws BadBytecode {
        Type t = parseObjectType(sig, c, true);
        if (t == null) {
            int i = c.position;
            c.position = i + 1;
            t = new BaseType(sig.charAt(i));
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BadBytecode error(String sig) {
        return new BadBytecode("bad signature: " + sig);
    }
}
