package com.mio.libpatcher.transformer;

import java.util.ArrayList;
import java.util.List;
import javassist.CtClass;
import javassist.CtMethod;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/game/MioLibPatcher.jar:com/mio/libpatcher/transformer/SodiumLikeModTransformer.class */
public class SodiumLikeModTransformer implements BaseTransformer {
    @Override // com.mio.libpatcher.transformer.BaseTransformer
    public List<String> getTargetClassNames() {
        List<String> nameList = new ArrayList<>();
        nameList.add("net.caffeinemc.mods.sodium.client.compatibility.checks.PostLaunchChecks");
        nameList.add("me.jellysquid.mods.sodium.client.compatibility.checks.PostLaunchChecks");
        nameList.add("org.embeddedt.embeddium.impl.compatibility.checks.LateDriverScanner");
        nameList.add("me.jellysquid.mods.sodium.client.compatibility.checks.LateDriverScanner");
        return nameList;
    }

    @Override // com.mio.libpatcher.transformer.BaseTransformer
    public void transform(CtClass clazz) throws Throwable {
        CtMethod method = clazz.getDeclaredMethod("isUsingPojavLauncher");
        method.setBody("{return false;}");
    }
}
