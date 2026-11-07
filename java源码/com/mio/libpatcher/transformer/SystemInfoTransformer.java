package com.mio.libpatcher.transformer;

import javassist.CtClass;
import javassist.CtConstructor;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/game/MioLibPatcher.jar:com/mio/libpatcher/transformer/SystemInfoTransformer.class */
public class SystemInfoTransformer implements BaseTransformer {
    @Override // com.mio.libpatcher.transformer.BaseTransformer
    public String getTargetClassName() {
        return "net.vulkanmod.vulkan.SystemInfo";
    }

    @Override // com.mio.libpatcher.transformer.BaseTransformer
    public void transform(CtClass clazz) throws Throwable {
        CtConstructor constructor = clazz.getClassInitializer();
        constructor.setBody("{cpuInfo = System.getProperty(\"cpu.name\",\"\");}");
    }
}
