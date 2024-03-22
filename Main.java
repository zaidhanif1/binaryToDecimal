import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String binary = scan.nextLine();

        // Validate binary input
        if (!isValidBinary(binary)) {
            System.out.println(binary + " is NOT a valid binary number");
            return;
        }


        int decimal = binaryToDecimal(binary);
        System.out.println(binary + " = " + decimal);

        scan.close();
    }

    public static boolean isValidBinary(String binary) {
        for (int i = 0; i < binary.length(); i++) {
            char digit = binary.charAt(i);
            if (digit != '0' && digit != '1') {
                return false;
            }
        }
        return true;
    }

    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            char digit = binary.charAt(i);
            if (digit == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }
        return decimal;
    }
}
