package com.github.caciocavallosilano.cacio.ctc.junit;

import java.lang.reflect.Method;
import org.assertj.swing.annotation.GUITestFinder;
import org.assertj.swing.junit.runner.FailureScreenshotTaker;
import org.assertj.swing.junit.runner.Formatter;
import org.assertj.swing.junit.runner.ImageFolderCreator;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.Statement;

/* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/junit/CacioAssertJRunner.class */
public class CacioAssertJRunner extends CacioTestRunner {

    /* loaded from: PyMCL-0.9.3-debug-v2.apk:assets/app_runtime/caciocavallo17/cacio-tta-1.19.1-SNAPSHOT.jar:com/github/caciocavallosilano/cacio/ctc/junit/CacioAssertJRunner$MethodInvoker.class */
    class MethodInvoker extends Statement {
        private final FrameworkMethod testMethod;
        private final Object target;
        private final FailureScreenshotTaker screenshotTaker;

        MethodInvoker(FrameworkMethod testMethod, Object target, FailureScreenshotTaker screenshotTaker) {
            this.testMethod = testMethod;
            this.target = target;
            this.screenshotTaker = screenshotTaker;
        }

        public void evaluate() throws Throwable {
            try {
                this.testMethod.invokeExplosively(this.target, new Object[0]);
            } catch (Throwable t) {
                takeScreenshot();
                throw t;
            }
        }

        private void takeScreenshot() {
            Method realMethod = this.testMethod.getMethod();
            Class<?> testClass = realMethod.getDeclaringClass();
            if (GUITestFinder.isGUITest(testClass, realMethod)) {
                this.screenshotTaker.saveScreenshot(Formatter.testNameFrom(testClass, realMethod));
            }
        }
    }

    public CacioAssertJRunner(Class<?> testClass) throws InitializationError {
        super(testClass);
    }

    protected Statement methodInvoker(FrameworkMethod method, Object test) {
        return new MethodInvoker(method, test, new FailureScreenshotTaker(new ImageFolderCreator().createImageFolder()));
    }
}
