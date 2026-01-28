package org.example.task4.creature;

import org.example.task4.move.MoveLogic;
import org.example.task4.sound.SoundLogic;

public class Human extends Creature {

    public Human(MoveLogic moveLogic, SoundLogic soundLogic) {
        super(moveLogic, soundLogic);
    }

    @Override
    public String getName() {
        return "Человек";
    }

    public void searchMeaningOfLife() {
        System.out.println(getName() + " ищет смысл жизни.");
    }
}
