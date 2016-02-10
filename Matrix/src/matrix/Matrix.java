/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;
import java.io.BufferedReader;
import java.io.InputStreamReader;

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
        int m, n;                                        
        
        try{                    
            BufferedReader oBufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
            System.out.println("Nhap 1 ma tran co m hang va n cot:");
            System.out.print("\n+ Nhap so hang m=");
            m = Integer.parseInt(oBufferedReader.readLine());
            System.out.print("\n+ Nhap so cot n=");
            n = Integer.parseInt(oBufferedReader.readLine());
            
            int[][] a = new int[m][n];  
            for(int i=0; i<m; i++)
               for(int j=0; j<n; j++)
               { 
                 System.out.print("\na[" + i + "][" + j + "]=");  
                  a[i][j] = Integer.parseInt(oBufferedReader.readLine());
               }            
                    
             //hien thi 1 Ma tran voi m hang n cot
            for(int i=0; i<m; i++)
            {    
               for(int j=0; j< n; j++)
                   System.out.print(a[i][j] + " ");
               System.out.println();
            } 
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
            
       
    }
}

