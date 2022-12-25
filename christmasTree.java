import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone {
    private static Random RND = new Random(System.currentTimeMillis()); // useful for placing balls
    private static char[] BALLS = { 'o', '⌾', '⛣', '⏣', '◍' }; // symbols being used as balls

    public static void main(String[] args) throws java.lang.Exception {
        int w = 27;
        int b = 10;
        String tree = "";

        // build tree
        w = (w % 2 == 1) ? w : 13;
        for (int i = 1; i <= w; i += 2) {
            int s = (w - i) / 2;
            tree += repeat(' ', s) + repeat('*', i) + repeat(' ', s) + "\n";
        }

        int i = 0;
        while (i < b) {
            int j = RND.nextInt(tree.length());
            if (tree.charAt(j) == '*') {
                tree = tree.substring(0, j) + BALLS[RND.nextInt(BALLS.length)] + tree.substring(j + 1);
                i++;
            }
        }

        tree += repeat(' ', (w - 4) / 2) + repeat('*', 4) + "\n" + repeat(' ', (w - 4) / 2) + repeat('*', 4);

        System.out.println(tree);
    }

    private static String repeat(char c, int l) {
        String s = "";
        for (int i = 0; i < l; i++)
            s += c;
        return s;
    }
}