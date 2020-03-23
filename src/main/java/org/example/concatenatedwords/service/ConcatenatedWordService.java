package org.example.concatenatedwords.service;

import java.util.List;

public interface ConcatenatedWordService {
    String getLongestConcatenatedWord(List<String> words);

    String getSecondLongestConcatenatedWord(List<String> words);

    List<String> getAllConcatenatedWords(List<String> words);
}
