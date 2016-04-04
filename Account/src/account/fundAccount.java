package account;

public class fundAccount {
	private double rare ;
 	private double loan ;
 	private int time ;
 	public fundAccount (String Rare, String Loan, String Time) {
 		this.rare = Double.valueOf(Rare);
 		this.loan = Double.valueOf(Loan);
 		this.time = Integer.valueOf(Time);
 	}
 	
 	public double Account () {
 		double f = 0 ;
 		if (rare > 0 || loan > 0 || time > 0) {
 			rare = rare/12.0;
 			int month = time*12;
 			f = loan*rare*Math.pow((1.0+rare), month)/(Math.pow(1.0+rare, month)-1);
 
 		} else {
 
 		}
 		
 		return f ;
 	}

}
