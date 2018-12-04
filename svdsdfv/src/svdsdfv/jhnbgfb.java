package svdsdfv;

import java.util.Scanner;

public class jhnbgfb {
	public static void main(String args[])
	{
		Boom a = new Boom();
		System.out.println(a.ran);
		a.find();
	}

}
class Boom
{
	int ran;
	int save1 = 100;
	int save2 = 1;
	public Boom()
	{
		ran = (int)(Math.random()*100+1);
	}
	
	int confirm()
	{
		System.out.println("Please choice a single digit:");
		Scanner in = new Scanner(System.in);
		int input = in.nextInt();
		if(input==ran)
		{
			return 1;
		}
		else if(input<=save2||input>=save1)
		{
			System.out.println("not legal!");
			return 0;
		}
		else
		{
			if(input<ran)
			{
				save2 = input;
			}
			else if(input>ran)
			{
				save1 = input;
			}
			System.out.println(save2+"~"+save1);
			return 2;
		}
	}
	
	void find()
	{
		boolean con = true;
		while(con)
		{
			switch(confirm())
			{
			case 1:
				con = false;
				break;
			case 0:
				break;
			case 2:
				break;
			}
		}
		System.out.println("You are BOOM!");
	}
}