class A {
    private int value;
    public void setvalue(int x){
        value = x;
    }
    public int  getvalue(){
        return value;
    }
}
class Encapsulation{
    public static void main(String[] args) {
        A obj = new A();
        obj.setvalue(200);
        System.out.println(obj.getvalue());
    }
}