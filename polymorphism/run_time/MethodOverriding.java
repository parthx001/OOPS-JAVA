class Shape{
    void draw(){
        System.out.println("unknown shape");
    }
}
class Square extends Shape{
    @Override
    void draw(){
        super.draw(); // calls the super class method
        System.out.println("square");
    }
}
class MethodOverriding{
    public static void main(String[] args) {
        Shape obj = new Square();
        obj.draw();
    }
}