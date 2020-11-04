package ru.netology.domain;


import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Data

public class Radio {
    private int maxStation = 10; // Максмимальная станция
    private int minStation = 0; // Минимальная станция
    private int currentStation = 5; // Выбранная станция
    private int maxVolume = 100; // Максимальная громкость
    private int minVolume = 0; // Минимальная громкость
    private int currentVolume = 50; // Выбранная громкость

    public void prevCurrentStation() {
        int currentStation = this.currentStation;
        if (currentStation <= minStation) {
            this.currentStation = maxStation;
        } else {
            this.currentStation = currentStation + 1;
        }
    }
    public void setCurrentSta(int currentStation) {
        this.currentVolume = currentVolume;
    }
    public void nextCurrentStation() {
        int currentStation = this.currentStation;
        if (currentStation >= maxStation) {
            this.currentStation = minStation;
        } else {
            this.currentStation = currentStation - 1;
        }
    }

    public void remoteCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            this.currentStation = maxStation;
        } else
        if (currentStation < minStation) {
            this.currentStation = minStation;
        } else {
            this.currentStation = currentStation;
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

    public void nextCurrentVolume() {
        int currentVolume = this.currentVolume;
        if (currentVolume >= maxVolume) {
            this.currentVolume = maxVolume;
        } else {
            this.currentVolume = currentVolume + 1;
        }
    }

    public void prevCurrentVolume() {
        int currentVolume = this.currentVolume;
        if (currentVolume <= minVolume) {
            this.currentVolume = minVolume;
        } else {
            this.currentVolume = currentVolume - 1;
        }
    }

}
