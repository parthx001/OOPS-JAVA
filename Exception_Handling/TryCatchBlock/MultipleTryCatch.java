class MultipleTryCatch{
    public static void main(String[] args) {
        try {
            int a=90,b=0,c;
            c=a/b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("Number can't be devided by zero");
        }
        try {
            int a[]={10,20,30};
            System.out.println(a[4]);
        } catch (Exception e) {
            System.out.println("Array element id out of bound");
        }
    }
}