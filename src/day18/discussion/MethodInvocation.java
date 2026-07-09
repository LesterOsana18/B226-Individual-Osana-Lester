package day18.discussion;

public class MethodInvocation {

	public static void main(String[] args) {
        MethodInvocation obj = new MethodInvocation();
        obj.b();
        a();
    }
    
    
    // Static method
    public static void a(){
        System.out.println("Accessing static method...");
    }
    
    // Instance method
    public void b() {
        System.out.println("Accessing instance method...");
    }
    
}
