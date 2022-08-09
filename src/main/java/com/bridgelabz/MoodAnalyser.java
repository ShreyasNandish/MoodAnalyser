package com.bridgelabz;

import java.util.Locale;

public class MoodAnalyser {

    String message;
    public static void main(String[] args) {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        String happyMood = moodAnalyser.analyseMood();
        System.out.println("Mood is "+happyMood);
        String sadMood = moodAnalyser.analyseMood();
        System.out.println("Mood is "+sadMood);
    }

    public MoodAnalyser(String message)
    {
        this.message = message;
    }

    public MoodAnalyser() {

    }

    public String analyseMood()
    {
        try {
            if (message.toLowerCase().contains("sad"))
                return "SAD";
            else
                return "HAPPY";
            }
        catch (Exception e)
        {
            return "HAPPY";
        }

    }
}
