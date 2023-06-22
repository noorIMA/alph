package  com.example.alph;

public class Alpha {
    private String character;
    private  String Example;
    public static final Alpha[] alpha = {
            new Alpha("A","Apple"),
            new Alpha("B","Ball"),
            new Alpha("C"," Car"),
            new Alpha("D"," Dream"),
            new Alpha("E","Elephant"),
            new Alpha("F","  Friend"),
            new Alpha("G"," Game"),
            new Alpha("H","House"),
            new Alpha("I"," Institution"),
            new Alpha("J"," Juice"),
            new Alpha("K","Kite"),
            new Alpha("L"," Lemon"),
            new Alpha("M"," Mouse"),
            new Alpha("N","Nose"),
            new Alpha("O"," Orange"),
            new Alpha("P"," Pineapple"),
            new Alpha("Q","Queen"),
            new Alpha("R"," Rainbow"),
            new Alpha("S"," Sun"),
            new Alpha("T","Tree"),
            new Alpha("U"," Unicorn"),
            new Alpha("V"," Van"),
            new Alpha("W","World"),
            new Alpha("X"," oX"),
            new Alpha("Y"," Yesterday"),
            new Alpha("Z","Zebra")
    };

    public Alpha(String character, String example) {
        this.character = character;
        Example = example;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {

        this.character = character;
    }

    public String getExample() {

        return Example;
    }

    public void setExample(String example) {

        Example = example;
    }
}
