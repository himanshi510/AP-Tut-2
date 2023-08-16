public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Rick", 19);
        Student student2 = new Student();
        // student1.introduce();
        // student2.introduce();
        student1.setName("John");
        student1.setAge(22);
        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        // System.out.println(student2.getName());

    }

}
