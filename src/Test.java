import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test
{

	public static void main(String[] args) 
	{
		System.out.println("---------------1er exercice-------------------------");
	    Item i1 = new Item ("Vodka", "Une bouteille de Vodka", 5483918746738L, 75.5);
	    Item i2 = new Item ("Filet de citron 200g", 5473664615361L, 3.25);
	    System.out.println(i1.getPrice());
	    System.out.println(i2.getPrice(9));
	    
	    System.out.println("\n\n---------------2eme exercice-------------------------");
	    GregorianCalendar d = new GregorianCalendar (1985, Calendar.DECEMBER, 6);
	    Person p = new Person ("Sébastien Combéfis", d);
	 
	    System.out.println (p.getBirthdate());
	   
	    System.out.println (p.getAge());
	    
	 
	    System.out.println("\n\n---------------3eme exercice-------------------------");
	    Rectangle r1 = new Rectangle (new Point (10, 10), 40, 30);
	    Rectangle r2 = new Rectangle (new Point (-10, -10), 50, 30);
	    System.out.println (r1);
	    System.out.println (r2);
	    System.out.println (r1.fusion (r2));
	    
		 
	    System.out.println("\n\n---------------4eme exercice-------------------------");
	   Watch w = new Watch (23, 58);
	    w.printHour();
	 
	    w.tick();
	    w.printHour();
	 
	    w.tick (5);
	    w.printHour();
	    
	}
	
	
	
}
