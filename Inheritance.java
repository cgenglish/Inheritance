import java.util.ArrayList;
public class Inheritance {

    public static void main(String[] args) {
        // int[] arr = new int[3];
        // try{
        // System.out.println("Hello this before the exception");
        // int value = arr[-1];
        // } catch(Exception exception){
        //     System.out.println("Exception: " + exception);
        // }
        // System.out.println("This is after the exception");
    
        // Student student = new Student("Connor");
        // System.out.println(student.GetName());
        // student.gpa = 3.0f;

        // Instructor instructor = new Instructor("Donald");
        // System.out.println(instructor.GetName()); 
        // instructor.salary = 50000;

        // //User user = new User("Justin"); //This will error because can't instantiate an abstract class
        // System.out.println(student instanceof Student);
        // System.out.println(student instanceof User);

        // Triangle triangle = new Triangle(5, 10);
        // System.out.println(triangle.GetArea());

        // Rectangle rectangle = new Rectangle(5, 10);
        // System.out.println(rectangle.GetArea());

        // Circle circle = new Circle(5);
        // System.out.println(circle.GetArea());
        
        
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