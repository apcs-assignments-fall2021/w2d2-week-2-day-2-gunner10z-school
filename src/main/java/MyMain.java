import java.util.Scanner;

public class MyMain {
    // Write a method that asks the user to input a double between 0.0 and 1000000.0
    // Your method should keep asking them until they type in a valid value
    // The method returns the final double they type in

    // scan.nextDouble() might be useful here
    public static double inputDouble() {
        Scanner scan = new Scanner(System.in);
        double input=-1.0;
        while (input<0.0 || input>1000000.0) {
            System.out.println("Please input a double: ");
            input = scan.nextDouble();
        }
        return input;
    }

    // Takes a double money as input and returns the number of quarters that we
    // can return in change
    // You should use a while loop!
    public static int numQuarters(double money) {
        int quarterCounter=0;
        while(money/0.25>=1){
            quarterCounter+=1;
            money=money-0.25;
        }
        return quarterCounter;
    }

    // Takes a double money as input and returns the number of dimes that we
    // can return in change
    // You should use a while loop!
    public static int numDimes(double money) {
        int dimeCounter=0;
        while(money/0.10>=1){
            dimeCounter+=1;
            money=money-0.10;
        }
        return dimeCounter;
    }
    public static int numNickels(double money) {
        int nickelCounter=0;
        while(money/0.05>=1){
            nickelCounter+=1;
            money=money-0.05;
        }
        return nickelCounter;
    }
    public static int numPennies(double money) {
        int pennyCounter=0;
        while(money/0.01>=1){
            pennyCounter+=1;
            money=money-0.01;
        }
        return pennyCounter;
    }





    //  Takes in two Strings as input and returns a String equal to those two Strings added
    //  together in alphabetic order.
    public static String stringOrder(String str1, String str2) {
        return "";
    }


    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);

        // You should test inputDouble yourself!
        double d = inputDouble();

        int quarterCounter=numQuarters(d);
        int dimeCounter=numDimes(d-quarterCounter*0.25);
        int nickelCounter=numNickels(d-quarterCounter*0.25-dimeCounter*0.10);
        int pennyCounter=numPennies(d-quarterCounter*0.25-dimeCounter*0.10-nickelCounter*0.05);

        System.out.println(quarterCounter+"/"+dimeCounter+"/"+nickelCounter+"/"+pennyCounter);
        // Some code to test numQuarters
        /*System.out.println("\nnumQuarters tests:");
        System.out.println("1.25 in quarters would be: " + numQuarters(1.25) + " quarters."); // 5
        System.out.println("10.55 in quarters would be: " + numQuarters(10.55) + " quarters."); // 42
        System.out.println("1000000.20 in quarters would be: " + numQuarters(1000000.20) + " quarters."); //4000000

        // Some code to test numDimes
        System.out.println("\nnumDimes tests:");
        System.out.println("1.20 in dimes would be: " + numDimes(1.20) + " dimes."); // 12
        System.out.println("120.13 in dimes would be: " + numDimes(120.13) + " dimes."); //1201
        System.out.println("150.25 in dimes would be: " + numDimes(150.25) + " dimes."); //1502*/

        //scan.close();
    }
}