
public class TestCercle {

	public static void main(String[] args) {
		
       Cercle c = new Cercle(2,1.2f,1.5f);
       Point p1 = new Point(1,1);
       Point p2 = new Point(3,3);
       
       
       System.out.println(c.toString());
       
       System.out.println(c.appartient(p1));
       System.out.println(c.appartient(p2));
       
       c.deplacer(-c.getCentre().getAbscisse(),-c.getCentre().getOrdonne());
       c.setRayon(1);
       
       System.out.println(c.toString());
       
    
       System.out.println(c.appartient(p1));
       System.out.println(c.appartient(p2));
       
       Point p = new Point(1,1);
       Cercle c1 = new Cercle(2,p);
       Cercle c2 = new Cercle(1,p);
       
       
       System.out.println(c1.toString());
       c2.deplacer(1,1);
       System.out.println(c1.toString());
       
       //equals 1
       /*Cercle c3 = new Cercle(2,2,2);
       Cercle c4 = new Cercle(2,1,1);
       
       System.out.println(c3.equals(c4));//false
       */
       
       //equals 2
       Cercle c3 = new Cercle(2,2,2);
       Cercle c4 = c3;
       
       System.out.println(c3.equals(c4));//trues
       
	}

}
