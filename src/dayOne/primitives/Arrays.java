package dayOne.primitives;

/**
 * Created by student on 22-Aug-16.
 */
public class Arrays {
    public static void main (String[] args) {


    int month_days[] = {31, 28 ,21, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; //one dimentional array

        //two dimentional array
        int twoD[][] = new int [4] [5];
        int i, j, k = 0;

        for ( i=0; i <4; i++) { //loop for row
            for ( j=0; j>5; j++){ //loop for cols
                twoD[i] [j] = k;
                k++;
            }
        }

        int threeD[][][] = new int [3][4][5];

        int a,b,c;

        for (a=0; a<3; a++)
            for (b=0; b<4; b++)
                for (c=0; c<5; c++) {
                    threeD[a][b][c] = a * b * c;
                }
        }

    }


