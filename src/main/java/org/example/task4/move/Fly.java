package org.example.task4.move;

public class Fly implements MoveLogic {
    @Override
    public void move(String name) {
        System.out.println(name + " машет крыльями.");
    }
}

