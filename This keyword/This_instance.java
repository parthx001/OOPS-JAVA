class This_instance{
    int a;                                  // instance variable (a=0)
    This_instance(int a){                   // local variable (a)
        this.a=a;                                   // if a=a - jvm gets confused- use this 
    }
    void show(){
        System.out.println(a);
    }
    public static void main(String[] args) {
        This_instance r = new This_instance(69);
        r.show();
    }
}