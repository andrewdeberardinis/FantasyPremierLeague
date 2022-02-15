import java.util.ArrayList;

public class Player
	{
		private String firstName;
		private String lastName;
		private double price; 
		private String team;
		private int pace;
		private int shooting;
		private int passing;
		private int dribbling;
		private int defending;
		private int physical;
		
		

		public Player ( String fn, String ln, double p, String t, int pa, int sh, int pas, int dr, int de, int phy)
		{
			firstName = fn;
			lastName = ln;
			price = p;
			team = t;
			pace = pa;
			shooting = sh;
			passing = pas;
			dribbling = dr;
			defending = de;
			physical = phy;
			
		}



		public int getPace()
			{
				return pace;
			}



		public void setPace(int pace)
			{
				this.pace = pace;
			}



		public int getShooting()
			{
				return shooting;
			}



		public void setShooting(int shooting)
			{
				this.shooting = shooting;
			}



		public int getPassing()
			{
				return passing;
			}



		public void setPassing(int passing)
			{
				this.passing = passing;
			}



		public int getDribbling()
			{
				return dribbling;
			}



		public void setDribbling(int dribbling)
			{
				this.dribbling = dribbling;
			}



		public int getDefending()
			{
				return defending;
			}



		public void setDefending(int defending)
			{
				this.defending = defending;
			}



		public int getPhysical()
			{
				return physical;
			}



		public void setPhysical(int physical)
			{
				this.physical = physical;
			}



		public String getFirstName()
			{
				return firstName;
			}



		public void setFirstName(String firstName)
			{
				this.firstName = firstName;
			}



		public String getLastName()
			{
				return lastName;
			}



		public void setLastName(String lastName)
			{
				this.lastName = lastName;
			}



		public double getPrice()
			{
				return price;
			}



		public void setPrice(double price)
			{
				this.price = price;
			}



		public String getTeam()
			{
				return team;
			}



		public void setTeam(String team)
			{
				this.team = team;
			}

		
	}
	
