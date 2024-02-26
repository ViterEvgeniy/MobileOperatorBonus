public class Main {
    public static void main(String[] args) {

        int amountStarted = 100;
        int refill = 800;
        int amountTotal1 = (amountStarted + refill);
        int percent;
        if (amountTotal1 >= 1000) {
            percent = 1;
        } else {
            percent = 0;
            }
            int bonus = (amountTotal1 * percent) / 100;
            int amountTotal2 = (amountTotal1 + bonus);

            System.out.println("Счет: " + amountTotal1);
            System.out.println("Бонусы: " + bonus);
            System.out.println("Итоговый счет: " + amountTotal2);


    }
}
