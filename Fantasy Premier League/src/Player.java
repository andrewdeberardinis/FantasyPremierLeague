import java.util.ArrayList;

public class Player
	{
		private String firstName;
		private String lastName;
		private double price; 
		private String team;
		private int pointRange;
		
		
	
		
		public Player ( String fn, String ln, double p, String t, int pr)
		{
			firstName = fn;
			lastName = ln;
			price = p;
			team = t;
			pointRange = pr;
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



		public int getPointRange()
			{
				return pointRange;
			}



		public void setPointRange(int pointRange)
			{
				this.pointRange = pointRange;
			}
		
	}
	
