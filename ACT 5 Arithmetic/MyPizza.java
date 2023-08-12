public class MyPizza{
    public static void main(String[] args) {
        Pizza MyPizza = new Pizza();
        
        MyPizza.setToppings("Pineapple");
        MyPizza.setDiameter(12);
        MyPizza.setPrice(99.99);
        
        System.out.println("MyPizza Toppings " + MyPizza.getToppings());
        System.out.println("MyPizza Diameter " + MyPizza.getDiameter());
        System.out.println("MyPizza Price " + MyPizza.getPrice());
    }
}