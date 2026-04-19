interface A {
    void a1();
    void b1();
    default void c1(){
        System.out.println(" Default method ");
    };
}
class B implements A {
    public void a1(){
        System.out.println(" class B method a1");
    }
    public void b1(){
        System.out.println(" class B method b1");
    }
    public void c1(){
        System.out.println(" Overriding in implemented class");
    }

}
class C implements A {
    public void a1(){
        System.out.println(" class C method a1");
    }
    public void b1(){
        System.out.println(" class C method b1");
    }
}
class D implements A {
    public void a1(){
        System.out.println(" class D method a1");
    }
    public void b1(){
        System.out.println(" class D method b1");
    }
}
class InterfaceDefaultMethod{
    public static void main(String[] args) {
        B b = new B();
        b.a1();b.b1();b.c1();
        C c = new C();
        c.a1();c.b1();c.c1();
        D d = new D();
        d.a1();d.b1();d.c1();
    }
}