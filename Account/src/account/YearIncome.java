package account;

public class YearIncome {
 	private double rare ;
 	private double inv ;
 	private int time ;
 	
 	public YearIncome(String Rare, String Investment, String Time) {
 		this.rare = Double.valueOf(Rare);
 		this.inv = Double.valueOf(Investment);
 		this.time = Integer.valueOf(Time);
 
 	}
 	public double Account () {
 		double f = 0 ;
   		if (inv > 0 && rare > 0 && time > 0) {
   			f = inv * (1.0 + rare) * (-1 + Math.pow(1.0 + rare, time)) / rare;
     		} else {
     			
     		}
 		
 		return f;
 	}
 

}
