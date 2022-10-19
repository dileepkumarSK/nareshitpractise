package strings;

public class Tcs2Mock2Exam {

	public static void main(String[] args) {
		StudentServiceTCS ss=new StudentServiceTCS();
		String [] a=ss.getName(new String[] {"10,ankit,mh","11,laxman,ts","01,Dileep,Ap"});
		
		for(String i:a)
			System.out.println(i);
		
		System.out.println();
		
		String stdFullDet=ss.getStudents(new String[] 
				{"10,ankit,mh","11,laxman,ts","01,Dileep,Ap"},"laxman");
		
		
		System.out.println(stdFullDet);
		
		}
	

}
