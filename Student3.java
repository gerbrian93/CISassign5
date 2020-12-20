import java.io.PrintWriter;

public abstract class Student3 {//creates abstract class
   private String name;
   private int idNum;   //variables in abstract class held by all extenstions of class
   private float gpa;

   
   
      public Student3(String name, int idNum, float gpa) {//constructs our student
         this.name = name;
         this.idNum = idNum;
         this.gpa = gpa;
      }
   
      public void printStudent() {//prints student object to console
      System.out.print(name+","+idNum+","+gpa+",");
      }
   
      public int getID() {
         return idNum;
      }
      public String getName() {
         return name;
      }
      public float getGPA() {
         return gpa;
      }
   
      public void printStudent(PrintWriter output) {//prints student object to specified file 
          output.print(name+","+idNum+","+gpa+",");
      }
}