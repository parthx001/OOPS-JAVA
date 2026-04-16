                                                //  Multiple Inheritance Using Java //

interface A {
    void Show();
}
interface B {
    void Disp();
}
class MultipleInheritance implements A,B{
    
    public void Show(){
        System.out.println("Inheritance A");
    }
    public void  Disp(){
        System.out.println("inheritance B");
    }
    public static void main(String[] args) {
        MultipleInheritance m = new MultipleInheritance();
        m.Show();m.Disp();
    }

}