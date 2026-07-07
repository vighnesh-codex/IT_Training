package Day_12.class_task;

public class BankingByOop {
    
    public static void main(String [] args){
        SbiAccount s1 = new SbiAccount();
        System.out.println(s1.checkBalance());
        s1.deposit(1000);
        System.out.println(s1.getBalance());
        s1.setName("Nilan");
        System.out.println(s1.getName());
        s1.deposit(1000);
        s1.checkBalance();
        s1.withdraw(9100);
    }
}

interface rbi{
    public void deposit(float amount);
    public void withdraw(float withdraw);
    public float checkBalance();
    
}
class SbiAccount implements rbi {
    private String accName;
    private int accId;
    private float balance;
    private float fdBalance;
    private float checkBalance;
    private float max_amount = 10000;

    public float getMax_amount() {
        return max_amount;
    }

    public float setMax_amount(float amount) {
        max_amount = amount;
        return max_amount;
    }

    public String getName() {
        return accName;
    }

    public int getAccId() {
        return accId;
    }

    public float getBalance() {
        return balance;
    }
    public float getcheckBalance() {
        return checkBalance;
    }

    
    public void setName(String Name) {
        accName = Name;
    }

    public void setAccId(int id) {
        accId = id;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void deposit(float amount, int acccode) {
        fdBalance = fdBalance + amount;
        System.out.println("Amount deposited in " + accName + ", Account Rs.: " + amount + " Remaining balance: " + fdBalance);
    }

    public void deposit(float amount) {
        balance = balance + amount;
        System.out.println("Amount deposited in " + accName + ", Account Rs.: " + amount + " Remaining balance: " + balance);
    }
    public void withdraw(float amount) {

        if (amount >= 0) {
            if (amount <= max_amount) {
                if (amount <= balance) {
                    balance = balance - amount;
                    System.out.println("Amount withdrawn: " + accName + ", Account Rs.: " + amount + "Remaining balance: " + balance);
                } else {
                    System.out.println("Insufficient Funds");
                }
        } else {
                System.out.println("Entered Amount exceed the Limit");
            }
        }else{
            System.out.println("Entered Amount is less /*more*/ than the Limit");
        }
    }
    public float checkBalance() {
        System.out.println("Main Balance: " + balance + " Fd balance" + fdBalance);
        return balance;
    }
}
