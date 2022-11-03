import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an expression with *, /, +, -, %, or ^: ");
        String request = scan.nextLine();

        double num1 = Double.parseDouble(request.substring(0,request.indexOf(" ")));
        double num2 = Double.parseDouble(request.substring(request.indexOf(" ")+3));
        String operation = request.substring(request.indexOf(" ")+1, request.indexOf(" "));

        Calculator calc = new Calculator(num1, num2);
        if (operation.equals("*")) {
            calc.multiply();
        }
        else if (operation.equals("/")) {
            calc.divide();
        }
        else if (operation.equals("+")) {
            calc.add();
        }
        else if (operation.equals("-")) {
            calc.subtract();
        }
        else if (operation.equals("%")) {
            calc.mod();
        }
        else if (operation.equals("^")) {
            calc.expo();
        } else {
            System.out.print("Enter a valid calculation.");
        }
    }
}
