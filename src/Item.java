
public class Item {
	public String nomArticle, description;
	double identifiant;
	double prix;
	

	public Item(String description, double identifiant, double prix) {
		super();
		this.description = description;
		this.identifiant = identifiant;
		this.prix = prix;
	}

	public Item(String nomArticle, String description, double identifiant, double prix) {
		super();
		this.nomArticle = nomArticle;
		this.description = description;
		this.identifiant = identifiant;
		this.prix = prix;
	}

	public double getPrice() {
		return prix;
	}

	public double getPrice(int q) {
		if (q >= 10) {
			return prix * 0.95;

		} else {
			return prix;
		}
	}

}
