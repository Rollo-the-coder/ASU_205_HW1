//CLASS: H01_34
//AUTHOR: Erik Christian Gotta, egotta, egotta@asu.edu
package HW1;
import java.util.ArrayList;

public class H01_34 {

  public H01_34() {

  }

  public Integer arrayListSum(ArrayList<Integer> pList) {

    //initialize sum if empty arraylist
    int sum = 0;

    //use an enhanced for loop to check if null or not to then add sum 
      for (Integer element : pList) {
        if (element != null) {
        sum = sum + element;
        }
      }
      return sum;
    }
    
}

