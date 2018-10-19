package trees.generic;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class GenericTree {

	private class Node
	{
		int data;
		ArrayList<Node> children= new ArrayList();
	}
	private int size;
	private Node root;
	
	public GenericTree()
	{
		construct(new Scanner(System.in),null,0);
		Stack s= new Stack();
	
		
	}
	
	private Node construct(Scanner sc,Node parent,int i)
	{
		if(parent==null)
		{
			System.out.println("enter the data for the root" );
		}
		System.out.println("enter the data for the " +i +"th child of the " +parent.data );
		
		int ichilddata=sc.nextInt();
		
		Node child=new Node();
		child.data=ichilddata;
		size++;
		
		System.out.println("enter the number of children for "+child.data);
		int ngcn=sc.nextInt();
		for(int j=0;j<ngcn;j++)
		{
			//faith that every node will return the data of its children
			Node gc=construct(sc,child,j);
			child.children.add(gc);
			
		}
		return child;
	}
}
