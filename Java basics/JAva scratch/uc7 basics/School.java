public class School {
    static class Student{
        String name;
    }
    public static void main(String[] args) {
        School.Student s = new School.Student();
        s.name = "Sujeet";
        System.out.println(s.name);
    }
}
