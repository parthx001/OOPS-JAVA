class A{
    int a; double b; String c;
    A(){
        a=10; b=10.36; c="Parth";
    }
    A(int x){
        a=x;
    } 
    A(double y, String s){
        b=y;
        c=s;
    }
}
class Cons_Overloading{
    public static void main(String[] args) {
        A r = new A();
        A r2 = new A(20);
        A r3 = new A(23.66, "Parth");
        System.out.println(r.a +" "+ r.b +" "+ r.c);
        System.out.println(r2.a);
        System.out.println(r3.b +" "+ r3.c);
    }
}