class BankAccount{
    double balance = 1000.0;
    public double getBalance(){
        return balance;
    }
    public static void main(String[] args) {
        BankAccount s = new BankAccount();
        System.out.println(s.getBalance());
    }
}