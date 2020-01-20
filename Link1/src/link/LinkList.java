package link;

public class LinkList {
	
	public Link firstLink;
	
	LinkList(){
		firstLink = null;
		
	}
	
	public boolean isEmpty(){
		return (firstLink == null);
	}

	public void insertFirstLink(String heroName, int hitPoints){
		Link newLink = new Link(heroName, hitPoints);
		newLink.next = firstLink;
		firstLink = newLink;
	}
	public Link removeFirst(){
		Link linkReference = firstLink;
		if (!isEmpty()){
			firstLink = firstLink.next;
		}else {
			System.out.println("Empty List");
		}
		return firstLink;
	}
	public void display(){
		Link theLink = firstLink;
		
		while(theLink != null){
			theLink.display();
			System.out.println("\n Next Link: "  + theLink.next);
			theLink = theLink.next;
			System.out.println();
		}
	}
	public Link find(String heroName){
		Link theLink = firstLink;
		if (!isEmpty()){
			while (theLink.heroName != heroName){
				if (theLink.next == null){
					return null;
				}else {
					theLink = theLink.next;
				}
			}
		}else {
			System.out.println(" Empty LinkedList");
		}
		return theLink;
	}
	public Link removeLink(String heroName){
		Link currentLink = firstLink;
		Link previousLink = firstLink;
		
		while(currentLink.heroName != heroName){
			if (currentLink.next == null){
				return null;
			}else {
				previousLink = currentLink;
				currentLink = currentLink.next;
			}
		}
		if (currentLink == firstLink){
			firstLink= firstLink.next;
		}else {
			previousLink.next = currentLink.next;
			
		}
		return currentLink;
	}
}
