class A{
    void  input(){
        System.out.println("What is your name? ");
    }
}
class B extends A{
    void show(){
        System.out.println("My name is Parth.");
    }
}
class C extends  A {
    void disp(){
        System.out.println("My name is Tiger.");
    }
}
class Hierarchical_inher{
    public static void main(String[] args) {
        B obj1 = new B();
        C obj2 = new C();
        obj1.input();obj1.show();
        obj2.input();obj2.disp();
    }
}