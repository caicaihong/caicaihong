package account;

public class TimeAccount {
	private double rate ;
 	private double principal ;
 	private double earnings ;
 	private int count ;
 	
 	public TimeAccount(String Rate, String Principal, String Earnings, String Count) {
 		this.rate = Double.valueOf(Rate);
 		this.principal = Double.valueOf(Principal);
 		this.earnings = Double.valueOf(Earnings);
 		this.count = Integer.valueOf(Count);
 	}
 
 	public int Account () {
 		int t = 0 ;
    		if (earnings > 0 || rate > 0 || principal > 0 || count > 0) {
 				rate = Math.pow(1+rate/count, count)-1;
 				t = (int)(Math.log(earnings/principal)/Math.log(1+rate));
     			
     		} else {
     			
     		}
 		return t ;
 	}

}
