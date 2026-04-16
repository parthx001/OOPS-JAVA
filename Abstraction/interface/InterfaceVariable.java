interface customer{
    int R = 5; // public + static + final
    void purchase(); // public +abstract
}
class InterfaceVariable implements customer{
    @Override
    public void purchase(){
        System.out.println("I need " + R + "kg rice");
    }
    public static void main(String[] args) {
        customer c = new InterfaceVariable();
        c.purchase();
        System.out.println(customer.R); // proves that variable is static 
    }
}