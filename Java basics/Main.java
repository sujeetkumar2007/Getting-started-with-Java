class Student{
  String name;
  int marks;
  Student(String name, int marks){
    this.name = name;
    this.marks = marks;
  }
  void display(){
    System.out.println("hello "+name+", Marks: "+marks);
  }
}
  public class Main {
    public static void main(String[] args) {
      Student[] students = new Student[4];
      students[0] = new Student("Sujeet", 100);
      students[1] = new Student("Harish", 120);
      students[2] = new Student("Saran", 123);
      students[3] = new Student("Poojith", 190);
      for(int i=0;i<=students.length;i++){
        students[i].display();
      }
    }
  
}