package bankaccountapp;

public class Checking extends Account {
    //List properties specific to a checking acct
    int debitCardNumber;
    int debitCardPIN;

    //Constructor to initialize checking acct properties
    public Checking(String name, String sSN, double initDeposit){
        super(name, sSN, initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();
    }
    
    @Override
    public abstract void setRate(){
        System.out.println("Implement rate for Checking");
    }
    
    //List any methods specific to a checking acct

    private void setDebitCard(){
        debitCardNumber =(int) (Math.random()*Math.pow(10,12));
        debitCardPIN = (int) (Math.random()*Math.pow(10,4));;
    }



    public void showInfo(){
        super.showInfo();
        System.out.println("Your Checking Acount Features" + 
        "\n  Debit Card Number: " + debitCardNumber +
        "\n  Debit Card PIN: " + debitCardPIN);
    }
}