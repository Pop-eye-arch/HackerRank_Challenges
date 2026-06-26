import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int start = sc.nextInt();
    int end = s.length() - 1;
    int n = sc.nextInt();

    if (s.length() >= 1) {
        if (s.length() <= 100) {
            System.out.println(s.substring(start, n) );
        }else  {
            System.out.println("String provided is longer than 100 characters");
        }
    }else {
        System.out.println("No string provided");
    }

    sc.close();
}
