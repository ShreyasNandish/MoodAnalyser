package com.bridgelabz;

import java.util.Locale;

public class MoodAnalyser {
    public static void main(String[] args) {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String happyMood = moodAnalyser.analyseMood("Happy mood");
        System.out.println("Mood is "+happyMood);
        String sadMood = moodAnalyser.analyseMood("sad mood");
        System.out.println("Mood is "+sadMood);
    }

    public String analyseMood(String message)
    {
        if(message.toLowerCase().contains("happy"))
            return "happy";
        else
            return "sad";
    }
}
