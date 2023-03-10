package ru.netology.domain;

public class Radio {

    private int currentNumber;
    private int currentVolume;


    public int getCurrentNumber() {

        return currentNumber;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void increaseNumber() {
        if (currentNumber > 0) {
            currentNumber = currentNumber + 1;
        }
        return;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        return;
    }


    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void next() {
        if (currentNumber < 9) {
            currentNumber = currentNumber + 1;
        } else {
            currentNumber = 0;
        }
    }

    public void prev() {
        if (currentNumber > 0) {
            currentNumber = currentNumber - 1;
        } else {
            currentNumber = 9;
        }
    }


    public void setCurrentNumber(int currentNumber) {

        if (currentNumber > 9) {
            return;
        }
        if (currentNumber < 0) {
            return;

        }
        this.currentNumber = currentNumber;
    }


    public void setCurrentVolume(int CurrentVolume) {

        if (CurrentVolume > 10) {
            return;
        }
        if (CurrentVolume < 0) {
            return;
        }
        this.currentVolume = CurrentVolume;
    }

}


