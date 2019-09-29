package samdhaba;
import java.util.*;
class SamDhaba
{
	public static void main(String []args)
	{
		int n,sum=0;
		double gst;
		double total;
		String Veg []={"1.shahi paneer @100/plate","2.muttar paneer @100/plate","3.paneer butter masala @120/plate","4.kadhai paneer @120/plate",
	                     "5.paalak paneer @110/plate","6.paneer handi @150/plate","7.paneer bhurjii @150/plate","8.paneer do pyaja @140/plate",
	                     "9.kali mirch tadka paneer @140/plate","10.khoya paneer @120/plate","11.paneer lababdaar @140/plate"};
	    String NonVeg []={"1.chicken cury @170/plate","2.chicken butter masala @190/plate","3.chicken handi @200/plate","4.chicken tikka 130/plate",
	                     "5.kadhai chicken @170/plate","6.muttan cury @200/plate","7.murgh masala @230/plate","8.chicken do pyaja @220/plate",
	                     "9.Egg cury @100/plate","10.murgh tadka cheese @240/plate","11.Egg bhurjii @110/plate"};
	    String VegNonVeg []={"1.shahi paneer @100/plate","2.muttar paneer @100/plate","3.paneer butter masala @120/plate","4.kadhai paneer @120/plate",
	                     "5.paalak paneer @110/plate","6.paneer handi @150/plate","7.paneer bhurjii @150/plate","8.paneer do pyaja @140/plate",
	                     "9.kali mirch tadka paneer @140/plate","10.khoya paneer @120/plate","11.paneer lababdaar @140/plate","12.chicken cury @170/plate",
	                     "13.chicken butter masala @190/plate","14.chicken handi @200/plate","15.chicken tikka 130/plate","16.kadhai chicken @170/plate",
	                     "17.muttan cury @200/plate","18.murgh masala @230/plate","19.chicken do pyaja @220/plate","20.Egg cury @100/plate",
	                     "21.murgh tadka cheese @240/plate","22.Egg bhurjii @110/plate"};
	    System.out.println("Welcome to the SamDhaba : @THE_BEST_FOOD :) " );
	    System.out.println();
	    System.out.println("~~~~~~OM~~~~~~NAMAH~~~~~~SHIVAAYE~~~~~~ :)");
	    Scanner sc=new Scanner(System.in);
	    int l1=Veg.length;
	    int l2=NonVeg.length;
	    int l3=VegNonVeg.length;

	    System.out.println();
	    System.out.println("Choose 1 for Veg: ");
	    System.out.println("Choose 2 for NonVeg: ");
	    System.out.println("Choose 3 for VegNonVeg: ");
        n=sc.nextInt();
        if(n==1)
        {
        	for(int i=0;i<l1;i++)
        	{
        		System.out.println(Veg[i]);
        	}
            System.out.println("********************************************************************************************************");
        	System.out.println("How many veg items do you want to buy??");
        	int a=sc.nextInt();
        	System.out.println("Please select " + a + " items");
        	for(int i=1;i<=a;i++)
        	{
        		int p=sc.nextInt();
        	switch(p)
	     	{
			case 1:
			System.out.println("shahi paneer @100/plate ");
			sum=sum+100;
			break;
		    case 2:
		    System.out.println("muttar paneer @100/plate ");
		    sum=sum+100;
		    break;
		    case 3:
		    System.out.println("paneer butter masala @120/plate");
		    sum=sum+120;
		    break;
		    case 4:
		    System.out.println("kadhai paneer @120/plate");
		    sum=sum+120;
		    break;
		    case 5:
		    System.out.println("paalak paneer @110/plate");
		    sum=sum+110;
		    break;
		    case 6:
		    System.out.println("paneer handi @150/plate");
		    sum=sum+150;
		    break;
		    case 7:
		    System.out.println("paneer bhurjii @150/plate");
		    sum=sum+150;
		    break;
		    case 8:
		    System.out.println("paneer do pyaja @140/plate");
		    sum=sum+140;
		    break;
		    case 9:
		    System.out.println("kali mirch tadka paneer @140/plate");
		    sum=sum+140;
		    break;
		    case 10:
		    System.out.println("khoya paneer @120/plate");
		    sum=sum+120;
		    break;
		    case 11:
		    System.out.println("paneer lababdaar @140/plate");
		    sum=sum+140;
		    break;
		    default:
		    System.out.println("Invalid !tems: ");
		}
	}
}
else if(n==2)
{
	for(int i=0;i<l2;i++)
	{
		System.out.println(NonVeg[i]);
	}
	System.out.println("****************************************************************************************************************");
	System.out.println("How many non-veg items do you want to buy??");
	int b=sc.nextInt();
	System.out.println("Please select " + b +" items");
	for(int i=1;i<=b;i++)
	{
		int p1=sc.nextInt();
	        switch(p1)
	     	{
			case 1:
			System.out.println("chicken cury @170/plate");
			sum=sum+170;
	        break;
		    case 2:
		    System.out.println("chicken butter masala @190/plate");
            sum=sum+190;
		    break;
		    case 3:
		    System.out.println("chicken handi @200/plate");
		    sum=sum+200;
		    break;
		    case 4:
		    System.out.println("chicken tikka 130/plate");
		    sum=sum+130;
		    break;
		    case 5:
		    System.out.println("kadhai chicken @170/plate");
		    sum=sum+170;
		    break;
		    case 6:
		    System.out.println("muttan cury @200/plate");
		    sum=sum+200;
		    break;
		    case 7:
		    System.out.println("murgh masala @230/plate");
		    sum=sum+230;
		    break;
		    case 8:
		    System.out.println("chicken do pyaja @220/plate");
		    sum=sum+220;
		    break;
		    case 9:
		    System.out.println("Egg cury @100/plate");
		    sum=sum+100;
		    break;
		    case 10:
		    System.out.println("murgh tadka cheese @240/plate");
		    sum=sum+240;
	        break;
		    case 11:
		    System.out.println("Egg bhurjii @110/plate");
		    sum=sum+110;
		    break;
		    default:
		    System.out.println("Invalid !tems: ");
		    }  
		      
}
		}
		else if(n==3)
		{
			for(int i=0;i<l3;i++)
	       {
		       System.out.println(VegNonVeg[i]);
	       }
	        System.out.println("********************************************************************************************************");
	        System.out.println("How many non-veg items do you want to buy??");
	        int c=sc.nextInt();
	        System.out.println("Please select " + c +" items");
	        for(int i=1;i<=c;i++)
	        {
		    int p2=sc.nextInt();
		    switch(p2)
	     	{
	     	case 1:
			System.out.println("shahi paneer @100/plate ");
			sum=sum+100;
			break;
		    case 2:
		    System.out.println("muttar paneer @100/plate ");
		    sum=sum+100;
		    break;
		    case 3:
		    System.out.println("paneer butter masala @120/plate");
		    sum=sum+120;
		    break;
		    case 4:
		    System.out.println("kadhai paneer @120/plate");
		    sum=sum+120;
		    break;
		    case 5:
		    System.out.println("paalak paneer @110/plate");
		    sum=sum+110;
		    break;
		    case 6:
		    System.out.println("paneer handi @150/plate");
		    sum=sum+150;
		    break;
		    case 7:
		    System.out.println("paneer bhurjii @150/plate");
		    sum=sum+150;
		    break;
		    case 8:
		    System.out.println("paneer do pyaja @140/plate");
		    sum=sum+140;
		    break;
		    case 9:
		    System.out.println("kali mirch tadka paneer @140/plate");
		    sum=sum+140;
		    break;
		    case 10:
		    System.out.println("khoya paneer @120/plate");
		    sum=sum+120;
		    break;
		    case 11:
		    System.out.println("paneer lababdaar @140/plate");
		    sum=sum+140;
		    break;	
			case 12:
			System.out.println("chicken cury @170/plate");
			sum=sum+170;
	        break;
		    case 13:
		    System.out.println("chicken butter masala @190/plate");
            sum=sum+190;
		    break;
		    case 14:
		    System.out.println("chicken handi @200/plate");
		    sum=sum+200;
		    break;
		    case 15:
		    System.out.println("chicken tikka 130/plate");
		    sum=sum+130;
		    break;
		    case 16:
		    System.out.println("kadhai chicken @170/plate");
		    sum=sum+170;
		    break;
		    case 17:
		    System.out.println("muttan cury @200/plate");
		    sum=sum+200;
		    break;
		    case 18:
		    System.out.println("murgh masala @230/plate");
		    sum=sum+230;
		    break;
		    case 19:
		    System.out.println("chicken do pyaja @220/plate");
		    sum=sum+220;
		    break;
		    case 20:
		    System.out.println("Egg cury @100/plate");
		    sum=sum+100;
		    break;
		    case 21:
		    System.out.println("murgh tadka cheese @240/plate");
		    sum=sum+240;
	        break;
		    case 22:
		    System.out.println("Egg bhurjii @110/plate");
		    sum=sum+110;
		    break;
		    default:
		    System.out.println("Invalid !tems: ");
		    }
		}
	}
	        System.out.println("\n");
		    System.out.println("********************************************************************************************************");
		    System.out.println("********************************************************************************************************");
		    System.out.println("your food amount is: "  + sum +"Rs");
		    gst=(sum*0.18);
		    System.out.println("your gst amount is: " + gst +"Rs");
		    total=(sum+gst);
		    System.out.println("Your total amount is: " + total +"Rs");
		    System.out.println();
		    System.out.println("Thank you for visiting the SamDhaba :) ");
	}
}