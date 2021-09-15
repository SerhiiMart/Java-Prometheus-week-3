package prometheus;


public class Prometheus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      double balance = 1000.75;
	      double amountToWithdraw = 250;
	      double updatedBalance = balance - amountToWithdraw;
	      double amountForEachFriend = updatedBalance/3;
	      boolean canPurchaseTicket = amountForEachFriend >= 250;
	      System.out.println(canPurchaseTicket);
	}

}
