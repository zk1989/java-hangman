package pl.edu.agh.hangman;

public class WordReveal2 {
    private String basicWord;
    private String hiddenWord;
    private int counter = 0;

    public WordReveal2(String word) {

        this.basicWord = word;
        hiddenWord = displayInitialWordState();
    }

    public int getCounter() {
        return counter;
    }


    public String displayInitialWordState() {
        int wordLength = basicWord.length();
        String initialWord = "";
        for (int i = 0; i < wordLength; i++) {
            initialWord += "_";
        }
        System.out.println(initialWord);
        return initialWord;
    }

    public String findLetter(char letter) {
        StringBuilder createdString = new StringBuilder();
        if (!basicWord.contains(String.valueOf(letter))) {
            counter++;
            return hiddenWord;
        } else {
            for (int i = 0; i < basicWord.length(); i++) {
                if (basicWord.charAt(i) == letter) {
                    createdString.append(basicWord.charAt(i));
                } else {
                    createdString.append("-");
                }
            }
        }
        hiddenWord = createdString.toString();
        return hiddenWord;
    }
}
