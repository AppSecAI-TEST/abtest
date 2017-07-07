package test;


public class Test {
	
	public static void main(String[] args) {
		Test t = null;
		 
		Runtime r = Runtime.getRuntime();
		r.gc();
		for(int i=0;i<10;i++){
			t=new Test();
			t=null;
		}
		r.gc();
	}
	
	@Override
	protected void finalize(){
		System.out.println("i'm going to End");
	}

}
