package ru.netology.domain;

public class Radio {
<<<<<<< HEAD

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
=======
    private int maxStation = 9;
    private int minStation = 0;
    private int currentStation;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;


    public Radio(int maxStation, int minStation, int currentStation, int currentVolume, int minVolume, int maxVolume) {
        this.maxStation = maxStation;
        this.minStation = minStation;
        this.currentStation = currentStation;
        this.currentVolume = currentVolume;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
    }

    public Radio() {

    }

    public Radio(int maxStation) {
        this.maxStation = maxStation;
    }


    public Radio(int currentStation, int maxStation) {
        this.maxStation = maxStation;
        this.currentStation = currentStation;

    }

    public Radio(int minVolume, int currentVolume, int maxVolume) {
        this.minVolume = minVolume;
        this.currentVolume = currentVolume;
        this.maxVolume = maxVolume;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            this.currentStation = maxStation;
            return;
        }
        if (currentStation < minStation) {
            this.currentStation = minStation;
            return;
        }
        this.currentStation = currentStation;
>>>>>>> d481ea39e93b5669461104297615223fd68784ff
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

<<<<<<< HEAD
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





=======
    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            this.currentVolume = maxVolume;
            return;
        }
        if (currentVolume < minVolume) {
            this.currentVolume = minVolume;
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public void increaseStation() {
        if (currentStation == maxStation) {
            this.currentStation = minStation;
            return;
        }
        currentStation++;
    }

    public void decreaseStation() {
        if (currentStation == minStation) {
            this.currentStation = maxStation;
            return;
        }
        currentStation--;
    }

    public void increaseVolume() {
        if (currentVolume == maxVolume) {
            return;
        }
        currentVolume++;
    }

    public void decreaseVolume() {
        if (currentVolume == minVolume) {
            return;
        }
        currentVolume--;
    }
}
>>>>>>> d481ea39e93b5669461104297615223fd68784ff
