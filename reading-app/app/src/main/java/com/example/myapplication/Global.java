package com.example.myapplication;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.widget.Button;

import androidx.appcompat.widget.LinearLayoutCompat;

import com.example.myapplication.Pages.FirstPage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// code that sets up all static values used in all three pages of our story
public class Global{
    private static Global instance;
    private Integer story;
    private Integer mode;
    private Integer words;
    private Integer words2;
    private Integer words3;
    private String[] storyselected;

    private Integer storynumber;

    public static final Integer buttonFontSize = 20;

    public static final Integer specialButtonFontSize = 18;

    public static final Integer height = 75;

    public static final Integer specialHeight = 69;



    public static Global getInstance() {
        if (instance == null) {
            instance = new Global();
        }
        return instance;
    }

    public Integer getStory() {

        return story;
    }

    public void setStory(Integer value) {

        story = value;
    }

    public String[] getStoryselected() {

        return storyselected;
    }

    public void setStoryselected(String [] value) {

        storyselected = value;
    }

    public Integer getMode() {

        return mode;
    }

    public void setMode(Integer value) {

        mode = value;
    }

    public int getWords() {

        return words;
    }

    public void setWords(int value) {

        words = value;
    }
    public int getWords2() {

        return words2;
    }

    public void setWords2(int value) {

        words2 = value;
    }
    public int getWords3() {

        return words3;
    }

    public void setWords3(int value) {

        words3 = value;
    }

    public static void startStory(Context context, int stringResourceA, int stringResourceA1, int stringResourceA2, int stringResourceA3) {
        // setting up our three pages by assigning them the repective words
        Global.getInstance().setStory(stringResourceA);
        Global.getInstance().setWords(stringResourceA1);
        Global.getInstance().setWords2(stringResourceA2);
        Global.getInstance().setWords3(stringResourceA3);
        Intent intent = new Intent(context, FirstPage.class);
        context.startActivity(intent);
    }

    public void setstorynumber(int value) {
        // sets up a variable that stores the story number we're reading. we use it later to
        // change stories in ThirdPage using getstorynumber
        storynumber = value;
    }

    public Integer getstorynumber() {

        return storynumber;
    }

    public static void startRobotCondition(Context context, String firststory){
        // takes in a story number from the dropdown on our condition selection page and loads the words
        // associated with the story (is seperated into title, first, second and third page
        switch (firststory) {
            case "0":
                Global.startStory(context, R.string.A, R.string.A1, R.string.A2, R.string.A3);
                break;
            case "1":
                Global.startStory(context, R.string.B, R.string.B1, R.string.B2, R.string.B3);
                break;
            case "2":
                Global.startStory(context, R.string.C, R.string.C1, R.string.C2, R.string.C3);
                break;
            case "3":
                Global.startStory(context, R.string.D, R.string.D1, R.string.D2, R.string.D3);
                break;
            case "4":
                Global.startStory(context, R.string.E, R.string.E1, R.string.E2, R.string.E3);
                break;
            case "5":
                Global.startStory(context, R.string.F, R.string.F1, R.string.F2, R.string.F3);
                break;
            case "6":
                Global.startStory(context, R.string.G, R.string.G1, R.string.G2, R.string.G3);
                break;
            case "7":
                Global.startStory(context, R.string.H, R.string.H1, R.string.H2, R.string.H3);
                break;
            case "8":
                Global.startStory(context, R.string.I, R.string.I1, R.string.I2, R.string.I3);
                break;
            case "9":
                Global.startStory(context, R.string.J, R.string.J1, R.string.J2, R.string.J3);
                break;
            case "10":
                Global.startStory(context, R.string.K, R.string.K1, R.string.K2, R.string.K3);
                break;
            case "11":
                Global.startStory(context, R.string.L, R.string.L1, R.string.L2, R.string.L3);
                break;
            case "12":
                Global.startStory(context, R.string.M, R.string.M1, R.string.M2, R.string.M3);
                break;
            case "13":
                Global.startStory(context, R.string.N, R.string.N1, R.string.N2, R.string.N3);
                break;
            case "14":
                Global.startStory(context, R.string.O, R.string.O1, R.string.O2, R.string.O3);
                break;
            case "15":
                Global.startStory(context, R.string.P, R.string.P1, R.string.P2, R.string.P3);
                break;
            case "16":
                Global.startStory(context, R.string.Q, R.string.Q1, R.string.Q2, R.string.Q3);
                break;
            case "17":
                Global.startStory(context, R.string.R, R.string.R1, R.string.R2, R.string.R3);
                break;
        }
    }

