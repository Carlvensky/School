//Time complexity is O(1)
class Food {
    private String name;

    public Food(String name) {
        this.name = name;
    }

    void prepare() {
        System.out.println("Preparing " + name + "...");
    }
}

class Pizza extends Food {
    public Pizza(String name) {
        super(name);
    }

    @Override
    void prepare() {
        System.out.println("Baking a pizza!");
    }
}

class Burger extends Food {
    public Burger(String name) {
        super(name);
    }

    @Override
    void prepare() {
        System.out.println("Grilling a burger!");
    }
}

public class Main {
    public static void main(String[] args) {
        Food pizza = new Pizza("Pizza");
        Food burger = new Burger("Burger");

        pizza.prepare(); // Output: Baking a pizza!
        burger.prepare(); // Output: Grilling a burger!
    }
}
