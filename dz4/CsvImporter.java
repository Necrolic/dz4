package dz4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CsvImporter implements Importer{
    @Override
    public void importFile(String pathToFile) throws IOException {
        List<String>list = Files.readAllLines(Paths.get("tasks.csv"));
        Document document = (Document) list;
    }
}
