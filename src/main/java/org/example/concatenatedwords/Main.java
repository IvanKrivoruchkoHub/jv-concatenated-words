package org.example.concatenatedwords;

import java.io.IOException;
import java.util.List;
import org.example.concatenatedwords.service.ConcatenatedWordService;
import org.example.concatenatedwords.service.FileReaderService;
import org.example.concatenatedwords.service.impl.ConcatenatedWordServiceImpl;
import org.example.concatenatedwords.service.impl.FileReaderServiceImpl;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReaderService fileService = new FileReaderServiceImpl();
        List<String> words = fileService.getWordsFromFile("src/main/resources/wordsforproblem.txt");
        ConcatenatedWordService wordService = new ConcatenatedWordServiceImpl();
        List<String> concatenatedWords =  wordService.getAllConcatenatedWords(words);
        System.out.println(concatenatedWords.size());
        System.out.println(wordService.getLongestConcatenatedWord(concatenatedWords));
        System.out.println(wordService.getSecondLongestConcatenatedWord(concatenatedWords));
    }
}
