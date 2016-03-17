
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;
public class Person {
	
	public String nom;
	public GregorianCalendar dateNaissance;
	
	
	
	public Person(String nom, GregorianCalendar dateNaissance) {
		this.nom = nom;
		this.dateNaissance =  (GregorianCalendar)  dateNaissance.clone();
	}
	


    public int getAge()
    {
        GregorianCalendar today = new GregorianCalendar();
        return today.get (Calendar.YEAR) - dateNaissance.get (Calendar.YEAR);
    }
 
    public Date getBirthdate()
    {
        return dateNaissance.getTime();
    }
	

}
