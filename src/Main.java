public class Main {
    public static void main(String[] args) {

        int amountStarted = 100;
        int refill = 1100;
        int amountTotal1 = (amountStarted + refill);
        if (refill > 1000) {
            int bonus = (refill / 100);
            int amountTotal2 = (amountTotal1 + bonus);
            System.out.println("Счет: " + amountTotal1);
            System.out.println("Бонусы: " + bonus);
            System.out.println("Итоговый счет: " + amountTotal2);

        }
    }
}