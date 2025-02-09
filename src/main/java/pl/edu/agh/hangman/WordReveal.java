package pl.edu.agh.hangman;

public class WordReveal {
    private String word;
    private int counter;

    public WordReveal(String word) {
        this.word = word;
    }


    public String displayInitialWordState(String word) {
        int wordLength = word.length();
        String initialWord = "";
        for (int i = 0; i < wordLength; i++) {
            initialWord += "_";
        }
        System.out.println(initialWord);
        return initialWord;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public String findLetter(char letter) {

        int iterateIndex = 0;
        if (word.indexOf(letter) == -1) {
            setCounter(counter + 1);
            return word;
        } else {
            while (word.indexOf(letter, iterateIndex) != -1) {
                int index = word.indexOf(letter);
                char charToReplace = word.charAt(index);
                word = word.replace(charToReplace, letter);
                iterateIndex++;
            }
            System.out.println(word);
            return word;
        }
    }
    

    public static void main(String[] args) {
        WordReveal wordReveal = new WordReveal("Hangman");
        wordReveal.displayInitialWordState("Hangman");
    }
}
