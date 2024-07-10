import java.util.Map;

public class Main {
    public static void main(String[] args) {
        PicnicAnalyzer picnicAnalyzer = new PicnicAnalyzer("input.txt");

        // Задание 1: Осуществить подсчет слов
        int wordCount = picnicAnalyzer.countWords();
        System.out.println("Количество слов в файле: " + wordCount);

        // Задание 2: Найти самое длинное слово
        String longestWord = picnicAnalyzer.findLongestWord();
        System.out.println("Самое длинное слово в файле: " + longestWord);

        // Задание 3: Вычислить частоту слов
        Map<String, Integer> wordFrequency = picnicAnalyzer.calculateWordFrequency();
        System.out.println("Частота встречаемости слов в файле: " + wordFrequency);
    }
}