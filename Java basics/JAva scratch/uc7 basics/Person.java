public class Person {
    String name;
    int age;
    Person (String name,int age){
        this.name = name;
        this.age = age;
    }
public static void main(String[] args) {
    Person s = new Person("SUJEET",18);
    System.out.println(s.name + " "+s.age);
}
}
