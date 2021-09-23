public class FahrenheitToCelcius
{
	//variable section
	static double fahrenheit;
	
	double celcius;
	
  public static void main(String args[])
  {
    // Printing out a welcoming message
    System.out.println("Welcome to my Temperature Converter.");
    System.out.println("\nProgram to convert Fahrenheit to Celcius.\n");
		
	  celcius = temperatureConverter(fahrenheit);  //parameter 

    // Printing out the complete answer
    System.out.println(fahrenheit + " Fahrenheit = " + celcius + " Celcius.");
    }
	
	public double temperatureConverter(double fahrenheitKoDataAudaiCha){
		return (fahrenheitKoDataAudaiCha − 32) × 5/9;
		
	}
}
