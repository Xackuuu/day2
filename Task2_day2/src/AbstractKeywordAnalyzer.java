import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class AbstractKeywordAnalyzer  implements TextAnalyzer{
    abstract List<String> getKeywords();
    abstract Label getLabel();

    @Override
    public Label processText(String text) {
        for (String s : getKeywords()) {
            Pattern pattern = Pattern.compile(s);
            Matcher matcher = pattern.matcher(text);
            if (matcher.find()) {
                return this.getLabel();
            }
        }
        return Label.OK;
    }
}
