//Time complexity for this program is O(1)
class Pet {
    private String type;

    public Pet(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    void purchase() {
        System.out.println("I would like a pet.");
    }
}

class Fish extends Pet {
    public Fish() {
        super("fish");
    }

    @Override
    void purchase() {
        System.out.println("I would like a fish.");
    }
}

class Dog extends Pet {
    private String breed;

    public Dog(String breed) {
        super("dog");
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    void purchase() {
        System.out.println("I would like a " + breed + " " + getType() + ".");
    }
}

class Turtle extends Pet {
    public Turtle() {
        super("turtle");
    }

    @Override
    void purchase() {
        System.out.println("I would like a turtle.");
    }
}

public class Main {
    public static void main(String[] args) {
        Pet[] pets = {
            new Fish(),
            new Dog("Bulldog"),
            new Turtle()
        };

        for (Pet pet : pets) {
            pet.purchase();
        }
    }
}
