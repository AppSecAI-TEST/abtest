package test;
public class OSFactory {
    public static OS getInstance(String str){
        if("Open".equals(str)){
            return new Android();
        }
        else if("secured".equals(str)){
            return new IOS();
        }
        else{
            return new Windows();
        }
    }
}
 
// Get different- different Object by using the benefit of run time polymorphism :--
 
    