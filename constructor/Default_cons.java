class A{
    int a; String b; Boolean c;
    A(){//default constructor
        a=10;b="parth";c=true;
    }
    void disp(){
        System.out.println(a+ " "+ b +" "+ c);
    }
}
class Default_cons{
    public static void main(String[] args) {
        A obj= new A();
        obj.disp();
    }
}