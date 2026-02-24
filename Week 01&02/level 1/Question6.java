

public class Question6 {
    public static void main(String[] args) {
        int fee = 125000 ;
        int discountPercent = 10;
        int discount = (discountPercent*fee)/100;
        int discountedFee = fee-discount;
        System.out.println("The discounted amount in INR is "+discount+" and final discounted fee is "+ discountedFee);

        

    }
}
