import java.util.List;

public class TooLongTextAnalyzer extends AbstractKeywordAnalyzer {

    private int sizeText;

    public TooLongTextAnalyzer(int sizeText) {
        this.sizeText = sizeText;
    }

    @Override
    List<String> getKeywords() {
        return null;
    }

    @Override
    Label getLabel() {
        return Label.TOO_LONG;
    }

    @Override
    public Label processText(String text) {
        return text.length() > sizeText ? getLabel() : Label.OK;
    }
}
