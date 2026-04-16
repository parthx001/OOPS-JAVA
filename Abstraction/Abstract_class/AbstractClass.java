abstract class Animal{
    Animal(){
        System.out.println("All animals");
    }
    public abstract void sound();
}
class Dog extends Animal{
    Dog(){
        super();
    }
    public void sound(){
        System.err.println("Barking");
    }
}
class Tiger extends Animal{
    Tiger(){
        super();
    }
    public void sound(){
        System.out.println("Roaring");
    }
}
class AbstractClass{
    public static void main(String[] args) {
        Dog d = new Dog();
        Tiger t = new Tiger();
        d.sound();t.sound();
    }
}