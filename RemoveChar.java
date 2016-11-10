import java.util.Scanner;

public class RemoveChar
{
	 public static String removeCharFromString(String str, char ch)
	 {
	        StringBuilder strBuilder = new StringBuilder();
	        char[] outputString = str.toCharArray();
	        for(int i=0; i<outputString.length; i++)
	        {
	            //if(outputString[i] == ch)
	            if((outputString[i] == Character.toLowerCase(ch)) || (outputString[i] == Character.toUpperCase(ch)) )
	            {
	            	//System.out.println("inside char");
	            } 
	            else
	            {
	                strBuilder.append(outputString[i]);
	            }
	        }
	        return strBuilder.toString();
	    }
	 
	 
    public static void main(String[] args)
    {
        String inputString;
        char inputChar;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the string: ");
        inputString = s.nextLine();
        System.out.println("Enter a character that is to be removed from the above string: ");
        inputChar = s.next().charAt(0);
        //System.out.println("The output is:");
        System.out.println(removeCharFromString(inputString,inputChar));
        s.close();
    }
}