package method;
class demo{
	void greetUser() {
		System.out.println("Welcome");
	}
	int square(int num) {
		System.out.println("The square of the number is:"+(num*num));
		return 0;
	}
	void showDetails(String name,int age) {
		System.out.println("Your Name:"+name);
		System.out.println("Your Age:"+age);
	}
double getPi() {
	double pi=3.14159;
		System.out.println("The value of Pi:"+pi);
		return 0;
	}
}
public class Method {
	public static void main(String[] args) {
		demo d1=new demo();
		d1.greetUser();
		d1.square(2);
		d1.showDetails("Sakshi",20);
		d1.getPi();
		}
}