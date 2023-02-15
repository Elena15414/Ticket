public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        System.out.println();
        System.out.println(service.calculate(10000)); // должно получиться 500

        System.out.println();
        System.out.println(service.calculate(20000)); // должно получиться 1000

        System.out.println();
        System.out.println(service.calculate(25000)); // должно получиться 1250
    }
}