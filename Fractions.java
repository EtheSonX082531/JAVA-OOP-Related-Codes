public class Fractions {
	public static int GCD(int x, int y) {
		int n;
		if (x < y) {
			n = x;
		} else {
			n = y;
		}
		for (int i = n; i >= 1; i--) {
			if (x % i == 0) {
				if (y % i == 0) {
					return i;
				}
			}
		}
		return 1;
	}


	public static class Fraction {
		int numerator;
		int denominator;

		public Fraction() {}

		public Fraction(int numerator, int denominator) {
			if (denominator == 0) {
				System.out.println(0);
			} else {
				int gcd = GCD(numerator, denominator);
				this.numerator = numerator / gcd;
				this.denominator = denominator / gcd;

				System.out.println("After Simplifying the fraction:" + this.numerator + "/" + this.denominator);
			}
		}

		public static Fraction Add(Fraction x, Fraction y) {
			Fraction F = new Fraction(((x.numerator * y.denominator) + (y.numerator * x.denominator)), (x.denominator * y.denominator));
			return F;
		}

		public static Fraction Multiply(Fraction x, Fraction y) {
			Fraction F = new Fraction((x.numerator * y.numerator), (x.denominator * y.denominator));
			return F;
		}
	}
	public static void main(String[] args) {
		Fraction f1 = new Fraction(3, 4);
		Fraction f2 = new Fraction(2, 5);
		Fraction.Add(f1, f2);

		Fraction.Multiply(f1, f2);
	}
}
