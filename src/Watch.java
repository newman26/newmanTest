
public class Watch {
int heure;
int minute;
public Watch() {
	super();
	this.heure = 00;
	this.minute = 00;
}
public Watch(int heure, int minute) {
	super();
	this.heure = heure;
	this.minute = minute;
}

public void  printHour()
{
	System.out.println ((heure < 10 ? "0" : "")+heure+"h"+(minute < 10 ? "0" : "")+minute);
}

public void tick()
{
	int x=minute+1;
	int y=heure;
	if (x>=60){
		y =heure+1;
		x=x-60;
	}
	System.out.println ((y < 10 ? "0" : "")+y+"h"+ (x < 10 ? "0" : "")+x);
}
public void tick(int n){
	int x=minute+n;
	int y=heure;
	if (x>=60){
		y =heure+1;
		x=x-60;
	}
	System.out.println ((y < 10 ? "0" : "")+y+"h"+ (x < 10 ? "0" : "")+x);
	
}
}
