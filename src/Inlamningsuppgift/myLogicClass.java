package Inlamningsuppgift;

public class myLogicClass {


    private int rows;

    private int characters;


    public myLogicClass() {
        rows = 0;
        characters = 0;
    }

    public int getRows() {
        return rows;
    }

    public void setNumberOfRows(String Text) {
        characters = characters + Text.length();
        rows++;
    }

    public int getNumberOfCharacters() {
        return characters;
    }
}





















