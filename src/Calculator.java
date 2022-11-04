public class Calculator {
    private double n1, n2;

    public Calculator(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double multiply() {
        return n1*n2;

    }

    public double divide() {
        return n1/n2;

    }

    public double add() {
        return n1+n2;

    }

    public double subtract() {
        return n1-n2;

    }

    public double mod() {
        return n1%n2;

    }

    public double expo() {
        return Math.pow(n1, n2);

    }
}
