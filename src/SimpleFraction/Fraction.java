package SimpleFraction;

public class Fraction {
	private int numerateur;
	private int denominateur;

	public Fraction(int num, int den) {
		if (den > 0) {
			numerateur = num;
			denominateur = den;
		} else if (den < 0) {
			numerateur = -1 * num;
			denominateur = -1 * den;
		} else
			return;
	}

	@Override
	public String toString() {
		return numerateur + "/" + denominateur;
	}
}
