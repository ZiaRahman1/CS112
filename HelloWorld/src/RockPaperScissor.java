import java.util.Scanner;


public class RockPaperScissor {
 
	private static int result(int player_1,int player_2)
	{
		int player=0;
		if ((player_1 == 1 && player_2 == 2) || (player_1 == 2 && player_2 == 3) || (player_1 == 3 && player_2 == 1)){
			player = 1;
		}else if(player_1 == player_2){ 
			player = 0;
		}else{ 
			player = 2;
		}
		return player;	
	}
	
	
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		int player_1,player_2;
		int winner;
		boolean stop = true;
		/*
		 * 1-Rock beats Scissor
		 * 2-Scissor beats paper
		 * 3-Paper beats Rock
		 */
		System.out.println("1 stands for Rock.");
		System.out.println("2 stands for Scissor.");
		System.out.println("3 stands for Paper.");
		System.out.println("Y for exit");
		
		while(stop){
			
			System.out.println("Player 1, please enter your choice");
			player_1 = read.nextInt();
			
			System.out.println("Player 2, please enter your choice");
			player_2 = read.nextInt();
			
			System.out.printf("Player 1 enter %d and Player d enter %d\n",player_1,player_2);
			 winner = result(player_1,player_2);
			 if (winner==0){
				 System.out.println("Tie"); 
			 }
			 if (winner==1){
				 System.out.println("Player 1 won"); 
			 }
			 if (winner==2){
				 System.out.println("Player 2 won"); 
			 }
			 if (winner==3){
				 System.out.println("Player 3 won"); 
			 }
			
			stop = read.nextBoolean();
		}
		
	}
}
