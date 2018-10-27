package heap.pq;

import java.util.ArrayList;

public class PQImpl {

	ArrayList<Integer> al = new ArrayList<>();

	boolean isMin;

	PQImpl(boolean isMin) {
		this.isMin = isMin;
	}

	public int size() {
		return al.size();
	}

	public int peek() {
		return al.isEmpty() ? -1 : al.get(0);
	}

	public void add(int val) {
		al.add(val);
		upheapify(al.size()-1);
		
	}

	public void upheapify(int ci)
	{
		int pi=(ci-1)/2;
		
		if(isHP(ci,pi)>0)
		{
			swap(ci,pi);
			upheapify(pi);
		}
	}
	
	public int remove()
	{
		if(al.isEmpty())
		{
			System.out.println("Queue Empty");
			return -1;
		}
		int rv=al.get(0);
		swap(0,al.size()-1);
		al.remove(al.size()-1);
		downheapify(0);
		
		return rv;
	}
	
	public void downheapify(int pi)
	{
		int li=2*pi+1;
		int ri=2*pi+2;
		
		int maxi=pi;
		
		if(li<al.size() && isHP(li,maxi)>0)
		{
			maxi=li;
		}
		
		if(ri<al.size() && isHP(ri,maxi)>0)
		{
			maxi=ri;
		}
		if(maxi!=pi)
		{
			swap(maxi,pi);
			downheapify(maxi);
		}
		
	}
	public int isHP(int i, int j) {

		return isMin ? (al.get(i) - al.get(j)) * -1 : al.get(i) - al.get(j);
	}
	
	public void swap(int i,int j)
	{
		int ith=al.get(i);
		int jth=al.get(j);
		al.set(i, jth);
		al.set(j, ith);
	}
	
	public String toString()
	{
		return al+"";
	}
}
