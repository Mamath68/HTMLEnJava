public class DessinHTMLer {
    private static final String debutHTML = """
            <html lang="fr">
            <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0"/>
            <link rel="stylesheet" href="style.css"/>
            <title>Ma Page Web Généré en Java</title>
            </head>
            <body>
            <main>""";

    private static final String finHTML = """ 
            </main>
            </body>
            </html>
            """;

    public static void transformerDessinEnPageWeb() {
        Titre titre = new Titre(0, "Un Super Titre généré");
        Paragraphe paragraphe = new Paragraphe("Un Super Paragraphe généré");
        Image image = new Image("chien.png", "Un Chien mignon", "Un Chien mignon");
        String html = debutHTML + titre.toHTML() + paragraphe.toHTML() + image.toHTML() + finHTML;
        UtilsHTML.writeHTMLToIndex(html);
    }

}
