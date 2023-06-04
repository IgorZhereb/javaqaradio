public class Radio {

    private int currentVolume;
    private int maxStation;
    private int currentStation;

    public Radio () {
        maxStation = 9;
    }

    public Radio (int numberOfStations) {
        maxStation = numberOfStations - 1;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {   // Сеттер громкости
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
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
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void increaseVolume() {                  // Прибавление громкости
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {                   // Убавление громкости
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }


    public void next() {                    // След. станция
        if (currentStation != maxStation) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {                   // Пред. станция
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }

    }
}




