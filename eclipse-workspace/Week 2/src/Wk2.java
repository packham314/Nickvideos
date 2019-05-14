
public class Wk2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean expression = true && false;
		System.out.println(expression);

	boolean expression1 = true || false;
		System.out.println(expression1);

	boolean expression2 = false && false;
		System.out.println(expression2);

    	boolean expression3 = true && (false ||true);
		System.out.println(expression3);
		
	boolean expression4 = false || (true && false);
		System.out.println(expression4);

	boolean expression5 = false || 1 < 5;
		System.out.println(expression5);
	
	boolean expression6 = 5 >= 4 && 1 > 3;
		System.out.println(expression6);
		
	boolean expression7 = 10 < 4 || 1 > 4;
		System.out.println(expression7);
	
	boolean expression8 = 12 >= 2 && 1 < 24;
		System.out.println(expression8);

	boolean isHotOutside = false;
		System.out.println(isHotOutside);
		
	boolean isWeekday = true;
		System.out.println(isWeekday);
		
	boolean hasMoneyInPocket = true == false;
		System.out.println(hasMoneyInPocket);
		
	double costOfMilk = 4.99;
		System.out.println(costOfMilk);
		
	double moneyInWallet = 25;
		System.out.println(moneyInWallet);

	for (int i = 5; i == 5; i++) {
		if (i <= 1); {
		System.out.println("Thirst level on a scale of 1 to 10 is " + i);
		}
	}
	boolean shouldBuyIcecream = isHotOutside && !hasMoneyInPocket ;
		System.out.println(shouldBuyIcecream);
	
	boolean willGoSwimming = isHotOutside && isWeekday; 
		System.out.println(willGoSwimming);
	
	boolean isAGoodDay = isHotOutside && !hasMoneyInPocket && !isWeekday;
		System.out.println(isAGoodDay);
	
	boolean willBuyMilk = false; 
		System.out.println(willBuyMilk);

	}

}
