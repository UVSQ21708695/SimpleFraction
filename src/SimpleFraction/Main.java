package SimpleFraction;

public class Main {

	public static void main(String[] args) {
		ChaineCryptee var = ChaineCryptee.deEnClair(null, 0);
		System.out.println(var.getChaineCryptee());
		var = ChaineCryptee.deEnClair("ceci est un test", 17);
		System.out.println(var.getChaineCryptee());
		var = ChaineCryptee.deCryptee("tvtz vjk le kvjk", -9);
		System.out.println(var.getChaineCryptee());
	}

}
