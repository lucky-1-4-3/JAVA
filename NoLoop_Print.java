/*
 * Print 1 to100 without using any Loop
 * 
 *  1 Recursive method
 *  2java streams ??//in jAva8
 *
 */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class NoLoop_Print {

    public static void main(String[] args) {
       // printNum(1); // Recursive Method => Recursion in java is a process in which a method calls itself continuously.
        printNumber(1,100);


//### 2nd Approach *****
        IntStream.range(1, 101).forEach(e -> System.out.println("Java Stream"+" "+e));
    
        //                   // Create a variable e and put a lambda (->) and supply 
       

              
    
    }
    // # method 1
    public static void printNum(int num){
         if(num <= 100){
            System.out.println(num);
            num++;
            printNum(num); //nearly identical to print( ) except that it requires the target level of the print operation to be specified as a number rather than as a string.
         }
    }
    // # method 2
    public static void printNumber(int startNum,int endNum){
        if (startNum<=endNum) {
            System.out.println(startNum);
            startNum++;
            printNumber(startNum, endNum);
        }
    }
    
}
