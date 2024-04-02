import java.util.ArrayList;
public class Inheritance {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(3.0);
        account.Deposit(101);
        account.Withdraw(200);
        SavingsAccount savingsAccount = new SavingsAccount(2.1);
        System.out.println(account.GetBalance());
        savingsAccount.Deposit(95);
        System.out.println(savingsAccount.GetBalance());
        savingsAccount.Withdraw(100);
        savingsAccount.Deposit(500);
        
        savingsAccount.Withdraw(100);
        System.out.println(savingsAccount.GetBalance());

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Paul"));
        students.add(new Student("Peter"));
        students.add(new Student("Parker"));

        students.sort(new StudentComparator());
        for(Student student : students) {
            System.out.println(student.GetName());
        }
    }
}