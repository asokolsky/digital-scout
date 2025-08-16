
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        // Create an instance of Cat
        Cat cat = new Cat("Kisa", "Abyssinian");
        // Create an instance of Dog
        Dog dog = new Dog("Buddy", "Golden Retriever");

        // Call the makeSound method on the cat instance
        cat.makeSound();
        // Call the makeSound method on the cat instance
        dog.makeSound();

        dog.sleep();
        cat.sleep();

        cat.makeSound();
        dog.makeSound();
    }
}
