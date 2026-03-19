class A{
    int a=10;
}
class B extends A{
    int a= 20;
    void show(){
        System.out.println(a);               // prints a=20
        System.out.println(super.a);         // prints a= 10 [super class value]  
    }
}
class Super_variable{
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}