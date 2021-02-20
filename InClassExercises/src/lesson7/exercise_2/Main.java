package lesson7.exercise_2;

public class Main {

	public static void main(String[] args) {
		System.out.println(Constants.COMPANY);
		System.out.println(Constants.SALES_TARGET);
		System.out.println();
		
		//Using Enums instead of the class Constants
		System.out.println(Const.COMPANY.val);
		System.out.println(Const.SALES_TARGET.val);
		System.out.println();
		int i = Integer.parseInt(Const.SALES_TARGET.val);
		System.out.println(i);
	}
	
	public enum Const{
		COMPANY("Microsoft"),
		SALES_TARGET("200000000");
		String val;
		
		
		Const(String s){
			val = s;
		}
		
		public String val() {
			return val; 
		}	
	}
}
