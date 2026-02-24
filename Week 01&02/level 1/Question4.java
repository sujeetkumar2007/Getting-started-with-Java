public class Question4 {
    public static void main (String[] args){
        int costPrice = 129;
        int sellingPrice = 191;
        double profit = sellingPrice-costPrice;
        double profitPer= (profit/costPrice)*100;
        System.out.println("The cost price is INR "+costPrice+" and the selling price in INR "+sellingPrice);
        System.out.printf("The profit is INR %.2f and the profit percentage is %.2f",profit,profitPer);}
}
