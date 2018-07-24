package exemple;

public class Application {

	public static void main(String[] args) {
		//creation de l'instance de la classe Cuisine
		Cuisine cuisineSimplon = new Cuisine();
		Cuisine cuisinePierre = new Cuisine();
		Cuisine cuisineAthanasia = new Cuisine();
		cuisineSimplon.tasse = "tasseZou";
		cuisineSimplon.nom = "Zoulira";
		cuisineSimplon.prenom = "Zouzou";
		cuisineAthanasia.tasse = "truc";
		cuisineAthanasia.nom = "machin";
		cuisineAthanasia.prenom = "Athanasia";
		cuisinePierre.prenom = "Pierre";
		cuisinePierre.nom = "Brogard";
		cuisinePierre.tasse = "peter pan";
		String retourCafe = cuisineSimplon.machineCafe("arabica", "eau", "on/off");
		String retour2 = cuisinePierre.machineCafe("colombien", "cristalline", "on");
		String retour3 = cuisineAthanasia.machineCafe("bidule", "volvic", "marche");
		System.out.println(retourCafe);
		System.out.println(retour2);
		System.out.println(retour3);
		System.out.println(cuisinePierre.tasse); 
	}

}
