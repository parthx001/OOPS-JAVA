class Static_block{
    static {
        System.out.println("code executed!");
    }
    public static void main(String[] args) {
        // static block will be executed though there is nothing in the main.
    }
}