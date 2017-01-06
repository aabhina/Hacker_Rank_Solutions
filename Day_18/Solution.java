
import java.util.Scanner;

interface AdvancedArithmetic {
	int divisorSum(int n);

}

class Solution {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
      	AdvancedArithmetic myCalculator = new Calculator(); 
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }

}

class Calculator implements AdvancedArithmetic {

	@Override
	public int divisorSum(int n) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		for(int j = 1; j <= n; j++){
			if(n%j == 0){
				sum += j;
			}
		}
		
		return sum;
	}

}

