                            // class & objects //

class Demo{
    int a=10; String b= "Parth";
    void show(){
        System.out.println(a+ " " +b);
    }
}
class ClassObject{
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.show();
    }
}