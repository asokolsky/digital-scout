// Define a public class named Cat that extends Animal
public class Cat extends Animal {
    String breed; // Instance variable

    Cat(String name, String breed) {
        super(name); // Calls the Animal constructor
        this.breed = breed;
        System.out.println("Cat constructor called for: " + breed);
    }

    // Use the @Override annotation to indicate that this method overrides a method in the superclass
    @Override
    // Define the makeSound method
    public void makeSound() {
        // Print "The cat quarrels." to the console
        System.out.printf("%s: meow\n", name);
    }
}
