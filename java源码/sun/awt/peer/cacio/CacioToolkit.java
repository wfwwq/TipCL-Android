package sun.awt.peer.cacio;

import java.awt.Button;
import java.awt.Canvas;
import java.awt.Checkbox;
import java.awt.CheckboxMenuItem;
import java.awt.Choice;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.KeyboardFocusManager;
import java.awt.Label;
import java.awt.List;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.PopupMenu;
import java.awt.ScrollPane;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.Window;
import java.awt.datatransfer.Clipboard;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;
import java.awt.peer.ButtonPeer;
import java.awt.peer.CanvasPeer;
import java.awt.peer.CheckboxMenuItemPeer;
import java.awt.peer.CheckboxPeer;
import java.awt.peer.ChoicePeer;
import java.awt.peer.DialogPeer;
import java.awt.peer.FileDialogPeer;
import java.awt.peer.FramePeer;
import java.awt.peer.KeyboardFocusManagerPeer;
import java.awt.peer.LabelPeer;
import java.awt.peer.ListPeer;
import java.awt.peer.MenuBarPeer;
import java.awt.peer.MenuItemPeer;
import java.awt.peer.MenuPeer;
import java.awt.peer.MouseInfoPeer;
import java.awt.peer.PanelPeer;
import java.awt.peer.PopupMenuPeer;
import java.awt.peer.ScrollPanePeer;
import java.awt.peer.ScrollbarPeer;
import java.awt.peer.TextAreaPeer;
import java.awt.peer.TextFieldPeer;
import java.awt.peer.WindowPeer;
import org.apache.commons.lang3.SystemProperties;
import sun.awt.LightweightFrame;
import sun.awt.SunToolkit;
import sun.awt.image.OffScreenImage;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/cacio-shared-1.10-SNAPSHOT.jar:sun/awt/peer/cacio/CacioToolkit.class */
public abstract class CacioToolkit extends SunToolkit {
    private static final int DEFAULT_SCREEN_RESOLUTION = 96;
    private static final int screenResolution;
    private Clipboard clipboard;

    public abstract PlatformWindowFactory getPlatformWindowFactory();

    static {
        String resolution = System.getProperty("cacio.screenResolution");
        int res = 96;
        if (resolution != null) {
            try {
                res = Integer.parseInt(resolution);
            } catch (NumberFormatException e) {
            }
        }
        screenResolution = res;
    }

    private static boolean isLinux() {
        return "Linux".equals(System.getProperty(SystemProperties.OS_NAME));
    }

    public CacioToolkit() {
        CacioEventPump<?> pump = getPlatformWindowFactory().createEventPump();
        pump.start();
        this.clipboard = new Clipboard("Cacio system clipboard");
    }

    public ButtonPeer createButton(Button target) throws HeadlessException {
        CacioButtonPeer peer = new CacioButtonPeer(target, getPlatformWindowFactory());
        SunToolkit.targetCreatedPeer(target, peer);
        return peer;
    }

    public CanvasPeer createCanvas(Canvas target) {
        CacioCanvasPeer peer = new CacioCanvasPeer(target, getPlatformWindowFactory());
        SunToolkit.targetCreatedPeer(target, peer);
        return peer;
    }

    public CheckboxPeer createCheckbox(Checkbox target) throws HeadlessException {
        CacioCheckboxPeer peer = new CacioCheckboxPeer(target, getPlatformWindowFactory());
        SunToolkit.targetCreatedPeer(target, peer);
        return peer;
    }

    public CheckboxMenuItemPeer createCheckboxMenuItem(CheckboxMenuItem target) throws HeadlessException {
        CacioCheckboxMenuItemPeer peer = new CacioCheckboxMenuItemPeer(target);
        SunToolkit.targetCreatedPeer(target, peer);
        return peer;
    }

    public ChoicePeer createChoice(Choice target) throws HeadlessException {
        CacioChoicePeer peer = new CacioChoicePeer(target, getPlatformWindowFactory());
        SunToolkit.targetCreatedPeer(target, peer);
        return peer;
    }

    public DialogPeer createDialog(Dialog target) throws HeadlessException {
        CacioDialogPeer peer = new CacioDialogPeer(target, getPlatformWindowFactory());
        SunToolkit.targetCreatedPeer(target, peer);
        return peer;
    }

    public FileDialogPeer createFileDialog(FileDialog target) throws HeadlessException {
        CacioFileDialogPeer peer = new CacioFileDialogPeer(target, getPlatformWindowFactory());
        SunToolkit.targetCreatedPeer(target, peer);
        return peer;
    }

    public FramePeer createFrame(Frame target) throws HeadlessException {
        CacioFramePeer peer = new CacioFramePeer(target, getPlatformWindowFactory());
        SunToolkit.targetCreatedPeer(target, peer);
        return peer;
    }

    public FramePeer createLightweightFrame(LightweightFrame target) throws HeadlessException {
        CacioLightweightFramePeer peer = new CacioLightweightFramePeer(target, getPlatformWindowFactory());
        SunToolkit.targetCreatedPeer(target, peer);
        return peer;
    }

