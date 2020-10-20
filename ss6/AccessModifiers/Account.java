package lad2.ss6.AccessModifiers;

public class Account {
    private int accountID;
    private  String holdName;
    private  String accountType;

    {
        accountID=100;
        holdName="Jonh Anderson";
        accountType="saving";
    }

    public void displayAccountDetails(){
        System.out.println("Account Details");
        System.out.println(accountID + " "+ holdName+" "+ accountType);
    }
}
