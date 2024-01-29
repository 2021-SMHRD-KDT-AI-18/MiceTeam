package View;

public abstract class enemy {

	private int enemyAtk;
	private int enemyHp;
	private String name;
	
	public abstract void fight();

	public int getEnemyAtk() {
		return enemyAtk;
	}

	public void setEnemyAtk(int enemyAtk) {
		this.enemyAtk = enemyAtk;
	}

	public int getEnemyHp() {
		return enemyHp;
	}

	public void setEnemyHp(int enemyHp) {
		this.enemyHp = enemyHp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public enemy(String name,int enemyAtk, int enemyHp) {
		super();
		this.enemyAtk = enemyAtk;
		this.enemyHp = enemyHp;
		this.name = name;
	}
		    
		
		
				
		
	
	
	
	
	
	
	
	
}
