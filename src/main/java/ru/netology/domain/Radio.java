package ru.netology.domain;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Radio {
    private int maxStation = 9; // Максмимальная станция
    private int minStation = 0; // Минимальная станция
    private int currentStation; // Выбранная станция
    private int maxVolume = 100; // Максимальная громкость
    private int minVolume = 0; // Минимальная громкость
    private int currentVolume; // Выбранная громкость


}
