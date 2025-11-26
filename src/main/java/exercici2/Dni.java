package exercici2;

public class Dni {

    private int number;
    private char letter;

    public Dni(int number) {
        this.number = number;
        this.letter = CalculoDni.calculateLetter(number);
    }

    public Dni(int number, char letter) {
        this.number = number;
        this.letter = letter;
    }

    public int getNumber() {
        return number;
    }

    public char getLetter() {
        return letter;

    }

    public boolean validDni(){
        return this.letter == CalculoDni.calculateLetter(this.number);
    }

    @Override
    public String toString() {
        return number + "" + letter;
    }
}
