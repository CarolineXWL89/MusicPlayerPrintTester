import javax.swing.text.html.HTML;
import java.util.ArrayList;

/**
 * Created by princ on 21/12/2017.
 */
public class LyricsPageHTMLReader {
    //TODO figure out what these random variables are and what isn't needed in LyricsPageHTMLReader
    private int lyRefL;
    private int lyEndRefL;
    private int numberOfSections;
    //private static final String LYRIC_REF = "<pre id=\"lyric-body-text\" class=\"lyric-body\" dir=\"ltr\" data-lang=\"en\">";
    //private static final String LYRIC_END = "</div></div><div class=\"xpdxpnd kno-fb-ctx _Rtn _ECr\" data-mh=\"-1\" data-ved=\"";
    private static final String LYRIC_REF = "<div id=\"lyrics-body-text\" class=\"js-lyric-text\">";
    private static final String LYRIC_END = "<!--BOTTOM MPU-->";
    private static final int SIZE_REF_BR = "<br>".length();
    private static final String BREAK_REF = "<br>";
    private static final String LINE_BREAK_INDICATOR = " / ";
    private static final String VERSE_BREAK = "<p class='verse'>";
    private static final String FALSE_BREAK_REDUCED = "</p><p class='ver";
    private static final String FALSE_BREAK_FULL = "</p><p class='verse'>";
    private static final String SECTION_END_INDICATOR = "<!--WIDGET ";

    public String getHTMLCode() {
//        int startLyrics = HTMLCode.indexOf(VERSE_BREAK);
//        String reducedSearch = HTMLCode.substring(startLyrics);
//        int endLyrics = HTMLCode.indexOf(LYRIC_END);
//        System.out.println(HTMLCode.length());
//        System.out.print("startLyrics: " + startLyrics + "; endLyrics: " + endLyrics + "; lyricsHTML: " + lyricsHTML);
//        lyricsHTML = HTMLCode.substring(startLyrics, endLyrics);
        return HTMLCode;
    }

    private String HTMLCode, lyricsHTML, lyricsPageURL;
    private ArrayList<String> wordsFinal = new ArrayList<>();
    //private ArrayList<String> brokenUpText = new ArrayList<>();

    public LyricsPageHTMLReader(String HTMLCodeLyrics, String title, ArrayList<String> artistWords) {
        String artistCaps = "";
        /*for (int i = 0; i < artistWords.size(); i++) {
            String wordsInTitle = artistWords.get(i);
            String wordsInTitleCaps = wordsInTitle.substring(0, 1).toUpperCase() + wordsInTitle.substring(1);
            artistCaps += wordsInTitleCaps;
            if (i < artistWords.size() - 1) {
                artistCaps += " ";
            }
        }*/
        //LYRIC_REF = "content=\"Lyrics to '"+title+"' by "+artistCaps+". ";
//        LYRIC_REF = "content=\"Lyrics to '"+title+"' by Book Of Love. ";
        //LYRIC_END = "\"/>\n<meta property=\"";
        int startParsePoint = HTMLCodeLyrics.indexOf(LYRIC_REF);
        //Log.d("StartParsePoint", "" + startParsePoint);
        int endParsePoint = HTMLCodeLyrics.indexOf(LYRIC_END);
        //Log.d("EndParsePoint", "" + endParsePoint);
        this.HTMLCode = HTMLCodeLyrics.substring(startParsePoint, endParsePoint);
        /*int firstBeforeLyrics = HTMLCode.indexOf(LYRIC_REF);
        lyRefL = LYRIC_REF.length();
        int firstAfterLyrics = HTMLCode.indexOf(LYRIC_END);
        lyEndRefL = LYRIC_END.length();*/
    }

    /**
     * Gets the number of full sections in HTML version of the lyrics
     *
     * @param fullSong HTML code in full
     * @return number of sections
     */
    public int numberSections(String fullSong) {
        //int firstVerse = fullSong.indexOf(VERSE_BREAK) + VERSE_BREAK.length();
        int l = fullSong.length();
        int iPlaceHolder = 0;
        System.out.println(l);
        String checkPoint = "";
        String realCheckPoint = "";
        for (int i = 0; i; i++) {
            if(i + SECTION_END_INDICATOR.length() < l){
                checkPoint = fullSong.substring(i, i + VERSE_BREAK.length());
                realCheckPoint = fullSong.substring(i, i + SECTION_END_INDICATOR.length());
                System.out.println("Check point: " + checkPoint + "; " + "i = " + i + "; " + "VERSE_BREAK: " + (i + VERSE_BREAK.length()));
                //String falseBreak = fullSong.substring(i, i + FALSE_BREAK.length());
                iPlaceHolder = i;
            }
//            String checkPoint = fullSong.substring(i, i + VERSE_BREAK.length());
//            System.out.println("Check point: " + checkPoint + "; " + "i = " + i + "; " + "VERSE_BREAK: " + (i + VERSE_BREAK.length()));
            //String falseBreak = fullSong.substring(i, i + FALSE_BREAK.length());
            else{
                checkPoint = fullSong.substring(iPlaceHolder, iPlaceHolder + VERSE_BREAK.length());
                realCheckPoint = fullSong.substring(iPlaceHolder, iPlaceHolder + SECTION_END_INDICATOR.length());
            }
            if (!(checkPoint.equals(VERSE_BREAK)) && (realCheckPoint).equals(FALSE_BREAK_REDUCED)) {
                numberOfSections++;
                System.out.println(checkPoint);
                System.out.println(numberOfSections);
            }
        }
        System.out.println(numberOfSections);
        return numberOfSections;
    }

