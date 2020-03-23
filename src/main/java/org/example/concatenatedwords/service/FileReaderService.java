package org.example.concatenatedwords.service;

import java.io.IOException;
import java.util.List;

public interface FileReaderService {
    List<String> getWordsFromFile(String path) throws IOException;
}
