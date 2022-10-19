package may102022;
import may_06_2022.*;
public class AlarmSound extends IevenClass {

	String ringAlarm(int m,boolean k) {
		
		if((m<=0 && m>=6) ||(k!=true && k!=false)) {
			return "Invalid Inputs";
		}
		else if((m>=1 && m<=5) &&(k==true)) {
			return "10:00";
		}
		else if((m>=1 && m<=5) &&(k==false)) {
			return "07:00";
		}
		else if((m==0 ||m==6)&& (k==true)) {
			return "OFF";
		}
		else if((m==0 ||m==6)&& (k==false)) {
			return "10:00";
		}
		else {
			return "hh";
		}

	}
	
	public static void main(String[] args) {
		String n=new AlarmSound().ringAlarm(5, true);
		 System.out.println(n);
		System.out.println(n);
		
	}

}
