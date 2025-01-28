public class Title implements Tag {

    String text;
    int lvl;


    Title(int lvl, String titre){
        this.text = titre;
        this.lvl = lvl;
    }


    @Override
    public String toHTML(){
        return "<h"+lvl+">" + this.text + "</h"+lvl+">";
    }

}
