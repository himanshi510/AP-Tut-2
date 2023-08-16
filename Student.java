public class Student {
    private String name;
    private int age;

    /** Default Constructor */
    Student() {
        this.name = "Alice";
        this.age = 10;
    }

    /** Parameterized Constructor */
    Student(String name, int age) {
        this.setName(name);
        this.setAge(age);
    }

    public void introduce() {
        System.out.println("Hi I'm " + name + ". my age is " + age);
    }

    public String getName() { // getters
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) { // setters
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}