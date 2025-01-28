import java.util.ArrayList;
import java.util.List;

public class PageWeb {
    private final String doctype = """
            <!doctype html>
            <html lang="fr">
            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
                <title>Java To HTML</title>
            </head>
            """;

    private final String header = "<body>";
    private final String footer = """
            </body>
            </html>
            """;
    private final List<Tag> tags = new ArrayList<>();

    public PageWeb() {
    }

    public static void main(String[] args) {
        PageWeb page = new PageWeb();

        Paragraph p = new Paragraph("Le premier paragraphe");
        page.addTag(p);
        page.addTag(new Paragraph("Le second paragraphe"));
        page.addTag(new Paragraph("Le troisième paragraphe"));
        page.addTag(new Title(1, "Hello world"));
        page.addTag(new Title(2, "Hello world 2"));
        page.addTag(new Title(3, "Hello world 3"));
        page.addTag(new Title(4, "Hello world 4"));
        page.addTag(new Title(5, "Hello world 5"));
        page.addTag(new Title(6, "Hello world 6"));
        page.addTag(new Img());
        page.addTag(new Link());
        UtilsHTML.writeHTMLToIndex(page.toHTML());
        System.out.println("Page générée dans index.html");
    }

    public void addTag(Tag t) {
        this.tags.add(t);
    }

    public String toHTML() {
        StringBuilder res = new StringBuilder();
        for (Tag t : tags) {
            res.append("\n\t").append(t.toHTML());
        }
        return doctype + header + res + footer;
    }
}
