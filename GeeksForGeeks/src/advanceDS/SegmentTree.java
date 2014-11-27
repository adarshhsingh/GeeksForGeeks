package advanceDS;

import java.util.Arrays;

import javax.swing.SpringLayout.Constraints;

public class SegmentTree {

	int[] tree;
	int maxsize;
	int height;

	final int STARTINDEX = 0;
	final int ENDINDEX;
	final int ROOT = 0;

	public SegmentTree(int size) {

		height = (int) (Math.ceil(Math.log(size) / Math.log(2)));
		maxsize = 2 * (int) Math.pow(2, height);
		tree = new int[maxsize];
		Arrays.fill(tree, 1);
		ENDINDEX = size - 1;
	}
	
	private int leftchild(int pos) {
		return 2 * pos + 1;
	}

	private int rightchild(int pos) {
		return 2 * pos + 2;
	}

	private int mid(int start, int end) {
		
		return (start + end)/2;
	}

	private int getSumUtil(int startIndex, int endIndex, int quertStart,
			int queryEnd, int current) {
		
		if(quertStart <= startIndex && queryEnd >= endIndex) {
			return tree[current];
		}
		
		if( endIndex < quertStart || startIndex > queryEnd) {
			return 1;
		}
		
		int mid = mid(startIndex, endIndex);
		return getSumUtil(startIndex, mid, quertStart, queryEnd, leftchild(current))
				 * getSumUtil(mid +1, endIndex, quertStart, queryEnd, rightchild(current));
	}
	
	private int getSum(int quertStart, int queryEnd) {
		
		if( quertStart < 0 || quertStart > tree.length) {
			return -1;
		}
		
		return getSumUtil(STARTINDEX, ENDINDEX, quertStart, queryEnd, ROOT);
		
	}

	private int constructSegmentTreeUtil(int[] arr, int startIndex,
			int endIndex, int current) {
		
		if(startIndex == endIndex) {
			tree[current] = arr[startIndex];
			return tree[current];
		}
		
		int mid = mid(startIndex, endIndex);
		tree[current] = constructSegmentTreeUtil(arr, startIndex, mid, leftchild(current))
						    * constructSegmentTreeUtil(arr, mid +1, endIndex, rightchild(current));
		return tree[current];		
		
	}

	public void constructSegmentTree(int[] arr) {

		constructSegmentTreeUtil(arr, STARTINDEX, ENDINDEX, ROOT);
	}


	private void updateUtil(int startIndex, int endIndex, int updateDiff,
			int updatePos, int current) {

		if( updatePos < startIndex || updatePos > endIndex) {
			return;
		}
		
		tree[current] += updateDiff;
		
		if(startIndex != endIndex) {
			int mid = mid(startIndex,endIndex);
			updateUtil(startIndex,mid, updateDiff, updatePos, leftchild(current));
			updateUtil(mid+1,endIndex, updateDiff, updatePos, rightchild(current));
		}
	}


	private void update(int update, int updatePos, int[] arr) {
		
		int updateDiff = update - arr[updatePos];
		arr[updatePos] = update;
		updateUtil(STARTINDEX,ENDINDEX,updateDiff,updatePos,ROOT);
	}

	
	public static void main(String[] args) {

		int[] arr = { 1, 4, 27, 256, 3125};
		SegmentTree segmentTree = new SegmentTree(5);
		segmentTree.constructSegmentTree(arr);
		int num = segmentTree.getSum(1,3);
		
		System.out.println(num);
		
	//	segmentTree.update(21,5,arr);
		
	//	num = segmentTree.getSum(1, 5);
	//	System.out.println(num);
		
	}
}
