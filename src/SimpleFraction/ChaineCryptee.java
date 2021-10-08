package SimpleFraction;

public class ChaineCryptee {
	private String chaineEnClair;
	private int decalage;
	public ChaineCryptee(String enClair,int decal) {
		chaineEnClair = enClair;
		decalage = decal;
	}
	public String deCrypte() {
		return chaineEnClair;
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
			chaineEnClair.equals(null);
		}
		catch(NullPointerException e){
			System.out.println("la chaine est null");
		}
		finally {
			if(chaineEnClair == null)
				chaineEnClair = new String();
		}
			String chiffree = new String();
			for(int i=0; i<chaineEnClair.length(); i++) {
				chiffree += decaleCaractere(chaineEnClair.charAt(i),decalage);
			}
			return chiffree;
	}
}
