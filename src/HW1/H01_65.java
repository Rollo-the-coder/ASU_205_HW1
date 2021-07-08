package HW1;

public class H01_65 {

  public H01_65() {
    mX = -1;
  }

  public H01_65(int pX) {
    this.setX(pX);
  }

  private int mX;

  private static int mY = 0;

  private final int A = 100;

  public static final int B = 200;
//getters
  public int getX() {
    return mX;
  }

  public int getY() {
    return mY;
  }
//setters
  public void setX(int param) {
    this.mX = param;
  }

  public void setY(int param) {
    H01_65.mY = param;
  }

}