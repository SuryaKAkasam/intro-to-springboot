package me.suryaakasam.v3.springJavaConfig.message.utilities;

import java.util.Random;

public class ColorUtils {
    private String addColor(String ansiColor, String str) {
        String ANSI_RESET = "\u001B[0m";
        return ansiColor + str + ANSI_RESET;
    }

    public String addRedColor(String str) {
        String ANSI_RED = "\u001B[31m";
        return addColor(ANSI_RED, str);
    }

    public String addGreenColor(String str) {
        String ANSI_GREEN = "\u001B[32m";
        return addColor(ANSI_GREEN, str);
    }

    public String addYellowColor(String str) {
        String ANSI_YELLOW = "\u001B[33m";
        return addColor(ANSI_YELLOW, str);
    }

    public String addBlueColor(String str) {
        String ANSI_BLUE = "\u001B[34m";
        return addColor(ANSI_BLUE, str);
    }

    public String addPurpleColor(String str) {
        String ANSI_PURPLE = "\u001B[35m";
        return addColor(ANSI_PURPLE, str);
    }

    public String addCyanColor(String str) {
        String ANSI_CYAN = "\u001B[36m";
        return addColor(ANSI_CYAN, str);
    }

    public String addWhiteColor(String str) {
        String ANSI_WHITE = "\u001B[37m";
        return addColor(ANSI_WHITE, str);
    }

    public String addRandomColor(String str) {
        Random r = new Random();
        int lowColor = 31, highColor = 37;
        int randomColor = r.nextInt(highColor - lowColor + 1) + lowColor;

        return switch (randomColor) {
            case 31 -> addRedColor(str);
            case 32 -> addGreenColor(str);
            case 33 -> addYellowColor(str);
            case 34 -> addBlueColor(str);
            case 35 -> addPurpleColor(str);
            case 36 -> addCyanColor(str);
            case 37 -> addWhiteColor(str);
            default -> throw new RuntimeException("Exception! Unsupported color code " + randomColor);
        };
    }
}
