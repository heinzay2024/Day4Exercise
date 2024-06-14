public class BankAccount {
    private double balance;
    private String accountNumber;

    //Constructor func
    public  BankAccount(double initialBalance,String accNumber){
        this.balance = initialBalance;
        this.accountNumber = accNumber;
    }

    public void deposit (double depositMoney){
        if (depositMoney > 0){
            balance += depositMoney;
        }else {
            System.out.println("Invalid Amount!");
        }
    }

    public void widthdraw(double widthDrawMoney){
        if ( widthDrawMoney <= balance && widthDrawMoney > 0){
            balance -= widthDrawMoney;
        }else {
            System.out.println("Invalid Amount!");
        }
    }

    public String getAccountNumber(){
       return accountNumber;
    }

    public double getBalance(){
        return balance;
    }
}
