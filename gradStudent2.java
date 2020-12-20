import java.io.PrintWriter;

public class gradStudent2 extends Student3 {//extends our abstract class so actual objects are made here
   private String college;

      public gradStudent2(String name, int idNum, float gpa, String college) { 
         super(name, idNum, gpa);   //calls for super variables plus the gradstudent variables to create object
         this.college = college;
      }
   
      public void printStudent() {//prints object to console 
         super.printStudent();//calls super method from student class
         System.out.println("graduate,"+college);//adds this to calling of above method
      }
      
      public void printStudent(PrintWriter output) {
         super.printStudent(output);//calls super method from student class 
         output.println("graduate,"+college);//adds this to super method output
      }
      
}
