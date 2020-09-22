
public class inhabitant 
{
	private String name;
	private int hitPoints;
	private String weapon;
	private int damage;
	
	public inhabitant (String name, int hitPoints, String weapon, int damage)
	{
		this.name = name;
		this.hitPoints = hitPoints;
		this.weapon = weapon;
		this.damage = damage;
	}
	
	public void display()
	{
		System.out.println(name + " has " + hitPoints + " hp and uses a " + weapon + " that does " + damage + " damage.");
	}
}
