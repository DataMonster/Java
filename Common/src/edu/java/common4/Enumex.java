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
		
		//a way to get enumclass instance
		Gender g = Enum.valueOf(Gender.class, "FEMALE");
		g.name = "girl";
		System.out.println(g);
		
		Gender g2 = Gender.FEMALE;
		g2.name = "Alio";
		System.out.println(g2+g2.name);
		
		
		
	}
}

enum Gender{
	MALE, FEMALE;
	public String name;
	
}
