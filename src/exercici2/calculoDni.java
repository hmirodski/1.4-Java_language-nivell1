package exercici2;

public class calculoDni {

    private static final char[] letters = {
            'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F',
            'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S',
            'Q', 'V', 'H', 'L', 'C', 'K', 'E'
    };

    public static char calcularLetra(int dninumber){
        int index = dninumber % 23;
        return letters[index];
    }


}
