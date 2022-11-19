/*********************************
* Tommy Luong  tluong@cnm.edu
*
* First Program
*
* RockPS.java
*
*********************************/

import java.util.Random;
import java.util.Scanner;
import javax.swing.*;

public class RockPS{
	
	public static void main(String[] args){
		
		String userHand;
		String compHand;
		
		int playerScore;
		int compScore;
		int compIndex;
		int gameCount = 0;
		int gameWon = 0;
		int gameLost = 0;
		//int winScore = 3;
		int yesNo = 0; // 0 = yes, 1 = no
		Random randGen = new Random(123);
		Scanner user = new Scanner(System.in);
		String[] options = {"Rock", "Paper", "Scissors"};
		
		while(yesNo == 0){
			
			playerScore = 0;
			compScore = 0;
			gameCount++;
			
			while(playerScore < 3 && compScore < 3){
				
				compIndex = randGen.nextInt(3);
				String compHand = options[compIndex];
				
				String userHand = (String)JOptionPane.showInputDialog(null, "Select Rock, Paper or Scissors",
				"Choices", JOptionPane.PLAIN_MESSAGE, null, options, "RPS");
				
				if(compHand == "Rock"){
					
					if(userHand == "Paper"){
						JOptionPane.showMessageDialog(null, "The player wins this round!", "Rock, Paper, Scissors", JOptionPane.INFORMATION_MESSAGE);
						playerScore++;
					}
					else if (userHand == "Scissors"){
						JOptionPane.showMessageDialog(null, "The computer wins this round!", "Rock, Paper, Scissors", JOptionPane.INFORMATION_MESSAGE);
						compScore++;
					}
					else if(compHand == userHand){
						JOptionPane.showMessageDialog(null, "Both the computer and user tie!", "Rock, Paper, Scissors", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				
				else if(compHand == "Paper"){
					
					if(userHand == "Scissors"){
						JOptionPane.showMessageDialog(null, "The player wins this round!", "Rock, Paper, Scissors", JOptionPane.INFORMATION_MESSAGE);
						playerScore++;
					}
					else if (userHand == "Rock"){
						JOptionPane.showMessageDialog(null, "The computer wins this round!", "Rock, Paper, Scissors", JOptionPane.INFORMATION_MESSAGE);
						compScore++;
					}
					else if(compHand == userHand){
						JOptionPane.showMessageDialog(null, "Both the computer and user tie!", "Rock, Paper, Scissors", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				
				else if(compHand == "Scissors"){
					
					if(userHand == "Rock"){
						JOptionPane.showMessageDialog(null, "The player wins this round!", "Rock, Paper, Scissors", JOptionPane.INFORMATION_MESSAGE);
						playerScore++;
					}
					else if (userHand == "Paper"){
						JOptionPane.showMessageDialog(null, "The computer wins this round!", "Rock, Paper, Scissors", JOptionPane.INFORMATION_MESSAGE);
						compScore++;
					}
					else if(compHand == userHand){
						JOptionPane.showMessageDialog(null, "Both the computer and user tie!", "Rock, Paper, Scissors", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				
				JOptionPane.showMessageDialog(null, "User's Choice: " + userHand +
				"\nComputer's Choice: " + compHand, "Hand Choices", JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null, "Player Score: " + playerScore +
				"\nComputer Score: " + compScore, "Score Results", JOptionPane.INFORMATION_MESSAGE);
				//System.out.println("Player Score: " + playerScore);
				//System.out.println("Computer Score: " + compScore);
			
			}
			
			if(playerScore == 3){
				JOptionPane.showMessageDialog(null, "The Player has won this game!\nCongradulations!!!", "Game Winner!!!", JOptionPane.INFORMATION_MESSAGE);
				gameWon++;
			}
			else if(compScore == 3){
				JOptionPane.showMessageDialog(null, "The Computer has won this game!\nTry again next time!!!", "Game Winner!!!", JOptionPane.INFORMATION_MESSAGE);
				gameLost++;
			}
			
			yesNo = JOptionPane.showConfirmDialog(null,
			"Would you like to continue?", "Continuation?", JOptionPane.YES_NO_OPTION);
		}
		
		JOptionPane.showMessageDialog(null, "Number of games played: " + gameCount +
		"\nGames won: " + gameWon + "\nGames lost: " + gameLost, "Score Results", JOptionPane.INFORMATION_MESSAGE);
		
		JOptionPane.showMessageDialog(null, "Thank you for playing!!!\nSee you next time!",
		"Game Over", JOptionPane.INFORMATION_MESSAGE);gameLost++;
	}

}