import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Util {

    public static long[][] readData(String filePath) {

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            // Assuming each line contains space-separated integers
            String line;
            int numRows = 0;
            int numCols = 0;

            // First, count the number of rows and columns in the file
            while ((line = br.readLine()) != null) {
                numRows++;
                String[] values = line.split(" ");
                numCols = Math.max(numCols, values.length);
            }

            // Reset the file reader
            br.close();
            BufferedReader br1 = new BufferedReader(new FileReader(filePath));
            br1 = new BufferedReader(new FileReader(filePath));

            // Create a 2D array
            long[][] array = new long[numRows][numCols];

            // Read data into the 2D array
            int row = 0;
            while ((line = br1.readLine()) != null) {
                String[] values = line.split(" ");
                for (int col = 0; col < values.length; col++) {
                    array[row][col] = Long.parseLong(values[col]);
                }
                row++;
            }

            return array;

        } catch (IOException e) {
            e.printStackTrace();
            return null; // or handle the exception as appropriate for your application
        }
    }

    public static HashMap<String, String> readKeyValueFromFile(String filePath) {
        HashMap<String, String> keyValueMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Read each line from the file
            while ((line = br.readLine()) != null) {
                // Split the line into key and value
                String[] parts = line.split("\\s+");
                if (parts.length == 2) {
                    String key = parts[0];
                    String value = parts[1];

                    // Store key-value pair in the map
                    keyValueMap.put(key, value);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception as appropriate for your application
        }

        return keyValueMap;
    }



}
