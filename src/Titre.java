public class Titre {
    private final int lvl;
    private final String texte;

    public Titre(int lvl, String titre) {
        this.lvl = lvl;
        this.texte = titre;
    }

    public String toHTML() {
        return switch (lvl) {
            case 1 -> "\n<h1>" + this.texte + "</h1> \n";
            case 2 -> "\n<h2>" + this.texte + "</h2> \n";
            case 3 -> "\n<h3>" + this.texte + "</h3> \n";
            case 4 -> "\n<h4>" + this.texte + "</h4> \n";
            case 5 -> "\n<h5>" + this.texte + "</h5> \n";
            case 6 -> "\n<h6>" + this.texte + "</h6> \n";
            default -> "\n<h1>" + this.texte + "</h1> \n";
        };
    }
}
