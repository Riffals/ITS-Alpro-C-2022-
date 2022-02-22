import java.util.*;

public class JavaLibs5026211189 {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to Javamart");

    System.out.println("Enter your name ");
    String name = input.next();

    System.out.println("How many packs of wafers do you want to buy?");
    int wafers = input.nextInt();

    System.out.println("How many packs of cookies do you want to buy?");
    int cookies = input.nextInt();

    System.out.println("How many packs of chips do you want to buy?");
    int chips = input.nextInt();

    System.out.println("How many packs of icecream do you want to buy?");
    int icecream = input.nextInt();

    System.out.println("How many kilograms of spinach do you want to buy?");
    double spinach = input.nextDouble();

    System.out.println("How many kilograms of carrots do you want to buy?");
    double carrots = input.nextDouble();

    System.out.println("How many litres of milk do you want to buy?");
    double milk = input.nextDouble();

    System.out.println("how much amount of discount do you want?(1-90)");
    int discount = input.nextInt();

    System.out.println("Are all your groceries right?(true/false)");
    boolean truefalse = input.nextBoolean();

    int wafersprice = wafers * 5_000;
    int cookiesprice = cookies * 6_000;
    int chipsprice = chips * 10_000;
    int icecreamprice = icecream * 9_000;
    double spinachprice = spinach * 8_000.00;
    double carrotsprice = carrots * 7_000.00;
    double milkprice = milk * 18_000.00;

    double totalprice = wafersprice + cookiesprice + chipsprice + icecreamprice + spinachprice + carrotsprice
        + milkprice;

    double afterdiscount = totalprice * (discount / 100.0);
    afterdiscount = totalprice - afterdiscount;

    System.out.println("One day " + name + " goes for shopping in Javamart. " + name + " wants to buy ");
    System.out.println(+wafers + " packs of chocolate wafer, " + cookies + " packs of cookies, ");
    System.out.println(chips + " packs of chips, " + spinach + " kilograms of spinach and  ");
    System.out.println(+ carrots + " kilograms of carrots. After take all items he needed, ");
    System.out.println("then " + name + " pay them all in the cashier. The total paid is Rp" + totalprice + ", ");
    System.out.println("but because " + name + " has Javamart member card, he gets discount " + discount + "% off.");
    System.out.println("So that he only pay Rp" + afterdiscount + " for all.");
  }
}
