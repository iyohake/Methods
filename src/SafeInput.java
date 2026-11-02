import java.util.Scanner;

public class SafeInput {

    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = ""; // Set this to zero length. Loop runs until it isn't
        do
        {
            System.out.print("\n" +prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        }while(retString.length() == 0);

        return retString;

    }
    public static int getInt(Scanner pipe, String prompt){
        int num = 0;
        do {

            System.out.print("\n" + prompt + ": ");
           if(pipe.hasNextInt()){
               num = pipe.nextInt();
               break;
           } else{
               System.out.println("Invalid input. Try again.");
               pipe.nextLine();
           }

        }while(true);
        pipe.nextLine();
        return num;
    }
    public static double getDouble(Scanner pipe, String prompt){
        double num = 0;
        do {

            System.out.print("\n" + prompt + ": ");
            if(pipe.hasNextDouble()){
                num = pipe.nextDouble();
                break;
            } else{
                System.out.println("Invalid input. Try again.");
                pipe.nextLine();
            }

        }while(true);
        pipe.nextLine();
        return num;
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high){
        double num = 0;
        do {

            System.out.print("\n" + prompt + ": ");
            if(pipe.hasNextDouble()){
                num = pipe.nextDouble();
                if(num > high || num < low){
                    System.out.println("That's out of bounds. Go again.");
                    pipe.nextLine();
                } else {
                    break;
                }
            } else{
                System.out.println("Invalid input. Try again.");
                pipe.nextLine();
            }

        }while(true);
        pipe.nextLine();
        return num;
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high){
        int num = 0;
        do {

            System.out.print("\n" + prompt + ": ");
            if(pipe.hasNextInt()){
                num = pipe.nextInt();
                if(num > high || num < low){
                    System.out.println("That's out of bounds. Go again.");
                    pipe.nextLine();
                } else {
                    break;
                }
            } else{
                System.out.println("Invalid input. Try again.");
                pipe.nextLine();
            }

        }while(true);
        pipe.nextLine();
        return num;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt){
        System.out.print("\n" + prompt + ": ");
        Boolean YN = false;
        if(pipe.hasNextLine()){
            String line;
            do {
                line = pipe.nextLine();
                if (line.equalsIgnoreCase("Y")) {
                    YN = true;
                    break;
                } else if (line.equalsIgnoreCase("N")) {
                    YN = false;
                    break;
                }else{
                    System.out.println("You screwed up. Type 'Y' or 'N'. It's not hard.");

                }
            }while(true);
            } else{
            System.out.println("Invalid input. Try again.");
            pipe.nextLine();


        }
        return YN;
    }
    public static String getRegExString(Scanner pipe, String prompt, String regEx)
    {
        String retString = "";
        System.out.print("\n" + prompt + ": ");
        do {retString = pipe.nextLine();
            if (retString.matches(regEx)) {

                break;
            } else {
                System.out.println("no, no, NO. WRONG. DO IT AGAIN.");


            }
        }while(true);

        return retString;

    }

    public class GetUserName {
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            String firstName = "";
            String lastName = "";
            firstName = SafeInput.getNonZeroLenString(in, "Enter your first name");
            lastName = SafeInput.getNonZeroLenString(in, "Enter your last name");
            System.out.println("\nYour full name is: " + firstName + " " + lastName);

        }
    }
}
