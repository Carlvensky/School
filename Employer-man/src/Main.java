//Complexity is O(N) including the loop
class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void work() {
        System.out.println("Employee is working.");
    }
}

class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    void work() {
        System.out.println("Manager is holding a meeting.");
    }
}

class Engineer extends Employee {
    public Engineer(String name, double salary) {
        super(name, salary);
    }

    @Override
    void work() {
        System.out.println("Engineer is coding.");
    }
}

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
            new Manager("Alice", 70000),
            new Engineer("Bob", 80000)
        };

        for (Employee e : employees) {
            e.work(); // Calls overridden methods dynamically
        }
    }
}
