package sun.net.dns;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
import sun.net.dns.ResolverConfiguration;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo/ResConfHack.jar:sun/net/dns/ResolverConfigurationImpl.class */
public class ResolverConfigurationImpl extends ResolverConfiguration {
    private static Object lock;
    private static long lastRefresh;
    private static final int TIMEOUT = 300000;
    private final ResolverConfiguration.Options opts = new OptionsImpl();
    private LinkedList<String> searchlist;
    private LinkedList<String> nameservers;
    static final /* synthetic */ boolean $assertionsDisabled;

    static native String localDomain0();

    static native String fallbackDomain0();

    static {
        $assertionsDisabled = !ResolverConfigurationImpl.class.desiredAssertionStatus();
        lock = new Object();
        lastRefresh = -1L;
        AccessController.doPrivileged(new PrivilegedAction<Void>() { // from class: sun.net.dns.ResolverConfigurationImpl.4
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.security.PrivilegedAction
            public Void run() {
                System.loadLibrary("net");
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public LinkedList<String> resolvconf(String keyword, int maxperkeyword, int maxkeywords) throws IOException {
        BufferedReader in;
        LinkedList<String> ll = new LinkedList<>();
        try {
            String resolvConfFile = System.getProperty("ext.net.resolvPath");
            if (resolvConfFile == null) {
                in = new BufferedReader(new StringReader("nameserver 8.8.8.8"));
                System.out.println("ResConfHack/E: Resolv file path not set, 8.8.8.8 nameserver used by default");
            } else {
                try {
                    in = new BufferedReader(new FileReader(resolvConfFile));
                } catch (IOException e) {
                    in = new BufferedReader(new StringReader("nameserver 8.8.8.8"));
                    System.out.println("ResConfHack/E: Unable to read resolv.conf:" + e.getMessage());
                }
            }
            while (true) {
                String line = in.readLine();
                if (line == null) {
                    break;
                }
                int maxvalues = maxperkeyword;
                if (line.length() != 0 && line.charAt(0) != '#' && line.charAt(0) != ';' && line.startsWith(keyword)) {
                    String value = line.substring(keyword.length());
                    if (value.length() != 0 && (value.charAt(0) == ' ' || value.charAt(0) == '\t')) {
                        StringTokenizer st = new StringTokenizer(value, " \t");
                        while (st.hasMoreTokens()) {
                            String val = st.nextToken();
                            if (val.charAt(0) == '#' || val.charAt(0) == ';') {
                                break;
                            }
                            if ("nameserver".equals(keyword) && val.indexOf(58) >= 0 && val.indexOf(46) < 0 && val.indexOf(91) < 0 && val.indexOf(93) < 0) {
                                val = "[" + val + "]";
                            }
                            ll.add(val);
                            maxvalues--;
                            if (maxvalues == 0) {
                                break;
                            }
                        }
                        maxkeywords--;
                        if (maxkeywords == 0) {
                            break;
                        }
                    }
                }
            }
            in.close();
        } catch (IOException e2) {
        }
        return ll;
    }

    private void loadConfig() {
        if (!$assertionsDisabled && !Thread.holdsLock(lock)) {
            throw new AssertionError();
        }
        if (lastRefresh >= 0) {
            long currTime = System.currentTimeMillis();
            if (currTime - lastRefresh < 300000) {
                return;
            }
        }
        this.nameservers = (LinkedList) AccessController.doPrivileged(new PrivilegedAction<LinkedList<String>>() { // from class: sun.net.dns.ResolverConfigurationImpl.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.security.PrivilegedAction
            public LinkedList<String> run() {
                return ResolverConfigurationImpl.this.resolvconf("nameserver", 1, 5);
            }
        });
        this.searchlist = getSearchList();
        lastRefresh = System.currentTimeMillis();
    }

    private LinkedList<String> getSearchList() {
        LinkedList<String> sl = (LinkedList) AccessController.doPrivileged(new PrivilegedAction<LinkedList<String>>() { // from class: sun.net.dns.ResolverConfigurationImpl.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.security.PrivilegedAction
            public LinkedList<String> run() throws IOException {
                LinkedList<String> ll = ResolverConfigurationImpl.this.resolvconf("search", 6, 1);
                if (ll.size() > 0) {
                    return ll;
                }
                return null;
            }
        });
        if (sl != null) {
            return sl;
        }
        String localDomain = localDomain0();
        if (localDomain != null && localDomain.length() > 0) {
            LinkedList<String> sl2 = new LinkedList<>();
            sl2.add(localDomain);
            return sl2;
        }
        LinkedList<String> sl3 = (LinkedList) AccessController.doPrivileged(new PrivilegedAction<LinkedList<String>>() { // from class: sun.net.dns.ResolverConfigurationImpl.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.security.PrivilegedAction
            public LinkedList<String> run() throws IOException {
                LinkedList<String> ll = ResolverConfigurationImpl.this.resolvconf("domain", 1, 1);
                if (ll.size() > 0) {
                    return ll;
                }
                return null;
            }
        });
        if (sl3 != null) {
            return sl3;
        }
        LinkedList<String> sl4 = new LinkedList<>();
        String domain = fallbackDomain0();
        if (domain != null && domain.length() > 0) {
            sl4.add(domain);
        }
        return sl4;
    }

    ResolverConfigurationImpl() {
    }

    public List<String> searchlist() {
        List<String> list;
        synchronized (lock) {
            loadConfig();
            list = (List) this.searchlist.clone();
        }
        return list;
    }

    public List<String> nameservers() {
        List<String> list;
        synchronized (lock) {
            loadConfig();
            list = (List) this.nameservers.clone();
        }
        return list;
    }

    public ResolverConfiguration.Options options() {
        return this.opts;
    }
}
