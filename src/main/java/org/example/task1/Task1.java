package org.example.task1;

import java.util.HashSet;
import java.util.Set;

public class Task1 {

    public static void main(String[] args) {
        HardWorker worker1 = new HardWorker("Bob", getNailsPack(), new Hammer());
        HardWorker worker2 = new HardWorker(
                "Bob Jr.",
                getNailsPack(),
                new MicroscopeAdapter(new Microscope())
        );

        worker1.hammerAllNails();
        worker2.hammerAllNails();
    }

    public static Set<Nail> getNailsPack() {
        Set<Nail> nailPack = new HashSet<>();
        for (int i = 0; i < 200; i++) {
            nailPack.add(new Nail());
        }
        return nailPack;
    }
}

class Nail {
    public int visiblePart = 40;
}

class Hammer {
    public boolean hit(Nail nail) {
        if (nail.visiblePart > 0) {
            nail.visiblePart--;
        }
        return nail.visiblePart == 0;
    }
}

class HardWorker {
    private final String name;
    private Set<Nail> nails;
    private Hammer hammer;

    public HardWorker(String name, Set<Nail> nails, Hammer hammer) {
        this.name = name;
        this.nails = nails;
        this.hammer = hammer;
    }

    public void hammerAllNails() {
        for (Nail nail : nails) {
            boolean hammered = false;
            while (!hammered) {
                hammered = hammer.hit(nail);
            }
        }
        System.out.println(name + " done!");
    }
}

class Microscope {
    public void enlarge(Object o) {
        System.out.println("🔬");
    }

    public void bang() {
    }
}

class MicroscopeAdapter extends Hammer {
    private Microscope microscope;

    public MicroscopeAdapter(Microscope microscope) {
        this.microscope = microscope;
    }

    @Override
    public boolean hit(Nail nail) {
        microscope.bang();
        return false;
    }
}

