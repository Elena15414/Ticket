public class Main {

    public static void main(String[] args) {
        int amount = 25000; // стоимость билета
        int x = 20; // начисление миль за каждые 20 руб
        int bonus; // бонус
        if (amount >= x) {
            bonus = amount / x;
        } else {
            bonus = 0;
        }
        System.out.println("Итоговый бонус:" + bonus);
    }
}