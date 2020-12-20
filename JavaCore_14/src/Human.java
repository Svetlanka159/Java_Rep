public class Human {
    private int age;
    private String name;

    public Human (String name, int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return "name: " + name + ", age: " + age;
    }
}
