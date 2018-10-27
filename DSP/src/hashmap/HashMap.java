package hashmap;

import java.util.ArrayList;

public class HashMap<K, V> {

	private class HMNode {
		K key;
		V val;

		HMNode(K key, V val) {
			this.key = key;
			this.val = val;
		}
	}

	LinkedList<HMNode>[] buckets;// it is the N
	int size;// it is the n

	public HashMap() {
		buckets = new LinkedList[4];

		for (int i = 0; i < buckets.length; i++) {
			buckets[i] = new LinkedList<HMNode>();
		}
		size = 0;
	}
	
	public void put(K key, V val) {
		int bidx = hashFn(key);
		int di = findWithinBucket(bidx, key);

		if (di == -1) {
			HMNode hmnode = new HMNode(key, val);
			buckets[bidx].addlast(hmnode);
			size++;
		} else {
			HMNode node2update = buckets[bidx].getAt(di);
			node2update.val = val;
		}
		
		double lambda=(size*1.0)/buckets.length;
		
		if(lambda>2.0)
		{
			rehashing();
		}
	}

	public boolean containsKey(K key) {
		int bidx = hashFn(key);
		int di = findWithinBucket(bidx, key);

		if (di == -1) {
			return false;
		} else {
			return true;
		}
	}

	public V get(K key) {
		int bidx = hashFn(key);
		int di = findWithinBucket(bidx, key);

		if (di == -1) {
			return null;
		} else {
			HMNode node = buckets[bidx].getAt(di);
			return node.val;

		}
	}

	public V remove(K key) {
		int bidx = hashFn(key);
		int di = findWithinBucket(bidx, key);

		if (di == -1) {
			return null;
		} else {
			HMNode node = buckets[bidx].removeAt(di);
			size--;
			return node.val;

		}
	}

	public ArrayList<K> keyset() {

		ArrayList<K> keys= new ArrayList<K>();
		
		for(int bi=0;bi<buckets.length;bi++)
		{
			for(int di=0;di<buckets[bi].size;di++)
			{
				HMNode node= buckets[bi].getAt(di);
				keys.add(node.key);
			}
		}
		return keys;
	}

	public void display() {
	
		
		for(int bi=0;bi<buckets.length;bi++)
		{
			
			System.out.print("B"+bi+"->");
			for(int di=0;di<buckets[bi].size;di++)
			{
				HMNode node= buckets[bi].getAt(di);
				System.out.print(node.key+"@"+node.val+" ");
			}
			System.out.println("--------------------");
		}
	
	}

	public boolean isEmpty() {

		return size==0;
	}

	public int size() {

		return size;
	}

	private int hashFn(K key) {

		int hashCode= key.hashCode();
		
		int bi=Math.abs(hashCode) %buckets.length;
		
		return bi;
	}

	private int findWithinBucket(int bidx, K key) {

		for(int di=0;di<buckets[bidx].size;di++)
		{
			HMNode node= buckets[bidx].getAt(di);
			if(node.key.equals(key))
			{
				return di;
			}
		}
		 return -1;
	}

	private void rehashing() {

		LinkedList<HMNode>[] oba= buckets;
		
		buckets=  new LinkedList[2 * buckets.length];
		for (int i = 0; i < buckets.length; i++) {
			buckets[i] = new LinkedList<HMNode>();
		}
		size=0;
		for(int bi=0;bi<oba.length;bi++)
		{
			for(int di=0;di<oba[bi].size;di++)
			{
				HMNode node= oba[bi].getAt(di);
				put(node.key,node.val);
			}
		}
		
	}
}
