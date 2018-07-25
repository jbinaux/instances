package exerciceAnimal;

public class Application {

	public static void main(String[] args) {

		Animal chien = new Animal();
		
		chien.m.nombre = 4;
		chien.m.type = "pattes";
		chien.c.embranchement = "chordata";
		chien.c.classe = "mammalia";
		chien.c.ordre = "carnivora";
		chien.c.sousOrdre = "caniformia";
		chien.c.famille = "canidae";
		chien.c.genre = "canis";
		chien.c.espece = "canis lupus";
	}

}
