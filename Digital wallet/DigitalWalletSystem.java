

class Wallet {

    
    private double balance;

   
    private static double cashbackRate = 0.02; // 2%


    public Wallet() {
        this.balance = 0.0;
    }

    
    public double getBalance() {
        return balance;
    }

    
    public static void setCashbackRate(double rate) {
        if (rate >= 0) {
            cashbackRate = rate;
        }
    }

    
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return;
        }

        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    
    public void transferTo(Wallet receiver, double amount) {
        try {
            
            if (amount <= 0) {
                throw new IllegalArgumentException("Amount must be greater than 0");
            }

            
            if (this.balance < amount) {
                throw new Exception("Insufficient balance");
            }

        
            this.balance -= amount;
            receiver.balance += amount;

            
            double cashback = amount * cashbackRate;
            this.balance += cashback;

            System.out.println("Transaction successful!");
            System.out.println("Transferred: " + amount);
            System.out.println("Cashback received: " + cashback);

        } catch (IllegalArgumentException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
    }
}


public class DigitalWalletSystem {

    public static void main(String[] args) {

        
        Wallet w1 = new Wallet();
        Wallet w2 = new Wallet();

        System.out.println("=== Digital Wallet System ===\n");

    
        w1.deposit(1000);

        System.out.println("\nInitial Balance:");
        System.out.println("Wallet 1: " + w1.getBalance());
        System.out.println("Wallet 2: " + w2.getBalance());

        
        System.out.println("\nTransferring 300...\n");
        w1.transferTo(w2, 300);

        System.out.println("\nFinal Balance:");
        System.out.println("Wallet 1: " + w1.getBalance());
        System.out.println("Wallet 2: " + w2.getBalance());
    }
}