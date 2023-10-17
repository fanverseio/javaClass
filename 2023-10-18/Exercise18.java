import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        System.out.println("Welcome to My Mail Server!");
        Scanner scan = new Scanner(System.in);
        CheckEmailValidity check = new CheckEmailValidity();
        boolean loop1 = true;

        while (loop1) {
            System.out.print(">>> ");
            String senderInputString = scan.nextLine();
            String rcptInputString = null;
            String message = null;

            if (senderInputString.equals("QUIT")) {
                System.out.println("Exiting Programme ... Goodbye!");
                loop1 = false;
                break;
            } else {

                while (!check.checkEmail(senderInputString)) {

                    System.out.println("Invalid email address. Please enter a valid email address.");
                    System.out.print(">>> ");
                    senderInputString = scan.nextLine();
                }

                System.out.println("MAIL FROM: " + senderInputString);
                System.out.print(">>> ");
                rcptInputString = scan.nextLine();
                boolean loop2 = true;

                while (loop2) {
                    if (rcptInputString.equals("QUIT")) {
                        System.out.println("Exiting Programme ... Goodbye!");
                        System.exit(0);
                    } else {
                        while (!check.checkEmail(rcptInputString)) {
                            System.out.println("Invalid email address. Please enter a valid email address.");
                            System.out.print(">>> ");
                            rcptInputString = scan.nextLine();
                        }

                        System.out.println("MAIL TO: " + rcptInputString);
                        System.out.println("");
                        boolean loop3 = true;
                        StringBuilder paragraph = new StringBuilder();

                        String line;
                        while (loop3) {
                            line = scan.nextLine();
                            if (line.trim().equals(".")) {
                                break;
                            }
                            paragraph.append(line).append("\n");
                            message = paragraph.toString();
                        }

                        System.out.println("from: " + senderInputString);
                        System.out.println("to: " + rcptInputString);
                        System.out.println(message);
                        break;
                    }
                }
            }
        }
        scan.close();
    }
}

class CheckEmailValidity {
    public boolean checkEmail(String str) {
        if (!str.contains("@") || !str.contains(".") || !str.matches("[\\w\\d]+@[\\w\\d]+\\.[\\w\\d]+")) {
            return false;
        } else {
            return true;
        }
    }
}