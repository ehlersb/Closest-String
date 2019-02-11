import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Benjamin Ehlers on 2/10/2019.
 */
public class Main {

    public static void main(String[] args) {
        String input;
        System.out.println("Input an integer indicating the number of strings, then input the strings, each on a new line: ");
        System.out.println("Enter '!' to quit.");
        while(true) {
            Scanner scan = new Scanner(System.in);
            input = scan.nextLine();
            if(input.equals("!")) break;
            int numLines = Integer.parseInt(input);
            ArrayList<String> strings = new ArrayList<>();
            for(int i = 0; i < numLines; i++) {
                String line = scan.nextLine();
                strings.add(line);
            }
            String output = closestString(strings);
            System.out.println("Closest string: " + output);
        }
    }

    private static String closestString(ArrayList<String> strings) {
        int[] scores = new int[strings.size()];
        for(int i = 0; i < strings.size(); i++) {
            int score = 0;
            for(int j = 0; j < strings.size(); j++) {
                score+= compareScore(strings.get(i), strings.get(j));
            }
            scores[i] = score;
        }
        int best = 0;
        for(int i = 0; i < scores.length; i++) {
            best = Math.max(best,scores[i]);
        }
        for(int i = 0; i < scores.length; i++) {
            if (scores[i] == best) {
                return strings.get(i);
            }
        }
        return "Something went wrong.";
    }

    private static int compareScore(String original, String other) {
        int score = 0;
        for(int i = 0; i < original.length(); i++) {
            if(original.charAt(i) == other.charAt(i))
                score++;
        }
        return score;
    }
}

