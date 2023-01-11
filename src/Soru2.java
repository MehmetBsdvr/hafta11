
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
public class Soru2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Üst kösegenlerin toplamı
        /*
        1 2 3 4
        4 5 6 7
        8 9 1 5   toplam 1+2+3+4+5+8
        1 2 3 5
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
            for(int j=0;j<N;j++){
                if((i+j)<(N+1)){
                    top=top+A[i][j];
                }
            }
        }
        System.out.println("Kösegenlerin toplamı üst:"+top);
    }
    
}
