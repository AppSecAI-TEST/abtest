package test2;
class Genirics<X> {
		X t;
		Genirics(X t){
			this.t=t;
		}
		
		public void show(){
			System.out.println("The type of object : "+ t.getClass().getName());
		}
		
		X getObj(){
			return t;
		}
}

public class DemoGenirics {
	public static void main(String[] args) {
		
		Genirics<String> str =new Genirics<String>("String");
		
		str.show();// The type of object : java.lang.String
		System.out.println(str.getObj());//String
		
		Genirics<Integer> intr =new Genirics<Integer>(1);
		
		intr.show();//The type of object : java.lang.Integer
		System.out.println(intr.getObj());//1
		
		Genirics<Double> doub =new Genirics<Double>(1.0d);
		doub.show();//The type of object : java.lang.Double
		System.out.println(doub.getObj());//1.0
		
		
	}
}
