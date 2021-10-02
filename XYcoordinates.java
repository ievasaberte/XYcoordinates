package XY;
import java.util.Scanner;
public class XYcoordinates {

	public static void main(String[] args) {
	//Get user inputs
		int x = getUserInputValue("Ievadiet x: ");
		int y = getUserInputValue("Ievadiet y: ");
		
		//Create result prefix
		String result = "Koordinatas [" + x + "; " + y + "] atrodas ";
		
		//Validate coordinates
		if ((x == -2 && y >= -4 && y <= 1)
			|| (x == 3 && y >= -4 && y <= 1)
			|| (y == -4 && x >= -2 && x <= 3)
			|| (y == 1 && x >= -2 && x <= 3)) {
			result += " uz figuras linijas!";
		}
		else if (x > -2 && x < 3 && y > -4 && y < 1)
			result += "figuras ieksiene!";
		else {
			result += "figuras arpuse!";
		}
		
		//Output result
		System.out.println(result);
	
	}
	
	private static int getUserInputValue (String prefix)
	{
		while (true)
		{
			System.out.print(prefix);
			Scanner scanner = new Scanner(System.in);
			if (scanner.hasNextInt()) {
				
				int inputValue = scanner.nextInt();
				return inputValue;
			}
			else
			{
				System.out.println("Ievadita vertiba nav vesels skaitlis");
				System.out.println();
			}
		}
	}
}
