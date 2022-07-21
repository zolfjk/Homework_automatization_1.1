package ru.netology.service;

import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    public void sumForCashbackForEquelZeroAmountTest() {

        CashbackHackService cash = new CashbackHackService();
        int actual = cash.remain(0);
        int expected = 1000;

        org.testng.Assert.assertEquals(actual,expected);
    }

    @Test
    public void sumForCashbackForLessThousendAmountTest() {

        CashbackHackService cash = new CashbackHackService();
        int actual = cash.remain(900);
        int expected = 100;

        org.testng.Assert.assertEquals(actual,expected);
    }

    @Test
    public void sumForCashbackForEquelThousendAmountTest() {

        CashbackHackService cash = new CashbackHackService();
        int actual = cash.remain(1000);
        int expected = 0;

        org.testng.Assert.assertEquals(actual,expected);
    }

    @Test
    public void sumForCashbackForMoreThanThousendAmountTest() {

        CashbackHackService cash = new CashbackHackService();
        int actual = cash.remain(1100);
        int expected = 0;

        org.testng.Assert.assertEquals(actual,expected);
    }

}


