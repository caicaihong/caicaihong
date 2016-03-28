import java.util.InputMismatchException;
import java.util.Scanner;
public class fulifourth {
	public static void main(String[] args) {
		double amount ;
		 double rate  ;
		 double year,result,p;
		 result=0;
		 p=0;
		 Scanner keyboard = new Scanner(System.in);
		String ch ="n";
		 System.out.println("请选择，单利计算本息输入s:");
		 System.out.println("复利计算本息输入d:");
		 System.out.println("计算本金输入m:");
		 System.out.println("复利计算时间输入t:");
		 System.out.println("计算利率请输入输入r:");
		 System.out.println("基金定投收益计算预期收益请输入j:");
		 System.out.println("计算贷款偿还本息请输入h:");	 
		ch =keyboard.nextLine();	
		if ( ch.equals("d")||ch.equals("D"))
		{	
			try{
	 		 System.out.println("请输入本金:");
	 		 amount = keyboard.nextDouble();
	 			 System.out.println("请输入利率（整数）:");
	 		 rate = keyboard.nextDouble();
	 			 rate = rate/100;
	 			 System.out.println("请输入时间:");
	 			 year = keyboard.nextInt();
			 for (int x = 1; x < year; x++){
	 				amount = amount * Math.pow(1.0 + rate, year);
	 			    }
			 System.out.println("结果为"+amount);
			}catch(InputMismatchException e)
			{
				System.out.println("您的输入有误，请重新输入");
				//goto a;
			}
		}
		
		else if(ch.equals("s")||ch.equals("S"))
		{
			try{
	 		 System.out.println("请输入本金:");
	 		 amount = keyboard.nextDouble();
	 			 System.out.println("请输入利率（整数）:");
	 		 rate = keyboard.nextDouble();
	 			 rate = rate/100;
	 			 System.out.println("请输入时间:");
	 			 year = keyboard.nextInt();
		 for (int x = 1; x < year; x++){
			amount =   amount*(1+rate*year);
		    }
		System.out.println("结果为"+amount);
			}catch(InputMismatchException e)
			{
				System.out.println("您的输入有误，请重新输入");
				//goto a;
			}
		}
		else if(ch.equals("m")||ch.equals("M"))
		{
			try{
			 System.out.println("请输入本息:");
	 		 amount = keyboard.nextDouble();
	 			 System.out.println("请输入利率（整数）:");
	 		 rate = keyboard.nextDouble();
	 			 rate = rate/100;
	 			 System.out.println("请输入时间:");
	 			 year = keyboard.nextInt();
		 for (int x = 1; x < year; x++){
			p= (rate+1)*x;
		    }
		 result=amount/p;
		 
		System.out.println("结果为"+result);	
			}catch(InputMismatchException e)
			{
				System.out.println("您的输入有误，请重新输入");
				//goto a;
			}
		}
		else if(ch.equals("t")||ch.equals("T"))
		{   double amount1,amount2;
		double time;
		try{
			a:System.out.println("请输入本金:");
	 		 amount1 = keyboard.nextDouble();
	 		 System.out.println("请输入本息:");
	 		 amount2 = keyboard.nextDouble();
	 			 System.out.println("请输入利率（整数）:");
	 		 rate = keyboard.nextDouble();
	 			 rate = rate/100;	 
        time= (Math.log(amount2/amount1)/Math.log(1+rate));
        System.out.println("结果为"+time);
		}catch(InputMismatchException e)
		{
			System.out.println("您的输入有误，请重新输入");
			//goto a;
		}
		
		}
		else if(ch.equals("r")||ch.equals("R"))
		{   double amount1,amount2;
	      double rate1 =0;
	      try{
			System.out.println("请输入本金:");
	 		 amount1 = keyboard.nextDouble();
	 		 System.out.println("请输入本息:");
	 		 amount2 = keyboard.nextDouble();
	 			 System.out.println("请输入时间:");
	 			 year = keyboard.nextInt();			 
	 			rate1=amount2/amount1/year;
		System.out.println("结果为"+rate1);
	      }catch(InputMismatchException e)
			{
				System.out.println("您的输入有误，请重新输入");
				//goto a;
			}
		}
		else if(ch.equals("j")||ch.equals("J"))
		{   
	      double m, m1,m2,m3;int year1,p1,rate1,amount3;
               m1=0;m2=0;m3=0;;
               try{
			System.out.println("请输入定投金额:");
	 		 amount3 = keyboard.nextInt();
	 		 System.out.println("请输入收益率（整数）:");
	 		 rate1 = keyboard.nextInt();
	 		 rate1=rate1/100;
	 			 System.out.println("请输入定投期数（时间）:");
	 			 year1 = keyboard.nextInt();			 
	 			m1=amount3*(1+rate1);
	 			 m2=-1+Math.pow((1+rate1),year1)	;
	 			m3=m1*m2;
	 		
	 		m=m3*rate1;
	 			
	System.out.println("结果为"+m);
               }catch(InputMismatchException e)
       		{
       			System.out.println("您的输入有误，请重新输入");
       			//goto a;
       		}
		}
		else if(ch.equals("h")||ch.equals("H"))
		{    double amount1,amount2;
		try{
			 System.out.println("请输入贷款金额:");
	 		 amount = keyboard.nextDouble();
	 			 System.out.println("请输入利率（整数）:");
	 		 rate = keyboard.nextDouble();
	 			 rate = rate/100;
	 			 System.out.println("请输入时间:");
	 			 year = keyboard.nextInt();
		amount1=amount*rate*Math.pow((1+rate),year );
		amount2=Math.pow(1+rate, year-1);
		
		 result=amount1/amount2;
		 
		System.out.println("结果为"+result);	
		}catch(InputMismatchException e)
		{
			System.out.println("您的输入有误，请重新输入");
			//goto a;
		}
		}
	
	}
}
