
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
public class Soru3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.println("Satır ve Sütun sayısını giriniz");
        int N=input.nextInt();
        
        int[][] A=new int[N][N];
        int[][] B=new int[N][N];
        int top=0;
        
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
               System.out.print("["+i+"]["+j+"] İndexilerini giriniz:");
               A[i][j]=input.nextInt();
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(i>j){
                    B[i][j]=0;
                }
                else{
                    B[i][j]=A[i][j];
                }
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
            System.out.print(B[i][j]+" ");
                }
            System.out.println();
            }
    }
    
}
