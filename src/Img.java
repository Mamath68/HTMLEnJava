public class Img implements Tag {

    String alt = "logo de google";
    String title = "logo de google";
    String src = "https://www.google.com/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png";

    Img() {
    }

    Img(String src, String alt, String title) {
        this.src = src;
        this.alt = alt;
        this.title = title;
    }

    public static void main(String[] args) {
        Img i = new Img();
        System.out.println(i.toHTML());
    }

    public String toHTML() {
        return "<img src=\"" + this.src + "\" alt=\"" + this.alt + "\" title=\"" + this.title + "\" />";
    }
}
