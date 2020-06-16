package exercises;
import java.util.Scanner;

public class SearchAlice {
    public static void main(String[] args){
        String firstAliceLine = "    Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        firstAliceLine = firstAliceLine.toLowerCase();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word to search:");
        String searchWord = input.nextLine().toLowerCase();
        String aliceMinusSearchWord = firstAliceLine.replace(searchWord, "");

        if (firstAliceLine.contains(searchWord)){
            System.out.println("The string does contain " + searchWord + ".");
            System.out.println("Index of " + searchWord +" is " + firstAliceLine.indexOf(searchWord) + "and it's length is " + searchWord.length());
        } else {
            System.out.println("The string does not contain " + searchWord + ".");
        }
        System.out.println(aliceMinusSearchWord);
    }
}
