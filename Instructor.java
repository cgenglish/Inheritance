public class Instructor extends User {
    double salary; 
 
    public Instructor(String name) {
     super(name);
     System.out.println("Called the Instructor Constructor");
 }
 
 public String GetName() {
     return super.GetName() + " is an instructor.";
 }
 }