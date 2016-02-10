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
            
            //dem so chan co trong ma tran a[m][n]
            int count=0;            
            for(int i=0; i<m; i++)
                for(int j=0; j<n; j++)
                    if(a[i][j]%2==0)
                        count = count + 1;
            System.out.println("Ma tran a co " + count + " phan tu chan");
            
            //tinh tong cac phan tu chan co trong ma tran A
            int sum=0;
            for(int i=0; i<m; i++)
                for(int j=0; j<n; j++)
                    if(a[i][j]%2==0)
                                    sum = a[i][j] + sum;
            System.out.println("Tong cac phan tu chan co trong Ma tran A la: " + sum);            
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
            
       
    }
}

