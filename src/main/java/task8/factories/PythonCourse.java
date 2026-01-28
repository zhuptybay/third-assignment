package task8.factories;

import task8.juniors.PythonJunior;
import task8.juniors.JuniorsDeveloper;
import task8.middles.PythonMiddle;
import task8.middles.MiddleDeveloper;
import task8.seniors.PythonSenior;
import task8.seniors.SeniorDeveloper;

public class PythonCourse implements DeveloperCourse {
    public JuniorsDeveloper createJunior() {
        return new PythonJunior();
    }

    public MiddleDeveloper createMiddle() {
        return new PythonMiddle();
    }

    public SeniorDeveloper createSenior() {
        return new PythonSenior();
    }
}

