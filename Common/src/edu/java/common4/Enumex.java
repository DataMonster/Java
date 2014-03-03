package edu.java.common4;

public class Enumex {
	public void judge(SeasonEnum s){
		switch(s){
		case SPRING:
			System.out.println("sp");
			break;
		case SUMMER:
			System.out.println("su");
			break;
		case FALL:
			System.out.println("fa");
			break;
		case WINTER:
			System.out.println("wi");
			break;
		}
	}
	public static void main(String... args){
		for(SeasonEnum s : SeasonEnum.values()){
			System.out.println(s);
		}
		new Enumex().judge(SeasonEnum.FALL);
	}
}
