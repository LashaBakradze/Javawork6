package ru.netology.services.Javamvn6.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
// import ru.netology.services.Javamvn6.service.MonthsOfRestService;

public class MonthsOfRestTest {

    @Test
    public void main() {
        MonthsOfRestService service = new MonthsOfRestService();
        int expected = 3;

        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;

        int actual = service.calculate(income,expenses,threshold);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void Notmain() {

        MonthsOfRestService service = new MonthsOfRestService();
        int expected = 2;

        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;

        int actual = service.calculate (income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
