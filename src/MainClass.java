import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by princ on 21/12/2017.
 */
public class MainClass {
    public static void main(String[] args) throws IOException {
        UserInput input = new UserInput();
        System.out.print("Insert lyrics link here: ");
        String userGot = input.getLine();

        String lyricsHTML, fullLyrics = "";
        String title = "";
        String lyricsURL = userGot;
        URLReader urlReader = new URLReader(lyricsURL);
        
        lyricsHTML = urlReader.readerReturn();
        //System.out.print(lyricsHTML);

        ArrayList<String> titleWords = new ArrayList<>();
        ArrayList<String> artistWords = new ArrayList<>();
        LyricsPageHTMLReader lyricsPageHTMLReader = new LyricsPageHTMLReader(lyricsHTML, title, artistWords);
        String reducedHTMLCode = lyricsPageHTMLReader.getHTMLCode();
        int numberOfSections = lyricsPageHTMLReader.numberSections(reducedHTMLCode);
        String[] stanzaSections = lyricsPageHTMLReader.stanzaLocators(lyricsHTML, numberOfSections);
        ArrayList<ArrayList<String>> arrayOfLyricArraysFromStanzas = new ArrayList<>();
        int numSections = numberOfSections;
        while(numSections > 0) {
            ArrayList<String> lyrics = lyricsPageHTMLReader.separateLyricsWords(stanzaSections[numberOfSections - numberOfSections]);
            arrayOfLyricArraysFromStanzas.add(lyrics);
        }
        for(ArrayList<String> lyricSets : arrayOfLyricArraysFromStanzas){
                    for(String lyric : lyricSets){
                        if(lyric.equals("<br>") || lyric.equals("</p><p class='verse'>")){
                            fullLyrics += "\n";
                        }
                        else{
                            fullLyrics += lyric;
                        }
                    }
                }
                System.out.print(fullLyrics);
    }
}