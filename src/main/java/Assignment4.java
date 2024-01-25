public class Assignment4 {

    public static void main(String[] args) {

        Animal a = new Animal();
        a.animalname = "Tiger";
        a.age=13;

        a.Sound();

        Car b = new Car();
        b.carname = "Honda";
        b.makeyear=2013;

        b.Start();

        Person c = new Person();
        c.personname = "Akhil";
        c.age=27;

        c.talk();

        Employee d = new Employee();
        d.empname = "Akhil";
        d.empid=27;
        d.empsalary=10000.00;

        d.work();
    }
}
     class Animal{
        String animalname;
        int age;

        void Sound()
        {
            System.out.println("Animal is making sound");
        }

    }

     class Car{
        String carname;
        int makeyear;
        
        void Start()
        {
            System.out.println("Car is started");
        }
    }
     class Person{
        String personname;
        int age;

        void talk()
        {
            System.out.println("Person is talking");
        }
    }
     class Employee{
        String empname;
        int empid;
        double empsalary;

        void work(){
            System.out.println("Employee is working and received salary");
        }
    }