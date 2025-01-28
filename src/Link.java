public class Link implements Tag {

    String text = "Google";
    String href = "https://www.google.com";

    Link() {
    }

    Link(String textDuLien, String href) {
        this.text = textDuLien;
        this.href = href;
    }

    public static void main(String[] args) {
        Link a = new Link();
        System.out.println(a.toHTML());
    }

    public String toHTML() {
        return "<a href=\"" + this.href + "\">" + this.text + "</a> \n";
    }

}
