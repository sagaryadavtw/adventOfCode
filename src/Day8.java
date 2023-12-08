import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Day8 {

    public int getSteps() {

        String filePath = "/Users/sagaryadav/Repositories/BootcampProjectGCP/AdventOfCode/src/inputs/Day8";
        HashMap<String, Network> dataMap = readNetworksFromFile(filePath);
        String pathToFollow = "LRRRLRRRLRRLRRLRLRRLRRLRRRLRRLRRRLRRRLLRRRLRRRLRRRLRLRRLRRRLRLRRRLRRRLLRLRLRRLRRLLLRRLRRLRRRLLRRRLLRRRLRLRRRLRRRLLRRLRLLRLRRRLRRLRRLRLRLRLRLRLRRRLRLRRRLLRLRRLRRRLRRRLRLRRLRLLLRLRLRLRLRLRRRLLRRLRLRLLRRRLRRLRRRLRRLRRLRRRLLRRLRLRRLRRRLRRLRLRRLRLLRRLLRLRRRLRRLRLLRRRR";
        return keepFollowingPath(pathToFollow, dataMap);
    }

    public long getSteps_2() {

        String filePath = "/Users/sagaryadav/Repositories/BootcampProjectGCP/AdventOfCode/src/inputs/Day8";
        HashMap<String, Network> dataMap = readNetworksFromFile(filePath);
        String pathToFollow = "LRRRLRRRLRRLRRLRLRRLRRLRRRLRRLRRRLRRRLLRRRLRRRLRRRLRLRRLRRRLRLRRRLRRRLLRLRLRRLRRLLLRRLRRLRRRLLRRRLLRRRLRLRRRLRRRLLRRLRLLRLRRRLRRLRRLRLRLRLRLRLRRRLRLRRRLLRLRRLRRRLRRRLRLRRLRLLLRLRLRLRLRLRRRLLRRLRLRLLRRRLRRLRRRLRRLRRLRRRLLRRLRLRRLRRRLRRLRLRRLRLLRRLLRLRRRLRRLRLLRRRR";
        return keepFollowingPath_2(pathToFollow, dataMap);
    }

    private int keepFollowingPath(String path, HashMap<String, Network> dataMap) {
        String startNode = "AAA";
        boolean pathFound = false;
        int result = 0;
        while (!pathFound) {
            result += path.length();
            char[] pathToArray = path.toCharArray();
            for (char c : pathToArray) {

                Network network1 = dataMap.get(startNode);
                if (c == 'L') {
                    startNode = network1.getLeft();
                } else
                    startNode = network1.getRight();
                if (startNode.equals("ZZZ"))
                    pathFound = true;
            }
        }
        return result;
    }

    private long keepFollowingPath_2(String path, HashMap<String, Network> dataMap) {
        List<Network> startNodes = new ArrayList<>();
        for (String key : dataMap.keySet()) {
            if (key.endsWith("A"))
                startNodes.add(dataMap.get(key));
        }
        int i = 0;
        int[] arr = new int[startNodes.size()];
        for (Network n : startNodes) {
            String startNode = n.getSource();
            boolean pathFound = false;
            int result = 0;
            while (!pathFound) {
                char[] pathToArray = path.toCharArray();
                for (char c : pathToArray) {
                    result++;
                    Network network1 = dataMap.get(startNode);
                    if (c == 'L') {
                        startNode = network1.getLeft();
                    } else
                        startNode = network1.getRight();
                    if (startNode.endsWith("Z")) {
                        pathFound = true;
                        break;
                    }
                }
            }
            arr[i] = result;
            i++;
        }
        System.out.println(lcmArr(arr, 0, arr.length));
        return lcmArr(arr, 0, arr.length);
    }

    public static long lcmArr(int[] arr, int start, int end) {
        if (end - start == 1) {
            return lcm(arr[start], arr[end - 1]);
        }
        return lcm(arr[start], lcmArr(arr, start + 1, end));
    }

    public static long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }

    public static long gcd(long a, long b) {
        if (a < b) {
            return gcd(b, a);
        }
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }

    public boolean followPath(String path, HashMap<String, Network> dataMap, String startNode) {
        char[] pathToArray = path.toCharArray();
        int result = 0;
        for (char c : pathToArray) {

            Network network1 = dataMap.get(startNode);
            if (c == 'L') {
                startNode = network1.getLeft();
            } else
                startNode = network1.getRight();
            if (startNode.equals("ZZZ"))
                return true;
        }
        return false;

    }


    public HashMap<String, Network> readNetworksFromFile(String filePath) {
        HashMap<String, Network> dataMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Read each line from the file
            while ((line = br.readLine()) != null) {
                // Split the line into source, left, and right using regex
                String[] parts = line.split(" = \\(|, |\\)");

                // Create a Network instance and add it to the list
                if (parts.length == 3) {
                    dataMap.put(parts[0], new Network(parts[0], parts[1], parts[2]));
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception as appropriate for your application
        }

        return dataMap;
    }

    public Network network;

    private class Network {
        private String source;
        private String left;
        private String right;

        public Network(String source, String left, String right) {
            this.source = source;
            this.left = left;
            this.right = right;
        }

        public String getSource() {
            return source;
        }

        public String getLeft() {
            return left;
        }

        public String getRight() {
            return right;

        }

    }


}
