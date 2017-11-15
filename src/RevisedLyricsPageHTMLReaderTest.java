import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by princ on 15/11/2017.
 */
public class RevisedLyricsPageHTMLReaderTest {

    private String lyricsWebsiteURL, boilerPipeURL, realLyrics;
    URL realBoilerPipeURL;
    public RevisedLyricsPageHTMLReaderTest(String lyricsWebsiteURL){
        this.lyricsWebsiteURL = lyricsWebsiteURL;
        boilerPipeURL = "http://boilerpipe-web.appspot.com/extract?url=" + lyricsWebsiteURL + "&output=text";
        try {
            realBoilerPipeURL = new URL(boilerPipeURL);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } //why is there a MalformedURLException now???
    }

    public String getLyrics(String urlToBoilerpipe){
        boilerPipeURL = "http://boilerpipe-web.appspot.com/extract?url=" + lyricsWebsiteURL + "&output=text";
        try {
            realBoilerPipeURL = new URL(boilerPipeURL);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } //why is there a MalformedURLException now???
        realLyrics = ArticleExtractor.INSTANCE.getText(realBoilerPipeURL);
        return "";
    }
}
