abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public boolean canWalk() {
        return false;
    }

    public boolean canSwim() {
        return false;
    }

    public String getName() {
        return name;
    }
}

class Pig extends Animal {
    public Pig(String name) {
        super(name);
    }
    @Override
    public boolean canWalk() {
        return true;
    }
}

class Duck extends Animal {
    public Duck(String name) {
        super(name);
    }
    @Override
    public boolean canWalk() {
        return true;
    }
    @Override
    public boolean canSwim() {
        return true;
    }
}


class Fish extends Animal {

    public Fish(String name) {
        super(name);
    }
    @Override
    public boolean canSwim() {
        return true;
    }
}

public class Management {
    public static void Printer(Animal[] animals) {
        for (Animal animal : animals) {
            if (animal.canSwim()) {
                System.out.println(animal.getName() + ", can swim.");
            } else if (animal.canWalk()) {
                System.out.println(animal.getName() + ", can walk");
            }
        }
    }

    public static void main(String[] args) {
        Animal[] Target = {
                new Pig("Waddles"),
                new Duck("Ugly Duck"),
                new Fish("Stockfish")
        };

        Printer(Target);
    }
}
