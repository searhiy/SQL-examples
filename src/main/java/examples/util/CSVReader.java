package examples.util;

import examples.util.processors.DataProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.List;

/**
 * Created by serhii on 01.11.14.
 */
public class CSVReader {

    private static final Logger LOGGER = LoggerFactory.getLogger(CSVReader.class);

    public static List<?> readCsv(String csvFileToRead, DataProcessor processor) {
        BufferedReader br = null;
        String line = "";
        String splitBy = ",";

        try {
            br = new BufferedReader(new InputStreamReader(CSVReader.class.getClassLoader().getResourceAsStream(csvFileToRead)));
            while ((line = br.readLine()) != null) {
                String[] data = line.split(splitBy);
                processor.processData(data);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    LOGGER.error("cannot close resource (*.csv file)", e);
                }
            }
        }
        return processor.getData();
    }
}
