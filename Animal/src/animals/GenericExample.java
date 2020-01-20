package animals;

public class GenericExample <E extends String> {
	
	public E add(E first, E second){
		E res;
		res = (E) first.concat(second);
		return res;
	}
}
