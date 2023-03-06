package ru.netology.domain;
<<<<<<< HEAD

=======
>>>>>>> 8bbfe6c8b26f0902bcd09f3e0d9f890c1a5edc43
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RadioTest {
<<<<<<< HEAD
    @Test
    public void shouldStationSix() {
        Radio radio = new Radio();


        radio.setCurrentStation(5);


        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
=======


    @Test
    public void shouldNotSetRadioStationAboveMax() {
        Radio stat = new Radio();
        stat.setCurrentRadioStation(10);
        int expected = 0;
        int actual = stat.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);

>>>>>>> 8bbfe6c8b26f0902bcd09f3e0d9f890c1a5edc43
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
    public void shouldStationEight() {
        Radio radio = new Radio();


        radio.setCurrentStation(7);


        int expected = 7;
        int actual = radio.getCurrentStation();
=======
    public void shouldNextRadioStationAfterCurrent() {
        Radio stat = new Radio();
        int currentRadioStation = 1;
        stat.setCurrentRadioStation(currentRadioStation);
        stat.increaseNextStation();
        int expected = 2;
        int actual = stat.getCurrentRadioStation();
>>>>>>> 8bbfe6c8b26f0902bcd09f3e0d9f890c1a5edc43
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
<<<<<<< HEAD
    public void shouldStationNine() {
        Radio radio = new Radio();


        radio.setCurrentStation(9);


        int expected = 9;
        int actual = radio.getCurrentStation();
=======
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
>>>>>>> 8bbfe6c8b26f0902bcd09f3e0d9f890c1a5edc43
        Assertions.assertEquals(expected, actual);
    }


    @Test
<<<<<<< HEAD
    public void shouldStationNull() {
        Radio radio = new Radio();


        radio.setCurrentStation(10);


        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldStationNullIfMinus() {
        Radio radio = new Radio();


        radio.setCurrentStation(-5);


        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
=======
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

>>>>>>> 8bbfe6c8b26f0902bcd09f3e0d9f890c1a5edc43
    }


    @Test
<<<<<<< HEAD
    public void shouldStationNullIfNull() {
        Radio radio = new Radio();


        radio.setCurrentStation(0);


        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldVolumeNullIfNull() {
        Radio radio = new Radio();


        radio.setCurrentVolume(0);


        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldVolumeNullIfMinus() {
        Radio radio = new Radio();


        radio.setCurrentVolume(-5);


        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldVolumeOne() {
        Radio radio = new Radio();


        radio.setCurrentVolume(1);


        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldVolumeNine() {
        Radio radio = new Radio();


        radio.setCurrentVolume(9);


        int expected = 9;
        int actual = radio.getCurrentVolume();
=======
    public void shouldIncreaseMaxVolumeLevelOne() {
        Radio stat = new Radio();
        int currentVolume = 10;
        stat.setCurrentVolume(currentVolume);
        stat.increaseVolume();
        int expected = 10;
        int actual = stat.getCurrentVolume();
>>>>>>> 8bbfe6c8b26f0902bcd09f3e0d9f890c1a5edc43
        Assertions.assertEquals(expected, actual);
    }
    @Test
<<<<<<< HEAD
    public void shouldVolumeTen() {
        Radio radio = new Radio();


        radio.setCurrentVolume(10);


        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldVolumeNullIfEleven() {
        Radio radio = new Radio();


        radio.setCurrentVolume(11);


        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldVolumeNullIfMore() {
        Radio radio = new Radio();


        radio.setCurrentVolume(15);


        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNextStationPlasOne() {
        Radio radio = new Radio();


        radio.setCurrentStation(5);


        radio.next();


        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNextStationNullIfNine() {
        Radio radio = new Radio();
=======
    public void shouldReduceVolumeLevel() {
        Radio stat = new Radio();
        int currentVolume = 4;
        stat.setCurrentVolume(currentVolume);
        stat.decreaseVolume();
        int expected = 3;
        int actual = stat.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
>>>>>>> 8bbfe6c8b26f0902bcd09f3e0d9f890c1a5edc43


        radio.setCurrentStation(9);


        radio.next();


        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNextStationNext() {
        Radio radio = new Radio();


        radio.setCurrentStation(0);


        radio.next();


        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNextStationNullIfTen() {
        Radio radio = new Radio();


        radio.setCurrentStation(10);


        radio.next();


        int expected = 1;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

<<<<<<< HEAD



    @Test
    public void shouldPrevStation() {
        Radio radio = new Radio();


        radio.setCurrentStation(6);


        radio.prev();


        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldPrevStationNullToNine() {
        Radio radio = new Radio();


        radio.setCurrentStation(0);


        radio.prev();


        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldPrevStationNineIfOne() {
        Radio radio = new Radio();


        radio.setCurrentStation(1);


        radio.prev();


        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldMaxVolumeNathing() {
        Radio radio = new Radio();


        radio.setCurrentVolume(10);


        radio.maxVolume();


        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldMaxVolumeNine() {
        Radio radio = new Radio();


        radio.setCurrentVolume(9);


        radio.maxVolume();


        int expected = 9;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldMinVolume() {
        Radio radio = new Radio();


        radio.setCurrentVolume(0);


        radio.minVolume();


        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldMinVolumeOne() {
        Radio radio = new Radio();


        radio.setCurrentVolume(1);


        radio.minVolume();


        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
=======
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
>>>>>>> 8bbfe6c8b26f0902bcd09f3e0d9f890c1a5edc43
