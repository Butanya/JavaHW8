package ru.netology.radio;

public class Radio {


    private int minStation = 0;
    private int numberOfStations;
    private int maxStation = 10;
    private int currentStation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
        this.maxStation = numberOfStations - 1;
    }

    public int getNumberOfStations() {
        return numberOfStations;
    }

    public Radio() {
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void nextStation() {

        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        } else {
            this.currentStation = minStation;
        }
    }

    public void prevStation() {

        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        } else {
            this.currentStation = maxStation;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}