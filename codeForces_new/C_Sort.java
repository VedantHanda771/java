import java.util.Scanner;

public class C_Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);// chalja bhai

        long testCases = scanner.nextLong(); // kida e

        while (testCases-- > 0) { //chal pia e
            long stringLength = scanner.nextLong();//k nhi chalya
            long queries = scanner.nextLong();//jaldi chal
            String stringA = scanner.next();
            String stringB = scanner.next();//chal hun

            // Create prefix frequency arrays for strings 'stringA' and 'stringB'
            long[][] prefixFrequencyA = new long[(int) stringLength + 1][26];//bas chal aj
            long[][] prefixFrequencyB = new long[(int) stringLength + 1][26];//please yaar

            for (long i = 0; i < stringLength; i++) {
                for (int j = 0; j < 26; j++) {
                    prefixFrequencyA[(int) (i + 1)][j] = prefixFrequencyA[(int) i][j];//minus na karvai hun
                    prefixFrequencyB[(int) (i + 1)][j] = prefixFrequencyB[(int) i][j];//k nhi 
                }
                prefixFrequencyA[(int) (i + 1)][stringA.charAt((int) i) - 'a']++;//ki kita hun
                prefixFrequencyB[(int) (i + 1)][stringB.charAt((int) i) - 'a']++;
            }///kid ao sarre

            while (queries-- > 0) {//chalja uaar
                long left = scanner.nextLong() - 1;//chalda ni
                long right = scanner.nextLong() - 1;//hunta chal

                long[] frequencyA = new long[26];//chal ja yaar
                long[] frequencyB = new long[26];//[lease chalja]
                for (int i = 0; i < 26; i++) {
                    frequencyA[i] = prefixFrequencyA[(int) (right + 1)][i] - prefixFrequencyA[(int) left][i];//i i i
                    frequencyB[i] = prefixFrequencyB[(int) (right + 1)][i] - prefixFrequencyB[(int) left][i];//karkde yayr
                }

                long changes = 0;//kartdena va
                for (int i = 0; i < 26; i++) { //kar dina va
                    changes += Math.abs(frequencyA[i] - frequencyB[i]);///kar dina va
                }

                System.out.println(changes / 2);//chalji yaar
            }
        }

        //end 
    }
}
