package segmentTree;

public class SegmentTree {

	int sa[];
	int ba[];

	public SegmentTree(int[] ba) {
		this.ba = ba;

		int h = getHeight(ba.length); //height with size of array
		int ne = (1 << (h + 1)) - 1;
		sa = new int[ne];
		build(0, 0, ba.length - 1);
	}

	private int getHeight(int n) {
		int log = 0;

		while ((1 << log) < n) {
			log++;
		}

		return log;
	}

	// on
	private void build(int si, int ss, int se) {
		if (ss == se) {
			sa[si] = ba[ss];
			return;
		}
		int mid = (ss + se) / 2;

		build(2 * si + 1, ss, mid);
		build(2 * si + 2, mid + 1, se);

		//sa[si] = sa[2 * si + 1] + sa[2 * si + 2];
		sa[si]=doOperation(sa[2 * si + 1], sa[2 * si + 2]);
	}

	// log n

	public void update(int idx, int nv) {

		update(0,0,ba.length-1,idx,nv);
	}
	
	private void update(int si,int ss,int se,int idx,int nv)
	{
		if (ss == se) {
			sa[si] = nv;
			ba[ss]=nv;
			return;
		}
		int mid=(ss+se)/2;
		if(idx<=mid)
		{
			update(2*si+1,ss,mid,idx,nv);
		}
		else
		{
			update(2*si+2,mid+1,se,idx,nv);
		}
	//	sa[si] = sa[2 * si + 1] + sa[2 * si + 2];
		sa[si]=doOperation(sa[2 * si + 1], sa[2 * si + 2]);
	}
	
	public int query (int l,int r)
	{
		return query(0,0,ba.length-1,l,r);
	}
	private int query(int si,int ss,int se,int l,int r)
	{
		if(ss>r || se<l)
		{
			return getIdentity();
		}
		else if(ss>=l && se<=r)
		{
			return sa[si];
		}
		else
		{
			int mid=(ss+se)/2;
			int lc=query(2*si+1,ss,mid,l,r);
			int rc=query(2*si+2,mid+1,se,l,r);
			return doOperation(lc,rc);
		}
	}
	
	private int getIdentity()
	{
		return Integer.MAX_VALUE;
	}
	
	private int doOperation(int left,int right)
	{
		return Math.min(left, right);
	}
	
}
