package pl.edu.agh.hangman;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class WordFinder {

    private final List<String> words = new ArrayList<>();

    public void readFile() throws IOException, URISyntaxException {
        InputStream is = getClass().getClassLoader().getResourceAsStream("slowa.txt");

        try (InputStreamReader streamReader =
                     new InputStreamReader(is, StandardCharsets.UTF_8);
             BufferedReader reader = new BufferedReader(streamReader)) {

            String line;
            while ((line = reader.readLine()) != null) {
                words.add(line.toUpperCase());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public List<String> getWords() {
        return words;
    }

    public String getRandomWord() {
        return words.get((int) (Math.random() * words.size()));
    }


}
