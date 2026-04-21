class NumberFormatException{
    public static void main(String[] args) {
        String str = "Parth";
        try { 
            int a = Integer.parseInt(str);
            System.out.println(a);
        } 
        catch (java.lang.NumberFormatException n) {
            System.out.println("String" + str + "can't be formated");
        }
    }
}