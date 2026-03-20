class This_default_cons{
    This_default_cons(){
        System.out.println("hello ");
    }
    This_default_cons(int a){
        this();                             // without this() prints only 7.
        System.out.println(a);
    }
    public static void main(String[] args) {
        This_default_cons r = new This_default_cons(7);
        
    }
}