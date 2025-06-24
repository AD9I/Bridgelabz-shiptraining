// Q3_Person.java
// Person class with copy constructor
public class Q3_Person {
    String name;
    int age;
    // ...existing code...
    public Q3_Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Q3_Person(Q3_Person other) {
        this.name = other.name;
        this.age = other.age;
    }
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    public static void main(String[] args) {
        Q3_Person p1 = new Q3_Person("Alice", 25);
        Q3_Person p2 = new Q3_Person(p1);
        p1.display();
        p2.display();
    }
}
