package org.jackhuang.hmcl;

import cpw.mods.modlauncher.serviceapi.ITransformerDiscoveryService;
import java.io.File;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/game/HMCLTransformerDiscoveryService-1.0.jar:org/jackhuang/hmcl/HMCLTransformerDiscoveryService.class */
public class HMCLTransformerDiscoveryService implements ITransformerDiscoveryService {
    private static final String CANDIDATES = System.getProperty("hmcl.transformer.candidates");

    public List<Path> candidates(Path gameDirectory) {
        return (List) Arrays.stream(CANDIDATES.split(File.pathSeparator)).flatMap(path -> {
            try {
                return Stream.of(Paths.get(path, new String[0]));
            } catch (InvalidPathException e) {
                return Stream.of((Object[]) new Path[0]);
            }
        }).collect(Collectors.toList());
    }
}
