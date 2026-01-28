package org.example.task4;

import org.example.task4.creature.Cow;
import org.example.task4.move.Fly;
import org.example.task4.sound.Meow;


public class Main {

    public static void main(String[] args) {

        Cow cow = new Cow(new Fly(), new Meow());

        cow.howDoIMove();
        cow.howDoISound();
        cow.giveMilk();
    }
}
