import java.util.*;
interface client{
    void input(); // public+abstract
    void output(); // public+abstract
}
class InterfaceClass implements client{
    String name; double sal;
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Username: ");
        name = sc.nextLine();

        System.out.print("Enter Sallary: ");
        sal = sc.nextDouble();
    }
    public void output(){
        System.out.println(name + " " + sal);
    }
    public static void main(String[] args) {
        client c = new InterfaceClass();
        c.input();c.output();
    }
}