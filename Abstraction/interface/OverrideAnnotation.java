class A {
    void show(){
        System.out.println(" Superclass method");
    }
}
class B extends A {
    @Override
    void show(){
        System.out.println(" Sub method");
    }
}
class OverrideAnnotation{
    public static void main(String[] args) {
        B b = new B();
        b.show();   
    }
}