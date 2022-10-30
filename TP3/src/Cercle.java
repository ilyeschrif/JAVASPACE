public class Cercle {

	//les attributs
    private  Point centre = new Point();
	private float rayon;
	
	
	//constructeur 1
	public Cercle(float r,Point centre) {
		this.rayon=r;
		this.centre=centre;
	}
	
	
	//constructeur 2
	public Cercle(float r,float abs,float ord) {
		this.rayon=r;
		this.centre.setAbscisse(abs);
		this.centre.setOrdonne(ord);
		
		}
	 
	//constructeur 3
	public Cercle(Point centre,Point p) {
		this.rayon=(float) this.centre.distance(p);
		this.centre=centre;
	}
	
	public void setCentre(float abs,float ord){
		this.centre.setAbscisse(abs);
		this.centre.setOrdonne(ord);
	}
	
	public void setRayon(float r){
		if(r>0)this.rayon=r;
	}
	
	public Point getCentre(){
		return this.centre;
	}
	
	public float getRayon() {
		return this.rayon;
	}
	
	public void deplacer(float dx,float dy) {
		this.centre.abscisse+=dx;
		this.centre.ordonne+=dy;
	}
	
	public double perimetre() {
		return 2*Math.PI*this.rayon;
	}
	
	public double surface() {
		return Math.pow(this.rayon,2)*Math.PI;
	}
	
	public String toString() {
		return this.centre.toString()+" rayon :"+rayon+" perimetre :"+perimetre()+" surface :"+surface();
	}
	
	public boolean appartient(Point p) {
		return this.centre.distance(p)==rayon;
	}
	
	public boolean equals(Object o) {
	 if(o instanceof Cercle==false)return false;
	 return this.centre==((Cercle)o).centre&&this.rayon==((Cercle)o).rayon;
	}
	
}
