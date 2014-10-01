//Writing a program that uses Binet's 
//formula to find out the nth term of the 
//Fibonacci sequence

import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException
	{
		File f = null;
		boolean LOCAL_TEST = false;
		if (LOCAL_TEST)
			f = new File("test.txt");
		else
			f = new File(args[0]);

		BufferedReader in = new BufferedReader(new FileReader(f));
		String line;
		
		
		
		while ((line = in.readLine()) != null) {
			double RootFive = Math.sqrt( (double)5 );
			double OnePlusRootFive = (double)1 + RootFive;
			double OnePlusSum = OnePlusRootFive;
			double OneMinusRootFive = (double)1 - RootFive;
			double OneMinusSum = OneMinusRootFive;
			double Result = 0;
			double TwoToTheN = 2;
			double TwoNSum = TwoToTheN;
			
			int input = Integer.parseInt(line);
			if(input == 0)
			{
				System.out.println(0);
				
			}
			else
			{

				
				for(int i = 1; i < input; i++)
				{
					OnePlusSum = OnePlusSum*OnePlusRootFive;
					OneMinusSum = OneMinusSum*OneMinusRootFive;
					TwoNSum = TwoNSum*TwoToTheN;
				}
				
				//System.out.println("OnePlusRootFive: "+OnePlusSum);
				//System.out.println("OneMinusRootFive: "+OneMinusSum);
				double TwoNRootFive = TwoNSum*RootFive;
				
				Result = (OnePlusSum - OneMinusSum)/TwoNRootFive;
				System.out.println((int)Result);
			}
			
			
		}
		in.close();
	}
	
}
