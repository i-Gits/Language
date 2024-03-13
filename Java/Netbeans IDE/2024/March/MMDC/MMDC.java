FILE 1

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hello.mmdc;

/**
 *
 * @author arc
 */
public class MMDC {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}


FILE 2: MotorPH.java

  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hello.motorph; 

import java.io.BufferedReader; 
import java.io.FileNotFoundException; 
import java.io.FileReader; 
import java.io.IOException; 

/**
 *
 * @author arc
 */
public class MotorPH {

    public static void main(String[] args) throws FileNotFoundException, IOException {
            String MotorPH = "C:\\Users\\arc\\Documents\\MMDC\\MotorPH\\My CSV Copy of MotorPH Employee Data.csv";
                //my file directory-->where パソコンがファイルを読めます
                String line = "";
 
                BufferedReader Bfrd = new BufferedReader(new FileReader(MotorPH));
                                //An object
                                     //*objects are like little helpers that store and manage data, + perform actions. 
                                        
                while((line = Bfrd.readLine()) != null) {
                    
                    System.out.println( "-------------------< MotorPH >---------------------- " );
                    String[] values = line.split(",");
                    System.out.println( " " );
                    System.out.println( "____________________________________________________ " );
                    System.out.println( " " );
                    System.out.println(" || " + values[0]+ " - " + values[2] + " " + values[1]+ " --- " + values[3] + " || " );
                    System.out.println( "____________________________________________________ " );
                    
                        System.out.println( " " );
                        System.out.println( " [ Total Hours Worked ] " + values[19] );
                        System.out.println( " ----------------------------"   );
                        System.out.println( " [ Gross Weekly Salary ] " + values[20] );
                        System.out.println( " ----------------------------"   );
                        System.out.println( " [ Net Weekly Salary ] " + values[25] );
                        System.out.println( " ---------------------------- "   );
                        System.out.println( " [ Position ] " + values[11] );
                        
                    System.out.println( " " );
                        System.out.println( "____________    *** end of data ***    _____________ " );

                       
                    
                        //Control Statements or Conditional branches
                        //Loops
                        //branches
                    
                    
    } 
                    
                }

    }

file 3 MotorPHvB

  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hello.motorph;

import java.io.BufferedReader;
    //A class!
    //This line imports (or brings in) BufferedReader from java.io. 
    //This class helps us read text from files more efficiently.
import java.io.FileNotFoundException;
    //A class!
import java.io.FileReader;
    //A class!
    //This line imports FileReader from java.io. 
    //now we can read text from files stored on our computer's hard drive.
import java.io.IOException;
    //A class!

/**
 *
 * @author arc
 */
public class MotorPHvB {

   private static void Static (String[] args) throws FileNotFoundException, IOException {
            String BANANA = "C:\\Users\\arc\\Documents\\MMDC\\MotorPH\\My CSV Copy of MotorPH Employee Data.csv";
            //my file directory-->where パソコンがファイルを読めます
    String line = "";
//this is empty so we can use it for later (see below)
    
                BufferedReader Bfrd = new BufferedReader(new FileReader(BANANA));
                //reads the file we have in String BANANA
                                //An object
                                     //*objects are like little helpers that store and manage data, + perform actions. 
                                
                                // BufferedReader Bfrd 
                                          // This line creates an object called Bfrd      
                                                                             
                                // = new 
                                        // we use this to create a new object
                                        
                                // BufferedReader(new FileReader(BANANA));
                                        //
                                        
                while((line = Bfrd.readLine()) != null) {
                    
                    //While String line is 
                    //This condition checks if the current line being read is not null. 
                    //If the line is not null, the loop body is executed, 
                    //which splits the line into an array of values using the split method, 
                    //and then prints the desired output using System.out.println. 
                    
                    //The loop continues until the end of the file is reached, 
                    //at which point the loop condition becomes false and the loop exits.
                    
                    System.out.println( "-------------------< MotorPH >---------------------- " );
                    String[] values = line.split(",");
                    System.out.println( " " );
                    System.out.println( "____________________________________________________ " );
                    System.out.println( " " );
                    System.out.println(" || " + values[0]+ " - " + values[2] + " " + values[1]+ " --- " + values[3] + " || " );
                    System.out.println( "____________________________________________________ " );
                    
                        System.out.println( " " );
                        System.out.println( " [ Total Hours Worked ] " + values[19] );
                        System.out.println( " ----------------------------"   );
                        System.out.println( " [ Gross Weekly Salary ] " + values[20] );
                        System.out.println( " ----------------------------"   );
                        System.out.println( " [ Net Weekly Salary ] " + values[25] );
                        System.out.println( " ---------------------------- "   );
                        System.out.println( " Position " + values[11] );
                        
                    System.out.println( " " );
                        System.out.println( "____________    *** end of data ***    _____________ " );

                    // "How to Handle comma present in the data of csv file in Informatica Cloud"
                    //Delimiter change
                    
                    
                    
    } 
                    
                }

    }


