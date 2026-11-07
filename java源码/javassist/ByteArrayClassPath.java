package javassist;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import org.apache.commons.io.IOUtils;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/game/MioLibPatcher.jar:javassist/ByteArrayClassPath.class */
public class ByteArrayClassPath implements ClassPath {
    protected String classname;
    protected byte[] classfile;

    public ByteArrayClassPath(String name, byte[] classfile) {
        this.classname = name;
        this.classfile = classfile;
    }

    public String toString() {
        return "byte[]:" + this.classname;
    }

    @Override // javassist.ClassPath
    public InputStream openClassfile(String classname) {
        if (this.classname.equals(classname)) {
            return new ByteArrayInputStream(this.classfile);
        }
        return null;
    }

    @Override // javassist.ClassPath
    public URL find(String classname) {
        if (this.classname.equals(classname)) {
            String cname = classname.replace('.', IOUtils.DIR_SEPARATOR_UNIX) + ".class";
            try {
                return new URL((URL) null, "file:/ByteArrayClassPath/" + cname, new BytecodeURLStreamHandler());
            } catch (MalformedURLException e) {
                return null;
            }
        }
        return null;
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/game/MioLibPatcher.jar:javassist/ByteArrayClassPath$BytecodeURLStreamHandler.class */
    private class BytecodeURLStreamHandler extends URLStreamHandler {
        private BytecodeURLStreamHandler() {
        }

        @Override // java.net.URLStreamHandler
        protected URLConnection openConnection(URL u) {
            return ByteArrayClassPath.this.new BytecodeURLConnection(u);
        }
    }

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/game/MioLibPatcher.jar:javassist/ByteArrayClassPath$BytecodeURLConnection.class */
    private class BytecodeURLConnection extends URLConnection {
        protected BytecodeURLConnection(URL url) {
            super(url);
        }

        @Override // java.net.URLConnection
        public void connect() throws IOException {
        }

        @Override // java.net.URLConnection
        public InputStream getInputStream() throws IOException {
            return new ByteArrayInputStream(ByteArrayClassPath.this.classfile);
        }

        @Override // java.net.URLConnection
        public int getContentLength() {
            return ByteArrayClassPath.this.classfile.length;
        }
    }
}
