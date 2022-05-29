package ru.netology.radio;


public class Radio {
    private int currentStation;
    private int currentVolume;

    public void setCurrentStation(int CurrentStation) {
        if (CurrentStation > 9) {
            return;
        }
        if (CurrentStation < 0) {
            return;
        }
        this.currentStation = CurrentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void nextStation() {

        if (currentStation < 9) {
            currentStation = currentStation + 1;
        }
        if (currentStation == 9) {
            this.currentStation = 0;
        }
    }

    public void prevStation() {

        if (currentStation > 0) {
            currentStation = currentStation - 1;
        }
        if (currentStation == 0) {
            this.currentStation = 9;
        }
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

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}