//CLASS: H01_31
//AUTHOR: Erik Christian Gotta, egotta, egotta@asu.edu
package HW1;
import java.util.ArrayList;

public class H01_31 {

    //constructor
    public H01_31() {
    }   

    //method
    public ArrayList<Integer> arrayListInit() {
        ArrayList<Integer> list = new ArrayList<>();

        //two for loops to add 0 1 2 3 4 two times to the list object
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }    
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        return list;
    }  
}

