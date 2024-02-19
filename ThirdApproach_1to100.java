// 3. Arrays fill :

import java.util.Arrays;
import java.util.BitSet;

public class ThirdApproach_1to100 {
    public static void main(String[] args) {


        // Arrays Fill
         Object num[] = new Object[100];

               Arrays.fill(num,new Object(){
                int count = 0;
                @Override
                public String toString(){
                return Integer.toString(++count);
               }
               });                                
    
               //System.out.println(Arrays.toString(num));


          //BitSet ()
           // ->  It stores the data in array format 
           // adds the values like we add in the list 

          String set =new BitSet() {{set(1,101);}}.toString();
          System.out.append(set, 1, set.length());
    }
}