    /**
     * Separates the lyrics based on the specific section of HTML code with full lyrics
     *
     * @param phrase HTML Code section with lyrics only
     * @return ArrayList of Strings with all the lyric words + indicator of line breaks
     */
    public ArrayList<String> separateLyricsWords(String phrase) {
        int startPosition1 = 0;
        //int startPosition2 = 0;
        int numLetters = 0;
        int phraseLength = phrase.length();
        //System.out.println(phraseLength);
        for (int i = 0; i < phraseLength; i++) {
            String currentCharacter = phrase.substring(i, i + 1);
            //String currentSection =
            //System.out.println(currentCharacter + " " + numLetters);
            if (!(currentCharacter.equals(" ")) && !(currentCharacter.equals("<"))/*i = phraseLength*/) {
                if (i != phraseLength - 1) {
                    numLetters++;
                }

                //System.out.print("startPosition1: " + startPosition1 + " ");
                //System.out.println(currentCharacter.equals(" "));
                //System.out.println("startPosition2: " + startPosition2 + " ");

            } else {
                String currentWord = phrase.substring(startPosition1, startPosition1 + numLetters);
                //System.out.print("There was a space: check --> ");
                //System.out.print("startPosition1: " + startPosition1 + " ");
                //System.out.println("numLetters: " + numLetters);
                String lineEndCheck = phrase.substring(startPosition1 + numLetters, startPosition1 + numLetters + 2);
                if (lineEndCheck.equals("<b")) {
                    //String stuffToCheck = phrase.substring(startPosition1 + numLetters);
                    //int endOfCheckPosit = stuffToCheck.indexOf(">");
                    wordsFinal.add(currentWord);
                    wordsFinal.add(BREAK_REF);
                    startPosition1 += numLetters + SIZE_REF_BR;
                } else if (lineEndCheck.equals("</")) {
                    wordsFinal.add(currentWord);
                    wordsFinal.add(FALSE_BREAK_FULL);
                    startPosition1 += numLetters + FALSE_BREAK_FULL.length();
                } else {
                    wordsFinal.add(currentWord);
                }
                //String currentWord = phrase.substring(startPosition1, startPosition1 + numLetters);
                //phrase = phrase.substring(numLetters);
                //System.out.println(phrase);
                //System.out.println("" + startPosition1 + " " + numLetters);
                //System.out.println("Current Word: " + currentWord);

                numLetters = 0;
                //numLetters++;
            }
        }
        String lastWord = phrase.substring(startPosition1, startPosition1 + numLetters + 1);
        //System.out.println(lastWord);
        return wordsFinal;
    }

    /**
     * Creates array of Strings in the section for lyrics
     *
     * @param song         Full HTML of the song lyric section
     * @param stanzaNumber Number of stanzas gotten from numberSections method
     * @return Array of stanza strings full HTML
     */
    public String[] stanzaLocators(String song, int stanzaNumber) {
        String[] stanzas = new String[stanzaNumber];
        int posit = 0;
        String stanzaHTML = "";
        while (stanzaNumber > 0) {
            int startSection = song.indexOf(VERSE_BREAK);
            int endSection = song.indexOf(SECTION_END_INDICATOR);
            stanzaHTML = song.substring(startSection, endSection);
            System.out.println("startSection: " + startSection + "; endSection: " + endSection);
            stanzaNumber--;
            stanzas[posit] = stanzaHTML;
            posit++;
        }
        return stanzas;
    }

    //USELESS METHOD

    /**
     * Designed originally to parse through lines of lyrics at a time but it doesn't work because
     * there's a lot of excess code to account for
     * @param lyricsPageHTML HTML Lyrics section
     * @return ArrayList of Strings with lyric lines
     */
    /*public ArrayList<String> findLyrics(String lyricsPageHTML){
        int firstBeforeLyrics = lyricsPageHTML.indexOf(LYRIC_REF);
        ArrayList<String> lyricLines = new ArrayList<>();
        lyRefL = LYRIC_REF.length();
        int firstAfterLyrics = lyricsPageHTML.indexOf(LYRIC_END);
        lyEndRefL = LYRIC_END.length();
        String lyricSection = lyricsPageHTML.substring(firstBeforeLyrics + lyRefL, firstAfterLyrics);
        int numCharacters = lyricSection.length();

        int firstPosition = 0;
        for(int i = 0; i < numCharacters; i++){
            String letterChecked = lyricSection.substring(i, i+1);
            String line = "";
            if(letterChecked.equals("<")){
                line = lyricSection.substring(firstPosition, i);
                lyricLines.add(line);
                firstPosition = i + SIZE_REF_BR;
            }
        }


        return lyricLines;
    }*/
}


