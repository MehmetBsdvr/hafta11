
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mehmet
 */
public class Soru1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // NxN tipindeki Matrix sondan bir önceki satır ve sütunların toplamı
        /*
        4x4 
        0 0 1 0
        0 0 2 0
        1 2 3 0
        toplam= (1+2+3)+(1+2+3)-3
        */
        Scanner input=new Scanner(System.in);
        
        System.out.println("Satır ve Sütun sayısını giriniz");
        int N=input.nextInt();
        
        int[][] A=new int[N][N];
        int top=0;
        
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
               System.out.print("["+i+"]["+j+"] İndexilerini giriniz:");
               A[i][j]=input.nextInt();
            }
        }
        for(int i=0;i<N;i++){
                top=top+A[N-1][i]+A[i][N-1];
            }
        System.out.println("Satır ve Sütun elemanlarının:"+(top-A[N-1][N-1]));
    }
    
}
