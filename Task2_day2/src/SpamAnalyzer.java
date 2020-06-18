import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpamAnalyzer extends AbstractKeywordAnalyzer{

    String[] spamStrings;

    public SpamAnalyzer(String[] spamStrings) {
        this.spamStrings = spamStrings;
    }

    @Override
    List<String> getKeywords() {
        List<String> listSpam = new ArrayList<>(Arrays.asList(spamStrings));
        return listSpam;
    }

    @Override
    public Label getLabel() {
        return Label.SPAM;
    }

    @Override
    final public Label processText(String text) {
        return super.processText(text);
    }
}
