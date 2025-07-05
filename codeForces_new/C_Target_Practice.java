import java.util.*;

public class C_Target_Practice {

    public static int[][] score = {
        {1,1,1,1,1,1,1,1,1,1},
        {1,2,2,2,2,2,2,2,2,1},
        {1,2,3,3,3,3,3,3,2,1},
        {1,2,3,4,4,4,4,3,2,1},
        {1,2,3,4,5,5,4,3,2,1},
        {1,2,3,4,5,5,4,3,2,1},
        {1,2,3,4,4,4,4,3,2,1},
        {1,2,3,3,3,3,3,3,2,1},
        {1,2,2,2,2,2,2,2,2,1},
        {1,1,1,1,1,1,1,1,1,1},
    };

    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String[][] arrows = new String[10][10];
            for(int i = 0;i<10;i++){
                String s = sc.nextLine();
                for(int j = 0;j<10;j++){
                    arrows[i][j] = String.valueOf(s.charAt(j));
                }
            }

            int actualScore = 0;
            for(int i = 0;i<10;i++){
                for(int j = 0;j<10;j++){
                    if(arrows[i][j].equals("X")){
                        actualScore += score[i][j];
                    }
                }
            }

            System.out.println(actualScore);
        }
    }
}