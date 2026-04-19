class A {
    void add(int ... a){
        int sum = 0;
        for (int x : a){            //      --> for ech loop. 
            sum = sum+x;
        }
        System.out.println("Sum of numbers :"+ sum);
    }
}

class VarArgs {
    public static void main(String[] args) {
        A a = new A();
        a.add();a.add(10);a.add(10,20);a.add(10,50,30,20,55,39,65);
    }
}