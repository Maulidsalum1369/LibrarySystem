package animal;

/**
 *
 * @author hp
 */
public class Animal {
    // Fields
    private String name;
    private int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and Setters for name and age
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

public void makeSound(int time) {
    if ("lion".equalsIgnoreCase(name)) {
        System.out.println("Roar");
    } else if ("elephant".equalsIgnoreCase(name)) {
        System.out.println("Trumpet");
    } else if ("monkey".equalsIgnoreCase(name)) {
        System.out.println("Chatter");
    } else {
        System.out.println(name + " is making a sound.");
    }
}

// Method to eat
public void eat(String foodType) {
    if ("lion".equalsIgnoreCase(name)) {
        System.out.println("Eating meat");
    } else if ("elephant".equalsIgnoreCase(name)) {
        System.out.println("Eating grass");
    } else if ("monkey".equalsIgnoreCase(name)) {
        System.out.println("Eating bananas");
    } else {
        System.out.println(name + " is eating.");
    }
}

    // Main method for testing
    public static void main(String[] args) {
        // Create an instance of Animal
        Animal lion = new Animal("Simba", 5);

        // Test methods
        lion.makeSound(3);
        lion.eat("meat");
    }
}