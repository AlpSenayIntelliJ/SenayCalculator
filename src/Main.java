import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an expression with *, /, +, -, %, or ^: ");
        String request = scan.nextLine();

        double num1 = Double.parseDouble(request.substring(0,request.indexOf(" ")));
        double num2 = Double.parseDouble(request.substring(request.indexOf(" ")+3));
        String operation = request.substring(request.indexOf(" ")+1, request.indexOf(" ")+2);

        Calculator calc = new Calculator(num1, num2);
        if (operation.equals("*")) {
            System.out.print(calc.multiply());
        }
        else if (operation.equals("/")) {
            System.out.print(calc.divide());
        }
        else if (operation.equals("+")) {
            System.out.print(calc.add());
        }
        else if (operation.equals("-")) {
            System.out.print(calc.subtract());
        }
        else if (operation.equals("%")) {
            System.out.print(calc.mod());
        }
        else if (operation.equals("^")) {
            System.out.print(calc.expo());
        } else {
            System.out.print("Enter a valid operation.");
        }
    }
}
