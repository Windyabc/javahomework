import java.util.Date;

public class ClassAccount {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public ClassAccount(){
        this.id=0;
        this.balance=0;
        this.annualInterestRate=0;
        dateCreated = new Date();
    }

    public ClassAccount(int id, double balance){
        this.id=id;
        this.balance=balance;
        this.annualInterestRate=0;
        dateCreated = new Date();
    }

    public int getId(){
        return this.id;
    }

    public double getBalance(){
        return this.balance;
    }

    public double getAnnualInterestRate(){
        return this.annualInterestRate;
    }

    public Date getDateCreated(){
        return this.dateCreated;
    }

    public void setId(int id){
        this.id=id;
    }

    public void setBalance(double balance){
        this.balance=balance;
    }

    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate=annualInterestRate;
    }

    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }

    public void withDraw(int number){
        this.balance -= number;
    }

    public void deposit(int number){
        this.balance += number;
    }

    public static void main(String[] args){
        ClassAccount account = new ClassAccount(1122, 20000);
        account.setAnnualInterestRate(4.5);
        account.withDraw(2500);
        account.deposit(3000);
        System.out.println("Balance: "+ account.getBalance());
        System.out.println("Monthly Interest: "+ account.getBalance()*account.getMonthlyInterestRate()/100.0);
        System.out.println("Created Date: "+ account.getDateCreated().toString());
    }
}
