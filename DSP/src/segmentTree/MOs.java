package segmentTree;
import java.util.Arrays;
import java.util.Scanner;

public class MOs {
	private static class Query implements Comparable<Query> {
		int left;
		int right;
		int num;
		int bn;
		
		@Override
		public int compareTo(Query o) {
			if(this.bn != o.bn){
				return this.bn - o.bn;
			} else {
				return this.right - o.right;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int[] arr = {2, -4, 5, 8, -1, 3, 7, 10, 1, 
					 5, -4, 11, 10, 2, -3, 1};
		int bs = (int)Math.sqrt(arr.length);
		
		Query[] queries = new Query[10];
		for(int i = 0; i < queries.length; i++){
			queries[i] = new Query();
			
			queries[i].left = scn.nextInt();
			queries[i].right = scn.nextInt();
			queries[i].num = i;
			queries[i].bn = queries[i].left / bs;
		}
		
		Arrays.sort(queries);
	
		int cl = 0;
		int cr = -1;
		int cs = 0;
		int[] res = new int[queries.length];
		
		for(Query query: queries){
			while(cl > query.left){
				cl--;
				cs += arr[cl];
			}
			
			while(cl < query.left){
				cs -= arr[cl];
				cl++;
			}
			
			while(cr < query.right){
				cr++;
				cs += arr[cr];
			}
			
			while(cr > query.right){
				cs -= arr[cr];
				cr--;
			}
			
			res[query.num] = cs;
		}
		
		for(int i = 0; i < res.length; i++){
			System.out.println(res[i]);
		}
	}
}
/*

int[] arr = {2, -4, 5, 8, -1, 3, 7, 10, 1, 
			 5, -4, 11, 10, 2, -3, 1};
7 12
2 14
3 9
6 9
7 7
11 15
0 15
4 5
8 14
2 7


*/
	
	
	