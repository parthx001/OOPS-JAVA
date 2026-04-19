interface A {
    // default void call(){
    //     add(20,10);
    // }
    
    // private  void add(int x, int y){
    //     System.out.println(" Sum : " + (x+y));
    // }
    public static void call(){
        add(20,10);
    }
    private static void add(int x, int y){
        System.out.println(" Sum : " + (x+y));
    }
}
class B implements A {
    public void sub (int x , int y){
        System.out.println(" subtraction : "+ (x-y));
    }
}
class InterfacePrivateMethod{
    public static void main(String[] args) {
        B b = new B();
        // b.call();
        A.call();
        b.sub(50,30);
    }
}