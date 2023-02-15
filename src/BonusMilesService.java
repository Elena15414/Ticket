public class BonusMilesService {

    public int calculate(int price) {
        int miles;
        int mil = 20;
        if (price >= mil) {
            miles = price / mil;
        } else {
            miles = 0;
        }
        return miles;
    }
}
