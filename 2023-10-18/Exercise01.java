
// // Read the following code and, without executing it rst, explain what it does.
// 1 java.util.Scanner scanner = new java.util.Scanner(System.in);
// 2 int currentYear = 2023;
// 3 System.out.print("When were you born (year)? ");
// 4 int birthYear = scanner.nextInt();
// 5 int ageAprox = currentYear - birthYear;
// 6 String result = (ageAprox > 17) ? "" : "not ";
// 7 System.out.println("It seems you are " + result + "an adult.");
// 1 

// line 1 - create a new Scanner object to take in user input
// line 2 instantiate a Integer variable called currentYear and assign the value of 2023 to it.

// line 3 - Print out in the console "When were you born?"

// line 4 - Instantiate an Integer variable called birthYear to take in the user input 

// line 5 - instantiate an Integer variable called ageAprox and the value is currentYear minus birthYear

// 6 Instatntiate a String variable called result, which value is based on a ternary operation of comparing whether ageAprox is greater than 17. if it is, result is an empty string, otherwise, it has a value of "not"

// print out in the console "It seems you are " plus the result pluse "an adult."

public class Exercise01 {

}
