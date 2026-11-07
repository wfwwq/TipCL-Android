import brut.androlib.mod.SmaliMod;

import com.android.tools.smali.dexlib2.Opcodes;
import com.android.tools.smali.dexlib2.writer.builder.DexBuilder;
import com.android.tools.smali.dexlib2.writer.io.FileDataStore;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SurgicalAssemble {
    public static void main(String[] args) throws Exception {
        if (args.length < 2) {
            System.err.println("usage: SurgicalAssemble <smaliDir> <outDex> [apiLevel]");
            System.exit(1);
        }
        File dir = new File(args[0]);
        File out = new File(args[1]);
        int api = args.length > 2 ? Integer.parseInt(args[2]) : 26;

        DexBuilder db = new DexBuilder(Opcodes.forApi(api));
        List<Path> files = new ArrayList<>();
        Files.walk(dir.toPath()).filter(p -> p.toString().endsWith(".smali")).forEach(files::add);
        Collections.sort(files);
        int n = 0;
        for (Path p : files) {
            if (!SmaliMod.assembleSmaliFile(p.toFile(), db, api, false, false)) {
                System.err.println("FAILED to assemble: " + p);
                System.exit(2);
            }
            n++;
        }
        db.writeTo(new FileDataStore(out));
        System.out.println("assembled " + n + " smali files -> " + out.getAbsolutePath());
    }
}
