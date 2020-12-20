import java.io.PrintWriter;

public class UndergradStudent2 extends Student3 { //exends abstract class 
   private boolean isTransfer;

      public UndergradStudent2(String name, int idNum, float gpa, boolean isTransfer) {
         super(name, idNum, gpa);          //super class variables called plus undergrad specific variable
         this.isTransfer = isTransfer;     
      }
   
      public void printStudent() {//prints super method plus below print statement to console 
      super.printStudent();
      System.out.println("undergraduate,"+isTransfer);
      }

      public void printStudent(PrintWriter output) {//same as above but this prints to our specified output file 
      super.printStudent(output);
      output.println("undergraduate,"+isTransfer);
      }

}