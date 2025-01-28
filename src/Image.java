public class Image {
    private final String img;
    private final String alt;
    private final String title;

    public Image(String image, String alt, String title) {
        this.img = image;
        this.alt = alt;
        this.title = title;
    }

    public String toHTML() {
        return "<img src=\"" + this.img + "\" alt=\"" + this.alt + "\" title=\"" + this.title + "\" /> \n";
    }
}
