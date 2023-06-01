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
    public void ShouldIncreaseVolumeFromNinetyNine() {

        Radio rad = new Radio();

        rad.setCurrentVolume(99);
        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void ShouldIncreaseVolumeFrom100() {

        Radio rad = new Radio();

        rad.setCurrentVolume(100);
        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void ShouldIncreaseVolumeFrom101() {

        Radio rad = new Radio();

        rad.setCurrentVolume(101);
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

        int expected = 26;
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
    public void shouldDecreaseVolumeFromNinetyNine() {

        Radio rad = new Radio();

        rad.setCurrentVolume(99);
        rad.decreaseVolume();

        int expected = 98;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldDecreaseVolumeFrom100() {

        Radio rad = new Radio();

        rad.setCurrentVolume(100);
        rad.decreaseVolume();

        int expected = 99;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldDecreaseVolumeFrom101() {

        Radio rad = new Radio();

        rad.setCurrentVolume(101);
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

        int expected = 24;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);                 // Окончание тестов на громкость
    }


    @Test
    public void ShouldSwitchOnNextStationFromMinusOne() {

        Radio rad = new Radio(25);

        rad.setCurrentStation(-1);
        rad.next();

        int expected = 1;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void ShouldSwitchOnNextStationFromZero() {

        Radio rad = new Radio(25);

        rad.setCurrentStation(0);
        rad.next();

        int expected = 1;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void ShouldSwitchOnNextStationFromOne() {

        Radio rad = new Radio(25);

        rad.setCurrentStation(1);
        rad.next();

        int expected = 2;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void ShouldSwitchOnNextStationFromEight() {

        Radio rad = new Radio(25);

        rad.setCurrentStation(8);
        rad.next();

        int expected = 9;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void ShouldSwitchOnNextStationFromNine() {

        Radio rad = new Radio(25);

        rad.setCurrentStation(9);
        rad.next();

        int expected = 10;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void ShouldSwitchOnNextStationFromTen() {

        Radio rad = new Radio(25);

        rad.setCurrentStation(10);
        rad.next();

        int expected = 11;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void ShouldSwitchOnNextStationFromMinusTwentyFive() {

        Radio rad = new Radio(-25);

        rad.setCurrentStation(-25);
        rad.next();

        int expected = 1;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void ShouldSwitchOnNextStationFromTwentyFive() {

        Radio rad = new Radio(25);

        rad.setCurrentStation(25);
        rad.next();

        int expected = 1;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void ShouldSwitchOnPrevStationFromMinusOne() {

        Radio rad = new Radio(25);

        rad.setCurrentStation(-1);
        rad.prev();

        int expected = 24;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void ShouldSwitchOnPrevStationFromZero() {

        Radio rad = new Radio(25);

        rad.setCurrentStation(0);
        rad.prev();

        int expected = 24;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void ShouldSwitchOnPrevStationFromOne() {

        Radio rad = new Radio(25);

        rad.setCurrentStation(1);
        rad.prev();

        int expected = 0;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void ShouldSwitchOnPrevStationFromEight() {

        Radio rad = new Radio(25);

        rad.setCurrentStation(8);
        rad.prev();

        int expected = 7;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldSwitchOnPrevStationFromNine() {

        Radio rad = new Radio(25);

        rad.setCurrentStation(9);
        rad.prev();

        int expected = 8;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldSwitchOnPrevStationFromTen() {

        Radio rad = new Radio(25);

        rad.setCurrentStation(10);
        rad.prev();

        int expected = 9;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldSwitchOnPrevStationFromMinusTwentyFive() {

        Radio rad = new Radio(25);

        rad.setCurrentStation(-25);
        rad.prev();

        int expected = 24;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void ShouldSwitchOnPrevStationFromTwentyFive() {

        Radio rad = new Radio(25);

        rad.setCurrentStation(25);
        rad.prev();

        int expected = 24;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void ShouldSwitchOnNextStationFromTwenty() {

        Radio rad = new Radio(19);

        rad.setCurrentStation(20);
        rad.next();

        int expected = 1;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void ShouldSwitchOnPrevStationFromTwenty() {

        Radio rad = new Radio(19);

        rad.setCurrentStation(20);
        rad.prev();

        int expected = 18;
        int actual = rad.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


}






