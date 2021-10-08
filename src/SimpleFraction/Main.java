package SimpleFraction;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction frac = new Fraction(10,3);
		System.out.println(frac.toString());
		ChaineCryptee chaine = new ChaineCryptee(null,-5);
		System.out.println(chaine.crypte());
		chaine = new ChaineCryptee("ceci est un test",17);
		System.out.println(chaine.crypte());
	}

}
