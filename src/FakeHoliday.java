import java.time.LocalDate;

public class FakeHoliday extends Holiday {

    private LocalDate _today;

    public void setToday(LocalDate today){
        _today = today;
    }

    @Override
    protected LocalDate getToday() {
        return _today;
    }
}
