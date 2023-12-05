import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Day5 {
    long[][] seedToSoil = readData("/Users/sagaryadav/Repositories/BootcampProjectGCP/AdventOfCode/src/inputs/Day5/seedToSoil");
    long[][] fertToWater = readData("/Users/sagaryadav/Repositories/BootcampProjectGCP/AdventOfCode/src/inputs/Day5/fertToWater");
    long[][] lightToTemp = readData("/Users/sagaryadav/Repositories/BootcampProjectGCP/AdventOfCode/src/inputs/Day5/lightToTemp");
    long[][] soilToFert = readData("/Users/sagaryadav/Repositories/BootcampProjectGCP/AdventOfCode/src/inputs/Day5/soilToFert");
    long[][] humToloc = readData("/Users/sagaryadav/Repositories/BootcampProjectGCP/AdventOfCode/src/inputs/Day5/humToloc");
    long[][] tempToHum = readData("/Users/sagaryadav/Repositories/BootcampProjectGCP/AdventOfCode/src/inputs/Day5/tempToHum");
    long[][] waterToLight = readData("/Users/sagaryadav/Repositories/BootcampProjectGCP/AdventOfCode/src/inputs/Day5/waterToLight");

    List<Long> seeds = readSeeds("/Users/sagaryadav/Repositories/BootcampProjectGCP/AdventOfCode/src/inputs/Day5/seeds");

    public int getClosestLocation() {
        System.out.println(seeds.stream().mapToLong(this::getCloseLocationForASeed).min().getAsLong());
        return 0;
    }

    public long getClosestLocation2(){
        int i = 0;
        long result = Long.MAX_VALUE;
        Set<Long> newSeedsList = new HashSet<>();
        while(i< seeds.size()){
            for( long j = seeds.get(i) ; j < seeds.get(i+1) + seeds.get(i);j++) {
                long res = getCloseLocationForASeed(j);
                if(result > res)
                       result = res;
                System.out.println(j);
            }
            i +=2;

        }
        Optional<Long> seedLoc = newSeedsList.stream().sorted().findFirst();

        System.out.println( seedLoc.get());
        return seedLoc.get();
    }

    private long getCloseLocationForASeed(Long seedNumber) {

        return getLocationInEachMap(humToloc , getLocationInEachMap(tempToHum ,
                getLocationInEachMap(lightToTemp , getLocationInEachMap(waterToLight ,
                        getLocationInEachMap(fertToWater , getLocationInEachMap(soilToFert,
                                getLocationInEachMap(seedToSoil , seedNumber)))))));
    }


    private long getLocationInEachMap(long[][] locationMap, Long seedNumber) {

        for (int i = 0; i < locationMap.length; i++) {
            if(seedNumber >= locationMap[i][1] && seedNumber <= locationMap[i][1]+locationMap[i][2] - 1)
                return seedNumber + locationMap[i][0] - locationMap[i][1];
        }
            return seedNumber;

    }


    private long[][] readData(String filePath) {

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

    public static List<Long> readSeeds(String filePath) {
        List<Long> longList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Read the single line from the file
            if ((line = br.readLine()) != null) {
                // Split the line into individual integers
                String[] values = line.split(" ");

                // Convert and add each integer to the list
                for (String value : values) {
                    longList.add(Long.parseLong(value));
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception as appropriate for your application
        }

        return longList;
    }
}
