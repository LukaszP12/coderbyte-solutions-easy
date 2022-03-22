package Coderbyte.Medium;

import java.util.Arrays;

public class EightQueens3 {

    public static String EightQueens3(String[] strArr) {
        int[][] givenPoint = new int[9][9];
        for(int i=0;i<=8;i++)
            Arrays.fill(givenPoint[i],0);

        for(int i =0; i<=7; i++){
            int fir = Integer.parseInt(String.valueOf(strArr[i].charAt(1)));
            int sec = Integer.parseInt(String.valueOf(strArr[i].charAt(3)));
            givenPoint[fir][sec]=1;
        }


        for(int i =0; i<=7; i++){
            int fir = Integer.parseInt(String.valueOf(strArr[i].charAt(1)));
            int sec = Integer.parseInt(String.valueOf(strArr[i].charAt(3)));
            for(int j =1;j<=8;j++){
                if((j != sec && givenPoint[fir][j] == 1) || (j != fir && givenPoint[j][sec] == 1)) return strArr[i];
            }
            for(int a = fir+1,b1=sec-1,b2=sec+1; a<=8; a++,b1--,b2++){
                if(b1 >= 1 && givenPoint[a][b1] ==1) return strArr[i];
                if(b2 <= 8 && givenPoint[a][b2] ==1) return strArr[i];

            }
            for(int a = fir-1,b1=sec-1,b2=sec+1; a >=1; a--,b1--,b2++){
                if(b1 >= 1 && givenPoint[a][b1] ==1) return strArr[i];
                if(b2 <= 8 && givenPoint[a][b2] ==1) return strArr[i];

            }
        }

        return "true";
    }

    public static void main(String[] args) {
        String[] strings = {"(2,1)", "(4,2)", "(6,3)", "(8,4)", "(3,5)", "(1,6)", "(7,7)", "(5,8)"};
        System.out.println(EightQueens3(strings));
    }
}
