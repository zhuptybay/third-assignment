package task8.factories;

import task8.juniors.JuniorsDeveloper;
import task8.juniors.JuniorsDeveloper;
import task8.middles.MiddleDeveloper;
import task8.seniors.SeniorDeveloper;

public interface DeveloperCourse {
    JuniorsDeveloper createJunior();
    MiddleDeveloper createMiddle();
    SeniorDeveloper createSenior();
}

