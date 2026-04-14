
public class MethodOverload {
    void add(){
        int a=10,b=20;
        int c=a+b;
        System.out.println(c);
    }
    int add(int x,int y){
        int c= x+y;
        System.out.println(c);
        return 0;
    }
    void  add (int a, double b){
        double c= a+b;
        System.out.println(c);
    }
    public static void main(String[] args) {
        MethodOverload obj = new MethodOverload();
        obj.add();
        obj.add(25,360);
        obj.add(20,23.66);


    }
}
