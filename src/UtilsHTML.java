import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UtilsHTML {


    /**
     * Permets de transposer le html passé en paramettre dans le fichier Ressources/index.html
     * @param html html
     */
    public static void writeHTMLToIndex(String html){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Ressources/index.html"));
            writer.write(html);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException("ecriture dans le fichier index.html echouée\n" + e);
        }
    }
}
