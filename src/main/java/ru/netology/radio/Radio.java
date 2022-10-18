package ru.netology.radio;

public class Radio {

    private int minRadioStation = 0;
    private int maxRadioStation = 9;

    private int currentRadioStation;
    private int minVolume = 0;
    private int maxVolume = 100;

    private int currentVolume;

    public Radio() {
        this.maxRadioStation = 9;

    }

    public Radio(int numberOfStations) {
        this.maxRadioStation = numberOfStations - 1;

    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setCurrentRadioStation(int CurrentRadioStation) {
        if (CurrentRadioStation < minRadioStation) {
            return;
        }
        if (CurrentRadioStation > maxRadioStation) {
            return;
        }
        this.currentRadioStation = CurrentRadioStation;
    }

    public void nextRadioStation() {
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation++;
        } else {
            currentRadioStation = minRadioStation;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation > minRadioStation) {
            currentRadioStation--;
        } else {
            currentRadioStation = maxRadioStation;
        }
    }


    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        this.currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = minVolume;
        }
    }

}
