package com.practise.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SampleCharacterExtractor {
	
	
     static List vowels =new ArrayList(Arrays.asList('a','A','e','E','i','I','o','O','u','U'));
    
     static List numbers =new ArrayList(Arrays.asList('0','1','2','3','4','5','6','7','8','9'));
     
	public static void main (String []args) throws Exception
	{  
       String tempArgStr;
       boolean isCharacterFound=false;
       
      	if(args!=null)
		{
			for(int i=0;i<args.length;i++)
			{
				tempArgStr=args[i];
				for(int j=0 ; j<tempArgStr.length();j++)
				{
					isCharacterFound=printVowels(tempArgStr.charAt(j));
					if(!isCharacterFound)
					{
						isCharacterFound=printConsonants(tempArgStr.charAt(j));
							if(!isCharacterFound)
							{
								printNumbers(tempArgStr.charAt(j));
							}
								
					}
					isCharacterFound =false;
				}
			}	
			
		}else
		{
			System.out.println("Please key in arguments");
		}	
		
	}
	
	static boolean printVowels(char argChar)
	{		
			
			if(vowels.contains(argChar))
			{
				System.out.println("vowel is "+argChar+"\n");
				return true;
			}
	return false;		
	}
	
	static boolean printConsonants (char argChar)
	{		
			
			if(!vowels.contains(argChar) && ! numbers.contains(argChar) )
			{
				System.out.println("Consonant is "+argChar+"\n");
				return true;
			}
	return false;		
	}
	
	static boolean printNumbers(char argChar)
	{		
			
			if( numbers.contains(argChar) )
			{
				System.out.println("Number is "+argChar+"\n");
				return true;
			}
	return false;		
	}

}
