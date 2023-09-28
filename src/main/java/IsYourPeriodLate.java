import java.time.LocalDate;

public class IsYourPeriodLate {

    public static void main(String[] args) {
        System.out.println(periodIsLate(LocalDate.of(2016, 6, 13), LocalDate.of(2016, 7, 16), 35));
        System.out.println(periodIsLate(LocalDate.of(2016, 6, 13), LocalDate.of(2016, 7, 16), 28));
    }

    public static boolean periodIsLate(LocalDate last, LocalDate today, int cycleLength) {
        int pastDays = 1;
        for(int i = 1; i <= pastDays; i++) {
            if((last.isAfter(today) && !(last.minusDays(i).equals(today))) ||
                    (last.isBefore(today) && !(last.plusDays(i).equals(today)))) {
                pastDays++;
            }
            if(pastDays >= cycleLength) {
                return true;
            }
        }
        return false;
    }
}
