abstract class Animal {
    protected String name;
    protected int age = 0;
    protected String eat;
    private String color;

    public Animal(String name, String eat, String color) {
        this.name = name;
        this.eat = eat;
        this.color = color;
    }

    public abstract String speak();
    public abstract String food();

    public void setColor(String nColor) {
        this.color = nColor;
    }

    public String getColor() {
        return color;
    }
}

class Dog extends Animal {

    public Dog(String name, String eat, String color) {
        super(name, eat, color);
    }

    @Override
    public String speak() {
        return name + " dice Woof!";
    }

    @Override
    public String food() {
        return name + " come " + eat;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAge() {
        return name + " tiene la edad de " + age;
    }

    @Override
    public String getColor() {
        return name + " es de color " + super.getColor();
    }
}

class Cat extends Animal {

    public Cat(String name, String eat, String color) {
        super(name, eat, color);
    }

    @Override
    public String speak() {
        return name + " dice Meow!";
    }

    @Override
    public String food() {
        return name + " come " + eat;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAge() {
        return name + " tiene la edad de " + age;
    }

    @Override
    public String getColor() {
        return name + " es de color " + super.getColor();
    }
}

class Raccon extends Animal {

    public Raccon(String name, String eat, String color) {
        super(name, eat, color);
    }

    @Override
    public String speak() {
        return name + " dice Rawr!";
    }

    @Override
    public String food() {
        return name + " come " + eat;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAge() {
        return name + " tiene la edad de " + age;
    }

    @Override
    public String getColor() {
        return name + " es de color " + super.getColor();
    }
}

public class Animales {
    public static void main(String[] args) {
        Dog dog = new Dog("Rex", "Huesos", "Marrón");
        Cat cat = new Cat("Whiskers", "Atún", "Naranja");
        Raccon raccon = new Raccon("Pedro", "Algodón de azúcar", "Café con gris");

        System.out.println(dog.speak());        // Rex dice Woof!
        System.out.println(dog.food());         // Rex come Huesos
        System.out.println(dog.getColor());     // Rex es de color Marrón
        dog.setAge(3);
        System.out.println(dog.getAge());       // Rex tiene la edad de 3

        System.out.println(cat.speak());        // Whiskers dice Meow!
        System.out.println(cat.food());         // Whiskers come Atún
        System.out.println(cat.getColor());     // Whiskers es de color Naranja
        cat.setAge(5);
        System.out.println(cat.getAge());       // Whiskers tiene la edad de 5

        System.out.println(raccon.speak());     // Pedro dice Rawr!
        System.out.println(raccon.food());      // Pedro come Algodón de azúcar
        System.out.println(raccon.getColor());  // Pedro es de color Café con gris
        raccon.setAge(4);
        System.out.println(raccon.getAge());    // Pedro tiene la edad de 4
    }
}