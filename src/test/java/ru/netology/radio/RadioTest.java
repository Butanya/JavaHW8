package ru.netology.radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    void checkSetStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        int actual = radio.getCurrentStation();
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void checkSetStationAboveLimits() {
        Radio radio = new Radio();
        radio.setCurrentStation(12);

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void checkSetStationUnderLimits() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void checkNextStationButtonAverage() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.nextStation();

        int actual = radio.getCurrentStation();
        int expected = 6;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void checkNextStationButtonBoundary() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.nextStation();

        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void checkNextStationButtonLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void checkPrevStationButtonAverage() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.prevStation();

        int actual = radio.getCurrentStation();
        int expected = 4;

        Assertions.assertEquals(expected, actual);

    }


    @Test
    void checkPrevStationButtonBoundary() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.prevStation();

        int actual = radio.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    void checkPrevStationButtonLimit() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();

        int actual = radio.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void checkSetVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);

        int actual = radio.getCurrentVolume();
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void checkSetVolumeAboveLimits() {
        Radio radio = new Radio();
        radio.setCurrentVolume(12);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void checkSetVolumeUnderLimits() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void checkIncreaseVolumeAverage() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 8;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void checkReduceVolumeAverage() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.reduceVolume();

        int actual = radio.getCurrentVolume();
        int expected = 4;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void checkIncreaseVolumeBoundary() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 10;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void checkReduceVolumeBoundary() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.reduceVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void checkIncreaseVolumeLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 10;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void checkReduceVolumeLimit() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.reduceVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

}
