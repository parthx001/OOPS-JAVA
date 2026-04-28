class FinallyBlock{
    public static void main(String[] args) {
        try{
            System.out.println("Hello World");
            int a=10,b=2,c;
            c=a/b;
            System.out.println(c);
            System.out.println("try block");
        }
        catch(ArithmeticException e ){
            System.out.println(e);
        }
        finally{
            System.out.println("Finally Block Must Execute!");
        }
        System.out.println("...... End ......");
    }
}