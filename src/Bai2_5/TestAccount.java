package Bai2_5;

public class TestAccount {
    public static void main(String[] args) {
        // Create account a1 with initial balance
        Account a1 = new Account("A101", "Tan Ah Teck", 88);
        System.out.println(a1);  // Output: Account[id=A101, name=Tan Ah Teck, balance=88.0]

        // Create account a2 with default balance 0
        Account a2 = new Account("A102", "Kumar");
        System.out.println(a2);  // Output: Account[id=A102, name=Kumar, balance=0.0]

        // Display details of a1
        System.out.println("ID: " + a1.getId());  // Output: ID: A101
        System.out.println("Name: " + a1.getName());  // Output: Name: Tan Ah Teck
        System.out.println("Balance: " + a1.getBalance());  // Output: Balance: 88.0

        // Perform credit and debit operations on a1
        a1.credit(100);
        System.out.println(a1);  // Output: Account[id=A101, name=Tan Ah Teck, balance=188.0]

        a1.debit(50);
        System.out.println(a1);  // Output: Account[id=A101, name=Tan Ah Teck, balance=138.0]

        a1.debit(500);  // Invalid debit, balance is not sufficient
        System.out.println(a1);  // Output: Invalid debit amount or insufficient balance
        // Account[id=A101, name=Tan Ah Teck, balance=138.0]

        // Perform transfer from a1 to a2
        a1.transferTo(a2, 100);
        System.out.println(a1);  // Output: Account[id=A101, name=Tan Ah Teck, balance=38.0]
        System.out.println(a2);  // Output: Account[id=A102, name=Kumar, balance=100.0]
    }
}
