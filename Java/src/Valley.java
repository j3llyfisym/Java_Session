import java.util.Scanner;

public class Valley {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the path (only U and D): ");
        String path = scanner.nextLine();

        int level = 0;
        int valleys = 0;

        for (int i = 0; i < path.length(); i++) {
            char step = path.charAt(i);

            if (step == 'U') {
                level++;
                if (level == 0) {
                    valleys++;
                }
            } else if (step == 'D') {
                level--;
            }
        }

        System.out.println("Number of valleys: " + valleys);
        scanner.close();
    }
}

