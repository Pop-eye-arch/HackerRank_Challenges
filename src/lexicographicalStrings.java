import java.util.*;

public class lexicographicalStrings {
    static void main() {
      Scanner scn = new Scanner(System.in);
      String A = scn.nextLine();
      String B = scn.nextLine();
        scn.close();
        System.out.println(A.length() + B.length());

       if (A.compareTo(B) > 0) {
          System.out.println("Yes");
      }else if (A.compareTo(B) < 0)   {
          System.out.println("No");
      }

        System.out.print(A.substring(0,1).toUpperCase() + A.substring(1).toLowerCase() + " ");
        System.out.println(B.substring(0,1).toUpperCase() + B.substring(1).toLowerCase());
    }
}
