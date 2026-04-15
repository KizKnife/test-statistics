package com.pluralsight;

public class TestStatistics {
    public static void main(String[] args) {
        int[] grades = {90, 56, 80, 83, 76, 97, 3, 86, 56, 61};
        double average = 0;
        int highScore;
        int lowScore;

        for (int i = 0; i < grades.length; i++) {
            average += grades[i];
        }

        System.out.printf("Average: %.2f%%%n", average / grades.length);

        highScore = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > highScore) {
                highScore = grades[i];
            }
        }

        System.out.printf("Highest score: %d%n", highScore);

        lowScore = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] < lowScore) {
                lowScore = grades[i];
            }
        }

        System.out.printf("Lowest score: %d", lowScore);
    }
}
