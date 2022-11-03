import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an expression with *, /, +, -, %, or ^: ");
        String request = scan.nextLine();

        double num1 = Double.parseDouble(request.substring(0,request.indexOf(" ")));
        double num2 = Double.parseDouble(request.substring(request.indexOf(" ")+3));


    }
}
