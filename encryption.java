package encryption;
import java.util.*;
import java.lang.Math; 

/**
* <h1>String Encryption</h1>
* This program takes a string input to be encrypted 
* based off of the encryption scheme.
*
* @author  Blane Staskiewicz
*/
public class encryption
{ 
	/**
	 * The driver method that scans users input 
	 * and calls encryptString method.
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Input string for encryption: ");
		String input = s.nextLine().replaceAll("\\s+","");
		System.out.print(encryptString(input));
	}
	/** 
	 * This method encrypts the input string 
	 * using the encryption scheme.
	 *
	 * @param s Users string input
	 * @return encryption Users encryped string
	 */
	public static String encryptString(String s) 
	{
		int L = s.length();
		int row = 0;
		int col = 0;
		int index = 0;
		String encryption = "";
		
		// checks constraints
		if(L < 1 || L > 81) 
		{
			encryption = "String does not meet length parameters";
			return encryption;
		}
		
		// gets correct row x col dimensions
		if(Math.sqrt(L) % 1 == 0) 
		{
			row = (int) Math.sqrt(L);
			col = (int) Math.sqrt(L);
		}
		else 
		{
			row = (int) Math.floor(Math.sqrt(L));
			col = (int) Math.ceil(Math.sqrt(L));
			
			if(row * col < L) row += 1;
		}
		// creates 2D array based off dimensions
		char[][] arr = new char[row][col];
		for(int i = 0; i < row; i++) 
		{
			for(int j = 0; j < col; j++) 
			{
				if(index >= L);
				else 
				{
					arr[i][j] = s.charAt(index);
					index++;
				}
			}
		}
		
		// encrypts string by col + " "
		index = 0;
		System.out.print("Encrypted string: ");
		for(int i = 0; i < col; i++) 
		{
			for(int j = 0; j < row; j++) 
			{
				if(index > L) break; 
				else 
				{
					if(j == row - 1) encryption += arr[j][i] + " ";
					else encryption += arr[j][i];
					index++;
				}
			}
		}
		return encryption;
	}
}
