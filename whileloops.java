import java.util.Scanner;

public class WhileLoops {
  public static void main(String[] args) {
        System.out.println("Enter Your Pin");
        enterYourPin();


        System.out.println("Skittles");
        skittles();


        System.out.println("Adding Values in a Loop");
        addingValues();
  }

  public static void enterYourPin() {
      Scanner keyboard = new Scanner(System.in);
		  int pin = 12345;

		  System.out.println("WELCOME TO THE BANK OF ROOT.");
		  System.out.print("ENTER YOUR PIN: ");
		  int entry = keyboard.nextInt();

  		while ( entry != pin )
  		{
  			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
  			System.out.print("ENTER YOUR PIN: ");
  			entry = keyboard.nextInt();
  		}
  
  		System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
  }

  /*  Add your code for the skittles problem here in this method */
  public static void skittles() {
      Scanner keyboard = new Scanner(System.in);
  }

  /* Add your code for the adding values problem in this method */
  public static void addingValues() {
      Scanner keyboard = new Scanner(System.in);
  }
}
