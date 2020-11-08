package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void nextCurrentStationNormal() {
        Radio radio = new Radio(9, 0, 2 );
        radio.nextCurrentStation();
        int expected = 3;
        assertEquals(expected, radio.getCurrentStation());
    }


    @Test
    public void nextCurrentStationMaxBorder() {
        Radio radio = new Radio(9,0,9);
        int expected = 0;
        radio.nextCurrentStation();
        assertEquals(expected, radio.getCurrentStation());
    }


    @Test
    public void prevCurrentStationNormal() {
        Radio radio = new Radio(9,0,2);
        int expected = 1;
        radio.prevCurrentStation();
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void prevCurrentStationMinBorder() {
        Radio radio = new Radio(9,0,0);
        int expected = 9;
        radio.prevCurrentStation();
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void remoteCurrentStationNormal() {
        Radio radio = new Radio(9,0,2);
        radio.remoteCurrentStation(3);
        assertEquals(3, radio.getCurrentStation());
    }

    @Test
    public void remoteCurrentStationOverMaxStation() {
        Radio radio = new Radio(9,0,2);

        int expected = 9;
        radio.remoteCurrentStation(10);
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    public void remoteCurrentUndereMinStation() {
        Radio radio = new Radio(9,0,2);
        int expected = 0;
        radio.remoteCurrentStation(-1);
        assertEquals(expected, radio.getCurrentStation());
    }

}





