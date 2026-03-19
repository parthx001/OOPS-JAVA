class A{
    void show(){
        System.out.println("Hello World");
    }
}
class B extends A{
    void show(){
        System.out.println("Hello Java");               // prints "Hello world"
        super.show();                                      // prints "Hello Java" [super class value]  
    }
}
class Super_method{
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}