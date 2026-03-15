class A{
    int x,y;
    A(int a, int b){    //parameterized constructor
        x=a;y=b;
    }
    void show(){
        System.out.println(x+ " " +y);
    }
}
class ParameterizedCons{
    public static void main(String[] args) {
        A obj = new A(10, 20);
        obj.show();
    }
}