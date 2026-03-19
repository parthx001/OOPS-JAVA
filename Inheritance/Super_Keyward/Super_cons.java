class A{
    A(){
        System.out.println("Hello World");
    }
}
class B extends A{
    B(){
        // super()              ---- called by compiler automatically
        System.out.println("Hello Java");               // prints "Hello world"                              
    }
}
class Super_cons{
    public static void main(String[] args) {
        B obj = new B();
    }
}