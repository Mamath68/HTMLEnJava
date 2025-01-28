public class Paragraphe {
    private final String texte;

    public Paragraphe(String paragraphe) {
        this.texte = paragraphe;
    }

    public String toHTML() {
        return "<p>" + this.texte + "</p> \n";
    }
}