File 4 MotorPHvノート.java


  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hello.motorph;

import java.io.BufferedReader;
    //A class!
    //This line imports (or brings in) BufferedReader from java.io. 
    //This class helps us read text from files more efficiently.
import java.io.FileNotFoundException;
    //A class!
import java.io.FileReader;
    //A class!
    //This line imports FileReader from java.io. 
    //now we can read text from files stored on our computer's hard drive.
import java.io.IOException;
    //A class!

/**
 *
 * @author arc
 */
public class MotorPHvノート {

   private static void Static(String[] args) throws FileNotFoundException, IOException {
            String BANANA = "C:\\Users\\arc\\Documents\\MMDC\\MotorPH\\My CSV Copy of MotorPH Employee Data.csv";
            //my file directory-->where パソコンがファイルを読めます
            String line = "";
//this is empty so we can use it for later (see below)
    
                BufferedReader Bfrd = new BufferedReader(new FileReader(BANANA));
                //reads the file we have in String BANANA
                                //An object
                                     //*objects are like little helpers that store and manage data, + perform actions. 
                                
                                // BufferedReader Bfrd 
                                          // This line creates an object called Bfrd      
                                                                             
                                // = new 
                                        // we use this to create a new object
                                        
                                // BufferedReader(new FileReader(BANANA));
                                        //
                                        
                while((line = Bfrd.readLine()) != null) {
                    
                    //While String line is 
                    //This condition checks if the current line being read is not null. 
                    //If the line is not null, the loop body is executed, 
                    //which splits the line into an array of values using the split method, 
                    //and then prints the desired output using System.out.println. 
                    
                    //The loop continues until the end of the file is reached, 
                    //at which point the loop condition becomes false and the loop exits.
                    
                    System.out.println( "-------------------< MotorPH >---------------------- " );
                    String[] values = line.split(",");
                    System.out.println( " " );
                    System.out.println( "____________________________________________________ " );
                    System.out.println( " " );
                    System.out.println(" || " + values[0]+ " - " + values[2] + " " + values[1]+ " --- " + values[3] + " || " );
                    System.out.println( "____________________________________________________ " );
                    
                        System.out.println( " " );
                        System.out.println( " [ Total Hours Worked ] " + values[19] );
                        System.out.println( " ----------------------------"   );
                        System.out.println( " [ Gross Weekly Salary ] " + values[20] );
                        System.out.println( " ----------------------------"   );
                        System.out.println( " [ Net Weekly Salary ] " + values[25] );
                        System.out.println( " ---------------------------- "   );
                        System.out.println( " Position " + values[11] );
                        
                    System.out.println( " " );
                        System.out.println( "____________    *** end of data ***    _____________ " );

                    // "How to Handle comma present in the data of csv file in Informatica Cloud"
                    //Delimiter change
                    
                    
                    
    } 
                    
                }

    }



File end of project files

  
  

  
