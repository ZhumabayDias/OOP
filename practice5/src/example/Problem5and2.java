package example;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Problem5and2 {
	public static void main(String[] args)
    {
       double                 leftOperand=0, result=0, rightOperand=0;
       String                 leftString, operator, rightString;
       StringTokenizer        tokenizer;
       Scanner in = new Scanner(System.in);

       tokenizer = new StringTokenizer(in.nextLine(), "+/*-", true);
       boolean isSan = true;

       try
       {
          leftString   = tokenizer.nextToken();
          operator     = tokenizer.nextToken();
          rightString  = tokenizer.nextToken();
          try {
        	  leftOperand  = Double.parseDouble(leftString);}
          catch(NumberFormatException left){
        	  System.out.println("LeftOperand is not a number");
        	  isSan = false;
          }
          try {
        	  rightOperand = Double.parseDouble(rightString);}
          catch(NumberFormatException right) {
        	  System.out.println("RightOperand is not a number");
        	  isSan = false;
          }
          if(isSan) {
        	  if (operator.equals("+"))
              result = leftOperand + rightOperand;
        	  else if(operator.equals("-"))
              result = leftOperand - rightOperand;
        	  else if(operator.equals("/"))
              result = leftOperand / rightOperand;
        	  else if(operator.equals("*"))
              result = leftOperand * rightOperand;
        	  else result = 0;

        	  System.out.println("Result: " + result);
       }
          }
       catch (NoSuchElementException nsee)
       {
          System.out.println("Invalid syntax");
       }
    

       }
    }
