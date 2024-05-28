import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws Exception {
        HashMap<String, Integer> words_map = new HashMap<String,Integer>();
        try {
            // diavasma arxeioy
            File file = new File("./cw0.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                // System.out.println(line);
                // making an array from the above string
                String regex = "[,\\.\\s]";
                String[] words = line.split(regex);
                //Xrhsh hasmap gia na prosthesw ta antikeimena 
                for (int i = 0; i < words.length; i++) {
                    words_map.put(words[i],   0);                
                }
                for (int i = 0; i < words.length; i++) {
                    if (words_map.containsKey(words[i])) {
                        words_map.put(words[i], words_map.get(words[i]) + 1);
                        

                    }
                }

                for (String i : words_map.keySet()) {
                    System.out.println(i + ": " + words_map.get(i));
                }
                Map<String, Integer> words_map2= new TreeMap<>(words_map);
                System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
                for (String i : words_map2.keySet()) {
                    System.out.println(i + ": " + words_map2.get(i));
                }
            }
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
