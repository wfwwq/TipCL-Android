package org.apache.commons.compress.harmony.pack200;

import javassist.bytecode.SyntheticAttribute;
import org.lwjgl.sdl.SDLJoystick;
import org.objectweb.asm.ClassReader;

/* loaded from: classes24.dex */
public class Pack200ClassReader extends ClassReader {
    private boolean anySyntheticAttributes;
    private String fileName;
    private boolean lastConstantHadWideIndex;
    private int lastUnsignedShort;

    public Pack200ClassReader(byte[] b) {
        super(b);
    }

    public String getFileName() {
        return this.fileName;
    }

    public boolean hasSyntheticAttributes() {
        return this.anySyntheticAttributes;
    }

    public boolean lastConstantHadWideIndex() {
        return this.lastConstantHadWideIndex;
    }

    public Object readConst(int item, char[] buf) {
        this.lastConstantHadWideIndex = item == this.lastUnsignedShort;
        return super.readConst(item, buf);
    }

    public int readUnsignedShort(int index) {
        int unsignedShort = super.readUnsignedShort(index);
        if (index > 0 && this.b[index - 1] == 19) {
            this.lastUnsignedShort = unsignedShort;
        } else {
            this.lastUnsignedShort = SDLJoystick.SDL_JOYSTICK_AXIS_MIN;
        }
        return unsignedShort;
    }

    public String readUTF8(int arg0, char[] arg1) {
        String utf8 = super.readUTF8(arg0, arg1);
        if (!this.anySyntheticAttributes && SyntheticAttribute.tag.equals(utf8)) {
            this.anySyntheticAttributes = true;
        }
        return utf8;
    }

    public void setFileName(String name) {
        this.fileName = name;
    }
}
