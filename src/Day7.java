import java.util.*;

public class Day7 {
    public long getCardSum(boolean part2){
        HashMap<String , String> data =
                Util.readKeyValueFromFile("/Users/sagaryadav/Repositories/BootcampProjectGCP/AdventOfCode/src/inputs/Day7");
        List<String> five = new ArrayList<>();
        List<String> four = new ArrayList<>();
        List<String> three = new ArrayList<>();
        List<String> two = new ArrayList<>();
        List<String> one = new ArrayList<>();
        List<String> highCard = new ArrayList<>();
        List<String> fullHouse = new ArrayList<>();

        for(String input : data.keySet()) {
            String hand;
            if(part2){
                hand = replaceCharacter(input, 'J');
            }
            else
                hand = input;
            char[] cards = hand.toCharArray();

            // Count occurrences of each card
            int[] cardCounts = new int[128];
            for (char card : cards) {
                cardCounts[card]++;
            }

            // Check for each hand type
            if (containsNOfAKind(cardCounts, 5, 0)) {
                five.add(input);
            } else if (containsNOfAKind(cardCounts, 4, 0)) {
                    four.add(input);
            } else if (containsNOfAKind(cardCounts, 3, 0) && containsNOfAKind(cardCounts, 2, 1)) {
                    fullHouse.add(input);
            } else if (containsNOfAKind(cardCounts, 3, 0)) {
                    three.add(input);
            } else if (containsNOfAKind(cardCounts, 2, 2)) {
                    two.add(input);
            } else if (containsNOfAKind(cardCounts, 2, 1)) {
                    one.add(input);
            } else {
                    highCard.add(input);
            }


        }

        Comparator<String> cardHandComparator = (hand1, hand2) -> {
            String order = "AKQT98765432J";

            for (int i = 0; i < Math.min(hand1.length(), hand2.length()); i++) {
                char card1 = hand1.charAt(i);
                char card2 = hand2.charAt(i);

                int compareResult = order.indexOf(card1) - order.indexOf(card2);

                if (compareResult != 0) {
                    return compareResult;
                }
            }

            return Integer.compare(hand1.length(), hand2.length());
        };

        // Sorting the card hands using the custom comparator
        Collections.sort(five, cardHandComparator);
        Collections.sort(four, cardHandComparator);
        Collections.sort(three, cardHandComparator);
        Collections.sort(two, cardHandComparator);
        Collections.sort(one, cardHandComparator);
        Collections.sort(highCard, cardHandComparator);
        Collections.sort(fullHouse, cardHandComparator);

        int i = data.size();
        int result = 0;
        for (int j = 0; j < five.size() ; j++){
            int value = Integer.parseInt(data.get(five.get(j)));
            result += i * value;
            i--;
        }
        for (int j = 0; j < four.size() ; j++){
            int value = Integer.parseInt(data.get(four.get(j)));
            result += i * value;
            i--;
        }
        for (int j = 0; j < fullHouse.size() ; j++){
            int value = Integer.parseInt(data.get(fullHouse.get(j)));
            result += i * value;
            i--;
        }
        for (int j = 0; j < three.size() ; j++){
            int value = Integer.parseInt(data.get(three.get(j)));
            result += i * value;
            i--;
        }
        for (int j = 0; j < two.size() ; j++){
            int value = Integer.parseInt(data.get(two.get(j)));
            result += i * value;
            i--;
        }
        for (int j = 0; j < one.size() ; j++){
            int value = Integer.parseInt(data.get(one.get(j)));
            result += i * value;
            i--;
        }
        for (int j = 0; j < highCard.size() ; j++){
            int value = Integer.parseInt(data.get(highCard.get(j)));
            result += i * value;
            i--;
        }


        return result;
    }

    private static void sumOfEach(List<String> typeList, HashMap<String, String> data, int i, int result) {
        for (int j = 0; j < typeList.size() ; j++){
            int value = Integer.parseInt(data.get(typeList.get(j)));
            result += i * value;
            i--;
        }
    }


    private static boolean containsNOfAKind(int[] cardCounts, int n, int times) {
        if(n == 2){
            int n1 = 0;
            for (int count : cardCounts) {
                if (count == n) {
                    n1++;
                }
            }
            if(n1 == times)
                return true;
        }

        else {
            for (int count : cardCounts) {
                if (count == n) {
                    return true;
                }
            }
        }
        return false;
    }


    public static String replaceCharacter(String input, char targetChar) {
        char[] charArray = input.toCharArray();

        // Count occurrences of each character in the string
        Map<Character, Integer> charCounts = new HashMap<>();
        for (char ch : charArray) {
            charCounts.put(ch, charCounts.getOrDefault(ch, 0) + 1);
        }

        // Find the next most occurring character
        char nextChar = findNextMostOccurring(charCounts, targetChar);

        // Replace targetChar with nextChar
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == targetChar) {
                charArray[i] = nextChar;
            }
        }

        return new String(charArray);
    }

    private static char findNextMostOccurring(Map<Character, Integer> charCounts, char targetChar) {
        char nextChar = targetChar;
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            char ch = entry.getKey();
            int count = entry.getValue();

            if (ch != targetChar && count > maxCount) {
                nextChar = ch;
                maxCount = count;
            }
        }

        return nextChar;
    }


}
