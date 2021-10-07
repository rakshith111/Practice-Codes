package l33tc0de.Java;

import java.util.Arrays;

public class invertandflip_832 {
    public static void flipAndInvertImage(int[][] image) {
        for( int [] ar : image){
            System.out.println(Arrays.toString(ar));
        }

    }

    public static void main(String[] args) {
        int [] [] img={{1,1,0},{1,0,1},{0,0,0}};
        flipAndInvertImage(img);


    }
}
