package tokenring;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
public class Tokenring {
    public static void main(String[] args) {
        
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        Queue<Integer> q3 = new LinkedList<>();
        Queue<Integer> q4 = new LinkedList<>();
     
        Random gen= new Random();
        
        int Y=0;
        for(int x=0;x<50;x++){
            Y=gen.nextInt(13+1);
           
            for(int i=0;i<Y;i++){q1.add(gen.nextInt(Y));}
             System.out.println("----------------------------------");
            System.out.println("\nNo.1 has "+q1.size()+" Packets : ");
            for(int y=0 ; y<10;y++){
                if(Y==0){
                   System.out.println("++++++ The QUEUE is Totally empty Pass the token ++++++");
                   break;
                }
                if( q1.isEmpty() == true)
                    System.out.println("The QUEUE is empty Waiting for timeout");
                else
                    System.out.println("TU : "+(y+1)+" TL : "+(10-y-1)+" |Pushed "+q1.remove());
            }System.out.println("No.1 has "+q1.size()+" Packets LEFT : "); 
              System.out.println("----------------------------------");
Y=gen.nextInt(13+1);
            
            for(int i=0;i<Y;i++){q2.add(gen.nextInt(Y));}
              System.out.println("----------------------------------");
            System.out.println("\nNo.2 has "+q2.size()+" Packets : ");
            for(int y=0 ; y<10;y++){
                if(Y==0){
                   System.out.println("++++++ The QUEUE is Totally empty Pass the token ++++++");
                   break;
                }
                if( q2.isEmpty() == true)
                    System.out.println("The QUEUE is empty Waiting for timeout");
                else
                    System.out.println("TU : "+(y+1)+" TL : "+(10-y-1)+" |Pushed "+q2.remove());
            }System.out.println("No.2 has "+q2.size()+" Packets LEFT : ");  
              System.out.println("----------------------------------");
         Y=gen.nextInt(13+1);
           
            for(int i=0;i<Y;i++){q3.add(gen.nextInt(Y));}
              System.out.println("----------------------------------");
            System.out.println("\nNo.3 has "+q3.size()+" Packets : ");
            for(int y=0 ; y<10;y++){
                if(Y==0){
                   System.out.println("++++++ The QUEUE is Totally empty Pass the token ++++++");
                   break;
                }
                if( q3.isEmpty() == true)
                    System.out.println("The QUEUE is empty Waiting for timeout");
                else
                    System.out.println("TU : "+(y+1)+" TL : "+(10-y-1)+" |Pushed "+q3.remove());
            }System.out.println("No.3 has "+q3.size()+" Packets LEFT : ");
              System.out.println("----------------------------------");
            
          Y=gen.nextInt(13+1);
            
            for(int i=0;i<Y;i++){q4.add(gen.nextInt(Y));}
              System.out.println("----------------------------------");
            System.out.println("\nNo.4 has "+q4.size()+" Packets : ");
            for(int y=0 ; y<10;y++){
                if(Y==0){
                   System.out.println("++++++ The QUEUE is Totally empty Pass the token ++++++");
                   break;
                }
                if( q4.isEmpty() == true)
                    System.out.println("The QUEUE is empty Waiting for timeout");
                else
                    System.out.println("TU : "+(y+1)+" TL : "+(10-y-1)+" |Pushed "+q4.remove());
            } System.out.println("No.4 has "+q4.size()+" Packets LEFT : ");    
              System.out.println("----------------------------------");
        }
    }
    
}
