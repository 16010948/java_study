package project;

class Unit{
	int hp;
	final int MAX_HP;	
	
	public Unit(int hp,int max) {
		this.hp=hp;
		MAX_HP=max;
	}
}

class GroupUnit extends Unit{
	
	public GroupUnit(int hp,int max) {
		super(hp,max);
	}
}

class AirUnit extends Unit{
	
	public AirUnit(int hp,int max) {
		super(hp,max);
	}
}

class Marine extends GroupUnit{
	
	public Marine() {
		super(60,60);
	}
}

class Scv extends GroupUnit implements Repairable{
	
	public Scv() {
		super(40,40);
	}
	
	public void repair(Repairable r){
		
		Unit unit=(Unit)r;
		while(unit.hp<unit.MAX_HP) {
			unit.hp++;
		}
		System.out.println(unit.toString()+"의 치료가 완료되었습니다.");
	}
}

class Tank extends GroupUnit implements Repairable{
	
	public Tank() {
		super(125,150);
	}
	
	public String toString() {
		return "Tank";
	}
}

class Dropship extends AirUnit implements Repairable{
	
	public Dropship() {
		super(110,125);
	}
	
	public String toString() {
		return "Dropship";
	}
}

interface Repairable{}
public class Hw7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tank tank=new Tank();
		Dropship dropship=new Dropship();
		Marine marine=new Marine();
		Scv scv=new Scv();
		
		scv.repair(tank);
		scv.repair(dropship);

	}

}
