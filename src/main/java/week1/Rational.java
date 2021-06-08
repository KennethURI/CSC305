package week1;

/**
 * This class represents a rational number object
 * Useful as an argument to a function
 */
public class Rational {
    private int numerator, denominator;

    /**
     * This class creates a Rational object
     * @param numerator any number
     * @param denominator should not be 0
     */
    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    /**

     * Checks whether the two Rationals have exactly the same values.

     * Rational(1,2) and Rational(2,4) are NOT exactly the same!

     *

     * @param other some other Rational
     * @return true when numerators and denominators are the same
     */
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rational rational = (Rational) o;
        return numerator == rational.numerator &&
                denominator == rational.denominator;
    }

    /**
     * Gets the double value of a rational class
     * @return double value of rational
     */
    public double doubleValue() {
        return (double) this.numerator/this.denominator;
    }

    public static void main(String[] args) {
        Rational rational12 = new Rational(1, 2);
        Rational rational23 = new Rational(2, 3);
        System.out.println("Test rational12 equals another Rational(1,2): " +
                (rational12.equals(new Rational(1, 2)) ? "passed" : "failed"));
        System.out.println("Test rational12 not equals rational23: " +
                (! rational12.equals(rational23) ? "passed" : "failed"));
        System.out.println("Test rational12 < rational23 as doubles: " +

                (rational12.doubleValue() < rational23.doubleValue() ?
                        "passed" : "failed"));
    }

}
