package prometheus;

public class SavingAccount {
	  
	  int balance;
	  
	  public SavingAccount(int initialBalance){
	    balance = initialBalance;
	  }
	   //Checking balance:
	  public void checkBalance(){
	    System.out.println("Hello!");
	    System.out.println("Your balance is "+ balance);
	  }
	  //Depositing:
	  public void deposit(int amountToDeposit){
	    balance += amountToDeposit;
	    System.out.println("You just deposited " + amountToDeposit);
	  }
	  //Withdrawing:
	  public int withdraw(int amountToWithdraw){
	    balance -= amountToWithdraw;
	    System.out.println("You just withdrew " + amountToWithdraw);
	    return amountToWithdraw;
	  }
	  
	  public String toString(){
	    return "This is a savings account with " + balance + " saved.";
	  }
	  
	  public static void main(String[] args){
	    SavingAccount savings = new SavingAccount(2000);
	    
	    //Check balance:
	    savings.checkBalance();
	    
	    //Withdrawing:
	    savings.withdraw(500);
	    
	    //Check balance:
	    savings.checkBalance();
	    
	    //Deposit:
	    savings.deposit(600);
	    
	    //Check balance:
	    savings.checkBalance();
	    
	    //Deposit:
	    savings.deposit(900);
	    
	    //Check balance:
	    savings.checkBalance();
	    
	    System.out.println(savings);
	  }       
	}

