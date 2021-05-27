package week1;

public class Rational {
    int numerator, denominator;

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rational rational = (Rational) o;
        return numerator == rational.numerator &&
                denominator == rational.denominator;
    }

    public static void main(String[] args) {
        Rational rational12 = new Rational(1, 2);
        Rational rational23 = new Rational(2, 3);
        System.out.println("Test rational12 equals another Rational(1,2): " +
                (rational12.equals(new Rational(1, 2)) ? "passed" : "failed"));
        System.out.println("Test rational12 not equals rational23: " +
                (! rational12.equals(rational23) ? "passed" : "failed"));
    }

}
