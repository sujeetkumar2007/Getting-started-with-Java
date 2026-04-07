public class Lamp {
    String color;
    Lamp(String color){
        this.color = color;
    }
    public static void main(String[] args) {
        Lamp myLamp = new Lamp("Red");
        System.out.println(myLamp.color);
        String[] colors = {"red","Blue","green"};
        for(String c : colors){
            System.out.println(c);
        }
        StringBuilder a = new StringBuilder();
        a.append("Hello");
        a.append(" ");
        a.append("Nigga");
        System.out.println(a.toString());

        String word = "OOPS";
        char first = word.charAt(0);
        char last = word.charAt(3);
    }
}
