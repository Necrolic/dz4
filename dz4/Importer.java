package dz4;

import java.io.IOException;

public interface Importer {
    void importFile(String pathToFile) throws IOException;
}