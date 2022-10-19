package june_20;

public class Student {
   int Student_Id;
     String Student_name;
     double Student_examfee;
     
     
	public Student() {
		Student_Id=00;
		Student_name="empty";
		Student_examfee=00;
	}

	public Student(int student_Id, String student_name, double student_examfee) {
		super();
		Student_Id = student_Id;
		Student_name = student_name;
		Student_examfee = student_examfee;
	}
      
        String DisplayDetails() {
        	 return toString();
        }
        
      
          @Override
		public String toString() {
			return "Student [Student_Id=" + Student_Id + ", Student_name=" + Student_name + ", Student_examfee="
					+ Student_examfee + "]";
		}

		double pay_fee(double amount) {
			 
			double topay=this.Student_examfee-amount;
			return topay;
          
          }
}