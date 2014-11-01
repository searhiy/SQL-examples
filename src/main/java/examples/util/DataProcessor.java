package examples.util;

import java.util.List;

/**
 * Created by serhii on 01.11.14.
 */
public interface DataProcessor {

    public void processData(String[] data);

    public List<?> getData();
}
