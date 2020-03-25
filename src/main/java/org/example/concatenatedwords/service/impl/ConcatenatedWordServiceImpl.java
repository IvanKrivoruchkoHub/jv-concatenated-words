package org.example.concatenatedwords.service.impl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.example.concatenatedwords.service.ConcatenatedWordService;

public class ConcatenatedWordServiceImpl implements ConcatenatedWordService {
    @Override
    public List<String> getAllConcatenatedWords(List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList);
        List<String> result = new ArrayList<>();
        for (String word: wordSet) {
            if (isConcat(word, wordSet, 0, 1)) {
                result.add(word);
            }
        }
        return result;
    }

    private boolean isConcat(String word, Set<String> words, int start, int end) {
        if (end > word.length() || (end == word.length() && start == 0)) {
            return false;
        }
        String temp = word.substring(start, end);
        if (words.contains(temp)) {
            if (end == word.length()) {
                return true;
            }
            return isConcat(word, words, end, end + 1) || isConcat(word, words, start, end + 1);
        }
        return isConcat(word, words, start, end + 1);
    }

    @Override
    public String getLongestConcatenatedWord(List<String> concatenatedWords) {
        concatenatedWords.sort(Comparator.comparing(String::length));
        return concatenatedWords.get(concatenatedWords.size() - 1);
    }

    @Override
    public String getSecondLongestConcatenatedWord(List<String> concatenatedWords) {
        concatenatedWords.sort(Comparator.comparing(String::length));
        return concatenatedWords.get(concatenatedWords.size() - 2);
    }
}
