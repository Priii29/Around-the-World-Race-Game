/******************************************************************************
Priyanshi Ramani
ICS3U-6A
April 8,2021
The user is a driver in an ‘around the world’ rally race.
GAME NAME: Worldwide Rally Race (WRR)
*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
		Scanner keyedInput = new Scanner (System.in);
		
		// VARIABLES //
		int points = 0; // stores points after every choice
		int turkeyChoice1 = 0; 
		int randomNum = (int)Math.round(Math.random()*4+1); //generates random number from 1-5 that user has to guess
		int magicPoints = (int)Math.round(Math.random()*9+1); //generates random number from 1-10 that is added to points
		int [ ] numbers = {2, 3, 6, 10, 15, 17, 19, 20, 23, 25}; //math calculation numbers
		int saharaChoice3;
		
		char turkeyChoice2;
		char turkeyChoice3;
		
		char indiaChoice1;
		char indiaChoice2; 
		char indiaChoice3;
		
		char saharaChoice1;
		char saharaChoice2;
		
		char canadaChoice1;
		char canadaChoice2;
		char canadaChoice3;
		
		char amazonChoice1;
		char amazonChoice2;
		char amazonChoice3;
		
		char initialChoice;
		char magicBox;
		char restartGame; //restart choice
		
		String goodChoice = ("Great Job!"); //displayed if user makes the right choice
		String badChoice = ("Hard Luck!"); //displayed if user makes the wrong choice
		String invalid = ("Invalid Response!"); //displayed if user enters an invalid response 
		
		
		// INTRODUCTION OF PLOT//
		do 
		{
		   System.out.println("Welcome to WRR (Worldwide Rally Race) 2021! This year drivers will compete in 5 different locations packed with some of the toughest routes on Earth!");
		   System.out.println("Locations: Twisty Turkey, Rainy India, Sandy Sahara, Snowy Canada, Amazing Amazon.");
		   
		   System.out.println(" "); //line space, to make text readable to user
		   System.out.println("Note: Throughout the game, please press the alphabet you wish to choose. For eg. \"A\" to select option [A].");
		   System.out.println("---------------------"); //design element to emphasize the message below
		   System.out.println("*USE CAPITAL LETTERS*"); //makes clear to user what to input
		   System.out.println("---------------------"); //design element to emphasize the message above
		   
		   // INITIAL DECISION //
		   System.out.println(" ");
		   System.out.println("Let's start by choosing your car! This choice significantly affects your performance in the race.");
		   System.out.println("[A] An ideal rally race car (-5 points)");
		   System.out.println("[B] An average car (+5 points)");
		   initialChoice = keyedInput.next ().charAt (0); //user input
		   
		   // PLOT LINE "A" //
		   if (initialChoice == 'A')
		   {
		       points = points - 5; //points decreased by 5 for choosing "A"
		       
		       System.out.println(" ");
		       System.out.println("Nice car! Now let's go to the first location. Twisty Turkey, here we come!");
		       System.out.println("3... 2... 1... GO!");
		       
		       // TURKEY CHOICE 1 //
		       System.out.println(" ");
		       System.out.println("Hmm... looks like you need a headstart.");
		       System.out.println("Quick! Guess a number from 1-5.");
		       turkeyChoice1 = keyedInput.nextInt (); 
		       
		           if (randomNum == turkeyChoice1) //if user guesses correctly, they get 3 points 
		           {
		               System.out.println(goodChoice+" +3");
		               points = points + 3; 
		           }
		           else
		           {
		               System.out.println(badChoice); //if user guesses incorrectly, points stay the same
		               points = points + 0; 
		               
		           }
		       
		       // TURKEY CHOICE 2 //
		       do {
		       System.out.println(" ");
		       System.out.println("Moving on, as you drive at full speed, you see some crazy turns in the road ahead!");
		       System.out.println("[A] Turn left ");
		       System.out.println("[B] Turn sharp left");
		       System.out.println("[C] Turn right");
		       System.out.println("[D] Turn sharp right");
		       turkeyChoice2 = keyedInput.next ().charAt (0); 
		       
		           switch (turkeyChoice2) {
		               case 'A': //option A 
		                   System.out.println(goodChoice+" +1"); 
		                   points = points + 1; //points increase by 1 for making a good choice
		                   break;
		               case 'B': //option B
		                   System.out.println("Since you have an ideal race car, you can handle this turn!");
		                   System.out.println(goodChoice+" +3");
		                   points = points + 3; //points increase by 3 for making an excellent choice
		                   break; 
		               case 'C': //option C
		                   System.out.println(badChoice);
		                   points = points + 0; //points stay the same for making a bad choice
		                   break;
		               case 'D': //option D
		                   System.out.println(badChoice);
		                   points = points + 0; //points stay the same for making a bad choice
		                   break;
		               default:
		                   System.out.println(invalid); //if user does not input "A" or "B" or "C" or "D" it is invalid
		                   break;
		           }
		       } while (turkeyChoice2 != 'A' && turkeyChoice2 != 'B' && turkeyChoice2 != 'C' && turkeyChoice2 != 'D'); 
		       //this loop will be presented to user again until they input a valid response
		       
		       // TURKEY CHOICE 3 // 
		       do {
		       System.out.println(" ");
		       System.out.println("Oh no! Another turn, quick!");
		       System.out.println("[A] Turn left ");
		       System.out.println("[B] Turn sharp left");
		       System.out.println("[C] Turn right");
		       System.out.println("[D] Turn sharp right");
		       turkeyChoice3 = keyedInput.next ().charAt (0);
		       
		           switch (turkeyChoice3) {
		               case 'A':
		                   System.out.println(badChoice);
		                   points = points + 0;
		                   break;
		               case 'B':
		                   System.out.println(badChoice);
		                   points = points + 0;
		                   break; 
		               case 'C':
		                   System.out.println(goodChoice+" +3");
		                   points = points + 3;
		                   break;
		               case 'D':
		                   System.out.println(goodChoice+" +1");
		                   points = points + 1;
		                   break;
		               default:
		                   System.out.println(invalid);
		                   break;
		           }
		       } while (turkeyChoice3 != 'A' && turkeyChoice3 != 'B' && turkeyChoice3 != 'C' && turkeyChoice3 != 'D');
		       
		       // END OF TWISTY TURKEY RACE //
		       System.out.println(" ");
		       System.out.println("Amazing finish!");
		       System.out.println("Current Points: "+points); //total points collected through the choices made, diplayed after end of each race 
		       System.out.println("Next Location: Rainy India. Are you up for this challenge?"); //next location introduced
		       System.out.println("3... 2... 1... GO!");
		       
		       // INDIA CHOICE 1 //
		       do {
		       System.out.println(" "); 
		       System.out.println("Oof! You have a severe leg injury. Your friend has offered help though!");
		       System.out.println("[A] Take the help (-2 points)");
		       System.out.println("[B] Sit this race out (+2 points)");
		       indiaChoice1 = keyedInput.next ().charAt (0);
		       
		           switch (indiaChoice1) {
		               case 'A': //option A allows user to play the india race
		                   System.out.println("What a nice friend!");
		                   points = points - 2; //points decreased by 2 for choosing "A"
		                   
		                   // INDIA CHOICE 2 //
		                   do {
		                   System.out.println(" ");
		                   System.out.println("Race begins!");
		                   System.out.println("As you are busy admiring the beautiful location in the passenger seat though, your car gets stuck in a large dirt puddle!");
		                   System.out.println("[A] Advise your friend to get out and push the car");
		                   System.out.println("[B] Get help from your fans");
		                   System.out.println("[C] Spin those tires, can your car take it?");
		                   indiaChoice2 = keyedInput.next ().charAt (0);
		                        
		                        switch (indiaChoice2) {
		                            case 'A':
		                                System.out.println(goodChoice+" +1");
		                                points = points + 1;
		                                break;
		                            case 'B':
		                                System.out.println(badChoice);
		                                points = points + 0;
		                                break; 
		                            case 'C':
		                                System.out.println("Yes! Your car is built for this!");
		                                System.out.println(goodChoice+" +3");
		                                points = points + 3;
		                                break;
		                            default:
		                                System.out.println(invalid);
		                                break;
		                            }
		                   } while (indiaChoice2 != 'A' && indiaChoice2 != 'B' && indiaChoice2 != 'C');
		                   
		                   // INDIA CHOICE 3 //
		                   do {   
		                   System.out.println(" ");
		                   System.out.println("Let's move ahead! Your opponents are overtaking you!");
		                   System.out.println("Oh no. There's a dangerous waterfall ahead on the road! Advise your friend to...");
		                   System.out.println("[A] Go around the waterfall, but off the race course");
		                   System.out.println("[B] Keep on the course, take some damage");
		                   System.out.println("[C] Go off-course and also take a shortcut");
		                   indiaChoice3 = keyedInput.next ().charAt (0);
		                        
		                        switch (indiaChoice3) {
		                            case 'A':
		                                System.out.println(goodChoice+" +1");
		                                points = points + 1;
		                                break;
		                            case 'B':
		                                System.out.println("Intentionally going off-course is against the rules! You are better than that.");
		                                System.out.println(goodChoice+" +3");
		                                points = points + 3;
		                                break; 
		                            case 'C':
		                                System.out.println(badChoice);
		                                points = points + 0;
		                                break;
		                            default:
		                                System.out.println(invalid);
		                                break;
		                            }
		                   } while (indiaChoice3 != 'A' && indiaChoice3 != 'B' && indiaChoice3 != 'C');
		                   
		                   System.out.println(" ");
		                   System.out.println("Amazing finish!");
		                   break;
		               case 'B': //(indiaChoice1) option B allows user to skip the india race 
		                   System.out.println(" ");
		                   System.out.println("It's ok! Rest up for the next race!");
		                   points = points + 2; //(indiaChoice1) points increase by 2 for choosing "B"
		                   break; 
		               default:
		                   System.out.println(invalid);
		                   break;
		           }
		       } while (indiaChoice1 != 'A' && indiaChoice1 != 'B'); //while loop for indiaChoice1
		       
		       // END OF RAINY INDIA RACE //   
		       System.out.println("Current Points: "+points); 
		       System.out.println("Next Location: Sandy Sahara. Hope your leg has healed!");
		       System.out.println("3... 2... 1... GO!");
		       
		       // SAHARA CHOICE 1 //
		       do {
		       System.out.println(" ");
		       System.out.println("Race has begun! You are driving full speed, overtaking your opponents!");
		       System.out.println("All is well, until you see a sandstorm coming right towards you!");
		       System.out.println("[A] Keep going with your speed, risk crashing with opponents and take damage");
		       System.out.println("[B] Wait it out, hope everyone else waits as well");
		       saharaChoice1 = keyedInput.next ().charAt (0);
		       
		       switch (saharaChoice1) {
		               case 'A':
		                   System.out.println("Hey, it's a pretty rough game! Come on!");
		                   System.out.println(goodChoice+" +1");
		                   points = points + 1;
		                   break;
		               case 'B':
		                   System.out.println(badChoice);
		                   points = points + 0;
		                   break;
		               default:
		                   System.out.println(invalid);
		                   break;
		           }
		       } while (saharaChoice1 != 'A' && saharaChoice1 != 'B');
		       
		       // SAHARA CHOICE 2 //
		       do {
		       System.out.println(" ");
		       System.out.println("Phew! Survived the sandstorm outside... but what about the one in your car?");
		       System.out.println("Your partner driver has been bribed to distract you! The finish line is in sight!");
		       System.out.println("[A] Stop the car and force him out");
		       System.out.println("[B] Just stay focused till you reach the finish line");
		       saharaChoice2 = keyedInput.next ().charAt (0);
		       
		       switch (saharaChoice2) {
		               case 'A':
		                   System.out.println(badChoice);
		                   points = points + 0;
		                   break;
		               case 'B':
		                   System.out.println(goodChoice+" +1");
		                   points = points + 1;
		                   break;
		               default:
		                   System.out.println(invalid);
		                   break;
		           }
		       } while (saharaChoice2 != 'A' && saharaChoice2 != 'B');
		       
		       // SAHARA CHOICE 3 //
		       System.out.println(" ");
		       System.out.println("Oh look! You have discovered a treasure chest.");
		       System.out.println("Solve this math problem to gain free points!");
		            for (int i = 0; i<=9; i= i + 1) //"for" loop that displays the ten numbers stored in the "numbers" array
		            {
		                System.out.println(numbers[i]); //displays the ten numbers to user
		            }
		       System.out.println("Add up all the prime numbers and divide by 8"); 
		       System.out.println("Subtract this number from 10"); //calculation to do 
		       System.out.println("What's the answer?");
		       saharaChoice3 = keyedInput.nextInt ();
		       
		       if (saharaChoice3 == 2) //if user inputs "2" they get 3 points 
		       {
		           System.out.println(goodChoice+" +3");
		           points = points + 3;
		       }
		       else //if user inputs any other value, points stay the same 
		       {
		           System.out.println(badChoice);
		           points = points + 0;
		       }
		       
		       // END OF SANDY SAHARA // 
		       System.out.println(" ");
		       System.out.println("Amazing finish!");
		       System.out.println("Current Points: "+points);
		       System.out.println("Next Location: Snowy Canada. Are you ready to race in -20 degree temperatures?");
		       System.out.println("3... 2... 1... GO!");
		       
		       // CANADA CHOICE 1 //
		       do {
		       System.out.println(" ");
		       System.out.println("Awesome start! But you see a steep snowy hill ahead!");
		       System.out.println("[A] Speed up");
		       System.out.println("[B] Keep the same pace");
		       canadaChoice1 = keyedInput.next ().charAt (0);
		       
		       switch (canadaChoice1) {
		               case 'A':
		                   System.out.println(goodChoice+" +1");
		                   points = points + 1;
		                   break;
		               case 'B':
		                   System.out.println(badChoice);
		                   points = points + 0;
		                   break;
		               default:
		                   System.out.println(invalid);
		                   break;
		           }
		       } while (canadaChoice1 != 'A' && canadaChoice1 != 'B');
		       
		       // CANADA CHOICE 2 //
		       do {
		       System.out.println(" ");
		       System.out.println("Snow avalanches!");
		       System.out.println("[A] Steer the wheel right, then left");
		       System.out.println("[B] Steer the wheel left, then right");
		       canadaChoice2 = keyedInput.next ().charAt (0);
		       
		       switch (canadaChoice2) {
		               case 'A':
		                   System.out.println(badChoice);
		                   points = points + 0;
		                   break;
		               case 'B':
		                   System.out.println(goodChoice+" +1");
		                   points = points + 1;
		                   break;
		               default:
		                   System.out.println(invalid);
		                   break;
		           }
		       } while (canadaChoice2 != 'A' && canadaChoice2 != 'B');
		       
		       // CANADA CHOICE 3 // 
		       do {  
		       System.out.println(" ");
		       System.out.println("The end is in sight! You can overtake your opponent, but speeding up may cause a skid.");
		       System.out.println("[A] Speed up anyway");
		       System.out.println("[B] Keep the same pace");
		       canadaChoice3 = keyedInput.next ().charAt (0);
		       
		       switch (canadaChoice3) {
		               case 'A':
		                   System.out.println("Yes! Your car can handle skids!");
		                   System.out.println(goodChoice+" +1");
		                   points = points + 1;
		                   break;
		               case 'B':
		                   System.out.println(badChoice);
		                   points = points + 0;
		                   break;
		               default:
		                   System.out.println(invalid);
		                   break;
		           }
		       } while (canadaChoice3 != 'A' && canadaChoice3 != 'B');
		       
		       // END OF SNOWY CANADA RACE //
		       System.out.println(" ");
		       System.out.println("Amazing finish!");
		       System.out.println("Current Points: "+points);
		       System.out.println("Last Location: Amazing Amazon. Rally is coming to an end!");
		       System.out.println("3... 2... 1... GO!");
		       
		       // AMAZON CHOICE 1 //
		       do {
		       System.out.println(" ");
		       System.out.println("Oh no, an opponent has sabotaged your car!");
		       System.out.println("[A] Report the opponent and fix your car");
		       System.out.println("[B] Sabotage opponent's car, hope you get away with it");
		       amazonChoice1 = keyedInput.next ().charAt (0);
		       
		       switch (amazonChoice1) {
		               case 'A':
		                   System.out.println(goodChoice+" +1");
		                   points = points + 1;
		                   break;
		               case 'B':
		                   System.out.println(badChoice);
		                   points = points + 0;
		                   break;
		               default:
		                   System.out.println(invalid);
		                   break;
		           }
		       } while (amazonChoice1 != 'A' && amazonChoice1 != 'B');
		       
		       // AMAZON CHOICE 2 //
		       do {
		       System.out.println(" ");
		       System.out.println("Let the last race begin!");
		       System.out.println("Oh wait, there are turtles crossing ahead!");
		       System.out.println("[A] Go off-course, save the turtles");
		       System.out.println("[B] Speed up, hope you don't hit them");
		       amazonChoice2 = keyedInput.next ().charAt (0);
		       
		       switch (amazonChoice2) {
		               case 'A':
		                   System.out.println(goodChoice+" +1");
		                   points = points + 1;
		                   break;
		               case 'B':
		                   System.out.println(badChoice);
		                   points = points + 0;
		                   break;
		               default:
		                   System.out.println(invalid);
		                   break;
		           }
		       } while (amazonChoice2 != 'A' && amazonChoice2 != 'B');
		       
		       // AMAZON CHOICE 3 //
		       do {
		       System.out.println(" ");
		       System.out.println("Ah! The finish line is in sight at last!");
		       System.out.println("Beep beep, you are low on fuel!");
		       System.out.println("[A] Speed up");
		       System.out.println("[B] Slow down");
		       amazonChoice3 = keyedInput.next ().charAt (0);
		       
		       switch (amazonChoice3) {
		               case 'A':
		                   System.out.println(goodChoice+" +1");
		                   points = points + 1;
		                   break;
		               case 'B':
		                   System.out.println(badChoice);
		                   points = points + 0;
		                   break;
		               default:
		                   System.out.println(invalid);
		                   break;
		           }
		       } while (amazonChoice3 != 'A' && amazonChoice3 != 'B');
		       
		       // END OF AMAZING AMAZON RACE //    
		       System.out.println(" ");
		       System.out.println("Amazing finish!");
		       System.out.println("Current Points: "+points);
		       
		       // MAGIC BOX (FREE POINTS) //
		       do {
		       System.out.println(" ");
		       System.out.println("WAIT! Before we get to the final scores...");
		       System.out.println("Open this magic box for some free points!");
		       System.out.println("Press \"A\"");
		       magicBox = keyedInput.next ().charAt (0);
		       
		       switch (magicBox) {
		               case 'A': //when user inputs "A" as instructed, a random number of points are added to their current points
		                   points = points + magicPoints; //random points (1-10) added to user's current points
		                   break;
		               default:
		                   System.out.println(invalid); 
		                   break;
		           }
		       } while (magicBox != 'A'); //if user inputs any other key, above instructions will be displayed again
		       
		       System.out.println(" ");
		       System.out.println("Current Points: "+points); //points displayed after free points are added
		       System.out.println(" ");
		       System.out.println("-----------------------------------"); //design element to emphasize the winning or losing message below
		       
		       if (points >= 20) //if points collected are 20 or more than 20, user came 1st place
		       {
		           System.out.println("CONGRATULATIONS! YOU WIN 1ST PLACE!"); //winning message
		       }
		       
		       else if (points >= 15) //if points collected are between 15-19, user came 2nd place
		       {
		           System.out.println("CONGRATULATIONS! YOU WIN 2ND PLACE!"); //winning message
		       }
		       
		       else if (points >= 10) //if points collected are between 10-14, user came 3rd place
		       {
		           System.out.println("CONGRATULATIONS! YOU WIN 3RD PLACE!"); //winning message
		       }
		       
		       else //if points collected are 9 or less than 9, user lost the rally race
		       {
		           System.out.println("SORRY! YOU LOSE."); //losing message
		       }
		       
		       System.out.println("-----------------------------------"); //design element to emphasize the winning or losing message above
		   }
		   
		   
		     //---------------------------------------------------------------------------------------------//
		    //---------------------------------------------------------------------------------------------//
		   
		  
		  // PLOT LINE "B" // 
		  if (initialChoice == 'B')
		   {
		       points = points + 5; //points increased by 5 for choosing "B" as initial decision
		       
		       System.out.println(" ");
		       System.out.println("Nice car! Now let's go to the first location. Twisty Turkey, here we come!");
		       System.out.println("3... 2... 1... GO!");
		       
		       // TURKEY CHOICE 1 //
		       System.out.println(" ");
		       System.out.println("Hmm... looks like you need a headstart.");
		       System.out.println("Quick! Guess a number from 1-5.");
		       turkeyChoice1 = keyedInput.nextInt ();
		       
		           if (randomNum == turkeyChoice1) //if user guesses correctly, they get 3 points
		           {
		               System.out.println(goodChoice+" +3");
		               points = points + 3;
		           }
		           else
		           {
		               System.out.println(badChoice); //if user guesses incorrectly, points stay the same
		               points = points + 0;
		               
		           }
		       
		       // TURKEY CHOICE 2 //
		       do {
		       System.out.println(" ");
		       System.out.println("Moving on, as you drive at full speed, you see some crazy turns in the road ahead!");
		       System.out.println("[A] Turn left ");
		       System.out.println("[B] Turn sharp left");
		       System.out.println("[C] Turn right");
		       System.out.println("[D] Turn sharp right");
		       turkeyChoice2 = keyedInput.next ().charAt (0);
		       
		           switch (turkeyChoice2) {
		               case 'A': //option A
		                   System.out.println(goodChoice+" +1");
		                   points = points + 1; //points increase by 1 for making a good choice
		                   break;
		               case 'B': //option B
		                   System.out.println("Your average car can't handle this turn, but your driving skills made it work!");
		                   System.out.println(goodChoice+" +1"); //points increase by 1 for making a good choice
		                   points = points + 1;
		                   break; 
		               case 'C': //option C
		                   System.out.println(badChoice);
		                   points = points + 0; //points stay the same for making a bad choice
		                   break;
		               case 'D': //option D
		                   System.out.println(badChoice);
		                   points = points + 0; //points stay the same for making a bad choice
		                   break;
		               default:
		                   System.out.println(invalid); //if user does not input "A" or "B" or "C" or "D" it is invalid
		                   break;
		           }
		       } while (turkeyChoice2 != 'A' && turkeyChoice2 != 'B' && turkeyChoice2 != 'C' && turkeyChoice2 != 'D');
		       //this loop will be presented to user again until they input a valid response
		       
		       // TURKEY CHOICE 3 // 
		       do {
		       System.out.println(" ");
		       System.out.println("Oh no! Another turn, quick!");
		       System.out.println("[A] Turn left ");
		       System.out.println("[B] Turn sharp left");
		       System.out.println("[C] Turn right");
		       System.out.println("[D] Turn sharp right");
		       turkeyChoice3 = keyedInput.next ().charAt (0);
		       
		           switch (turkeyChoice3) {
		               case 'A':
		                   System.out.println(badChoice);
		                   points = points + 0;
		                   break;
		               case 'B':
		                   System.out.println(badChoice);
		                   points = points + 0;
		                   break; 
		               case 'C':
		                   System.out.println(goodChoice+" +1");
		                   points = points + 1;
		                   break;
		               case 'D':
		                   System.out.println(goodChoice+" +1");
		                   points = points + 1;
		                   break;
		               default:
		                   System.out.println(invalid);
		                   break;
		           }
		       } while (turkeyChoice3 != 'A' && turkeyChoice3 != 'B' && turkeyChoice3 != 'C' && turkeyChoice3 != 'D');
		       
		       // END OF TWISTY TURKEY RACE //
		       System.out.println(" ");
		       System.out.println("Amazing finish!");
		       System.out.println("Current Points: "+points);
		       System.out.println("Next Location: Rainy India. Are you up for this challenge?");
		       System.out.println("3... 2... 1... GO!");
		       
		       // INDIA CHOICE 1 //
		       do {
		       System.out.println(" ");
		       System.out.println("Oof! You have a severe leg injury. Your friend has offered help though!");
		       System.out.println("[A] Take the help (-2 points)");
		       System.out.println("[B] Sit this race out (+2 points)");
		       indiaChoice1 = keyedInput.next ().charAt (0);
		       
		           switch (indiaChoice1) {
		               case 'A': //option A allows user to play the india race
		                   System.out.println("What a nice friend!");
		                   points = points - 2; //points decreased by 2 for choosing "A"
		                   
		                    // INDIA CHOICE 2 //
		                   do {
		                   System.out.println(" ");
		                   System.out.println("Race begins!");
		                   System.out.println("As you are busy admiring the beautiful location in the passenger seat though, your car gets stuck in a large dirt puddle!");
		                   System.out.println("[A] Advise your friend to get out and push the car");
		                   System.out.println("[B] Get help from your fans");
		                   System.out.println("[C] Spin those tires, can your car take it?");
		                   indiaChoice2 = keyedInput.next ().charAt (0);
		                        
		                        switch (indiaChoice2) {
		                            case 'A':
		                                System.out.println(goodChoice+" +1");
		                                points = points + 1;
		                                break;
		                            case 'B':
		                                System.out.println(goodChoice+" +1");
		                                points = points + 1;
		                                break; 
		                            case 'C':
		                                System.out.println("No! Your car isn't built for this, sorry!");
		                                System.out.println(badChoice+" -1");
		                                points = points - 1; //points decrease by 1 for making a very bad choice 
		                                break;
		                            default:
		                                System.out.println(invalid);
		                                break;
		                            }
		                   } while (indiaChoice2 != 'A' && indiaChoice2 != 'B' && indiaChoice2 != 'C');
		                   
		                   // INDIA CHOICE 3 //     
		                   do {   
		                   System.out.println(" ");
		                   System.out.println("Let's move ahead! Your opponents are overtaking you!");
		                   System.out.println("Oh no. There's a dangerous waterfall ahead on the road! Advise your friend to...");
		                   System.out.println("[A] Go around the waterfall, but off the race course");
		                   System.out.println("[B] Keep on the course, take some damage");
		                   System.out.println("[C] Go off-course and also take a shortcut");
		                   indiaChoice3 = keyedInput.next ().charAt (0);
		                        
		                        switch (indiaChoice3) {
		                            case 'A':
		                                System.out.println(goodChoice+" +1");
		                                points = points + 1;
		                                break;
		                            case 'B':
		                                System.out.println("Your car can't take any damage, sorry!");
		                                System.out.println(badChoice+" -1");
		                                points = points - 1; //points decrease by 1 for making a very bad choice
		                                break; 
		                            case 'C':
		                                System.out.println(goodChoice+" +1");
		                                points = points + 1;
		                                break;
		                            default:
		                                System.out.println(invalid);
		                                break;
		                            }
		                   } while (indiaChoice3 != 'A' && indiaChoice3 != 'B' && indiaChoice3 != 'C');
		                   
		                   System.out.println(" ");
		                   System.out.println("Amazing finish!");
		                   break;
		               case 'B': //(indiaChoice1) option B allows user to skip the india race
		                   System.out.println(" ");
		                   System.out.println("It's ok! Rest up for the next race!");
		                   points = points + 2; //(indiaChoice1) points increase by 2 for choosing "B"
		                   break; 
		               default:
		                   System.out.println(invalid);
		                   break;
		           }
		       } while (indiaChoice1 != 'A' && indiaChoice1 != 'B'); //while loop for indiaChoice1
		       
		       // END OF RAINY INDIA RACE //
		       System.out.println("Current Points: "+points);
		       System.out.println("Next Location: Sandy Sahara. Hope your leg has healed!");
		       System.out.println("3... 2... 1... GO!");
		       
		       // SAHARA CHOICE 1 // 
		       do {
		       System.out.println(" ");
		       System.out.println("Race has begun! You are driving full speed, overtaking your opponents!");
		       System.out.println("All is well, until you see a sandstorm coming right towards you!");
		       System.out.println("[A] Keep going with your speed, risk crashing with opponents and take damage");
		       System.out.println("[B] Wait it out, hope everyone else waits as well");
		       saharaChoice1 = keyedInput.next ().charAt (0);
		       
		       switch (saharaChoice1) {
		               case 'A':
		                   System.out.println("Your car can't take any damage, sorry!");
		                   System.out.println(badChoice+" -1");
		                   points = points - 1; //points decrease by 1 for making a very bad choice
		                   break;
		               case 'B':
		                   System.out.println(goodChoice+" +1");
		                   points = points + 1;
		                   break;
		               default:
		                   System.out.println(invalid);
		                   break;
		           }
		       } while (saharaChoice1 != 'A' && saharaChoice1 != 'B');
		       
		       // SAHARA CHOICE 2 //
		       do {
		       System.out.println(" ");
		       System.out.println("Phew! Survived the sandstorm outside... but what about the one in your car?");
		       System.out.println("Your partner driver has been bribed to distract you! The finish line is in sight!");
		       System.out.println("[A] Stop the car and force him out");
		       System.out.println("[B] Just stay focused till you reach the finish line");
		       saharaChoice2 = keyedInput.next ().charAt (0);
		       
		       switch (saharaChoice2) {
		               case 'A':
		                   System.out.println(badChoice);
		                   points = points + 0;
		                   break;
		               case 'B':
		                   System.out.println(goodChoice+" +1");
		                   points = points + 1;
		                   break;
		               default:
		                   System.out.println(invalid);
		                   break;
		           }
		       } while (saharaChoice2 != 'A' && saharaChoice2 != 'B');
		       
		       // SAHARA CHOICE 3 //
		       System.out.println(" ");
		       System.out.println("Oh look! You have discovered a treasure chest.");
		       System.out.println("Solve this math problem to gain free points!");
		            for (int i = 0; i<=9; i= i + 1) //"for" loop that displays the ten numbers stored in the "numbers" array
		            {
		                System.out.println(numbers[i]); //displays the ten numbers to user
		            }
		       System.out.println("Add up all the prime numbers and divide by 8");
		       System.out.println("Subtract this number from 10");//calculation to do 
		       System.out.println("What's the answer?");
		       saharaChoice3 = keyedInput.nextInt ();
		       
		       if (saharaChoice3 == 2) //if user inputs "2" they get 3 points
		       {
		           System.out.println(goodChoice+" +3");
		           points = points + 3;
		       }
		       else //if user inputs any other value, points stay the same
		       {
		           System.out.println(badChoice);
		           points = points + 0;
		       }
		       
		       // END OF SANDY SAHARA //
		       System.out.println(" ");
		       System.out.println("Amazing finish!");
		       System.out.println("Current Points: "+points);
		       System.out.println("Next Location: Snowy Canada. Are you ready to race in -20 degree temperatures?");
		       System.out.println("3... 2... 1... GO!");
		       
		       // CANADA CHOICE 1 //
		       do {
		       System.out.println(" ");
		       System.out.println("Awesome start! But you see a steep snowy hill ahead!");
		       System.out.println("[A] Speed up");
		       System.out.println("[B] Keep the same pace");
		       canadaChoice1 = keyedInput.next ().charAt (0);
		       
		       switch (canadaChoice1) {
		               case 'A':
		                   System.out.println(goodChoice+" +1");
		                   points = points + 1;
		                   break;
		               case 'B':
		                   System.out.println(badChoice);
		                   points = points + 0;
		                   break;
		               default:
		                   System.out.println(invalid);
		                   break;
		           }
		       } while (canadaChoice1 != 'A' && canadaChoice1 != 'B');
		           
		       // CANADA CHOICE 2 //
		       do {
		       System.out.println(" ");
		       System.out.println("Snow avalanches!");
		       System.out.println("[A] Steer the wheel right, then left");
		       System.out.println("[B] Steer the wheel left, then right");
		       canadaChoice2 = keyedInput.next ().charAt (0);
		       
		       switch (canadaChoice2) {
		               case 'A':
		                   System.out.println(badChoice);
		                   points = points + 0;
		                   break;
		               case 'B':
		                   System.out.println(goodChoice+" +1");
		                   points = points + 1;
		                   break;
		               default:
		                   System.out.println(invalid);
		                   break;
		           }
		       } while (canadaChoice2 != 'A' && canadaChoice2 != 'B');
		       
		       // CANADA CHOICE 3 //
		       do {  
		       System.out.println(" ");
		       System.out.println("The end is in sight! You can overtake your opponent, but speeding up may cause a skid.");
		       System.out.println("[A] Speed up anyway");
		       System.out.println("[B] Keep the same pace");
		       canadaChoice3 = keyedInput.next ().charAt (0);
		       
		       switch (canadaChoice3) {
		               case 'A':
		                   System.out.println("Your car cannot handle skids, sorry!");
		                   System.out.println(badChoice+" -1");
		                   points = points - 1; //points decrease by 1 for making a very bad choice
		                   break;
		               case 'B':
		                   System.out.println(goodChoice+" +1");
		                   points = points + 1;
		                   break;
		               default:
		                   System.out.println(invalid);
		                   break;
		           }
		       } while (canadaChoice3 != 'A' && canadaChoice3 != 'B');
		       
		       // END OF SNOWY CANADA RACE //
		       System.out.println(" ");
		       System.out.println("Amazing finish!");
		       System.out.println("Current Points: "+points);
		       System.out.println("Last Location: Amazing Amazon. Rally is coming to an end!");
		       System.out.println("3... 2... 1... GO!");
		       
		       // AMAZON CHOICE 1 //
		       do {
		       System.out.println(" ");
		       System.out.println("Oh no, an opponent has sabotaged your car!");
		       System.out.println("[A] Report the opponent and fix your car");
		       System.out.println("[B] Sabotage opponent's car, hope you get away with it");
		       amazonChoice1 = keyedInput.next ().charAt (0);
		       
		       switch (amazonChoice1) {
		               case 'A':
		                   System.out.println(goodChoice+" +1");
		                   points = points + 1;
		                   break;
		               case 'B':
		                   System.out.println(badChoice);
		                   points = points + 0;
		                   break;
		               default:
		                   System.out.println(invalid);
		                   break;
		           }
		       } while (amazonChoice1 != 'A' && amazonChoice1 != 'B');
		       
		       // AMAZON CHOICE 2 //
		       do {
		       System.out.println(" ");
		       System.out.println("Let the last race begin!");
		       System.out.println("Oh wait, there are turtles crossing ahead!");
		       System.out.println("[A] Go off-course, save the turtles");
		       System.out.println("[B] Speed up, hope you don't hit them");
		       amazonChoice2 = keyedInput.next ().charAt (0);
		       
		       switch (amazonChoice2) {
		               case 'A':
		                   System.out.println(goodChoice+" +1");
		                   points = points + 1;
		                   break;
		               case 'B':
		                   System.out.println(badChoice);
		                   points = points + 0;
		                   break;
		               default:
		                   System.out.println(invalid);
		                   break;
		           }
		       } while (amazonChoice2 != 'A' && amazonChoice2 != 'B');
		       
		       // AMAZON CHOICE 3 //
		       do {
		       System.out.println(" ");
		       System.out.println("Ah! The finish line is in sight at last!");
		       System.out.println("Beep beep, you are low on fuel!");
		       System.out.println("[A] Speed up");
		       System.out.println("[B] Slow down");
		       amazonChoice3 = keyedInput.next ().charAt (0);
		       
		       switch (amazonChoice3) {
		               case 'A':
		                   System.out.println(goodChoice+" +1");
		                   points = points + 1;
		                   break;
		               case 'B':
		                   System.out.println(badChoice);
		                   points = points + 0;
		                   break;
		               default:
		                   System.out.println(invalid);
		                   break;
		           }
		       } while (amazonChoice3 != 'A' && amazonChoice3 != 'B');
		       
		       // END OF AMAZING AMAZON RACE //
		       System.out.println(" ");
		       System.out.println("Amazing finish!");
		       System.out.println("Current Points: "+points);
		       
		       // MAGIC BOX (FREE POINTS) //
		       do {
		       System.out.println(" ");
		       System.out.println("WAIT! Before we get to the final scores...");
		       System.out.println("Open this magic box for some free points!");
		       System.out.println("Press \"A\"");
		       magicBox = keyedInput.next ().charAt (0);
		       
		       switch (magicBox) {
		               case 'A': //when user inputs "A" as instructed, a random number of points are added to their current points
		                   points = points + magicPoints; //random points (1-10) added to user's current points
		                   break;
		               default:
		                   System.out.println(invalid);
		                   break;
		           }
		       } while (magicBox != 'A'); //if user inputs any other key, above instructions will be displayed again
		       
		       System.out.println(" ");
		       System.out.println("Current Points: "+points); //points displayed after free points are added
		       System.out.println(" ");
		       System.out.println("-----------------------------------"); //design element to emphasize the winning or losing message below
		       
		       if (points >= 20) //if points collected are 20 or more than 20, user came 1st place
		       {
		           System.out.println("CONGRATULATIONS! YOU WIN 1ST PLACE!"); //winning message
		       }
		       
		       else if (points >= 15)//if points collected are between 15-19, user came 2nd place
		       {
		           System.out.println("CONGRATULATIONS! YOU WIN 2ND PLACE!");//winning message
		       }
		       
		       else if (points >= 10) //if points collected are between 10-14, user came 3rd place
		       {
		           System.out.println("CONGRATULATIONS! YOU WIN 3RD PLACE!");//winning message
		       }
		       
		       else //if points collected are 9 or less than 9, user lost the rally race
		       {
		           System.out.println("SORRY! YOU LOSE."); //losing message
		       }
		       
		       System.out.println("-----------------------------------"); //design element to emphasize the winning or losing message above
		   }
		 
		 if (initialChoice != 'A' && initialChoice != 'B') //if user did not input "A" or "B", input is invalid and user is given the option to restart game
		 {
		     System.out.println(invalid);
		 }
		 
		 // RESTART GAME //
		 System.out.println(" ");
		 System.out.println("Restart game?");
		 System.out.println("Press any key to restart or \"N\" to exit.");
		 restartGame = keyedInput.next ().charAt (0); //user can press any key to restart the game
		}
		
		while (restartGame != 'N'); //if user presses "N" user exits the game
	}
}


