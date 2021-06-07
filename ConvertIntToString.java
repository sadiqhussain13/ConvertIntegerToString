import java.util.Scanner;

public class ConvertIntToString 
{
	public static void main(String[] args)
	{
		DoNotTerminate.forbidExit();
		/*try { */
		  
			Scanner in = new Scanner(System.in);
			while(!in.hasNextInt()) 
			{ 
				//repeat until a number is entered.
			    in.next();
			    System.out.println("Invalid! try entering a number"); //Tell it's not a number.
			}
			int n = in .nextInt();
			in.close();
		
			Integer.toString(n);
			String s = String.valueOf(n);
			//String s = "" + n;
			if (n == Integer.parseInt(s)) 
			{
				System.out.println("Great work");
			}
			else
			{
				System.out.println("Wrong Answer");
			}
		}
		/*catch(DoNotTerminate.ExitTrappedException e)
		{
			System.out.println("Unsuccesful termination!!");
		} 
	} */
}
