
public class Point {

	//les attributs
	public float abscisse;
	public float ordonne;
	
	//constructeur 1
	public Point() {
		
	}
	
	//constructeur 2
	public Point(float abs,float ord) {
		this.abscisse=abs;
		this.ordonne=ord;
	}
	
	
	public void setAbscisse(float abs) {
		this.abscisse=abs;
	}
	
	public void setOrdonne(float ord) {
		this.ordonne=ord;
	}
	
	
	public float getAbscisse() {
		return this.abscisse;
	}
	
	public float getOrdonne() {
		return this.ordonne;
	}
	
	public String toString() {
		return "abscisse : "+abscisse+" ordonne :"+ordonne;
	}
	
	public void deplacer(float dx,float dy) {
		this.abscisse+=dx;
		this.ordonne+=dy;
	}
	
	public boolean equals(Point p) {
		return this.abscisse==p.abscisse&&this.ordonne==p.ordonne;
	}
	
	public double distance(Point p) {
		return Math.sqrt(Math.pow(p.abscisse-this.abscisse,2)+Math.pow(p.ordonne-this.ordonne,2));
	}
	
	
}
