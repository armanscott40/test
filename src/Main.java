abstract class Deposit {
    protected String ownerName;
    protected double balance;

    public Deposit(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("واریز " + amount + " تومان به حساب " + ownerName + ". موجودی: " + balance + " تومان.");
    }

    public void withdraw(double amount) {
        if (balance - amount < 0) {
            System.out.println("برداشت ناموفق: موجودی کافی نیست.");
        } else {
            balance -= amount;
            System.out.println("برداشت " + amount + " تومان از حساب " + ownerName + ". موجودی: " + balance + " تومان.");
        }
    }

    public abstract double calculateInterest();
}

class ShortTermDeposit extends Deposit {

    public ShortTermDeposit(String ownerName, double balance) {
        super(ownerName, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount < 2000) {
            System.out.println("برداشت ناموفق: موجودی نباید از 2000 تومان کمتر شود.");
        } else {
            super.withdraw(amount);
        }
    }

    @Override
    public double calculateInterest() {
        double interest = this.balance * 0.1 / 12; // 10 درصد سالانه  
        System.out.println("سود سپرده کوتاه مدت " + ownerName + ": " + interest + " تومان");
        return interest;
    }
}

class LongTermDeposit extends Deposit {

    public LongTermDeposit(String ownerName, double balance) {
        super(ownerName, balance);
    }

    @Override
    public void deposit(double amount) {
        System.out.println("برای سپرده بلند مدت اجازه واریز وجود ندارد.");
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("برای سپرده بلند مدت اجازه برداشت وجود ندارد.");
    }

    @Override
    public double calculateInterest() {
        double interest = this.balance * 0.2 / 12; // 20 درصد سالانه  
        System.out.println("سود سپرده بلند مدت " + ownerName + ": " + interest + " تومان");
        return interest;
    }
}

class SavingsDeposit extends Deposit {

    public SavingsDeposit(String ownerName, double balance) {
        super(ownerName, balance);
    }

    @Override
    public double calculateInterest() {
        double interest = 0; // نرخ سود سپرده پس انداز صفر است  
        System.out.println("نرخ سود سپرده پس انداز " + ownerName + ": " + interest + " تومان");
        return interest;
    }
}

public class Main {
    public static void main(String[] args) {
        Deposit[] deposits = {
                new ShortTermDeposit("علی", 3000),
                new LongTermDeposit("حمید", 5000),
                new SavingsDeposit("سارا", 1500)
        };

        // عملیات واریز و برداشت  
        deposits[0].deposit(2000);
        deposits[0].withdraw(3000); // این باید موفق باشد  
        deposits[0].withdraw(2000); // این باید ناموفق باشد  

        deposits[1].deposit(1000); // این باید خطا بدهد  
        deposits[1].withdraw(1000); // این باید خطا بدهد  

        // محاسبه سود برای همه سپرده‌ها  
        System.out.println("محاسبه سود:");
        for (Deposit deposit : deposits) {
            deposit.calculateInterest();
        }
    }
}