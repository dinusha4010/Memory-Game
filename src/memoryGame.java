import java.util.Random;
public class memoryGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random=new Random();
		
		int[] numbers=new int[7];
		
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
	}

	
}
