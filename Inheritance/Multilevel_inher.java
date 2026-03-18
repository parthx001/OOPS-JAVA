class A{            // Super or Parent class
    int a, b, c;
    void add(){
        a=10;
        b=9;
        c=a+b;
        System.out.println("Addition: " + c);
    }
}
class B extends A{      // Sub 1 class
    void sub(){
        a=30;b=20;
        c=a-b;
        System.out.println("Subtraction: "+ c);
    }
}
class C extends B{      // sub 2 class
    void mul(){
        a=90;b=4;
        c=a*b;
        System.out.println("Multiplication: "+ c);
    }
}
class D extends C{      // sub 3 class
    void div(){
        a=60;b=3;
        c=a/b;
        System.out.println("Division: "+ c);
    }
}
class Multilevel_inher{                 
    public static void main(String[] args) {
        D obj = new D();
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
    }
}