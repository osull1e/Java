package bintree;

public class BSTNode<E> {
	public E element;
	BSTNode<E> leftTree = null;
	BSTNode<E> rightTree = null;
	
	public BSTNode(E e){
		this.element = e;
	}
}
