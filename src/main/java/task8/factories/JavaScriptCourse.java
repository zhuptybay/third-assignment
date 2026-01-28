package task8.factories;

import task8.juniors.JavaScriptJunior;
import task8.juniors.JuniorsDeveloper;
import task8.middles.JavaScriptMiddle;
import task8.middles.MiddleDeveloper;
import task8.seniors.JavaScriptSenior;
import task8.seniors.SeniorDeveloper;

public class JavaScriptCourse implements DeveloperCourse {
    public JuniorsDeveloper createJunior() {
        return new JavaScriptJunior();
    }

    public MiddleDeveloper createMiddle() {
        return new JavaScriptMiddle();
    }

    public SeniorDeveloper createSenior() {
        return new JavaScriptSenior();
    }
}

