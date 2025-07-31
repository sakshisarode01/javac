package bmi;

public class BMI {
	 public static void main(String[] args) {
	        if(args.length != 4) {
	            System.out.println("error: please provide first name, last name, weight (in kg), and height (in meters)");
	            return;
	        }

	        String firstName = args[0];
	        String lastName = args[1];
	        double weight = Double.parseDouble(args[2]);
	        double height = Double.parseDouble(args[3]);
	        double bmi = weight / (height * height);

	        System.out.println("Name: " + firstName + " " + lastName);
	        System.out.println("BMI: "+bmi);
}
}
