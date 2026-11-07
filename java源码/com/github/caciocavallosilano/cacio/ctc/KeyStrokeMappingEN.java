package com.github.caciocavallosilano.cacio.ctc;

import java.awt.AWTKeyStroke;
import java.util.Map;
import kotlin.text.Typography;
import org.apache.commons.io.IOUtils;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/KeyStrokeMappingEN.class */
class KeyStrokeMappingEN extends AbstractKeyStrokeMapping implements KeyStrokeMapping {
    private Map<AWTKeyStroke, Character> map = getDefaultMap();

    KeyStrokeMappingEN() {
        this.map.put(keyStroke(48, 0), '0');
        this.map.put(keyStroke(48, 1), ')');
        this.map.put(keyStroke(49, 0), '1');
        this.map.put(keyStroke(49, 1), '!');
        this.map.put(keyStroke(50, 0), '2');
        this.map.put(keyStroke(50, 1), '@');
        this.map.put(keyStroke(51, 0), '3');
        this.map.put(keyStroke(51, 1), '#');
        this.map.put(keyStroke(52, 0), '4');
        this.map.put(keyStroke(52, 1), '$');
        this.map.put(keyStroke(53, 0), '5');
        this.map.put(keyStroke(53, 1), '%');
        this.map.put(keyStroke(54, 0), '6');
        this.map.put(keyStroke(54, 1), '^');
        this.map.put(keyStroke(55, 0), '7');
        this.map.put(keyStroke(55, 1), Character.valueOf(Typography.amp));
        this.map.put(keyStroke(56, 0), '8');
        this.map.put(keyStroke(56, 1), '*');
        this.map.put(keyStroke(57, 0), '9');
        this.map.put(keyStroke(57, 1), '(');
        this.map.put(keyStroke(65, 0), 'a');
        this.map.put(keyStroke(65, 1), 'A');
        this.map.put(keyStroke(66, 0), 'b');
        this.map.put(keyStroke(66, 1), 'B');
        this.map.put(keyStroke(192, 0), '`');
        this.map.put(keyStroke(192, 1), '~');
        this.map.put(keyStroke(92, 0), Character.valueOf(IOUtils.DIR_SEPARATOR_WINDOWS));
        this.map.put(keyStroke(92, 1), '|');
        this.map.put(keyStroke(67, 0), 'c');
        this.map.put(keyStroke(67, 1), 'C');
        this.map.put(keyStroke(93, 0), ']');
        this.map.put(keyStroke(93, 1), '}');
        this.map.put(keyStroke(44, 0), ',');
        this.map.put(keyStroke(44, 1), Character.valueOf(Typography.less));
        this.map.put(keyStroke(68, 0), 'd');
        this.map.put(keyStroke(68, 1), 'D');
        this.map.put(keyStroke(69, 0), 'e');
        this.map.put(keyStroke(69, 1), 'E');
        this.map.put(keyStroke(61, 0), '=');
        this.map.put(keyStroke(61, 1), '+');
        this.map.put(keyStroke(70, 0), 'f');
        this.map.put(keyStroke(70, 1), 'F');
        this.map.put(keyStroke(71, 0), 'g');
        this.map.put(keyStroke(71, 1), 'G');
        this.map.put(keyStroke(72, 0), 'h');
        this.map.put(keyStroke(72, 1), 'H');
        this.map.put(keyStroke(73, 0), 'i');
        this.map.put(keyStroke(73, 1), 'I');
        this.map.put(keyStroke(74, 0), 'j');
        this.map.put(keyStroke(74, 1), 'J');
        this.map.put(keyStroke(75, 0), 'k');
        this.map.put(keyStroke(75, 1), 'K');
        this.map.put(keyStroke(76, 0), 'l');
        this.map.put(keyStroke(76, 1), 'L');
        this.map.put(keyStroke(77, 0), 'm');
        this.map.put(keyStroke(77, 1), 'M');
        this.map.put(keyStroke(45, 0), '-');
        this.map.put(keyStroke(45, 1), '_');
        this.map.put(keyStroke(78, 0), 'n');
        this.map.put(keyStroke(78, 1), 'N');
        this.map.put(keyStroke(79, 0), 'o');
        this.map.put(keyStroke(79, 1), 'O');
        this.map.put(keyStroke(91, 0), '[');
        this.map.put(keyStroke(91, 1), '{');
        this.map.put(keyStroke(80, 0), 'p');
        this.map.put(keyStroke(80, 1), 'P');
        this.map.put(keyStroke(46, 0), '.');
        this.map.put(keyStroke(46, 1), Character.valueOf(Typography.greater));
        this.map.put(keyStroke(81, 0), 'q');
        this.map.put(keyStroke(81, 1), 'Q');
        this.map.put(keyStroke(222, 0), '\'');
        this.map.put(keyStroke(222, 1), Character.valueOf(Typography.quote));
        this.map.put(keyStroke(82, 0), 'r');
        this.map.put(keyStroke(82, 1), 'R');
        this.map.put(keyStroke(83, 0), 's');
        this.map.put(keyStroke(83, 1), 'S');
        this.map.put(keyStroke(59, 0), ';');
        this.map.put(keyStroke(59, 1), ':');
        this.map.put(keyStroke(47, 0), Character.valueOf(IOUtils.DIR_SEPARATOR_UNIX));
        this.map.put(keyStroke(47, 1), '?');
        this.map.put(keyStroke(32, 0), ' ');
        this.map.put(keyStroke(84, 0), 't');
        this.map.put(keyStroke(84, 1), 'T');
        this.map.put(keyStroke(85, 0), 'u');
        this.map.put(keyStroke(85, 1), 'U');
        this.map.put(keyStroke(86, 0), 'v');
        this.map.put(keyStroke(86, 1), 'V');
        this.map.put(keyStroke(87, 0), 'w');
        this.map.put(keyStroke(87, 1), 'W');
        this.map.put(keyStroke(88, 0), 'x');
        this.map.put(keyStroke(88, 1), 'X');
        this.map.put(keyStroke(89, 0), 'y');
        this.map.put(keyStroke(89, 1), 'Y');
        this.map.put(keyStroke(90, 0), 'z');
        this.map.put(keyStroke(90, 1), 'Z');
    }

    @Override // com.github.caciocavallosilano.cacio.ctc.KeyStrokeMapping
    public char getKeyChar(int keyCode, int modifiers) {
        AWTKeyStroke stroke = keyStroke(keyCode, modifiers);
        Character ch = this.map.get(stroke);
        if (ch == null) {
            return (char) 65535;
        }
        return ch.charValue();
    }
}
