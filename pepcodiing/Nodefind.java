import java.util.HashMap;

public class Nodefind {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 3, 3, 4 };
        Nodefind n = new Nodefind(arr);
        System.out.println(n.getMode());
    }

    private int[] arr;
    private int mode;

    public Nodefind(int[] arr) {
        this.arr = arr;
        preprocess();
    }

    private void preprocess() {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int maxFreq = 0;
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
            if (freqMap.get(num) > maxFreq) {
                maxFreq = freqMap.get(num);
                mode = num;
            }
        }
    }

    public int getMode() {
        return mode;
    }
}