package june_20;

public class Day_Scholar extends Student {
	double Transport_fee;

	public Day_Scholar() {
		super();
	}

	public Day_Scholar(double transport_fee,int id,String name,double exam_fee) {
		super(id,name,exam_fee);
	    
		Transport_fee = transport_fee;
	}
	
	String DisplayDetails() {
   	 return toString();
   }
   

	@Override
	public String toString() {
		return "Day_Scholar [Transport_fee=" + Transport_fee + ", Student_Id=" + Student_Id + ", Student_name="
				+ Student_name + ", Student_examfee=" + Student_examfee + "]";
	}

	double pay_fee(double amount) {
		 
		double topay=(this.Transport_fee+super.Student_examfee)-amount;
		return topay;
      
      }
	

}
