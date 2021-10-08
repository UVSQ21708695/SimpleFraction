package SimpleFraction;

public class ChaineCryptee {
	private String chaineCrypte;
	private int decalage;
	public static ChaineCryptee deCryptee(String crypte, int decalage) {
		ChaineCryptee chaine= new ChaineCryptee("",0);
		chaine.chaineCrypte = crypte;
		chaine.decalage = decalage;
		return chaine;
	}
	public static ChaineCryptee deEnClair(String enClair,int decalage) {
		return new ChaineCryptee(enClair, decalage);
	}
	private ChaineCryptee(String enClair,int decal) {
		chaineCrypte = enClair;
		decalage = decal;
		chaineCrypte = crypte();
	}
	
	public String deCrypte() {
		return chaineCrypte;
	}
	/*
	 * cette fonction décale uniquement les caractere alphabétique
	 * les majuscules sont décalé de <code>decalage</code> caractere de façon circulaire en majuscules
	 * les muniscules en muniscules. Les autres caracteres ne sont pas modifiés
	 * 
	 * @param c le caractere à décaler
	 * @param decalage le décalage à appliquer. il doit être >=-26 et <=26
	 * @param return le caractere décalé
	 */
	private static char decaleCaractere(char c,int decalage) {
		if(decalage<0) decalage += 26;
		if(c>='A' && c<='Z') return (char)(((c-'A'+decalage)%26) +'A');
		if(c>='a' && c<='z') return (char)((c-'a'+decalage)%26 +'a');
		return c;
	}
	/*
	 * on applique decaleCaractere sur tous les caracteres de chaineEnClair
	 * 
	 * @param return renvoie la chaine cryptée
	 * @param throws NullPointerException si la chaine chaineEnClair est null.
	 */
	public String crypte() throws NullPointerException{
		try {
			chaineCrypte.equals(null);
		}
		catch(NullPointerException e){
			System.out.println("la chaine est null");
		}
		finally {
			if(chaineCrypte == null)
				chaineCrypte = new String();
		}
			String chiffree = new String();
			for(int i=0; i<chaineCrypte.length(); i++) {
				chiffree += decaleCaractere(chaineCrypte.charAt(i),decalage);
			}
			return chiffree;
	}
	public String getChaineCryptee() {
		return chaineCrypte;
	}
}
