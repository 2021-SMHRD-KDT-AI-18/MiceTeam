package model;

public class MidupgradeDTO {

	
	private String grade;
	private int exp;
	private int atk;
	private int dex;
	private int maxHp;
	

	public MidupgradeDTO(String grade, int exp, int atk, int dex, int maxHp) {
		super();
		this.grade = grade;
		this.exp = exp;
		this.atk = atk;
		this.dex = dex;
		this.maxHp = maxHp;
	}
	public String getGrade() {
		return grade;
	}
	
	
	public int getExp() {
		return exp;
	}
	
	
	public int getAtk() {
		return atk;
	}
	
	
	public int getDex() {
		return dex;
	}
	
	
	public int getMaxHp() {
		return maxHp;
	}


	
		 
		 
		 
		 
	 
	
}
