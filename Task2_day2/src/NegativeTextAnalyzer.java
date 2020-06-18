import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NegativeTextAnalyzer extends AbstractKeywordAnalyzer {

    String[] negativeArray = {":(", "=(", ":|"};

    @Override
    List<String> getKeywords() {
        List<String> listNegative = new ArrayList<>(Arrays.asList(negativeArray));
        return listNegative;
    }

    @Override
    Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }

    @Override
    final public Label processText(String text) {
        for (String s : getKeywords()) {
            if (text.contains(s)) {
                return Label.NEGATIVE_TEXT;
            }
        }
        return Label.OK;
    }
}
