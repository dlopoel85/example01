public class HomeorkIfMethod {

    public static void main(String[] args) {

        char letter = '+';

        int a = 10;
        int b = 5;
        int c = 0;


        resultOfnumber(letter, a, b, c);
        System.out.println("-----------------------------");
    }
        public static void resultOfnumber(char letter, int a, int b, int c) {


        if (letter == '+') {
            c = a + b;

        }
        if (letter == '-') {
             c = a - b;

        }
        if (letter == '*') {
            c = a * b;

        }
        if (letter == '/') {
            c = a / b;

        }
            System.out.println("Műveleti jel: " + letter + " eredmény: " + c);
        }


}
