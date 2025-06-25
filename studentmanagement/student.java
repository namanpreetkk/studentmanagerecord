public class student {
    int id;
    String name;
    int age;
    public student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Display Student Info
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
    }
}
