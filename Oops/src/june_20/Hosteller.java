package june_20;

public class Hosteller extends Student {

	 double hostelFee;

	 
	public Hosteller() {
		super();
	}


	public Hosteller(double hostelFee,int id,String name,double exam_fee) {
		 super(id,name,exam_fee);
		this.hostelFee = hostelFee;
	}
	 
	@Override
	public String toString() {
		return "Hosteller [hostelFee=" + hostelFee + ", Student_Id=" + Student_Id + ", Student_name=" + Student_name
				+ ", Student_examfee=" + Student_examfee + "]";
	}


	double pay_fee(double amount) {
		 
		double topay= (this.hostelFee+super.Student_examfee)-amount;
		return topay;
      
      }
}
