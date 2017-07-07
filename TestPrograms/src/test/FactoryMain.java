package test;
public class FactoryMain {
    public static void main(String[] args) {
        OS android=OSFactory.getInstance("Open");
        android.spec();
        OS ios=OSFactory.getInstance("secured");
        ios.spec();
        OS window=OSFactory.getInstance("None");
        window.spec();
    }
}
