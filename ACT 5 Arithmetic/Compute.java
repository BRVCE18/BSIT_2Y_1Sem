public class Compute {
    public static void main(String args[]) {
        Arithmetic compute = new Arithmetic(9,3);
                     
        System.out.println("The Sum of Integer 9 and 3 is " + compute.sum());
        System.out.println("The Difference of Integer 9 and 3 is " + compute.difference());
        System.out.println("The Product of Integer 9 and  3 is " + compute.product());
        System.out.println("The Quotient of Integer 9 and 3 is " + compute.quotient());
    }
}