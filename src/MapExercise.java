import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
public class MapExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, ArrayList<String>> carModel = new HashMap<>();
		Scanner input = new Scanner(System.in);
		
		carModel.put("Ford", new ArrayList<String>());
		carModel.get("Ford").add("Focus");
		carModel.get("Ford").add("F-Series");
		carModel.get("Ford").add("Mustang");
		
		carModel.put("Toyota", new ArrayList<String>());
		carModel.get("Toyota").add("Prius");
		carModel.get("Toyota").add("Tacoma");
		carModel.get("Toyota").add("Highlander");

		carModel.put("Cheverolet", new ArrayList<String>());
		carModel.get("Cheverolet").add("Equinox");
		carModel.get("Cheverolet").add("Silverado");
		carModel.get("Cheverolet").add("Camaro");
		
		for(;;) {
			System.out.println("\nWhat car model are you looking for?");
			String response = input.nextLine();
			
			System.out.printf("Oh, you're looking for a %s?\n", response);
			System.out.printf("Our %s selection is right over here.\n", response);
			if(response.equalsIgnoreCase("Ford")) {
				System.out.printf("Here is a selection of our %s vehicles that we are currently carrying: " + carModel.get("Ford"), response);
			} else  if (response.equalsIgnoreCase("Toyota")) {
				System.out.printf("Here is a selection of our %s vehicles that we are currently carrying: " + carModel.get("Toyota"), response);
			} else if (response.equalsIgnoreCase("Cheverolet")) {
				System.out.printf("Here is a selection of our %s vehicles that we are currently carrying: " + carModel.get("Cheverolet"), response);
			} else {
				System.out.printf("Sorry, we do not carry a selection of %s in our inventory at this time.", response);
			}
		}
	}
}
