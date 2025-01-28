public class Paragraph implements  Tag {

    String text;

    Paragraph(){}

    Paragraph(String paragraphe){
        this.text = paragraphe;
    }

    public String toHTML(){
        return "<p>" + this.text + "</p>";
    }

    @Override
    public String toString() {
        return "Paragraph{" +
                "text='" + text + '\'' +
                '}';
    }
}
