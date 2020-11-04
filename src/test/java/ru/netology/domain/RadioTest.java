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

//    @Test
//    public void setMaxStation() {
//        Radio radio = new Radio(9);
//        int expected = 9;
//        radio.setMaxStation(0);
//        assertEquals(expected, radio.getMaxStation());
//    }

//    @Test
//    public void setMinStationTest() {
//        Radio radio = new Radio();
//        radio.setMinStation(0);
//        assertEquals(0, radio.getMinStation());
////    }

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

//    @Test
//    public void setCurrentOverMaxStation() {
//        Radio radio = new Radio(9,0,8);
//        radio.setMaxStation(9);
//        radio.setMinStation(0);
//        radio.setCurrentStation(8);
//        radio.setCurrentStation(60);
//        assertEquals(8, radio.getCurrentStation());
//    }
//
//    @Test
//    public void setCurrentUnderMinStation() {
//        Radio radio = new Radio();
//        radio.setMaxStation(9);
//        radio.setMinStation(0);
//        radio.setCurrentStation(8);
//        radio.setCurrentStation(-1);
//        assertEquals(8, radio.getCurrentStation());
//    }
//
//    @Test
//    public void nextCurrentVolNormalVol() {
//        Radio radio = new Radio();
//        radio.setMaxVolume(10);
//        radio.setMinVolume(0);
//        radio.setCurrentVolume(2);
//        int expected = 3;
//        radio.nextCurrentVolume();
//        assertEquals(expected, radio.getCurrentVolume());
//    }
//
//    @Test
//    public void nextCurrentVolMaxBorderVol() {
//        Radio radio = new Radio();
//        radio.setMaxVolume(10);
//        radio.setMinVolume(0);
//        radio.setCurrentVolume(10);
//        radio.nextCurrentVolume();
//        assertEquals(10, radio.getCurrentVolume());
//    }
//
//    @Test
//    public void prevCurrentVolNormalVol() {
//        Radio radio = new Radio();
//        radio.setMaxVolume(10);
//        radio.setMinVolume(0);
//        radio.setCurrentVolume(2);
//        radio.prevCurrentVolume();
//        assertEquals(1, radio.getCurrentVolume());
//    }
//
//    @Test
//    public void prevCurrentVolMinBorderVol() {
//        Radio radio = new Radio();
//        radio.setMaxVolume(10);
//        radio.setMinVolume(0);
//        radio.setCurrentVolume(0);
//        radio.prevCurrentVolume();
//        assertEquals(0, radio.getCurrentVolume());
//    }
//
//
//    @Test
//    public void setMaxVol() {
//        Radio radio = new Radio();
//        radio.setMaxVolume(10);
//        assertEquals(10, radio.getMaxVolume());
//    }
//
//    @Test
//    public void setMinVol() {
//        Radio radio = new Radio();
//        radio.setMinVolume(0);
//        assertEquals(0, radio.getMinVolume());
//    }
//
//    @Test
//    public void setCurrentVolumeOverMaxVol() {
//        Radio radio = new Radio();
//        radio.setMaxVolume(10);
//        radio.setMinVolume(0);
//        radio.setCurrentVolume(2);
//        radio.setCurrentVolume(15);
//        assertEquals(2, radio.getCurrentVolume());
//    }
//
//    @Test
//    public void setCurrentVolumeUnderMinVol() {
//        Radio radio = new Radio();
//        radio.setMaxVolume(10);
//        radio.setMinVolume(0);
//        radio.setCurrentVolume(2);
//        radio.setCurrentVolume(-1);
//        assertEquals(2, radio.getCurrentVolume());
//    }

}





