import HW1.H01_65;

public class H01_66 {
  public static void main (String[] args) {
    H01_65 cObj1 = new H01_65();
    H01_65 cObj2 = new H01_65(10);

    System.out.println(cObj1.getX());
    System.out.println(cObj2.getX());

    // int a2 = H01_65.mY;
    // int a3 = H01_65.A;
    // int a5 = cObj1.getX();
    // cObj2.setX(cObj1.getX());
    // int a7 = cObj1.getY();
    int a8 = H01_65.getY(); 

    System.out.println();
  }
}
