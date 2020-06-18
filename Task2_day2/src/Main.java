public class Main {
    public static Label test(TextAnalyzer[] obj, String s) {
        Label label = Label.OK;
        for (TextAnalyzer ob : obj) {
            if (ob.processText(s) != label) {
                return ob.processText(s);
            }
        }
        return label;
    }

    public static void main(String[] args) {
        String[] spam = {"страшный", "урод", "гном", "свою", "всё"};
        TextAnalyzer tooLongTextAnalyzer = new TooLongTextAnalyzer(100);
        TextAnalyzer negativeAnalyzer = new NegativeTextAnalyzer();
        TextAnalyzer spamAnalyzer = new SpamAnalyzer(spam);

        TextAnalyzer[] obj = {tooLongTextAnalyzer, negativeAnalyzer, spamAnalyzer};
        String s = "Предвижу всё: вас оскорбит\n" +
                "Печальной тайны объясненье.\n" +
                "Какое горькое презренье\n" +
                "Ваш гордый взгляд изобразит!\n" +
                "Чего хочу? с какою целью\n" +
                "Открою душу вам свою?\n" +
                "Какому злобному...";
        System.out.println(test(obj, s));
    }
}
