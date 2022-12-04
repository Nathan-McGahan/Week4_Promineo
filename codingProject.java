package week3_4_codingProject;


public class codingProject {
	
	// Question 13 Method
	
	public static boolean willBuyGame(double rating, double cost, double moneyIHave) {
		if(cost > moneyIHave) {
			return false;
		}
		else if(cost < 10 && rating < 2) {
			return true;
		}
		else if(rating < 3) {
			return false;
		}
		else if((cost >= 60) && (rating <= 4)) {
			return false;
		}
		return true;
	}
	//Question 12 Method
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if(isHotOutside==true && moneyInPocket>10.50) {
			return true;
		}
		return false;
	}
	//Question 11 method
	
			public static boolean isGreaterAverage(double array1[],double array2[])
			{
				double avg1=averageDouble(array1);
				double avg2=averageDouble(array2);
				if(avg1>avg2)
				{
					return true;
				}
				return false;
			}
	
	//Question 10 Method
		public static double averageDouble(double[] doubles) {
			double sum=0.0;
			for(double number : doubles)
			{
				sum+=number;
			}
			return sum/doubles.length;
		}
		
		
	//Question 9 Method
	public static boolean isGreaterThan(int arr[])
	{
		int sum=sumArray(arr);
		if(sum>100) {
			return true;
		}
		return false;
	}
	//Question 8 Method
	public static String createFullName(String x, String y) {
		return x + " " + y;
	}
	
	//Question 7 Method
	public static String multiplyString(String str, int num) {
		String result = "";
		for (int i = 0; i < num; i++) {
			result += str;
		}
		return result;
	}
	// Question 6 Method
	public static int sumArray(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// Question 1
		
		int ages[]= {3, 9, 23, 64, 2, 8, 28, 93};
		int temp = ages[ages.length-1] - ages[0];
		System.out.println("Last - first equals" + " " + temp);
		
		int totalAge = 0;
				
		for (int i = 0; i < ages.length; i++) {
			totalAge += ages[i];
		}
		
		System.out.println("Average age is" + " " + (totalAge / ages.length));

	
	// Question 2
		
		String names [] = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		int nameCharLength = 0;
		
		for (int i = 0; i < names.length; i++) {
			nameCharLength += names[i].length();
		}
	
		System.out.println("Average name length is" + " " + (nameCharLength / names.length));
		
	
	// Question 3
		
		// array[array.length-1]
		
	//Question 4
		
		// array[0]
		
	//Question 5
		
		int nameLengths[] = new int[names.length];
		for(int i = 0; i < names.length; i++) {
			nameLengths[i]=names[i].length();
		}
		
		
	// Question 6
		
	System.out.println(("Sum of length of names is") + " " + sumArray(nameLengths));
	
	// Question 7
		
	System.out.println(multiplyString("Hello", 3));
	
	// Question 8
	
	String firstName = "Gerry";
	String lastName = "Rafferty";
	String fullName = createFullName(firstName, lastName);
	
	System.out.println(fullName);
	
	// Question 9
	
	if(isGreaterThan(nameLengths))
    {
    	System.out.println("Sum is greater than 100");
    } else {
    	System.out.println("Sum is not greater than 100");
}
	// Question 10
	
	double[] dubArr=new double[]{14, 30.6, 2, 0.15, 34, 69};
    double avgdouble=averageDouble(dubArr);
    System.out.println("Average of double array is " + avgdouble);
    
    //Question 11
    
    double[] dubArr1=new double[]{27, 43, 11, 24.42, 11, 0.1};
    if(isGreaterAverage(dubArr,dubArr1))
    {
    	System.out.println("Average of first array is greater than second ");
    } else {
    	System.out.println("Average of first array is less than second ");
    }
    
    //Question 12
    
    if(willBuyDrink(true, 15))
    {
    	System.out.println("You can buy a drink");
    } else {
    	System.out.println("You can't afford a drink...");
    }
    
    // Question 13: Should I buy a Steam game? But only if I can afford it, and it has positive reviews. I created it as a baseline for if I should buy a game or not.
    
    String games [] = {"Call of Duty", "Beyblade Revolution", "Raft", "Grand Theft Auto 5"};
    double ratings [] = {3.7, 2.3, 4, 4.3};
    double cost [] = {19.99, 5, 14.95, 59.99};
    double moneyIHave = 75;
    
    for(int i = 0; i < games.length; i++ ){
    	if(willBuyGame(ratings[i], cost[i], moneyIHave)) {
    		System.out.println("Buy" + " " + games[i]);
    	} else {
    		System.out.println("Do not buy" + " " + games[i]);
    	}
    }
    
    
    
	}
}
	


	
