package org.example.task4.creature;

import org.example.task4.move.MoveLogic;
import org.example.task4.sound.SoundLogic;


public class Cat extends Creature {

    public Cat(MoveLogic moveLogic, SoundLogic soundLogic) {
        super(moveLogic, soundLogic);
    }

    @Override
    public String getName() {
        return "Кошка";
    }

    public void catchMice() {
        System.out.println(getName() + " ловит мышей.");
    }
}
