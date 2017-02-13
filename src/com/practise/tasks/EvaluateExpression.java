package com.practise.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvaluateExpression {
	
	public static void main(String []args) throws Exception
	{
		 for(int i=0;i<args.length;i++)
		 {
			 processExpression(args[i]);
		 }
		 
	}
	static void processExpression( String argsVal)
	{
		int operatorIndex=0;
		int expressVal;
     if(argsVal.indexOf("+")!= -1 )
     {
    	 operatorIndex=argsVal.indexOf("+");
    	 expressVal  =Integer.valueOf(argsVal.substring(0,operatorIndex)) 
    	 + Integer.valueOf(argsVal.substring(operatorIndex+1,argsVal.length()));
    	 System.out.println(argsVal+"->"+expressVal);
     }else if(argsVal.indexOf("-")!= -1 )
     {
    	 operatorIndex=argsVal.indexOf("-");
    	 expressVal  =Integer.valueOf(argsVal.substring(0,operatorIndex)) 
    			 		- Integer.valueOf(argsVal.substring(operatorIndex+1,argsVal.length()));
    	 System.out.println(argsVal+"->"+expressVal);
     }else if(argsVal.indexOf("*") != -1)
     {
    	 operatorIndex=argsVal.indexOf("*");
    	 expressVal  =Integer.valueOf(argsVal.substring(0,operatorIndex)) 
    			 		* Integer.valueOf(argsVal.substring(operatorIndex+1,argsVal.length()));
    	 System.out.println(argsVal+"->"+expressVal);
    	 
     }else if(argsVal.indexOf("%") != -1)
     {
    	 operatorIndex=argsVal.indexOf("%");
    	 expressVal  =Integer.valueOf(argsVal.substring(0,operatorIndex)) 
    			 		% Integer.valueOf(argsVal.substring(operatorIndex+1,argsVal.length()));
    	 System.out.println(argsVal+"->"+expressVal);
     }else if(argsVal.indexOf("/") != -1)
     {
    	 operatorIndex=argsVal.indexOf("/");
    	 expressVal  =Integer.valueOf(argsVal.substring(0,operatorIndex)) 
    			 		/ Integer.valueOf(argsVal.substring(operatorIndex+1,argsVal.length()));
    	 System.out.println(argsVal+"->"+expressVal);
     }else 
     {
    	 System.out.println(argsVal+"->"+argsVal);
     }
     	 
    	 
	}

}
