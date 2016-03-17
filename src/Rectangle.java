
public class Rectangle {
	
	Point point;
	double largeur;
	double longueur;
	
	
	public Rectangle(Point point, double largeur, double longueur) {
		super();
		this.point = point;
		this.largeur = largeur;
		this.longueur = longueur;
	}

	public Rectangle fusion(Rectangle r2)
	{
		double z = Math.min (point.x, r2.point.x);
        double w = Math.min (point.y, r2.point.y);
        double l = Math.max (point.x + largeur, r2.point.x + r2.largeur) - z;
        double lg = Math.max (point.y + longueur, r2.point.y + r2.longueur) - w;
        return new Rectangle (new Point (z, w), l, lg);
	}
	@Override
	public String toString() {
		return "Rectangle [ point=(" + point.x +","+ point.y +")"+", largeur=" + largeur + ", longueur=" + longueur + "]";
	}
	

	
	

}
