package segmentTree;

public class LazySegmentTree {

	int sa[];
	int ba[];
	int lazy[];

	public LazySegmentTree(int[] ba) {
		this.ba = ba;

		int h = getHeight(ba.length); // height with size of array
		int ne = (1 << (h + 1)) - 1; //number of elements
		sa = new int[ne];
		lazy= new int[ne];
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

		
		sa[si] = doOperation(sa[2 * si + 1], sa[2 * si + 2]);
	}


	private void handlePendingWork(int si, int bl, int br) {

		int length = br - bl + 1;
		sa[si] += (lazy[si] * length);

		if (bl != br) {
			lazy[2 * si + 1] += lazy[si];
			lazy[2 * si + 2] += lazy[si];
		}
		else
		{
			ba[bl]+=lazy[si];
		}
		lazy[si] = 0;
	}

	public void rupdate(int ul, int ur, int delta) {

		rupdate(0, 0, ba.length - 1, ul, ur, delta);
	}

	private void rupdate(int si, int bl, int br, int ul, int ur, int delta)

	{
		handlePendingWork(si,bl,br);
		if (bl > ur || br < ul) {
			return;
		} else if (bl >= ul && br <= ur) {
			int length = br - bl + 1;
			sa[si] += delta * length;

			if (bl != br) {
				lazy[2 * si + 1] += delta;
				lazy[2 * si + 2] += delta;
			}
			else
			{
				ba[bl]+=delta;
			}
		} else {
			int mid = (bl + br) / 2;
			rupdate(2 * si + 1, bl, mid, ul, ur,delta);
			rupdate(2 * si + 2, mid + 1, br, ul, ur,delta);
			sa[si]= doOperation(sa[2 * si + 1], sa[2 * si + 2]);
             return ;
		}
	}

	public int query(int l, int r) {
		return query(0, 0, ba.length - 1, l, r);
	}

	private int query(int si, int bl, int br, int l, int r) {
		handlePendingWork(si,bl,br);
		if (bl > r || br < l) {
			return getIdentity();
		} else if (bl >= l && br <= r) {
			return sa[si];
		} else {
			int mid = (bl + br) / 2;
			int lc = query(2 * si + 1, bl, mid, l, r);
			int rc = query(2 * si + 2, mid + 1, br, l, r);
			return doOperation(lc, rc);
		}
	}

	private int getIdentity() {
		return 0;
	}

	private int doOperation(int left, int right) {
		return left+right;
	}

}
