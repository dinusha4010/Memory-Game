import java.util.Scanner;
import java.util.Random;
public class memoryGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random=new Random();
		Scanner in= new Scanner(System.in);
		
		int[] numbers=new int[7];
		int[] userInput=new int[7];
		
		for (int i=0;i<7;i++)
			
		{
			numbers[i]=random.nextInt(5)+1;
		}
		
		for (int i=0;i<7;i++)
			
		{
			System.out.print(numbers[i]);
		}
		try { 

			// The pause will last 1 second
			 Thread.sleep(1000); 

			} 

			catch(InterruptedException ex) 

			{ 

			Thread.currentThread().interrupt();

			}
		
		
		for (int i = 0; i < 20; ++i) System.out.println();
		
		for (int j=0; j<7;j++)
			
		{
			System.out.println("Type number "+(j+1)+" :");
			userInput[j]=Integer.parseInt(in.nextLine());
		}
		
			System.out.println("The numbers were:");
			for (int j=0;j<7;j++)
			
		{
				System.out.print(numbers[j]);
				
		}
			System.out.println();
			System.out.println("Your numbers were:");
			for (int j=0;j<7;j++)
				
			{
					
					System.out.print(userInput[j]);
			}
	}
	

	
}
