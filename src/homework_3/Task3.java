package homework_3;

public class Task3 {
    public static void main(String[] args) {
        double priceA = 1000;
        double priceB = 500;

        int discount = 10;

        double discountMoney = (priceA + priceB) * discount / 100;

        double priceWithDiscount = priceA + priceB - discountMoney;

        double priceWithDiscount1 = (priceA + priceB) * (100 - discount) / 100;

        System.out.println("DiscountMoney: " + discountMoney);
        System.out.println("PriceWithDiscount: " + priceWithDiscount);
        System.out.println("PriceWithDiscount1: " + priceWithDiscount1);
    }
}
