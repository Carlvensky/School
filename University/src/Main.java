class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        setAge(age); // Use setter to ensure valid age
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age must be greater than or equal to 0.");
        }
    }

    void introduce() {
        System.out.println("I am a person named " + name + ", age " + age + ".");
    }
}

class Student extends Person {
    private String major;

    public Student(String name, int age, String major) {
        super(name, age);
        setMajor(major);
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    void introduce() {
        System.out.println("I am a student majoring in " + major + ".");
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        setSubject(subject);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    void introduce() {
        System.out.println("I teach " + subject + ".");
    }
}

public class Main {
    public static void main(String[] args) {
        Person[] people = {
            new Student("Carlvensky", 23, "Computer Science"),
            new Teacher("Mr. Xian", 30, "Java")
        };

        for (Person person : people) {
            person.introduce(); // Polymorphic call to introduce()
        }
    }
}
