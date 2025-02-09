package pl.edu.agh.hangman;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

public class Game {
    static int  counter = 0;

    public static void start() throws IOException, URISyntaxException {
        DisplayPicture displayPicture = new DisplayPicture(counter);
        System.out.println(displayPicture.getPicture());


        

//        int counter = 0;
//
//        WordFinder wordFinder = new WordFinder();
//        wordFinder.readFile();
//        System.out.println(wordFinder.getRandomWord());
//        String choosenWord = wordFinder.getRandomWord();
//        WordReveal2 wordReveal2 = new WordReveal2(choosenWord);
//        wordReveal2.displayInitialWordState();
//
//        DisplayPicture displayPicture = new DisplayPicture(0);
//        System.out.println(displayPicture.getPicture());
//
//       while (counter < 6) {
//           System.out.println("===========");
//           System.out.println("Enter letter: ");
//           Scanner scanner = new Scanner(System.in);
//           String letter = scanner.next();
//           letter = letter;
//
//
//           String returnedString = wordReveal2.findLetter(letter.charAt(0));
//          // System.out.println(wordReveal2.findLetter(letter.charAt(0)));
//           System.out.println(returnedString);
//
//           counter = wordReveal2.getCounter();
//           System.out.println("counter" + counter );
//           displayPicture.setCounter(counter);
//           System.out.println(displayPicture.getPicture());
//

       //}


    }
}
