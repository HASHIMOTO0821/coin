import java.util.*;

public class coin{
    public static void main(String[] args){


	System.out.println("Tossing a coin...");
	int head = 0;
	int tail = 0;
	for(int i = 1;i <= 3; i++){
	    int coin = new java.util.Random().nextInt(5);
	    if(coin%2 == 0){
		System.out.println("Round " + i + ": Heads");
		head++;
	    } else if(coin%2 == 1){
		System.out.println("Round " + i + ": Tails");
		tail++;
	    }
	}
	System.out.println("Heads: " + head + ", Tails: " + tail);

	if(head > tail){
	    System.out.println("You won!");
	}
	else{
	    System.out.println("You lost!");
	}
	    	    
    }
}
