package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();
    Radio radio2 = new Radio(15);

    @Test
    void shouldInitFields() {
        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(10, radio.getMaxStation());
        Assertions.assertEquals(0, radio.getMinVolume());
        Assertions.assertEquals(100, radio.getMaxVolume());
        Assertions.assertEquals(15, radio2.getNumberOfStations());
    }

    @Test
    void checkSetStationDefault() {
        radio.setCurrentStation(8);

        Assertions.assertEquals(8, radio.getCurrentStation());
    }

    @Test
    void checkSetStation() {
        radio2.setCurrentStation(12);

        Assertions.assertEquals(12, radio2.getCurrentStation());
    }

    @Test
    void checkSetStationAboveLimitsDefault() {
        radio.setCurrentStation(12);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void checkSetStationAboveLimits() {
        radio.setCurrentStation(19);

        Assertions.assertEquals(0, radio2.getCurrentStation());
    }

    @Test
    void checkSetStationUnderLimits() {
        radio.setCurrentStation(-1);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void checkNextStationButtonAverage() {
        radio.setCurrentStation(5);
        radio.nextStation();

        Assertions.assertEquals(6, radio.getCurrentStation());

    }

    @Test
    void checkNextStationButtonBoundary() {
        radio.setCurrentStation(9);
        radio.nextStation();

        Assertions.assertEquals(10, radio.getCurrentStation());

    }

    @Test
    void checkNextStationButtonLimit() {
        radio.setCurrentStation(10);
        radio.nextStation();

        Assertions.assertEquals(0, radio.getCurrentStation());

    }

    @Test
    void checkPrevStationButtonAverage() {
        radio.setCurrentStation(5);
        radio.prevStation();

        Assertions.assertEquals(4, radio.getCurrentStation());

    }

    @Test
    void checkPrevStationButtonBoundary() {
        radio.setCurrentStation(1);
        radio.prevStation();

        Assertions.assertEquals(0, radio.getCurrentStation());

    }

    @Test
    void checkPrevStationButtonLimit() {
        radio.setCurrentStation(0);
        radio.prevStation();

        Assertions.assertEquals(10, radio.getCurrentStation());

    }

    @Test
    void checkSetVolume() {
        radio.setCurrentVolume(50);

        Assertions.assertEquals(50, radio.getCurrentVolume());
    }

    @Test
    void checkSetVolumeAboveLimits() {
        radio.setCurrentVolume(102);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void checkSetVolumeUnderLimits() {
        radio.setCurrentVolume(-1);

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void checkIncreaseVolumeAverage() {
        radio.setCurrentVolume(52);
        radio.increaseVolume();

        Assertions.assertEquals(53, radio.getCurrentVolume());

    }

    @Test
    void checkReduceVolumeAverage() {
        radio.setCurrentVolume(56);
        radio.reduceVolume();

        Assertions.assertEquals(55, radio.getCurrentVolume());

    }

    @Test
    void checkIncreaseVolumeBoundary() {
        radio.setCurrentVolume(99);
        radio.increaseVolume();

        Assertions.assertEquals(100, radio.getCurrentVolume());

    }

    @Test
    void checkReduceVolumeBoundary() {
        radio.setCurrentVolume(1);
        radio.reduceVolume();

        Assertions.assertEquals(0, radio.getCurrentVolume());

    }

    @Test
    void checkIncreaseVolumeLimit() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();

        Assertions.assertEquals(100, radio.getCurrentVolume());

    }

    @Test
    void checkReduceVolumeLimit() {
        radio.setCurrentVolume(0);
        radio.reduceVolume();

        Assertions.assertEquals(0, radio.getCurrentVolume());

    }

}
