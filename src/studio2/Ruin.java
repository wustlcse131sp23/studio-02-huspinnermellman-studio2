package studio2;

public class Ruin {

	public static void main(String[] args) {
		int startAmount = 2;
		double winChance = 0.5;
		int winLimit = 10;
		int money = startAmount;
		int totalSimulations = 500;
		int daysCompleted;
		int plays = 0;
		int successes = 0;
		int ruins = 0;
		double expectedRuinRate;
		double alpha = 0;
		
	for (daysCompleted = 1;
			daysCompleted <= totalSimulations;
			daysCompleted ++)
	{
		while(money<winLimit && money>0)
		{
			if(Math.random()<winChance)
			{
				money++;
				plays++;
				//System.out.println("You win! You now have $" + money);
			
			}
			else
			{
				money--;
				plays++;
				//System.out.println("You lose! You now have $" + money);
			
			}
		}
			System.out.println("End of day " + daysCompleted);
			System.out.println("Total plays: " + plays);
			if (money == 0)
				{
				System.out.println("Ruined!");
				ruins++;
				}
			else
				{
				System.out.println("Success!");
				successes++;
				}
			System.out.println("");
			money = startAmount;
			plays = 0;
	}
	System.out.println("Ruin rate: " + ((double) ruins/totalSimulations)*100 + "%");
	if (winChance==0.5)
	{
		expectedRuinRate=(1-((double) startAmount/winLimit));
		
	}
	else
	{
		alpha = ((1-winChance)/winChance);
		expectedRuinRate=((Math.pow(alpha, (double) startAmount)-(Math.pow(alpha, (double) winLimit)))/(1-(Math.pow(alpha, (double) winLimit))));
	}
	System.out.println("Expected Ruin Rate: " + expectedRuinRate);
	}
	
	

}
