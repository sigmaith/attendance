package attendance.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class CsvReader {
    private static final String DELIMITER = ",";

    public static List<String[]> readFile(final String filePath) {
        try (final BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            return br.lines()
                    .skip(1) // Skip the header line
                    .map(line -> line.split(DELIMITER))
                    .toList();
        } catch (final IOException e) {
            throw new IllegalStateException();
        }
    }
}
