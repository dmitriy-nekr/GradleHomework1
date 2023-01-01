package ru.netology.service;


import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();


    @Test
    public void shouldAdd1000() {
        int expected = 1000;
        int actual = service.remain(0);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldAdd500() {
        int expected = 500;
        int actual = service.remain(500);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldAdd1() {
        int expected = 1;
        int actual = service.remain(999);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldAdd999() {
        int expected = 999;
        int actual = service.remain(1001);
        assertEquals(actual, expected);
    }
    @Test
    public void shouldAdd0() {
        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(actual,expected);
    }

}