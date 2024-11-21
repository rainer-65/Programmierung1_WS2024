package ch.fhnw.richards.week09_Comparing.solutions.fraction;

public class Fraction extends Number implements Comparable<Fraction> {
    private final long numerator;     // immutable!
    private final long denominator;   // immutable!
    
    public Fraction(long numerator, long denominator) {
        long gcd = gcd(numerator, denominator);
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }
    
    /**
     * Add two fractions
     */
    public Fraction add(Fraction in) {
    	long numerator = this.numerator * in.denominator + in.numerator * this.denominator;
    	long denominator = this.denominator * in.denominator;
    	return new Fraction(numerator, denominator);
    }    

    /**
     * Subtract two fractions
     */
    public Fraction subtract(Fraction in) {
    	long numerator = this.numerator * in.denominator - in.numerator * this.denominator;
    	long denominator = this.denominator * in.denominator;
    	return new Fraction(numerator, denominator);
    }    

    /**
     * Multiply two fractions. Example: 2/5 * 3/7 = 6/35
     */
    public Fraction multiply(Fraction in) {
    	long numerator = this.numerator * in.numerator;
    	long denominator = this.denominator * in.denominator;
    	return new Fraction(numerator, denominator);
    }

    /**
     * Divide two fractions. Example: 2/5 / 3/7 = 14/15
     */
    public Fraction divide(Fraction in) {
    	long numerator = this.numerator * in.denominator;
    	long denominator = this.denominator * in.numerator;
    	return new Fraction(numerator, denominator);
    }

    public long getNumerator() {
        return numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    @Override
    public int intValue() {
        return (int) longValue();
    }

    @Override
    public long longValue() {
        return numerator / denominator;
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override
    public double doubleValue() {
        return ((double) numerator) / ((double) denominator);
    }

	@Override
	public boolean equals(Object obj) {
		if ((obj == null) || this.getClass() != obj.getClass()) return false;
		
		Fraction other = (Fraction) obj;
		return (this.numerator == other.numerator && this.denominator == other.denominator);
	}

	@Override
    public int compareTo(Fraction o) {
    	Fraction f = this.subtract(o);
    	if (f.numerator * f.denominator < 0) return -1;
    	else if (f.numerator == 0) return 0;
    	else return 1;
    }
    
    @Override
    public String toString() {
        return Long.toString(numerator) + "/" + Long.toString(denominator);
    }
    
    /**
     * Adaptation of Euclid's GCD algorithm
     */
    private long gcd(long num1, long num2) {
        long tmp;
        if (num2 > num1) {
            tmp = num2;
            num2 = num1;
            num1 = tmp;
        }
        while (num2 != 0) {
            tmp = num1 % num2;
            num1 = num2;
            num2 = tmp;
        }
        return num1;
    }
}