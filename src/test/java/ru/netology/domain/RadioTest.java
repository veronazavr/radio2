package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldSetCurrentVol() {
        Radio radio = new Radio();
        radio.nextCurrentVolume();
        int expected = 51;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldSetMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.nextCurrentVolume();
        int expected = 100;
        assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldSetMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.prevCurrentVolume();
        int expected = 0;
        assertEquals(expected, radio.getCurrentVolume());

    }

    @Test
    void shouldSetMaxStation() {
        Radio radio = new Radio(
                10,
                0,
                5,
                100,
                0,
                50
        );
        radio.prevCurrentStation();
        int expected = 6;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldSetNextStation() {
        Radio radio = new Radio(
                10,
                0,
                5,
                100,
                0,
                50);
        radio.nextCurrentStation();
        int expected = 4;
        assertEquals(expected, radio.getCurrentStation());
    }

    @Test
    void shouldSetPrevStation() {
        Radio radio = new Radio(
                10,
                0,
                5,
                100,
                0,
                50
        );
        radio.prevCurrentStation();
        int expected = 6;
        assertEquals(expected, radio.getCurrentStation());
    }
}





