package com.padmaja.flowcontrol;

import org.junit.Test;

import static org.junit.Assert.*;


public class CreateSwitchStatementTest {

    @Test
    public void testGetRankBaseOfScore() {
        CreateSwitchStatement createSwitchStatement = new CreateSwitchStatement();
        int result = createSwitchStatement.getRankBaseOfScore(20);
        System.out.println(result);
        int expectedresult = 20;
        assertEquals(expectedresult,result);
    }


    @Test
    public void testGetRankBaseOfScore10() {
        CreateSwitchStatement createSwitchStatement = new CreateSwitchStatement();
        int result = createSwitchStatement.getRankBaseOfScore(10);
        System.out.println(result);
        int expectedresult = 10;
        assertEquals(expectedresult,result);
    }
    @Test
    public void testGetRankBaseOfScore30() {
        CreateSwitchStatement createSwitchStatement = new CreateSwitchStatement();
        int result = createSwitchStatement.getRankBaseOfScore(30);
        System.out.println(result);
        int expectedresult = 30;
        assertEquals(expectedresult,result);
    }

    @Test
    public void testGetRankBaseOfScore40() {
        CreateSwitchStatement createSwitchStatement = new CreateSwitchStatement();
        int result = createSwitchStatement.getRankBaseOfScore(40);
        System.out.println(result);
        int expectedresult = 40;
        assertEquals(expectedresult,result);
    }

    @Test
    public void testGetRankBaseOfScore0() {
        CreateSwitchStatement createSwitchStatement = new CreateSwitchStatement();
        int result = createSwitchStatement.getRankBaseOfScore(0);
        System.out.println(result);
        int expectedresult = 0;
        assertEquals(expectedresult,result);
    }

    @Test
    public void testGetRankBaseOfScore100() {
        CreateSwitchStatement createSwitchStatement = new CreateSwitchStatement();
        int result = createSwitchStatement.getRankBaseOfScore(100);
        System.out.println(result);
        int expectedresult = 100;
        assertEquals(expectedresult,result);
    }

}