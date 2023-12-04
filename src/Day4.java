import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class Day4 {


    public int getPoints(String path) throws URISyntaxException, IOException {
        List<String> inputData = Files.lines(Paths.get(getClass().getResource(path).toURI())).collect(Collectors.toList());
        int result = 0;
        for (String in : inputData) {
            String[] numberArray = in.replace("|", "").split("\\s+");

            // Convert the array to a list of strings
            List<String> numberList = Arrays.asList(numberArray);
            result += calculateSumInCard(numberList);
        }


        return result;
    }

    private int calculateSumInCard(List<String> input) {
        Set<String> numberSet = new HashSet<>();
        int result = 1;
        boolean foundCard = false;
        for (String s : input) {
            if (numberSet.contains(s)) {
                result = result * 2;
                foundCard = true;
            } else
                numberSet.add(s);
        }
        if (foundCard)
            return result / 2;
        return 0;

    }

    public int getPointsPart2(String path) throws URISyntaxException, IOException {
        List<String> inputData = Files.lines(Paths.get(getClass().getResource(path).toURI())).collect(Collectors.toList());
        int result = 0;
        List<Integer> resultList = new ArrayList<>();

        for (int i = 1; i <= inputData.size(); i++) {
            resultList.add(1);
        }
        int counter = 0;

        for (String in : inputData) {

            String[] numberArray = in.replace("|", "").split("\\s+");

            // Convert the array to a list of strings
            List<String> numberList = Arrays.asList(numberArray);
            int cardsFound = calculateSumInCardPart2(numberList);

            counter++;
            int j = counter;
            while (j < inputData.size() && cardsFound > 0) {
                resultList.set(j, resultList.get(j) + resultList.get(counter - 1));
                j++;
                cardsFound--;
            }

        }


        return resultList.stream().mapToInt(Integer::intValue).sum();
    }

    private int calculateSumInCardPart2(List<String> input) {
        Set<String> numberSet = new HashSet<>();
        int result = 0;
        for (String s : input) {
            if (numberSet.contains(s)) {
                result++;
            } else
                numberSet.add(s);
        }
        return result;

    }
}
