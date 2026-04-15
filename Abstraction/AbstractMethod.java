abstract class Programming{
    abstract public void dev();
    abstract public void rank();
}
class HTML extends Programming{
    @Override
    public void dev(){
        System.out.println("Tim Berners Lee");
    }
    @Override
    public void rank(){
        System.out.println("3rd");
    }
}
class Java extends Programming{
    @Override
    public void dev(){
        System.out.println("James Goslin");
    }
     @Override
    public void rank(){
        System.out.println("2nd");
    }
}
class AbstractMethod{
    public static void main(String[] args) {
        Programming h = new Java();
        h.dev();h.rank();
        Programming p = new HTML();
        p.dev();p.rank();
       
    }
}