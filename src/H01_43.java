//CLASS: H01_43
//AUTHOR: Erik Christian Gotta, egotta, egotta@asu.edu
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class H01_43 {
  public static void main (String[] args) throws FileNotFoundException {
    Scanner sc = new Scanner(System.in);

    System.out.println("Please enter the name of the Java source code file");
    String fname = sc.nextLine();

    Scanner in = new Scanner(new File(fname));

    PrintWriter out = new PrintWriter(new File(fname + ".txt"));

    int i = 1;
    while (in.hasNextLine()) { 
      String javaFile = in.nextLine();
      out.printf("[%03d]", i);
      out.println(javaFile);
      i++;
    }
    
    sc.close();
    in.close();
    out.close();
  }
}
