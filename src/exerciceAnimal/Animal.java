package exerciceAnimal;

public class Animal {

	Membre m = new Membre();
	Classification c = new Classification();
	String environnement;
	String nourriture;
	double taille;
	String couleur;
	String peau;
	double poids;
	int esperanceDeVie;
	String modeReproduction;
	String modeDevie;
	int gestation;
	boolean sangChaud;
	boolean social;
	boolean hiberne;
	boolean dors;
	
	void seNourrir(String aliment)
	{
		
	}
	
	void dormir()
	{
		this.dors = true;
	}
	
	void seReveiller()
	{
		this.dors = false;
		this.hiberne = false;
	}
	
	void hiberner()
	{
		this.hiberne = true;
	}
	
	void seReproduire()
	{
		
	}
	
	int seDeplacer()
	{
		int distanceParcourue;
		distanceParcourue = (int) (Math.random() * 1000);
		return distanceParcourue;
	}

	public String getEnvironnement() {
		return environnement;
	}

	public void setEnvironnement(String environnement) {
		this.environnement = environnement;
	}

	public String getNourriture() {
		return nourriture;
	}

	public void setNourriture(String nourriture) {
		this.nourriture = nourriture;
	}

	public double getTaille() {
		return taille;
	}

	public void setTaille(double taille) {
		this.taille = taille;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public String getPeau() {
		return peau;
	}

	public void setPeau(String peau) {
		this.peau = peau;
	}

	public double getPoids() {
		return poids;
	}

	public void setPoids(double poids) {
		this.poids = poids;
	}

	public int getEsperanceDeVie() {
		return esperanceDeVie;
	}

	public void setEsperanceDeVie(int esperanceDeVie) {
		this.esperanceDeVie = esperanceDeVie;
	}

	public String getModeReproduction() {
		return modeReproduction;
	}

	public void setModeReproduction(String modeReproduction) {
		this.modeReproduction = modeReproduction;
	}

	public String getModeDevie() {
		return modeDevie;
	}

	public void setModeDevie(String modeDevie) {
		this.modeDevie = modeDevie;
	}

	public int getGestation() {
		return gestation;
	}

	public void setGestation(int gestation) {
		this.gestation = gestation;
	}

	public boolean isSangChaud() {
		return sangChaud;
	}

	public void setSangChaud(boolean sangChaud) {
		this.sangChaud = sangChaud;
	}

	public boolean isSocial() {
		return social;
	}

	public void setSocial(boolean social) {
		this.social = social;
	}

	public boolean isHiberne() {
		return hiberne;
	}

	public void setHiberne(boolean hiberne) {
		this.hiberne = hiberne;
	}

	public boolean isDors() {
		return dors;
	}

	public void setDors(boolean dors) {
		this.dors = dors;
	}
	
	
}
