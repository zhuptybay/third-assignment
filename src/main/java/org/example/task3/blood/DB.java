package org.example.task3.blood;

import java.util.List;

public interface DB {
    BloodSample getById(int id);
    List<BloodSample> find(String request);
}
