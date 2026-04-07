public class FruitExample{
    static class FruitBox{
        String fruitName;
        String color;
        FruitBox(String fruitname,String color){
            this.fruitName  = fruitname;
            this.color = color;
        }
        public String getFruitName(){
            return fruitName;
        }
        public String getColor(){
            return color;
        }

    }
    public static FruitBox[] createFruitBoxes(){
        FruitBox[] boxes = new FruitBox[4];
        boxes[0] = new FruitBox("Apple", "Red");
        boxes[1] = new FruitBox("Banana", "Yellow");
        boxes[2] = new FruitBox("Orange", "Orange");
        return boxes;
    }
    public static void main(String[] args) {
        FruitBox[] mybox = createFruitBoxes();
        System.out.println(mybox[0].getFruitName());
        System.out.println(mybox[1].getColor());
    }
}