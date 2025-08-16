// Define a public (not pure!) abstract class named Animal
public abstract class Animal {
    String name; // Instance variable
    int age;     // Instance variable

    public Animal(String name) {
        this.name = name;
    }

    // Abstract method - must be implemented by subclasses
    public abstract void makeSound();

    // Concrete method
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}
