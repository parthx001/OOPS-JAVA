class A{
    int a; String name;
    // [constructor]
    A(){
        a=10; name="Parth";
    }
    void show(){
        System.out.println(a+ " " +name);
    }
}
class Const{
    public static void main(String[] args) {
        A obj=new A();
        obj.show();
    }
}