import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HolidayTests {

    private final FakeHoliday holiday = new FakeHoliday();

    @Test
    public void today_is_xmas() {
        givenToday(12, 25);
        responseShouldBe("Merry Xmas");
    }

    @Test
    public void today_is_xmas_12_24() {
        givenToday(12, 24);
        responseShouldBe("Merry Xmas");
    }

    @Test
    public void today_is_not_xmas() {
        givenToday(11, 25);
        responseShouldBe("Today is not Xmas");
    }

    private void responseShouldBe(String expected) {
        assertEquals(expected, holiday.sayXmas());
    }

    private void givenToday(int month, int dayOfMonth) {
        holiday.setToday(LocalDate.of(2018, month, dayOfMonth));
    }

}

