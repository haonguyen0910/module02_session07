public class Cat extends Animal {
    private String breed;

    // Constructor
    public Cat(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public void meow() {
        System.out.println("Meow");
    }
}