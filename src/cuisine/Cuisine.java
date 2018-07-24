package cuisine;

public class Cuisine {

	static Personne p1;
	static Personne p2;
	static Verre v1;
	static Verre v2;
	
	public static void main(String[] args) {

		p1 = new Personne();
		p1.prenom = "George";
		p1.nom = "Lucas";
		p1.email = "noreply@hotmail.com";
		p1.telephone = "0123456789";
		System.out.println(p1.prenom + " " + p1.nom);
		
		v1 = new Verre();
		v1.forme = "ovale";
		v1.l.nomLiquide = "coca";
		v1.l.quantite = 33;
		System.out.println(v1.forme);
		System.out.println(v1.l.nomLiquide);
	}

}
