class NullPointerException{
    public static void main(String[] args) {
        String n = null;
        try{
            System.out.println(n.toUpperCase());
        }
        catch ( java.lang.NullPointerException N ){
            System.out.println(" null can't be casted");
        }
        
    }
}