package FootballManager;


	import java.util.ArrayList;

	public class Team {
		Coach coach;
		String name;
		ArrayList<FootballPlayer> playerlist;
		
		public Team() {
			name="your first school name";
			coach= new Coach();
			coach.name="Fatih";
			coach.surname="Kýlýç";
			
			playerlist=new ArrayList<FootballPlayer>();
			
		}
		
		public double SumofSalary() {
			double cost=0;
			for(FootballPlayer f : playerlist) {
				cost=cost+f.salaryAmount;
			}
			cost=cost+coach.salaryAmount;
			return cost;
		}
		
		public double AvgofFootballPlayers() {
			double cost=0;
			for(FootballPlayer f : playerlist) {
				cost=cost+f.age;
			}
			cost=cost/playerlist.size();
			return cost;
		}
		
		public double AvgofFootballPlayerExperince() {
			double cost=0;
			for(FootballPlayer f : playerlist) {
				cost=cost+f.experienceList.size();
			}
			cost=cost/playerlist.size();
			return cost;
		}
		
		public FootballPlayer highestPaidofFotballPlayerSalary() {
			FootballPlayer ret=null;
			for(FootballPlayer f : playerlist) {
				if (f.salaryAmount>ret.salaryAmount) {
					ret=f;
				}
			}
			return ret;
		}

}
