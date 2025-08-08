package date;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateFormat {
	 public static void main(String[] args) {
	        Date date=new Date();
	        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	        String str = sdf.format(date);
	        System.out.println("Current date is: " + str);

	        sdf = new SimpleDateFormat("MM-dd-yyyy");
	        str = sdf.format(date);
	        System.out.println("Current date is: " + str);

	        sdf = new SimpleDateFormat("E MMMM dd hh:mm:ss z yyyy");
	        str = sdf.format(date);
	        System.out.println("Current date is: " + str);

	        sdf = new SimpleDateFormat("dd/MM/yy HH:mm:ss a Z");
	        str = sdf.format(date);
	        System.out.println("Current date is: " + str);

	        sdf = new SimpleDateFormat("hh:mm:ss");
	        str = sdf.format(date);
	        System.out.println("Current date is: " + str);

	        sdf = new SimpleDateFormat("w");
	        str = sdf.format(date);
	        System.out.println("Current week of year is: " + str);

	        sdf = new SimpleDateFormat("W");
	        str = sdf.format(date);
	        System.out.println("Current week of the month is: " + str);

	        sdf = new SimpleDateFormat("D");
	        str = sdf.format(date);
	        
}
}
