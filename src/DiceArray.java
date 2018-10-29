import java.util.Arrays;

/**
 * 
 * @author Akira Morales
 * Dice Array Homework
 * Period 6
 */
public class DiceArray
{
	public static void main(String[] args)
	{
		Dice die1 = new Dice();
		Dice die2 = new Dice();
		int[] counter = new int[13];
		
		for(int i =0; i<counter.length; i++)
		{
			counter[i] = 0;
		}
		
		for(int i=0; i<999; i++)
		{
			int val1 = die1.roll();
			int val2 = die2.roll();
			counter[val1+val2] ++;
		}
		
		System.out.print(Arrays.toString(counter));
	}
}
