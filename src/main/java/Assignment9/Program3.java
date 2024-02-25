package Assignment9;

// Abstract class Person
abstract class Person {
    // Abstract methods eat() and exercise()
    abstract void eat();
    abstract void exercise();
}

// Subclass Athlete inheriting from Person
class Athlete extends Person {
    // Implementing eat() method for Athlete
    @Override
    void eat() {
        System.out.println("Athlete eats a balanced diet to maintain energy levels.");
    }

    // Implementing exercise() method for Athlete
    @Override
    void exercise() {
        System.out.println("Athlete engages in rigorous training sessions and workouts.");
    }
}

// Subclass LazyPerson inheriting from Person
class LazyPerson extends Person {
    // Implementing eat() method for LazyPerson
    @Override
    void eat() {
        System.out.println("Lazy person enjoys fast food and snacks while lounging around.");
    }

    // Implementing exercise() method for LazyPerson
    @Override
    void exercise() {
        System.out.println("Lazy person prefers to stay sedentary and avoids physical activities.");
    }
}

// Main class
public class Program3 {
    public static void main(String[] args) {
        // Creating objects of Athlete and LazyPerson
        Athlete athlete = new Athlete();
        LazyPerson lazyPerson = new LazyPerson();

        // Calling eat() and exercise() methods for Athlete
        System.out.println("Athlete:");
        athlete.eat();
        athlete.exercise();

        System.out.println();

        // Calling eat() and exercise() methods for LazyPerson
        System.out.println("Lazy Person:");
        lazyPerson.eat();
        lazyPerson.exercise();
    }
}

