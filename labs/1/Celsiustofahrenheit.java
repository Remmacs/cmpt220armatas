
public class Celsiustofahrenheit {

	public static void main(String[] args) {
		
		//Put in celsius value
		
		double celsius = 25;
		
		//put a string here to show what number is being put in
		System.out.print("Enter a degree in Celsius: " + celsius);
		float fahrenheit = (float)((9.0/5) * celsius + 32); // conversion equation
		
		System.out.print(celsius + " Celsius is " + fahrenheit + " Fahrenheit");

	}

}
