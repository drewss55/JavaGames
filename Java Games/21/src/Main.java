

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int left = 21;
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int player = 1;
		System.out.println("Type 21 to play!");
		int play = sc.nextInt();
		
		if(play == 21){
		System.out.println("Try to get the other player to pick the last stick!");
		System.out.println("How many players are playing?");
		int players = sc.nextInt();
		
		if(players == 1){
		while(left > 0){
		System.out.println("The current number is: " + left);
		System.out.println("Would you like to take 1 or 2?");
		int take = sc.nextInt();
		
		if(take == 1){
			left--;
		}
		if(take > 1){
			left -= 2;
		}
		if(left <= 0){
			System.out.println("YOU LOSE!");
		}
		if(left > 0){
		int comp = r.nextInt((2-1)+1)+1;
		left -= comp;
		System.out.println("The computer took: " + comp);
		
		if(left <= 0){
			System.out.println("YOU WIN!");
		}
		}
		
		}
		}else if(players == 2){
			while(left > 0){
				System.out.println("It's player: " + player + "'s turn!");
				System.out.println("The current number is: " + left);
				System.out.println("Would you like to take 1 or 2?");
				int take = sc.nextInt();
				
				if(player == 2){
					player=0;
				}
				if (player == 1){
					player+=2;
				}
				if(player == 3){
					player--;
				}
				if(player==0){
					player++;
				}
				
				if(take == 1){
					left--;
				}
				if(take > 1){
					left -= 2;
				}
				if(left <= 0){
					if(player == 1){
						System.out.println("Player 1 WINS!");
					}
					if(player == 2){
						System.out.println("Player 2 WINS!");
					}
				}
				
				
				}
		}
		}
	}

}


