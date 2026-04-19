interface A {
    static void disp(){
        System.out.println("Can't override interface static method");
    }
}
class InterfaceStaticMethod{
    public static void main(String[] args) {
        A.disp();
    }
}