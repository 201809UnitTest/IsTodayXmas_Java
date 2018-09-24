import java.time.LocalDate;

public class Holiday {
    public String sayXmas() {
        LocalDate now = getToday();
        if (now.getMonthValue() == 12 && (now.getDayOfMonth() == 24 || now.getDayOfMonth() == 25)) {

            return "Merry Xmas";
        }

        return "Today is not Xmas";
    }

    protected LocalDate getToday() {
        return LocalDate.now();
    }
}
