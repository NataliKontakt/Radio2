package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Radio2Test {

    @Test
    public void shouldSetRadioStationNumberUnder() {
        Radio radio = new Radio(20);
        radio.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNumber0() {
        Radio radio = new Radio(15);
        radio.setCurrentRadioStation(0);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNumber1() {
        Radio radio = new Radio(15);
        radio.setCurrentRadioStation(1);
        int expected = 1;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetRadioStationNumber13() {
        Radio radio = new Radio(15);
        radio.setCurrentRadioStation(13);
        int expected = 13;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNumber14() {
        Radio radio = new Radio(15);
        radio.setCurrentRadioStation(14);
        int expected = 14;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioStationNumber15() {
        Radio radio = new Radio(15);
        radio.setCurrentRadioStation(15);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxRadioStationNumber() {
        Radio radio = new Radio();
        int expected = 9;
        int actual = radio.getMaxRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinRadioStationNumber() {
        Radio radio = new Radio();
        int expected = 0;
        int actual = radio.getMinRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxVolume() {
        Radio radio = new Radio();
        int expected = 100;
        int actual = radio.getMaxVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinVolume() {
        Radio radio = new Radio();
        int expected = 0;
        int actual = radio.getMinVolume();
        Assertions.assertEquals(expected, actual);
    }

}
