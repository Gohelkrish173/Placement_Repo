import java.util.Scanner;

public class Highest_Profit_In_Week{

  public static void main(String[] args){
    
    // week price in the array
    int[] n = {8,3,15,1,27,81,5};

    int buy_index = 0;
    int sell_index = 0;
    int maxDiff = 0;

    int diff = 0;

    for(int i = 0;i<n.length;i++){
      for(int j = i+1;j<n.length;j++){
        
        diff = n[j] - n[i];

        if(diff > 0){
          if(diff > maxDiff){
            maxDiff = diff;
            buy_index = i;
            sell_index = j;
          }
        }

      }
    }

    System.out.println("Buy Index : "+buy_index);
    System.out.println("Sold Index : "+sell_index);
    System.out.println("Profit : "+maxDiff);

  }
}