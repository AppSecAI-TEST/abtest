package test;

import java.util.Date;

public class GarbageCollection {
	public GarbageCollection() {

	}	
	
	public static void main(String[] args) throws Exception {
		 Runtime r = Runtime.getRuntime();
	     System.out.println(r.totalMemory());
	      System.out.println(r.totalMemory()-r.freeMemory());
	      GarbageCollection collectMe=null;
		for(int i=0;i<10;i++){
			 collectMe= garbage();
		//	if(i==9){
				collectMe.disp();
				//break;
			//}
       }
        r.gc();
        collectMe.disp();
        System.out.println(r.totalMemory()-r.freeMemory());
        Thread.sleep(1000);
    }

    public static GarbageCollection garbage() {
    	GarbageCollection g= new GarbageCollection();
    	return g;
    }
    
    public void disp(){
    	System.out.println("Disp Called");
    }

    @Override
    protected void finalize() {
        System.out.println(Thread.currentThread().getName() + ": Yes  collected !!!!");
    }
}