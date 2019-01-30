public class Order {
    Pizza [] threeForOne = new Pizza[3];

    public Order(Pizza[] pizza)
    {
        this.threeForOne = pizza;
    }

    public void printOrder()
    {
        System.out.println("3-4-1 PIZZA MADNESS");
        System.out.println("#########################");
        System.out.println("You ordered a " + threeForOne[0].getTopping() + " on a " + threeForOne[0].getBase() + " base.");
        System.out.println("You ordered a " + threeForOne[1].getTopping() + " on a " + threeForOne[1].getBase() + " base.");
        System.out.println("Are you sure you want " + threeForOne[2].getTopping() + " on your " + threeForOne[2].getBase() + " base?");
    }
}
