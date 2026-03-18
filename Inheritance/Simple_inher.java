class Super{
    int roll, marks;
    String name;
    void input(){
        System.out.println(roll + " " + marks + " " + name);
    }
}
class Simple_inher extends Super{
    void disp(){
        int roll=35, marks=89;
        String name="Parth";
        System.out.println(roll + " " + marks + " " + name);
    }
    public static void main(String[] args) {
        Simple_inher s = new Simple_inher();
        s.disp();
    }
}