    public static void startHumanCondition(Context context, String firststory) {
        // same as function above. there's probably a better way to implement this but found this brute force way to get it working fast
        switch (firststory) {
            case "Sponges":
                Global.startStory(context, R.string.A, R.string.A1, R.string.A2, R.string.A3);
                break;
            case "Why We Need Water":
                Global.startStory(context, R.string.B, R.string.B1, R.string.B2, R.string.B3);
                break;
            case "Trees":
                Global.startStory(context, R.string.C, R.string.C1, R.string.C2, R.string.C3);
                break;
            case "The Raft":
                Global.startStory(context, R.string.D, R.string.D1, R.string.D2, R.string.D3);
                break;
            case "Honesty":
                Global.startStory(context, R.string.E, R.string.E1, R.string.E2, R.string.E3);
                break;
            case "Sunset at the Beach":
                Global.startStory(context, R.string.F, R.string.F1, R.string.F2, R.string.F3);
                break;
            case "Breathing":
                Global.startStory(context, R.string.G, R.string.G1, R.string.G2, R.string.G3);
                break;
            case "Animal Tools":
                Global.startStory(context, R.string.H, R.string.H1, R.string.H2, R.string.H3);
                break;
            case "The Sukkah Next Door":
                Global.startStory(context, R.string.I, R.string.I1, R.string.I2, R.string.I3);
                break;
            case "Helen Keller":
                Global.startStory(context, R.string.J, R.string.J1, R.string.J2, R.string.J3);
                break;
            case "Sloths and Monkeys":
                Global.startStory(context, R.string.K, R.string.K1, R.string.K2, R.string.K3);
                break;
            case "Changing Bedtime":
                Global.startStory(context, R.string.L, R.string.L1, R.string.L2, R.string.L3);
                break;
            case "Coyotes and Wolves":
                Global.startStory(context, R.string.M, R.string.M1, R.string.M2, R.string.M3);
                break;
            case "Fizzy Water":
                Global.startStory(context, R.string.N, R.string.N1, R.string.N2, R.string.N3);
                break;
            case "Prize Winning Vegetables":
                Global.startStory(context, R.string.O, R.string.O1, R.string.O2, R.string.O3);
                break;
            case "Crows":
                Global.startStory(context, R.string.P, R.string.P1, R.string.P2, R.string.P3);
                break;
            case "Government":
                Global.startStory(context, R.string.Q, R.string.Q1, R.string.Q2, R.string.Q3);
                break;
            case "Digital Music Recording":
                Global.startStory(context, R.string.R, R.string.R1, R.string.R2, R.string.R3);
                break;
        }
    }

    public static void processMessage(String message, LinearLayoutCompat buttonContainer) {
        // function that sets up fuctionality to highlight words by receiving the indexes of the word
        // from our raspberry pi

        // raspberry pi is coded to send the indexes of the three words to be highlighted by seperating them using semicolons
        List<String> receivedMessage = Arrays.asList(message.split(";"));

        if (receivedMessage.get(0).equals("highlight") || receivedMessage.get(0).equals("Return connection messagehighlight")) {
            String buttons_to_highlight = receivedMessage.get(1);
            buttons_to_highlight = buttons_to_highlight.substring(1, buttons_to_highlight.length() - 1);
            List<String> highlighted_button_indice = Arrays.asList(buttons_to_highlight.split(","));

            for (int i = 0; i < highlighted_button_indice.size(); i++) {
                String buttonToHighlight = highlighted_button_indice.get(i).trim();
                Integer buttonindex = Integer.parseInt(buttonToHighlight);
                Button highlightedbutton = buttonContainer.findViewById(buttonindex);

                if (highlightedbutton != null) {
                    highlightedbutton.setBackgroundColor(Color.LTGRAY);
                }
            }
        }
    }


}

