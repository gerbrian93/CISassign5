/*
Name: Brian Gerhart
CSU ID: 2741107
CIS 265: Assignment 5
Description: This program will use the scanner to read input from a file and store it in an arraylist. 
Then it will output into a new file elements of the arraylist in reverse order. Exception handling and logic
handle extra credit 1-4.
 */


import java.io.File;
import java.util.Collections;
import java.io.IOException; 
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
 
public class Assign5gerhart {
      public static void main (String[] args) throws IOException {
      ArrayList<Student3> studentList = new ArrayList<>();//initialize ArrayList 
      String name;
      int idNum;
      float gpa;
      boolean isTransfer;
      String college;
  
         if (args.length != 2) {//prints invalid if the arg length is not 2
         System.out.println("ERROR, invalid arguments");
         }
         File inputFile = new File(args[0]); //inputs the files to pass as arguments
         File outputFile = new File(args[1]);
         Scanner input = new Scanner(inputFile);//Scanner reads input from the input file or first argument
         String line = "";//creates empty string for input to read

       while (input.hasNextLine()) {//this passes the input through every line of the file 
        try {
               line = input.nextLine();//starts at first line
               String[] split = line.split(",");//splits string line into substrings 
               name = split[0];
               idNum = Integer.parseInt(split[1]);//converts string to integer
               gpa = Float.parseFloat(split[2]);//converts string to float
                  if (split[3].equals("undergraduate")) {
                        isTransfer = Boolean.parseBoolean(split[4]);//converts string to boolean                    
                        studentList.add(new UndergradStudent2(name, idNum, gpa, isTransfer)); //creates undergrad and adds to list  
                                } else if (split[3].equals("graduate")) {
                        college = split[4];
                        studentList.add(new gradStudent2(name, idNum, gpa, college));//creates grad and adds to list
                  }else {
                        System.out.println("invalid input: "+line);//extra credit #4
                  }
         } catch (ArrayIndexOutOfBoundsException e) {
               System.out.println("Invalid input: "+line);  //extra credit #1        
         } catch (NumberFormatException f) {
               System.out.println("invalid input: "+line); //extra credit #2 & #3
           }
        }
         input.close();//close input
         PrintWriter output = new PrintWriter(outputFile);//create printwriter object 
           for (int i = studentList.size() - 1; i >= 0; i--) {//starts at last element of array and i-- decremnts
              studentList.get(i).printStudent(output);//uses .get(i) and calls the printStudent methods
              
           }
            output.close();//close output
      }
} 



