package ch.fhnw.richards.week09_Comparing;

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
    	// TODO
    	return new Fraction(0,1);
    }    

    /**
     * Subtract two fractions
     */
    public Fraction subtract(Fraction in) {
    	// TODO
    	return new Fraction(0,1);
    }    

    /**
     * Multiply two fractions. Example: 2/5 * 3/7 = 6/35
     */
    public Fraction multiply(Fraction in) {
    	// TODO
    	return new Fraction(0,1);
    }

    /**
     * Divide two fractions. Example: 2/5 / 3/7 = 14/15
     */
    public Fraction divide(Fraction in) {
    	// TODO
    	return new Fraction(0,1);
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
    	// TODO
    	return 1;
    }
}