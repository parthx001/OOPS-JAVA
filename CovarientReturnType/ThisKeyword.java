class A {
    A show(){
        System.out.println("super class");
        return this;  // this ->> new A()
    }
}
class B extends A {
    @Override
    
    B show(){
        super.show();
        System.out.println("Sub class");
        return this;
    }
}
class ThisKeyword{
    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
}