class A{

    int a,b;
    void show(){
        a= 30;
        b=50;
        System.out.println(a + " " + b);      // method         ........    3rd
    }
    A(){
        a=80;
        b=40;
        System.out.println(a + " " + b);      // constructor    ........    2nd
    }

    {
        a=10;
        b=90;
        System.out.println(a + " " + b);        // instance block   ......  1st
    }
}

class Instance_block{
    public static void main(String[] args) {
        A r =new A();
        r.show();
    }
}