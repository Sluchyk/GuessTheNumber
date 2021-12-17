public class View {
    public static final String EQUAL = "=";
    public static final String SPACE_SING = " ";
    public static final String OPENS_BRACKET = "[";
    public static final String CLOSING_BRACKET = "]";

    public static final String INPUT_INT_DATA = "Input INT value ";
    public static final String WRONG_INPUT_DATA = "Wrong input! Repeat please! ";
    public static final String CONGRATULATION = "CONGRATULATION! You WIN! Secret value = ";
    public static final String YOUR_WAY = "YOUR WAY = ";

    public void printMessage (String message){
        System.out.println(message);
    }

    public String concatenationString (String... message){
        StringBuilder concatString = new StringBuilder();
        for (String v : message){
            concatString = concatString.append(v);
        }
        return new String(concatString);
    }
}
