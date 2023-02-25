import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
Date d=new Date();
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
 Date d2=sdf.parse(s);
 long d3=d2.getTime();
//System.out.println(d);
//System.out.println(d.getYear());
 long YearCore1=d3/(1000*60*60*24)/365;
long d1=d.getTime();
long YearCore=d1/(1000*60*60*24)/365;
long diff=YearCore1-YearCore;
if(diff<0) {
System.out.println((-1)*diff);
	}
else {
		System.out.println(diff);
	}
	}
}
