package ru.netology.domain;


public class Radio {
<<<<<<< HEAD
    private int currentStation;
    private int currentVolume;



    public void next() {
        if (currentStation != 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }


    public void prev() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }
    }


    public void maxVolume() {
        if (currentVolume == 10) {
            return;
        }
    }


    public void minVolume() {
        if (currentVolume == 0) {
            return;
        }
    }


    public int getCurrentStation() {
        return currentStation;
    }


    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }


    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}
=======

    private int currentRadioStation;
    private int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void increaseNextStation() {

        if (currentRadioStation == 9) {
            currentRadioStation = 0;
            return;

        }
        currentRadioStation++;
    }

    public void reduceCurrentStation() {

        if (currentRadioStation == 0) {
            currentRadioStation = 9;
            return;

        }
        currentRadioStation--;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }


    public void increaseVolume() {
        if (currentVolume == 10) {

            currentVolume = 10;
            return;
        }
        currentVolume = currentVolume + 1;


    }

    public void decreaseVolume() {

        if (currentVolume == 0) {
            currentVolume = 0;
            return;
        }

        currentVolume = currentVolume - 1;


    }
}
>>>>>>> 8bbfe6c8b26f0902bcd09f3e0d9f890c1a5edc43
