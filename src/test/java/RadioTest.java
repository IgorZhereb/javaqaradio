import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {


    @Test
    public void ShouldIncreaseVolumeFromMinusOne() {
        Radio rad = new Radio();


        rad.setCurrentVolume(-1);
        rad.increaseVolume();

        int expected = 1;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void ShouldIncreaseVolumeFromZero() {
        Radio rad = new Radio();


        rad.setCurrentVolume(0);
        rad.increaseVolume();

        int expected = 1;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldIncreaseVolumeFromOne() {
        Radio rad = new Radio();


        rad.setCurrentVolume(1);
        rad.increaseVolume();

        int expected = 2;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void ShouldIncreaseVolumeFromNine() {
        Radio rad = new Radio();


        rad.setCurrentVolume(9);
        rad.increaseVolume();

        int expected = 10;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void ShouldIncreaseVolumeFromTen() {
        Radio rad = new Radio();


        rad.setCurrentVolume(10);
        rad.increaseVolume();

        int expected = 10;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void ShouldIncreaseVolumeFromEleven() {
        Radio rad = new Radio();


        rad.setCurrentVolume(11);
        rad.increaseVolume();

        int expected = 1;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void ShouldIncreaseVolumeFromMinusTwentyFive() {
        Radio rad = new Radio();


        rad.setCurrentVolume(-25);
        rad.increaseVolume();

        int expected = 1;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void ShouldIncreaseVolumeFromTwentyFive() {
        Radio rad = new Radio();


        rad.setCurrentVolume(25);
        rad.increaseVolume();

        int expected = 1;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldDecreaseVolumeFromMinusOne() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-1);
        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeFromZero() {
        Radio rad = new Radio();

        rad.setCurrentVolume(0);
        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldDecreaseVolumeFromOne() {
        Radio rad = new Radio();

        rad.setCurrentVolume(1);
        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldDecreaseVolumeFromNine() {
        Radio rad = new Radio();

        rad.setCurrentVolume(9);
        rad.decreaseVolume();

        int expected = 8;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldDecreaseVolumeFromTen() {
        Radio rad = new Radio();

        rad.setCurrentVolume(10);
        rad.decreaseVolume();

        int expected = 9;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldDecreaseVolumeFromEleven() {
        Radio rad = new Radio();

        rad.setCurrentVolume(11);
        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldDecreaseVolumeFromMinusTwentyFive() {
        Radio rad = new Radio();

        rad.setCurrentVolume(-25);
        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldDecreaseVolumeFromTwentyFive() {
        Radio rad = new Radio();

        rad.setCurrentVolume(25);
        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);                 // Окончание тестов на громкость
    }


    @Test
    public void ShouldSwitchOnNextStationFromMinusOne() {
        Radio rad = new Radio();

        rad.setCurrentStation(-1);
        rad.next();

        int expected = 1;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void ShouldSwitchOnNextStationFromZero() {
        Radio rad = new Radio();

        rad.setCurrentStation(0);
        rad.next();

        int expected = 1;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void ShouldSwitchOnNextStationFromOne() {
        Radio rad = new Radio();

        rad.setCurrentStation(1);
        rad.next();

        int expected = 2;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void ShouldSwitchOnNextStationFromEight() {
        Radio rad = new Radio();

        rad.setCurrentStation(8);
        rad.next();

        int expected = 9;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void ShouldSwitchOnNextStationFromNine() {
        Radio rad = new Radio();

        rad.setCurrentStation(9);
        rad.next();

        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void ShouldSwitchOnNextStationFromTen() {
        Radio rad = new Radio();

        rad.setCurrentStation(10);
        rad.next();

        int expected = 1;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void ShouldSwitchOnNextStationFromMinusTwentyFive() {
        Radio rad = new Radio();

        rad.setCurrentStation(-25);
        rad.next();

        int expected = 1;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void ShouldSwitchOnNextStationFromTwentyFive() {
        Radio rad = new Radio();

        rad.setCurrentStation(25);
        rad.next();

        int expected = 1;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void ShouldSwitchOnPrevStationFromMinusOne() {
        Radio rad = new Radio();

        rad.setCurrentStation(-1);
        rad.prev();

        int expected = 9;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void ShouldSwitchOnPrevStationFromZero() {
        Radio rad = new Radio();

        rad.setCurrentStation(0);
        rad.prev();

        int expected = 9;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void ShouldSwitchOnPrevStationFromOne() {
        Radio rad = new Radio();

        rad.setCurrentStation(1);
        rad.prev();

        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void ShouldSwitchOnPrevStationFromEight() {
        Radio rad = new Radio();

        rad.setCurrentStation(8);
        rad.prev();

        int expected = 7;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldSwitchOnPrevStationFromNine() {
        Radio rad = new Radio();

        rad.setCurrentStation(9);
        rad.prev();

        int expected = 8;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldSwitchOnPrevStationFromTen() {
        Radio rad = new Radio();

        rad.setCurrentStation(10);
        rad.prev();

        int expected = 9;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldSwitchOnPrevStationFromMinusTwentyFive() {
        Radio rad = new Radio();

        rad.setCurrentStation(-25);
        rad.prev();

        int expected = 9;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void ShouldSwitchOnPrevStationFromTwentyFive() {
        Radio rad = new Radio();

        rad.setCurrentStation(25);
        rad.prev();

        int expected = 9;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


}






