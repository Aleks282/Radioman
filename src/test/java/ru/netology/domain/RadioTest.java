package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

<<<<<<< HEAD
public class RadioTest {


    @Test
    public void shouldNotSetRadioStationAboveMax() {
        Radio stat = new Radio();
        stat.setCurrentRadioStation(10);
        int expected = 0;
        int actual = stat.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

=======

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    void setCurrentStationValid() {
        Radio music = new Radio(5, 9);
        music.setCurrentStation(6);
        assertEquals(6, music.getCurrentStation());
    }

    @Test
    void setCurrentStationInvalidMax() {
        Radio music = new Radio(9);
        music.setCurrentStation(10);
        assertEquals(9, music.getCurrentStation());

    }

    @Test
    void setCurrentStationInvalidMin() {
        Radio music = new Radio(1,9);
        music.setCurrentStation(-5);
        assertEquals(0, music.getCurrentStation());


    }

    @Test
    void setCurrentStationIncreaseValid() {
        Radio music = new Radio(5, 9);
        music.increaseStation();
        assertEquals(6, music.getCurrentStation());


    }

    @Test
    void setCurrentStationIncreaseValidMax() {
        Radio music = new Radio(9, 9);
        music.increaseStation();
        assertEquals(0, music.getCurrentStation());

    }

    @Test
    void setCurrentStationDecreaseValid() {
        Radio music = new Radio(5, 9);
        music.decreaseStation();
        assertEquals(4, music.getCurrentStation());


    }

    @Test
    void setCurrentStationDecreaseValidMin() {
        Radio music = new Radio(0, 9);
        music.decreaseStation();
        assertEquals(9, music.getCurrentStation());

    }

    @Test
    void setCurrentVolume() {
        Radio music = new Radio(0, 5, 100);
        music.setCurrentVolume(6);
        assertEquals(6, music.getCurrentVolume());

    }

    @Test
    void setCurrentVolumeInvalidMax() {
        Radio music = new Radio(0,5,100);
        music.setCurrentVolume(101);
        assertEquals(100, music.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeInvalidMin() {
        Radio music = new Radio(0,5,100);
        music.setCurrentVolume(-5);
        assertEquals(0, music.getCurrentVolume());
>>>>>>> d481ea39e93b5669461104297615223fd68784ff
    }

    @Test
    public void shouldNotSetRadioStationBelowMin() {
        Radio stat = new Radio();
        stat.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = stat.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

    }

    @Test
<<<<<<< HEAD
    public void shouldNextRadioStationAfterCurrent() {
        Radio stat = new Radio();
        int currentRadioStation = 1;
        stat.setCurrentRadioStation(currentRadioStation);
        stat.increaseNextStation();
        int expected = 2;
        int actual = stat.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceCurrentRadioStation() {
        Radio stat = new Radio();
        int currentRadioStation = 9;
        stat.setCurrentRadioStation(currentRadioStation);
        stat.reduceCurrentStation();
        int expected = 8;
        int actual = stat.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationAfterMax() {
        Radio stat = new Radio();
        int currentRadioStation = 9;
        stat.setCurrentRadioStation(currentRadioStation);
        stat.increaseNextStation();
        int expected = 0;
        int actual = stat.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPreviousStationBeforeMin() {
        Radio stat = new Radio();
        int currentRadioStation = 0;
        stat.setCurrentRadioStation(currentRadioStation);
        stat.reduceCurrentStation();
        int expected = 9;
        int actual = stat.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldValueSetLevelBelowMin() {
        Radio stat = new Radio();
        stat.setCurrentVolume(-1);
        int expected = 0;
        int actual = stat.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolumeLevelAboveMax() {
        Radio stat = new Radio();
        stat.setCurrentVolume(11);
        int expected = 0;
        int actual = stat.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldReduceVolumeLevelBelowMin() {
        Radio stat = new Radio();
        int currentVolume = 0;
        stat.setCurrentVolume(currentVolume);
        stat.decreaseVolume();
        int expected = 0;
        int actual = stat.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void shouldIncreaseMaxVolumeLevelOne() {
        Radio stat = new Radio();
        int currentVolume = 10;
        stat.setCurrentVolume(currentVolume);
        stat.increaseVolume();
        int expected = 10;
        int actual = stat.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolumeLevel() {
        Radio stat = new Radio();
        int currentVolume = 4;
        stat.setCurrentVolume(currentVolume);
        stat.decreaseVolume();
        int expected = 3;
        int actual = stat.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseVolumeLevel() {
        Radio stat = new Radio();
        int currentVolume = 9;
        stat.setCurrentVolume(currentVolume);
        stat.increaseVolume();
        int expected = 10;
        int actual = stat.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


}
=======
    void setCurrentVolumeIncreaseMax() {
        Radio music = new Radio(0, 100, 100);
        music.increaseVolume();
        assertEquals(100, music.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeIncrease() {
        Radio music = new Radio(0, 5, 100);
        music.increaseVolume();
        assertEquals(6, music.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeDecrease() {
        Radio music = new Radio(0, 5, 100);
        music.decreaseVolume();
        assertEquals(4, music.getCurrentVolume());
    }

    @Test
    void setCurrentVolumeDecreaseMin() {
        Radio music = new Radio(0, 0, 100);
        music.decreaseVolume();
        assertEquals(0, music.getCurrentVolume());
    }


}
>>>>>>> d481ea39e93b5669461104297615223fd68784ff
