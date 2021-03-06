package edu.java.common;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Gomoku {
	private String[][] board;
	private static int Board_size = 16;
	
	public void init(){
		board = new String[Board_size][Board_size];
		for(int i = 0; i<Board_size; i++){
			for(int j =0;j<Board_size; j++){
				board[i][j] = "+ ";
			}
		}
	}
	
	public void printBoard(){
		for(int i = 0; i<Board_size; i++){
			for(int j =0;j<Board_size; j++){
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}
	
	public void Play()throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputStr = null;
		System.out.println("Please enter the position, in x, y format: ");
		while((inputStr = br.readLine())!="end"){
			String[] posStrArr = inputStr.split(",");
			int xPos = Integer.parseInt(posStrArr[0]);
			int yPos = Integer.parseInt(posStrArr[1]);

			if(this.board[xPos-1][yPos-1] == "# "||this.board[xPos-1][yPos-1] == "@ "){
				System.out.println("Already taken, re-enter:");
				continue;
			}else{
			this.board[xPos-1][yPos-1] = "# ";
			this.ComputerPlay();
			this.printBoard();
			System.out.println("Please enter the position, in x, y format: ");
			}
		}
	}
	
	public void ComputerPlay(){
		Random r1 = new Random();
		int nextx = Math.abs(r1.nextInt())%(Board_size);
		Random r2 = new Random();
		int nexty = Math.abs(r2.nextInt())%(Board_size);
		while (this.board[nextx][nexty]=="# " || this.board[nextx][nexty]=="@ "){
			nextx = Math.abs(r1.nextInt())%(Board_size);
			nexty = Math.abs(r2.nextInt())%(Board_size);
		}
		this.board[nextx][nexty] = "@ ";
	}
	
	public void checkWin(){
		
		String[] target1 = new String[5];
		Arrays.fill(target1, "@ ");
		String[] target2 = new String[5];
		Arrays.fill(target2, "# ");
		String[] compare = new String[5];
		
		//check if there's five same in a row
		for (int i=0;i<this.Board_size;i++){
			for (int j=0;j<this.Board_size-5;j++){
				compare = Arrays.copyOfRange(this.board[i], j, j+5);
				
				if(Arrays.equals(compare,target1)){
					System.out.println("Computer Wins!");
					return;
				}
				else if(Arrays.equals(compare,target2)){
					System.out.println("Player Wins!");
					return;
				}
			}
		}
		
		//check if there's five same in a column
		for (int i=0;i<this.Board_size;i++){
			for (int j=0;j<this.Board_size-5;j++){
				for (int k=0;k<5;k++){
					compare[k] = this.board[j][i];
				}
				
				if(Arrays.equals(compare,target1)){
					System.out.println("Computer Wins!");
					return;
				}
				else if(Arrays.equals(compare,target2)){
					System.out.println("Player Wins!");
					return;
				}
			}
		}
		//check if there's a slash line with five same things
		
	}
	
	public static void main(String[] args)throws Exception{
		Gomoku gk = new Gomoku();
		gk.init();
		gk.printBoard();
		gk.Play();
		gk.printBoard();
		gk.checkWin();

	}
}
