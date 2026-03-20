class This_refference{
    void show(){
        System.out.println(this);                           // prints the refference value 
    }
    public static void main(String[] args) {
        This_refference r = new This_refference();
        System.out.println(r);                                 // prints the ref value 
        r.show();
    }
}