// the complexity of this progrm is O(1)

interface Vehicle {
    void startEngine();
}

class Car implements Vehicle {
    private String model;
    private int speed;

    public Car(String model, int speed) {
        this.model = model;
        setSpeed(speed); // checking speed valid
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Getter and Setter for speed
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed >= 0) {
            this.speed = speed;
        } else {
            System.out.println("Speed cannot be negative.");
        }
    }

    @Override
    public void startEngine() {
        System.out.println("The engine of " + model + " is starting!");
    }
}

class ElectricCar extends Car {
    public ElectricCar(String model, int speed) {
        super(model, speed);
    }

    @Override
    public void startEngine() {
        System.out.println("The electric engine of " + getModel() + " is starting!");
    }
}

class GasCar extends Car {
    public GasCar(String model, int speed) {
        super(model, speed);
    }

    @Override
    public void startEngine() {
        System.out.println("The gas engine of " + getModel() + " is starting!");
    }
}

public class Main {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar("Tesla Model S", 120);
        GasCar gasCar = new GasCar("Toyota Corolla", 90);

        electricCar.startEngine();
        gasCar.startEngine(); 
    }
}
