/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

/**
 *
 * @author TrungNT
 */
public class Matrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] a = new int[2][3];
        a[0][0] = 3;
        a[0][1] = 5;
        a[0][2] = 9;
        a[1][0] = 6;
        a[1][1] = 2;
        a[1][2] = 8;
        
        for(int i=0; i<2; i++)
        {    
           for(int j=0; j< 3; j++)
               System.out.print(a[i][j] + " ");
           System.out.println();
        }       
    }
    
}
