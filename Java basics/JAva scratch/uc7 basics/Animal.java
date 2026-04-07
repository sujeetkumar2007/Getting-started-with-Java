public class Animal{
    String name;
    void sound(){
        System.out.println("MOOOOOO");
    }
    public static void main(String[] args) {
        Animal cow = new Animal();
        cow.sound();
    }
}