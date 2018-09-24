import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HolidayTests {

    @Test
    public void today_is_xmas() {
//        Holiday holiday = new Holiday();
        FakeHoliday holiday = new FakeHoliday();
        holiday.setToday(LocalDate.of(2018, 12, 25));
        String response = holiday.sayXmas();
        assertEquals("Merry Xmas", response);
    }

}

