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

    private void responseShouldBe(String expected) {
        String response = holiday.sayXmas();
        assertEquals(expected, response);
    }

    private void givenToday(int month, int dayOfMonth) {
        holiday.setToday(LocalDate.of(2018, month, dayOfMonth));
    }

}

