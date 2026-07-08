import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int dept = in.nextInt();
        in.close();

        switch (dept) {
            case 1:
                System.out.println("IT");
                System.out.println("No employee!");
                break;
            case 2:
                System.out.println("Accounts");
                System.out.println("No employee!");

                break;
            case 3:
                System.out.println("HR");
                System.out.println("Employee Exists!\nEnter Emp code: ");

                int empId = in.nextInt();
                switch (empId) {
                    case 1:
                        System.out.println("Pradnyesh");
                        break;
                    case 2:
                        System.out.println("Shardul");
                        break;
                    case 3:
                        System.out.println("Karan");
                        break;
                    default:
                        break;
                }
                break;
            case 4:
                System.out.println("Sales");
                break;
            default:
            System.out.println("Enter correct input");
                break;
        }

    }
}
