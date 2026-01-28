package task8.factories;

import task8.juniors.JavaJunior;
import task8.juniors.JuniorsDeveloper;
import task8.middles.JavaMiddle;
import task8.middles.MiddleDeveloper;
import task8.seniors.JavaSenior;
import task8.seniors.SeniorDeveloper;

public class JavaRush implements DeveloperCourse {
    public JuniorsDeveloper createJunior() {
        return new JavaJunior();
    }

    public MiddleDeveloper createMiddle() {
        return new JavaMiddle();
    }

    public SeniorDeveloper createSenior() {
        return new JavaSenior();
    }
}

