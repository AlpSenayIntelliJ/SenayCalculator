public class Calculator {
    private double n1, n2;

    public Calculator(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double multiply() {
        double answer = n1*n2;
        if (answer - (int) (answer) == 0) {
            return (int) (answer);
        } else {
            return answer;
        }
    }

    public double divide() {
        double answer = n1/n2;
        if (answer - (int) (answer) == 0) {
            return (int) (answer);
        } else {
            return answer;
        }
    }

    public double add() {
        double answer = n1+n2;
        if (answer - (int) (answer) == 0) {
            return (int) (answer);
        } else {
            return answer;
        }
    }

    public double subtract() {
        double answer = n1-n2;
        if (answer - (int) (answer) == 0) {
            return (int) (answer);
        } else {
            return answer;
        }
    }

    public double mod() {
        double answer = n1%n2;
        if (answer - (int) (answer) == 0) {
            return (int) (answer);
        } else {
            return answer;
        }
    }

    public double expo() {
        double answer = Math.pow(n1, n2);
        if (answer - (int) (answer) == 0) {
            return (int) (answer);
        } else {
            return answer;
        }
    }
}
