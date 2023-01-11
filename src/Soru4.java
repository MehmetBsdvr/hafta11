
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
public class Soru4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.println("Satır ve Sütun sayısını giriniz");
        int N=input.nextInt();
        
        int[][] A=new int[N][N];
        
        
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
               System.out.print("["+i+"]["+j+"] İndexilerini giriniz:");
               A[i][j]=input.nextInt();
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(A[i][j]==A[j][i]){
                    System.out.println("A Matrixi simetrik dir");
                }
                else{
                    System.out.println("A Matrixi simetrik degildir");
                }
            }
        }
    }
    
}
