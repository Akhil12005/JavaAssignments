package Assignment9;
// Abstract class Animal
abstract class Animal {
    // Abstract methods eat() and sleep()
    abstract void eat();
    abstract void sleep();
}

// Subclass Lion inheriting from Animal
class Lion extends Animal {
    // Implementing eat() method for Lion
    @Override
    void eat() {
        System.out.println("Lion eats meat");
    }

    // Implementing sleep() method for Lion
    @Override
    void sleep() {
        System.out.println("Lion sleeps in den");
    }
}

// Subclass Tiger inheriting from Animal
class Tiger extends Animal {
    // Implementing eat() method for Tiger
    @Override
    void eat() {
        System.out.println("Tiger eats meat and sometimes fish");
    }

    // Implementing sleep() method for Tiger
    @Override
    void sleep() {
        System.out.println("Tiger sleeps in the jungle");
    }
}

// Subclass Deer inheriting from Animal
class Deer extends Animal {
    // Implementing eat() method for Deer
    @Override
    void eat() {
        System.out.println("Deer eats grass and leaves");
    }

    // Implementing sleep() method for Deer
    @Override
    void sleep() {
        System.out.println("Deer sleeps in the forest");
    }
}

// Main class
public class Program2 {
    public static void main(String[] args) {
        // Creating objects of Lion, Tiger, and Deer
        Lion lion = new Lion();
        Tiger tiger = new Tiger();
        Deer deer = new Deer();

        // Calling eat() and sleep() methods for each object
        System.out.println("Lion:");
        lion.eat();
        lion.sleep();

        System.out.println("\nTiger:");
        tiger.eat();
        tiger.sleep();

        System.out.println("\nDeer:");
        deer.eat();
        deer.sleep();
    }
}
