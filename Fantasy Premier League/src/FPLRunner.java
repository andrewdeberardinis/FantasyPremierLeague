import java.util.ArrayList;
import java.util.Scanner;

public class FPLRunner
	{
		public static ArrayList<Player> playerList = new ArrayList<Player>();
		
		
		public static void main(String[] args)
			{
				
				RunIt();
				

			}
		

		public static void RunIt()
		{

					CreatePlayer();
					
					
				
			

			
		}
		
				public static void CreatePlayer()
			{
				
				for(int j = 1; j < 13; j++)
					{
						
						Scanner supa = new Scanner(System.in);
						
						System.out.println("You are creating player number: " + j );
						System.out.println("What will his first name be?");
						String firstName = supa.nextLine();
						
						
						System.out.println("What will his last name be?");
						String lastName = supa.nextLine();

						
						System.out.println("What team will " + firstName + " be on?");
						String teamName = supa.nextLine();
						
						
						System.out.println("Now you will select your player's stats");
						System.out.println("Pace:");
						int pace = supa.nextInt();
						
						System.out.println("Shooting:");
						int shooting = supa.nextInt();
						
						System.out.println("Passing:");
						int passing = supa.nextInt();
						
						System.out.println("Dribbling:");
						int dribbling = supa.nextInt();
						
						System.out.println("Defending:");
						int defending = supa.nextInt();
						
						System.out.println("Physical");
						int physical = supa.nextInt();

						
						int price = pace + shooting + passing + dribbling + defending + physical;
						
						//displays price and asks user if they want to purchase
						System.out.println("Based on the stats, this is your player's price:" + price);		
						System.out.println("Would you like to add this player to your squad? (y/n)");
						String confirm = supa.nextLine();
						if(confirm.equals("y"))
							{
								playerList.add(new Player(firstName, lastName, price, teamName, pace, shooting, passing, dribbling, defending, physical));
							}
						
						else
							{
								j--;
							}
						
						
								
					}
			}
				
				public static void displayPlayers()
				{
					for(Player p: playerList)
						{
							
							System.out.println(p.getFirstName() + " " + p.getLastName());
							
							
							
						}
				}
				
				


	}
