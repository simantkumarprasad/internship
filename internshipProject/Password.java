package internshipProject;

import java.security.SecureRandom;
import java.util.Scanner;

public class Password 
{
	 /**
     * @param args
     */
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
     
      System.out.println("enter the length of password you want");

        int in=s.nextInt();
        System.out.println("your password is: "+Randompass(in));
       
    }

    public static String Randompass(int in)
    {
        final String chs= "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@!#$.";

        SecureRandom randomize=new SecureRandom();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<in;i++)
        {
            int randomIndex= randomize.nextInt(chs.length());
            sb.append(chs.charAt(randomIndex));
        }
        return sb.toString();
    }
}
