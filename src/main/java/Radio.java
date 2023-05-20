public class Radio {

    private int currentVolume;
    private int currentStation;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {   // Сеттер громкости
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {   // Сеттер станции
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void increaseVolume() {                  // Прибавление громкости
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {                   // Убавление громкости
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }


    public void next() {                    // След. станция
        if (currentStation != 9) {
            currentStation++;
            return;
        }
        currentStation = 0;

    }

    public void prev() {                   // Пред. станция
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }

    }
}




