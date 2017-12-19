import java.util.ArrayList;

/**
 * Created by princ on 19/12/2017.
 */
public class WordSplitterTester {
    private ArrayList<String> words = new ArrayList<>();
    String toBeSplitUp;

    public WordSplitterTester(String toBeSplitUp){
        this.toBeSplitUp = toBeSplitUp;
    }

    int startPosition1 = 0;
    int startPosition2 = 0;
    public ArrayList<String> separateWords(String phrase){
        int numLetters = 0;
        int phraseLength = phrase.length();
        //System.out.println(phraseLength);
        for(int i = 0; i < phraseLength; i++){
            String currentCharacter = phrase.substring(i, i + 1);
            //System.out.println(currentCharacter + " " + numLetters);
            if(!(currentCharacter.equals(" ")) && !(currentCharacter.equals("  "))/*i = phraseLength*/){
                if(i != phraseLength - 1){
                    numLetters++;
                }

                //System.out.print("startPosition1: " + startPosition1 + " ");
                //System.out.println(currentCharacter.equals(" "));
                //System.out.println("startPosition2: " + startPosition2 + " ");

            }
            else{
                /*System.out.print("There was a space: check --> ");
                System.out.print("startPosition1: " + startPosition1 + " ");
                System.out.println("numLetters: " + numLetters);*/
                String currentWord = phrase.substring(startPosition1, startPosition1 + numLetters);
                //phrase = phrase.substring(numLetters);
                //System.out.println(phrase);
                //System.out.println("" + startPosition1 + " " + numLetters);
                //System.out.println("Current Word: " + currentWord);
                startPosition1 += numLetters + 1;
                words.add(currentWord);
                numLetters = 0;
                //numLetters++;
            }
        }
        String lastWord = phrase.substring(startPosition1, startPosition1 + numLetters + 1);
        words.add(lastWord);
        //System.out.println(lastWord);
        return words;
        }
}
