package FootballManager;

import java.util.ArrayList;

public class FootballPlayer extends Person {
	float salaryAmount;
	SoccerPositions soccerPositions;
	
	ArrayList<Experience> experienceList;
	
	public FootballPlayer() {
		experienceList=new ArrayList<Experience>();
	}
	
	String MyJob() {
		return "FootballPlayer";
	}
}
