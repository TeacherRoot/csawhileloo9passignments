# csawhileloo9passignments
CSA While Loop Assignments
 # Assignment 1: Enter Your Pin
 Enter Your PIN
Type** in the following code, and get it to compile. This assignment will help you learn how to make a loop, so that you can repeat a section of code over and over again!

** Yes, type it in so that you can start to learn the format for coding a while loop. **

import java.util.Scanner;

public class EnterPIN
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int pin = 12345;

		System.out.println("WELCOME TO THE BANK OF MITCHELL.");
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
}
What You Should See
WELCOME TO THE BANK OF MITCHELL.
ENTER YOUR PIN: 90210

INCORRECT PIN. TRY AGAIN.
ENTER YOUR PIN: 11111

INCORRECT PIN. TRY AGAIN.
ENTER YOUR PIN: 12345

PIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.
Notice what happens when we type the correct PIN on the first try:

WELCOME TO THE BANK OF MITCHELL.
ENTER YOUR PIN: 12345

PIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.
What You Should Do on Your Own
Assignments turned in without these things will receive no credit.  Answer these questions using the SUBMIT button on Schoology.

How is a while loop similar to an if statement?
How is a while loop different from an if statement?
Inside the while loop, why isn't there an int in front of the line entry = keyboard.nextInt()?
Delete the line entry = keyboard.nextInt(); from inside the while loop. What happens? Why?
(Put the entry = keyboard.nextInt(); back before you turn in the assignment.)

# Assignment 2: Skittles

Anyhow, there’s a whole lot of Skittles, Mike and Ike’s, and M&M’s in that machine. Want to guess how many Skittles? Glad you said yes! Your task in this problem is to implement, in a file called skittles.java inside of your ~/workspace/unit1 directory (remember how?), a program that first picks a (pseudorandom) number between 0 and 1023, inclusive, and then asks you (the human) to guess what it is.[2] The program should keep asking you to guess until you guess right, at which point it should thank you for playing.

Where to begin?

Remember the Random Number assignments you did AND the loop assignments!

 Allow me to suggest that you begin by filling skittles.java with this code:

 
import java.io.*;
import java.util.*;

public class skittles
{
    public static void main(String[] args)
    {
         
         Scanner keyboard = new Scanner( System.in );
         int guess = 0;
         int tries = 0;
         
         Random rand = new Random(System.currentTimeMillis());
         int r = rand.nextInt(1024);
     }
} 
What should your program’s output be, once fully implemented? We leave your program’s personality entirely up to you, but below’s one possible design. Assume that the underlined text is what some user has typed.

username@ide50:~/workspace/unit1 $ java -cp . skittles 
O hai! I'm thinking of a number between 0 and 1023. What is it?
0
Nope! There are way more Skittles than that. Guess again.
1
Nope! There are way more Skittles than that. Guess again.
-1
Nope! Don't be difficult. Guess again.
1023
Nope! There are fewer Skittles than that. Guess again.
42
That's right! Nom nom nom.
Your program should end once the user has guessed right. 

Incidentally, know that you can generally force a program to quit prematurely by hitting ctrl-c. 

Because your program should be generating pseudorandom numbers it is what computer scientists call non-deterministic, the behavior is not predictable from run-to-run. Be sure to play your game extensively to make sure all the corner cases are ironed out!

# Assignment 3: Adding Values in a Loop
Adding Values in a Loop
Write a program that gets several integers from the user. Sum up all the integers they give you. Stop looping when they enter a 0. Display the total at the end.

You must use a while loop.

I will add up the numbers you give me.
Number: 6
The total so far is 6
Number: 9
The total so far is 15
Number: -3
The total so far is 12
Number: 2
The total so far is 14
Number: 0

The total is 14.
 

I will add up the numbers you give me.
Number: 1
The total so far is 1
Number: 2
The total so far is 3
Number: 3
The total so far is 6
Number: 4
The total so far is 10
Number: 5
The total so far is 15
Number: 0

The total is 15
