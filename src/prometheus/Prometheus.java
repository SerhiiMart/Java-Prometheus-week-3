package prometheus;


public class Prometheus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      double recommendedWaterIntake = 8;
	      double daysInChallenge = 30;
	      double yourWaterIntake = 235.5;
	      double totalRecommendedAmount = recommendedWaterIntake * daysInChallenge;
	      boolean isChallengeComplete = yourWaterIntake >= totalRecommendedAmount;
	      System.out.println(isChallengeComplete);
	}

}
