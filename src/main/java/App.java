import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    System.out.println("How many guests will be attending?");
    String stringGuests = myConsole.readLine();

    System.out.println("What type of meal would you like to provide?" + '\n' + "Enter 1 for Chicken or 2 for Steak.");
    String stringMeal = myConsole.readLine();

    System.out.println("What type of beverages would you like to provide?" + '\n' + "Enter 1 for alcoholic or 2 for non-alcoholic.");
    String stringBeverage = myConsole.readLine();

    System.out.println("What type of entertainment would you like to provide?" + '\n' + "Enter 1 for a live band or 2 for a DJ.");
    String stringEntertainment = myConsole.readLine();

    Event name = new Event(Integer.parseInt(stringGuests), Integer.parseInt(stringMeal), Integer.parseInt(stringBeverage), Integer.parseInt(stringEntertainment));

    name.calculateCost();
    name.showMeal();
    name.showBeverage();
    name.showEntertainment();
    System.out.println('\n' + "INVOICE" + '\n' + "Requested number of guests: " + name.getGuests() + '\n' + "Your choices are:" + '\n' + "Meal: " + name.getMealChoice() + '\n' + "Beverages: " + name.getBeverageChoice() + '\n' + "Entertainment: " + name.getEntertainmentChoice());
    System.out.println("The estimated total cost of your event is " + "$"+ name.getTotal() + ".00" + '\n');
  }
}
