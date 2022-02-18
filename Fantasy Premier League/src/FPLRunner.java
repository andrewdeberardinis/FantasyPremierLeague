import java.util.ArrayList;
import java.util.Scanner;

public class FPLRunner
	{
		public static ArrayList<Player> playerList = new ArrayList<Player>();
		
		
		
		public static int pace;
		public static int shooting;
		public static int passing;
		public static int dribbling;
		public static int defending;
		public static int physical;
		public static int position;
		
		public static void main(String[] args)
			{
				
				RunIt();
				

			}
		
		
		

		public static void RunIt()
		{

					CreatePlayer();
					displayPlayers();

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
						pace = supa.nextInt();
						
						System.out.println("Shooting:");
						shooting = supa.nextInt();
						
						System.out.println("Passing:");
						passing = supa.nextInt();
						
						System.out.println("Dribbling:");
						dribbling = supa.nextInt();
						
						System.out.println("Defending:");
						defending = supa.nextInt();
						
						System.out.println("Physical:");
						physical = supa.nextInt();

						
						int price = pace + shooting + passing + dribbling + defending + physical;
						
						price = price *10;
						
						//gives player position based on stats entered
						positionAlg();
						

						
						//displays price and asks user if they want to purchase
						System.out.println("Based on the stats, this is your player's price:" + price);		
						System.out.println("Would you like to add this player to your squad? (y/n)");
						System.out.println();
						String confirm = supa.nextLine();
						if(confirm.equals("y"))
							{
								System.out.println("Congrats on signing" + firstName + " " + lastName + "to your squad");
								playerList.add(new Player(firstName, lastName, price, teamName, pace, shooting, passing, dribbling, defending, physical, position));
						
						}
						
						else
							{
								j--;
							}
						
					
						System.out.println("Would you like to see the current list?");
						String display = supa.nextLine(); 
						if(display.equals("y"))
							{
								System.out.println("Here is the current squad list:");
								displayPlayers();
							}
						
						else 
							{
								System.out.println();
							}
						
						
								
					}
			}
				
				
		
				
				public static void displayPlayers()
				{
					
							
							for(Player p: playerList)
								{
									
							System.out.println(p.getPosition() + " : " + p.getFirstName() + " " + p.getLastName() );
								}
							
							
						
				}
				
				public static void positionAlg()
				{
						if(defending > 80 && shooting < 65)
							{
								position = 4;
								
							}
						
						else if(pace > 82 && passing > 80 && shooting < 65)
							{
								position = 2;
							}
						
						else if(shooting > 65 && defending > 78 && physical > 85)
							{
								position = 6;
							}
						
						else if(pace > 85 && shooting > 80 && dribbling > 88)
							{
								position = 7;
							}
						
						else if(passing > 85 && dribbling > 85 && shooting > 85 && defending > 55)
							{
								position = 10;
							}
						
						else if(shooting > 88 && dribbling > 85 && defending < 55)
							{
								position = 9;
							}
						
						else
							{
								position = 0;
							}
				}
						

				
				public static void field(Player p)
				{
					
				
					System.out.println(" ______________________________________________________________________");
					System.out.println("|                                                                      |");
					System.out.println("|                                   " + p.getFirstName() + p.getLastName() + "                                   |");
					System.out.println("|                                                                      |");
					System.out.println("|                                                                      |");
					System.out.println("|                                                                      |");
					System.out.println("|                                                                      |");
					System.out.println("|                                                                      |");
					System.out.println("|                                                                      |");
					System.out.println("|                                                                      |");
					System.out.println("|                                                                      |");
					System.out.println("|                                                                      |");
					System.out.println("|                                                                      |");
					System.out.println("|                                                                      |");
					System.out.println("|                                                                      |");
					System.out.println("|                                                                      |");
					System.out.println("|                                                                      |");
					System.out.println("|                                                                      |");
					System.out.println("|                                                                      |");
					System.out.println("|                                                                      |");
					System.out.println("|                                                                      |");
					System.out.println("|                                                                      |");
					System.out.println("|          __________________________________________________          |");
					System.out.println("|         |                                                  |         |");
					System.out.println("|         |                                                  |         |");
					System.out.println("|         |                         _                        |         |");
					System.out.println("|         |                                                  |         |");
					System.out.println("|         |                                                  |         |");
					System.out.println("|         |              ______________________              |         |");
					System.out.println("|         |             |                      |             |         |");
					System.out.println("|         |             |                      |             |         |");
					System.out.println("|_________|_____________|______________________|_____________|_________|");
				}
					
			
				
		}
	

	
