import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] count = new int[6];
        int[] chess = {1,1,2,2,2,8};
        for(int i=0; i<6; i++){
            count[i] = scan.nextInt(); 
        }
        for(int i=0; i<chess.length; i++){
            chess[i] = chess[i]-count[i];
            System.out.println(chess[i]);
        }
        
    }    
  
}