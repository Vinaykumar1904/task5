package com.logger.vinay.com.Task5;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.logging.Logger;

public class CalculateInterest {
	private static final Logger logger=Logger.getLogger(CalculateInterest.class.getName());
    public static void main( String[] args ) throws IOException
    {
    	Scanner sc = new Scanner(System.in);
    	logger.info("Choose either option 1 or 2 :"+"\n"+"1.Simple Interest"+"\n"+"2.Compound Interest"+"\n");
    	SimpleInterest simpleInterest = new SimpleInterest();
    	CompoundInterest compoundInterest = new CompoundInterest();
    	int choice = sc.nextInt();
    	switch(choice){
    		case 1:simpleInterest.readValues();
    			   simpleInterest.calculateSimpleInterest();
    			   simpleInterest.displayAmount();
    			   break;
    		case 2:compoundInterest.readValues();
			   compoundInterest.calculateCompoundInterest();
			   compoundInterest.displayAmount();
			   break;
			default:logger.info("Please Enter Valid Option!");
    	}
    }

}
