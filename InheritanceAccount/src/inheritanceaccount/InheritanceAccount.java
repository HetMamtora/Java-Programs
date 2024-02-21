package inheritanceaccount;

class Account
{
    private String accNo;
    private String name;
    private String address;
    private String phNo;
    private String dob;
    protected long balance;
    
    public Account(String acc, String n, String add, String phno, String dob)
    {
        accNo=acc;
        name=n;
        address=add;
        this.phNo=phno;
        this.dob=dob;
        balance=0;
    }
    
    public String getAccNo()
    {
        return accNo;
    }
    public String getName()
    {
        return name;
    }
    public String getAddress()
    {
        return address;
    }
    public String getPhno()
    {
        return phNo;
    }
    public String getDOB()
    {
        return dob;
    }
    public long getBalance()
    {
        return balance;
    }
    
    public void setAddress(String add)
    {
        address=add;
    }
    public void setPhNo(String phNo)
    {
        this.phNo=phNo;
    }
    public void setBalance(long balance)
    {
        this.balance = balance;
    }
}

class SavingsAccount extends Account
{
    public SavingsAccount(String acc, String n, String add, String phno, String dob)
    {
        super(acc, n, add, phno, dob);
    }
    
    public void deposit(long amt)
    {
        balance+=amt;
    }
    public void withdraw(long amt)
    {
        balance-=amt;
    }
}

class LoanAccount extends Account
{
    public LoanAccount(String acc, String n, String add, String phno, String dob)
    {
        super(acc, n, add, phno, dob);
    }
    
    public void payEMI(long amt)
    {
        balance-=amt;
    }
    public void repay(long amt)
    {
        if(balance==amt)
            balance=0;
    }
}

public class InheritanceAccount {

    public static void main(String[] args) {
        // TODO code application logic here
        
        SavingsAccount s = new SavingsAccount("", "", "", "", "");
        LoanAccount l = new LoanAccount("", "", "", "", "");

        //Set values for SavingsAccount
        s.setAddress("123 abc Society");
        s.setPhNo("123-456-7890");
        s.setBalance(5000);
        System.out.println("Savings Account Balance after setting: Rs. " + s.getBalance());
        
        // Set values for LoanAccount
        l.setAddress("456 star Society");
        l.setPhNo("987-654-3210");
        l.setBalance(10000);
        System.out.println("Loan Account Balance after setting: Rs. " + l.getBalance());

        // Perform operations
        s.deposit(5000);
        s.withdraw(2000);
        System.out.println("Savings Account Balance: Rs. " + s.getBalance());

        l.payEMI(2000);
        System.out.println("Loan Account Balance: Rs. " + l.getBalance());
    }
    
}
