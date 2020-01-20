package link;

public class Link {
	
	public String heroName;
	public int hitPoints;
	
	public Link next;
	
	public Link(String heroName, int hitPoints){
	this.heroName = heroName;
	this.hitPoints = hitPoints;
	
	}

	public void display(){
		System.out.print(heroName + " " + hitPoints);
	}
	public String getHeroName() {
		return heroName;
	}

	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}

	public int getHitPoints() {
		return hitPoints;
	}

	public void setHitPoints(int hitPoints) {
		this.hitPoints = hitPoints;
	}

	public String toString(){
		return heroName;
	}
	public static void main(String[] args) {
		
		LinkList theLinkedList = new LinkList();
		theLinkedList.insertFirstLink("Connan", 500);
		theLinkedList.insertFirstLink("Erumis", 800);
		theLinkedList.insertFirstLink("Conrad", 432);
		
		theLinkedList.display();
		
	}

}
