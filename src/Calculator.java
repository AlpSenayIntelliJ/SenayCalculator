public class Calculator {
    private double n1, n2;

    public Calculator(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double multiply() {
        if (((int) (n1) == n1) && ((int) (n2) == n2)) {
            return (int) (n1*n2);
        } else {
            return n1*n2;
        }
    }

    public double divide() {
        if (((int) (n1) == n1) && ((int) (n2) == n2)) {
            if (n1%n2 == 0) {
                return (int) (n1/n2);
            } else {
                return n1/n2;
            }
        } else {
            return n1/n2;
        }
    }

    public double add() {
        if (((int) (n1) == n1) && ((int) (n2) == n2)) {
            return (int) (n1+n2);
        } else {
            return n1+n2;
        }
    }

    public double subtract() {
        if (((int) (n1) == n1) && ((int) (n2) == n2)) {
            return (int) (n1-n2);
        } else {
            return n1-n2;
        }
    }

    public double mod() {
        if (((int) (n1) == n1) && ((int) (n2) == n2)) {
            return (int) (n1%n2);
        } else {
            return n1%n2;
        }
    }

    public double expo() {
        if (((int) (n1) == n1) && ((int) (n2) == n2)) {
            return (int) (Math.pow(n1, n2));
        } else {
            return Math.pow(n1, n2);
        }
    }
}
