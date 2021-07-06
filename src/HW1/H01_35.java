//CLASS: H01_35
//AUTHOR: Erik Christian Gotta, egotta, egotta@asu.edu
import java.util.ArrayList;

public class H01_35 {

  public H01_35(){

  }

  public ArrayList<Integer> arrayListCreate(int pLen, int pInitValue) {
    ArrayList<Integer> ArrayList = new ArrayList<>();

    for (int i = 0; i < pLen; i++) {
      ArrayList.add(pInitValue);
    }
    return ArrayList;
  }
}
