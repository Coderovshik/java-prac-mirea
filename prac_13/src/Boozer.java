import java.util.*;

/**
 * Boozer
 */
public class Boozer {
    static void playStack() {
        Scanner s = new Scanner(System.in);

        Stack<Integer> mainDeck1 = new Stack<Integer>();
        Stack<Integer> auxDeck1 = new Stack<>();

        Stack<Integer> mainDeck2 = new Stack<>();
        Stack<Integer> auxDeck2 = new Stack<>();

        String deck1 = s.next();
        String deck2 = s.next();

        for (int i = deck1.length() - 1; i >= 0; i--) {
            mainDeck1.push(Integer.parseInt(String.valueOf(deck1.charAt(i))));
            mainDeck2.push(Integer.parseInt(String.valueOf(deck2.charAt(i))));
        }

        for (int i = 0; i < 106; i++) {
            if (mainDeck1.empty() && auxDeck1.empty()) {
                System.out.println("second " + i);
                return;
            } else if (mainDeck2.empty() && auxDeck2.empty()) {
                System.out.println("first " + i);
                return;
            }

            if (mainDeck1.empty()) {
                while (!auxDeck1.empty()) {
                    mainDeck1.push(auxDeck1.pop());
                }
            }

            if (mainDeck2.empty()) {
                while (!auxDeck2.empty()) {
                    mainDeck2.push(auxDeck2.pop());
                }
            }

            int fc = mainDeck1.pop();
            int sc = mainDeck2.pop();

            if (fc > sc && sc != 0 || fc == 0) {
                auxDeck1.push(fc);
                auxDeck1.push(sc);
            } else if (sc > fc && fc != 0 || sc == 0) {
                auxDeck2.push(fc);
                auxDeck2.push(sc);
            }
        }

        System.out.println("botva");
    }

    static void playQueue() {
        Scanner s = new Scanner(System.in);

        LinkedList<Integer> mainDeck1 = new LinkedList<>();
        LinkedList<Integer> mainDeck2 = new LinkedList<>();

        String deck1 = s.next();
        String deck2 = s.next();

        for (int i = 0; i < deck1.length(); i++) {
            mainDeck1.add(Integer.parseInt(String.valueOf(deck1.charAt(i))));
            mainDeck2.add(Integer.parseInt(String.valueOf(deck2.charAt(i))));
        }

        for (int i = 0; i < 106; i++) {
            if (mainDeck1.isEmpty()) {
                System.out.println("second " + i);
                return;
            } else if (mainDeck2.isEmpty()) {
                System.out.println("first " + i);
                return;
            }

            int fc = mainDeck1.remove();
            int sc = mainDeck2.remove();

            if (fc > sc && sc != 0 || fc == 0) {
                mainDeck1.add(fc);
                mainDeck1.add(sc);
            } else if (sc > fc && fc != 0 || sc == 0) {
                mainDeck2.add(fc);
                mainDeck2.add(sc);
            }
        }

        System.out.println("botva");
    }

    public static void main(String[] args) {
        playStack();
    }
}