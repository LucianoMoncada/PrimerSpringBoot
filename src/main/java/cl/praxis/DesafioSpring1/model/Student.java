package cl.praxis.DesafioSpring1.model;

public class Student {
    private String name;
    private String last;
    private int age;

    public Student() {
    }

    public Student(String name, String lastName, int age) {
        this.name = name;
        this.last = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", lastName='" + last + '\'' +
                ", age=" + age ;
    }
}
