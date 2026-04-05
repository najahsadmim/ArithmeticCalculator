
import java.util.Scanner;

public class ArithCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an arithmetic expression to perform: ");
        String exp = sc.nextLine().replace(" ", "");
        String op = "";
        int opIdx = -1;

        if (exp.contains("+")) {
            op = "+";
            opIdx = exp.indexOf("+");
        } else if (exp.contains("-")) {
            op = "-";
            opIdx = exp.indexOf("-");
        } else if (exp.contains("*")) {
            op = "*";
            opIdx = exp.indexOf("*");
        } else if (exp.contains("/")) {
            op = "/";
            opIdx = exp.indexOf("/");
        }

        if (opIdx == -1) {
            System.out.println("INVALID EXPRESSION");
            return;
        }

        int n1 = Integer.parseInt(exp.substring(0, opIdx));
        int n2 = Integer.parseInt(exp.substring(opIdx + 1));

        if (op.equals("+")) {
            System.out.println("Result: " + add(n1, n2));
        } else if (op.equals("-")) {
            System.out.println("Result: " + subt(n1, n2));
        } else if (op.equals("*")) {
            System.out.println("Result: " + multi(n1, n2));
        } else if (op.equals("/")) {
            if (n2 == 0) {
                System.out.println("RUNTIME ERROR");
            } else {
                System.out.println("Result: " + divi(n1, n2));
            }
        } else {
            System.out.println("INVALID EXPRESSION");
        }
    }

    public static int add(int n1, int n2) {
        return n1 + n2;
    }

    public static int subt(int n1, int n2) {
        return n1 - n2;
    }

    public static int multi(int n1, int n2) {
        return n1 * n2;
    }

    public static int divi(int n1, int n2) {
        return n1 / n2;
    }
}
