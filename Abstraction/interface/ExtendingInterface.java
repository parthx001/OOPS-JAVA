                                            // Extending Interface //

interface A {
    void add();
}
interface B{
    void sub();
}
class C implements A,B{
    @Override
    public void add(){
        int a = 2, b=30;
        int c=a+b;
        System.out.println("Addition : "+c);
    }
    @Override
    public void sub(){
        int a=80,b=30;
        int c=a-b;
        System.out.println("Subtraction: "+c);
    }    
}
class ExtendingInterface {
    public static void main(String[] args) {
        C obj = new C();
        obj.add(); obj.sub();
    }
}