/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import animal.Animal; // Assuming Animal class is in the animal package

/**
 *
 * @author hp
 */
public class zoo {

    public static void main(String[] args) {
        // Create instances of Animal
        Animal lion = new Animal("Lion", 5);
        Animal elephant = new Animal("Elephant", 10);
        Animal monkey = new Animal("Monkey", 3);

        // Add animals to the zoo (if you have a collection or zoo management logic)
        // For example, you might have a list of animals in the Zoo class

        // Test methods
        lion.makeSound(3);
        lion.eat("meat");

        elephant.makeSound(5);
        elephant.eat("grass");

        monkey.makeSound(2);
        monkey.eat("bananas");

        // Additional zoo management logic can go here
    }
}