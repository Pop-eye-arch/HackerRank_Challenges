import java.util.*;

  void main() {
        Scanner scn = new Scanner(System.in);

       ArrayList<String> allLines = new ArrayList<>();

        while (scn.hasNextLine()) {
            String msg = scn.nextLine();
            allLines.add(msg);
        }

        for (int i = 0; i < allLines.size(); i++) {
            System.out.println((i + 1) + " " + allLines.get(i));
        }

        scn.close();
    }