    public LabelPeer createLabel(Label target) throws HeadlessException {
        CacioLabelPeer peer = new CacioLabelPeer(target, getPlatformWindowFactory());
        SunToolkit.targetCreatedPeer(target, peer);
        return peer;
    }

    public ListPeer createList(List target) throws HeadlessException {
        CacioListPeer peer = new CacioListPeer(target, getPlatformWindowFactory());
        SunToolkit.targetCreatedPeer(target, peer);
        return peer;
    }

    public MenuPeer createMenu(Menu target) throws HeadlessException {
        CacioMenuPeer peer = new CacioMenuPeer(target);
        SunToolkit.targetCreatedPeer(target, peer);
        return peer;
    }

    public MenuBarPeer createMenuBar(MenuBar target) throws HeadlessException {
        CacioMenuBarPeer peer = new CacioMenuBarPeer(target);
        SunToolkit.targetCreatedPeer(target, peer);
        return peer;
    }

    public MenuItemPeer createMenuItem(MenuItem target) throws HeadlessException {
        CacioMenuItemPeer peer = new CacioMenuItemPeer(target);
        SunToolkit.targetCreatedPeer(target, peer);
        return peer;
    }

    public PanelPeer createPanel(Panel target) {
        CacioPanelPeer peer = new CacioPanelPeer(target, getPlatformWindowFactory());
        SunToolkit.targetCreatedPeer(target, peer);
        return peer;
    }

    public PopupMenuPeer createPopupMenu(PopupMenu target) throws HeadlessException {
        CacioPopupMenuPeer peer = new CacioPopupMenuPeer(target);
        SunToolkit.targetCreatedPeer(target, peer);
        return peer;
    }

    public ScrollPanePeer createScrollPane(ScrollPane target) {
        CacioScrollPanePeer peer = new CacioScrollPanePeer(target, getPlatformWindowFactory());
        SunToolkit.targetCreatedPeer(target, peer);
        return peer;
    }

    public ScrollbarPeer createScrollbar(Scrollbar target) throws HeadlessException {
        CacioScrollBarPeer peer = new CacioScrollBarPeer(target, getPlatformWindowFactory());
        SunToolkit.targetCreatedPeer(target, peer);
        return peer;
    }

    public TextAreaPeer createTextArea(TextArea target) throws HeadlessException {
        CacioTextAreaPeer peer = new CacioTextAreaPeer(target, getPlatformWindowFactory());
        SunToolkit.targetCreatedPeer(target, peer);
        return peer;
    }

    public TextFieldPeer createTextField(TextField target) throws HeadlessException {
        CacioTextFieldPeer peer = new CacioTextFieldPeer(target, getPlatformWindowFactory());
        SunToolkit.targetCreatedPeer(target, peer);
        return peer;
    }

    public WindowPeer createWindow(Window target) throws HeadlessException {
        WindowPeer windowPeer;
        if (target instanceof ProxyWindow) {
            windowPeer = new ProxyWindowPeer((ProxyWindow) target);
        } else {
            windowPeer = new CacioWindowPeer(target, getPlatformWindowFactory());
        }
        SunToolkit.targetCreatedPeer(target, windowPeer);
        return windowPeer;
    }

    public KeyboardFocusManagerPeer createKeyboardFocusManagerPeer(KeyboardFocusManager manager) throws HeadlessException {
        return getKeyboardFocusManagerPeer();
    }

    public KeyboardFocusManagerPeer getKeyboardFocusManagerPeer() throws HeadlessException {
        return CacioKeyboardFocusManagerPeer.getInstance();
    }

    static void disposePeer(Object target, Object peer) {
        SunToolkit.targetDisposedPeer(target, peer);
    }

    protected static boolean useManagedWindows() {
        return Boolean.getBoolean("cacio.usemanaged");
    }

    protected void setDecorateWindows(boolean decorate) {
        CacioWindowPeer.setDecorateWindows(decorate);
    }

    protected void setDecorateDialogs(boolean decorate) {
        CacioWindowPeer.setDecorateDialogs(decorate);
    }

    protected Object lazilyLoadDesktopProperty(String propName) {
        if (propName.equals("awt.font.desktophints") && this.desktopProperties.get("awt.font.desktophints") == null) {
            this.desktopProperties.put("awt.font.desktophints", SunToolkit.getDesktopFontHints());
        }
        return this.desktopProperties.get(propName);
    }

    public Image createOffScreenImage(Component component, int width, int height) {
        GraphicsConfiguration gc = component.getGraphicsConfiguration();
        ColorModel model = gc.getColorModel(1);
        WritableRaster wr = model.createCompatibleWritableRaster(width, height);
        return new OffScreenImage(component, model, wr, model.isAlphaPremultiplied());
    }

    public boolean areExtraMouseButtonsEnabled() {
        return false;
    }

    public int getScreenResolution() throws HeadlessException {
        return screenResolution;
    }

    public Clipboard getSystemClipboard() throws HeadlessException {
        return this.clipboard;
    }

    protected MouseInfoPeer getMouseInfoPeer() {
        return CacioMouseInfoPeer.getInstance();
    }
}
