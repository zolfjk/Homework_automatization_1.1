package ru.netology.service;

import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void sumForCashbackForEquelZeroAmountTest() {

        CashbackHackService cash = new CashbackHackService();
        int actual = cash.remain(0);
        int expected = 1000;

        org.junit.Assert.assertEquals(expected,actual);
    }

    @Test
    public void sumForCashbackForLessThousendAmountTest() {

        CashbackHackService cash = new CashbackHackService();
        int actual = cash.remain(900);
        int expected = 100;

        org.junit.Assert.assertEquals(expected,actual);
    }

    @Test
    public void sumForCashbackForEquelThousendAmountTest() {

        CashbackHackService cash = new CashbackHackService();
        int actual = cash.remain(1000);
        int expected = 0;

        org.junit.Assert.assertEquals(expected,actual);
    }

    @Test
    public void sumForCashbackForMoreThanThousendAmountTest() {

        CashbackHackService cash = new CashbackHackService();
        int actual = cash.remain(1100);
        int expected = 0;

        org.junit.Assert.assertEquals(expected,actual);
    }

}


