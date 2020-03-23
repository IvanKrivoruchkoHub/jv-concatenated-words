package org.example.concatenatedwords.service.impl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import org.example.concatenatedwords.service.FileReaderService;

public class FileReaderServiceImpl implements FileReaderService {
    @Override
    public List<String> getWordsFromFile(String path) throws IOException {
        return Files.readAllLines(Paths.get(path));
    }
}
