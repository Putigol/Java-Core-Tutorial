public class Main {
    public static void main(String[] args) {
// Inheritance = One class inherits the attributes and methods
// from another class.

        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        plant.photosynthesize();
        cat.speak();
        dog.eat();
    }
}