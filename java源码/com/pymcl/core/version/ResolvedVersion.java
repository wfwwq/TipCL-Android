package com.pymcl.core.version;

import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import com.pymcl.core.util.Json;
import com.pymcl.core.util.JsonKt;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.archivers.ArchiveStreamFactory;

/* compiled from: Versions.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 -2\u00020\u0001:\u0001-B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005j\u0002`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)2\u0006\u0010+\u001a\u00020,R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR#\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u000f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000bR\u0011\u0010\u0011\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000bR'\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\rR\u0011\u0010\u0015\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000bR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u000bR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u000bR!\u0010\u001f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010 j\u0004\u0018\u0001`!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R!\u0010$\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010 j\u0004\u0018\u0001`!8F¢\u0006\u0006\u001a\u0004\b%\u0010#R\u0011\u0010&\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b'\u0010\u000b¨\u0006."}, d2 = {"Lcom/pymcl/core/version/ResolvedVersion;", "", "id", "", "json", "", "Lcom/pymcl/core/util/JObj;", "jarId", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getJson", "()Ljava/util/Map;", "getJarId", "mainClass", "getMainClass", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "getType", "assetIndex", "getAssetIndex", "assetsName", "getAssetsName", "javaMajor", "", "getJavaMajor", "()Ljava/lang/Integer;", "javaComponent", "getJavaComponent", "minecraftArguments", "getMinecraftArguments", "gameArgs", "", "Lcom/pymcl/core/util/JArr;", "getGameArgs", "()Ljava/util/List;", "jvmArgs", "getJvmArgs", "mcVersion", "getMcVersion", "libraries", "", "Lcom/pymcl/core/version/Library;", "env", "Lcom/pymcl/core/version/RuleEnv;", "Companion", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ResolvedVersion {
    public static final Companion Companion = new Companion(null);
    private final String id;
    private final String jarId;
    private final Map<String, Object> json;

    public ResolvedVersion(String id, Map<String, Object> json, String jarId) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(jarId, "jarId");
        this.id = id;
        this.json = json;
        this.jarId = jarId;
    }

    public final String getId() {
        return this.id;
    }

    public final String getJarId() {
        return this.jarId;
    }

    public final Map<String, Object> getJson() {
        return this.json;
    }

    public final String getMainClass() {
        String str = JsonKt.str(this.json, "mainClass");
        return str == null ? "net.minecraft.client.main.Main" : str;
    }

    public final String getType() {
        String str = JsonKt.str(this.json, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
        return str == null ? "release" : str;
    }

    public final Map<String, Object> getAssetIndex() {
        return JsonKt.obj(this.json, "assetIndex");
    }

    public final String getAssetsName() {
        String str = JsonKt.str(getAssetIndex(), "id");
        if (str != null) {
            return str;
        }
        String str2 = JsonKt.str(this.json, "assets");
        return str2 == null ? "legacy" : str2;
    }

    public final Integer getJavaMajor() {
        return JsonKt.m8042int(JsonKt.obj(this.json, "javaVersion"), "majorVersion");
    }

    public final String getJavaComponent() {
        return JsonKt.str(JsonKt.obj(this.json, "javaVersion"), "component");
    }

    public final String getMinecraftArguments() {
        return JsonKt.str(this.json, "minecraftArguments");
    }

    public final List<Object> getGameArgs() {
        return JsonKt.arr(JsonKt.obj(this.json, "arguments"), "game");
    }

    public final List<Object> getJvmArgs() {
        return JsonKt.arr(JsonKt.obj(this.json, "arguments"), "jvm");
    }

    public final String getMcVersion() {
        String str = JsonKt.str(this.json, "clientVersion");
        if (str != null) {
            return str;
        }
        String str2 = JsonKt.str(this.json, "_mc_version");
        return str2 == null ? this.jarId : str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.pymcl.core.version.Library> libraries(com.pymcl.core.version.RuleEnv r24) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pymcl.core.version.ResolvedVersion.libraries(com.pymcl.core.version.RuleEnv):java.util.List");
    }

    /* compiled from: Versions.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bJL\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rj\u0002`\u000e2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rj\u0002`\u000e2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rj\u0002`\u000e¨\u0006\u0011"}, d2 = {"Lcom/pymcl/core/version/ResolvedVersion$Companion;", "", "<init>", "()V", "load", "Lcom/pymcl/core/version/ResolvedVersion;", "versionsDir", "Ljava/io/File;", "id", "", "depth", "", "merge", "", "Lcom/pymcl/core/util/JObj;", "parent", "child", "PyMCL-Android:core"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ ResolvedVersion load$default(Companion companion, File file, String str, int i, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                i = 0;
            }
            return companion.load(file, str, i);
        }

        public final ResolvedVersion load(File versionsDir, String id, int depth) throws VersionNotFound {
            Intrinsics.checkNotNullParameter(versionsDir, "versionsDir");
            Intrinsics.checkNotNullParameter(id, "id");
            if (!(depth < 8)) {
                throw new IllegalArgumentException("inheritsFrom 层级过深".toString());
            }
            File f = new File(versionsDir, id + "/" + id + ".json");
            if (!f.isFile()) {
                throw new VersionNotFound(id);
            }
            Map j = Json.INSTANCE.obj(FilesKt.readText$default(f, null, 1, null));
            String parentId = JsonKt.str(j, "inheritsFrom");
            if (parentId == null) {
                String str = JsonKt.str(j, ArchiveStreamFactory.JAR);
                if (str == null) {
                    str = id;
                }
                return new ResolvedVersion(id, j, str);
            }
            ResolvedVersion parent = load(versionsDir, parentId, depth + 1);
            Map<String, Object> mapMerge = merge(parent.getJson(), j);
            String str2 = JsonKt.str(j, ArchiveStreamFactory.JAR);
            if (str2 == null) {
                str2 = parent.getJarId();
            }
            return new ResolvedVersion(id, mapMerge, str2);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v2 ??, still in use, count: 1, list:
              (r0v2 ?? I:java.lang.Object) from 0x000e: INVOKE (r0v3 ?? I:java.util.Map) = (r0v2 ?? I:java.lang.Object) STATIC call: com.pymcl.core.util.JsonKt.o(java.lang.Object):java.util.Map A[MD:(java.lang.Object):java.util.Map<java.lang.String, java.lang.Object> (m)]
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
            	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
            	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
            */
        public final java.util.Map<java.lang.String, java.lang.Object> merge(java.util.Map<java.lang.String, java.lang.Object> r12, 
        /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v2 ??, still in use, count: 1, list:
              (r0v2 ?? I:java.lang.Object) from 0x000e: INVOKE (r0v3 ?? I:java.util.Map) = (r0v2 ?? I:java.lang.Object) STATIC call: com.pymcl.core.util.JsonKt.o(java.lang.Object):java.util.Map A[MD:(java.lang.Object):java.util.Map<java.lang.String, java.lang.Object> (m)]
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
            	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1119)
            	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:110)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
            */
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r13v0 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
            	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
            	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:310)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
            	at jadx.core.ProcessClass.process(ProcessClass.java:79)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:403)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:391)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:341)
            */
    }
}
