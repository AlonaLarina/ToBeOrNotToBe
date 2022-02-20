package com.company;

import java.util.Random;

public class ToBeOrNotToBe {

    public static void main(String[] args) {

        String mainAnswer = new String("TO BE");
        Random rand = new Random();
        boolean toBe = rand.nextBoolean(); // random boolean
        boolean myStatus;
        String myColour = null;

        if (toBe || !toBe) {

            myStatus = true; // for fun, always true
        } else {

            myStatus = false;
        }

        if (myStatus) {

            if (!toBe) {

                mainAnswer = "NOT TO BE!";
                myColour = ConsoleColors.RED_BOLD;
            } else {

                mainAnswer = "TO BE!";
                myColour = ConsoleColors.GREEN_BOLD;
            }
        }

        // Scull Array
        String[] scullArray = new String[]{"  ╱▔▔▔▔▔▔▔▔▔▔▔▔▔▔╲  ", " ╱┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈╲ ", " ▏ ┃┈┈┈┈┈┈┈┈┈┈┈┈┃ ▕ ", " ▏▏┈┈┈┈┈┈┈┈┈┈┈┈┈┈▕▕ ", " ╲┈┃┈▉▉◣┈┈┈◢▉▉┈┃┈╱ ", " ┈▏┈┈▉▉◤┈┈┈◥▉▉┈┈▕  ", " ╭▏┈┈┈┈┈◢▉◣┈┈┈┈┈▕╮ ", " ╰━╮┈┈┈┈◤▅◥┈┈┈┈╭━╯ ", " ┈╲┃.┈┈┈┈┈┈┈┈┈┈.┃╱  ", " ┈▕╰.┈╋╋╋╋╋╋╋╋┈.╯▏  ", " ┈┈┈╲▂▂▂▂▂▂▂▂▂▂╱    "};

        String mainQuestion = "To be, or not to be, that is the question...";
        int stringLength = mainQuestion.length(); // 44
        int emptySpace = 24; // by default 24, should be more than 13
        int stringLengthLimit = stringLength + emptySpace; // 68

        String symbolMacron = "▔";
        String myTopFrame = symbolMacron.repeat(stringLengthLimit); // 68
        System.out.println("┃" + myTopFrame + "┃"); // first line

        String symbolWhitespace = " ";
        String myHalfSpace = symbolWhitespace.repeat(emptySpace / 2); // 12
        System.out.println("┃" + myHalfSpace + mainQuestion + myHalfSpace + "┃"); // second line with Question

        String myLargeSpace = symbolWhitespace.repeat(stringLengthLimit); // 68
        System.out.println("┃" + myLargeSpace + "┃"); // 3rd empty line

        stringLength = (stringLengthLimit - scullArray[0].length()) / 2; // 68-20=48/2=24
        String mySpace = symbolWhitespace.repeat(stringLength);
        for (int i = 0; i < scullArray.length; i++) {
            System.out.println("┃" + mySpace + scullArray[i] + mySpace + "┃"); // 4-14 lines with scull
        }
        System.out.println("┃" + myLargeSpace + "┃"); // 15th empty line

        String mainFinalAnswer = "The answer is: " + mainAnswer; // 25 or 21, should be counted without formatting
        stringLength = mainFinalAnswer.length();
        mySpace = symbolWhitespace.repeat((stringLengthLimit - stringLength) / 2); //68-25=43/2
        mainFinalAnswer = "The answer is:  " + myColour + mainAnswer + ConsoleColors.RESET; // text formatting
        System.out.println("┃" + mySpace + mainFinalAnswer + mySpace + "┃"); // 16th line with Answer

        String symbolUnderline = "▂";
        String myBelowFrame = symbolUnderline.repeat(stringLengthLimit); // 68
        System.out.println("┃" + myBelowFrame + "┃"); // final line nr. 17
    }
}