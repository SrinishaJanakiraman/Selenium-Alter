package Program;

public class Fizzbuzz {

	
	public static void main(String[] args) {
		
		int no=35;
		if((no%3==0)&&(no%5==0)) {
			System.out.println("fizzbuzz");
		}
		else if(no%5==0)
		{
			System.out.println("buzz");
		}
		else if(no%3==0)
		{
			System.out.println("fizz");
		}


	}

}
