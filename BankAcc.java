package bank;

public class BankAcc {
	static String BankName;

    BankAcc(String AccHolder, double balance) {
        System.out.println("Account Holder is: " + AccHolder);
        System.out.println("Bank Balance is: " + balance);
    }

    void display() {
        System.out.println("Bank name is: " + BankName);
    }

    public static void main(String[] args) 
    {
        BankAcc b1 = new BankAcc("sakshi", 2000.0);
        BankAcc.BankName = "HDFC";
        b1.display();
}
}
