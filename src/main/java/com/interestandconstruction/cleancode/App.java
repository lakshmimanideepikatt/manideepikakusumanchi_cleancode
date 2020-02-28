package com.interestandconstruction.cleancode;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map.Entry;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("For House Construction enter 1\nFor Intrest calculation enter 2");
        Scanner sc=new Scanner(System.in);
        int option=sc.nextInt();
        if(option==1) {
        	HashMap<String,Integer>housingStandards=new HashMap<String,Integer>();
        	housingStandards.put("below average", 1500);
        	housingStandards.put("average",2000);
        	housingStandards.put("above average", 2500);
        	housingStandards.put("excellent",3000);
        	for(Entry<String,Integer>map:housingStandards.entrySet()) {
        		System.out.println("Type of house materials "+map.getKey()+" has a cost of "+map.getValue());
        	}
        	System.out.println("Enter the amount corresponding to standard you want to construct");
        	int standardSelected=sc.nextInt();
        	System.out.println("Enter number of yards in site");
        	int yards=sc.nextInt();
        	long totalCost=1l*yards*standardSelected;
        	System.out.println("Total cost for construction of building is: "+totalCost);
        }
        else if(option==2) {
    		System.out.println("Enter principalamount");
    		float principalAmount = sc.nextFloat();
    		System.out.println("Enter rateofinterset");
        	float  rateOfInterestPerYear = sc.nextFloat();
        	System.out.println("Enter number of years");
        	int years = sc.nextInt();
            System.out.println("To calculate Simple Interest enter 1");
            System.out.println("To calculate Compound Interest enter 2");
            int interestOption= sc.nextInt();
            if(interestOption== 1) {        	
            	SimpleInterest SI = new SimpleInterest(principalAmount,years,rateOfInterestPerYear);
            	System.out.println(SI.computeSimpleInterest());
            }
           else if(interestOption == 2) {
            	CompoundInterest CI = new CompoundInterest(principalAmount,years,rateOfInterestPerYear);
            	System.out.println(CI.computeCompoundInterest());
            }
            else {
            	System.out.println("Not a valid entry");
            }
        }
        else {
        	System.out.println("Not a valid entry");
        }
     }
}
