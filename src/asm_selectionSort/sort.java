package asm_selectionSort;

import java.util.Stack;

public class sort {
	public static void main(String[] args) {
		int[] a = {27, 2, 62, 11, 24, 96, 23};
		for (int e : a) {
			System.out.print(e + " ");
		}
		System.out.println();
		ssort(a, a.length);
		for (int e : a) {
			System.out.print(e + " ");
		}
	}
	public static void ssort(int[] a, int ecx) {
		Stack<Integer> stack = new Stack<Integer>();
		int edx=ecx;			//EDX=SIZE OF ARRAY
		while (ecx>0) {
			int eaxPtr=edx-ecx;

			int ebxSmallest=edx-ecx;	//THIS IS A POINTER
			eaxPtr=eaxPtr+1;	//increment pointer
			stack.push(ecx);	//save loop counter
			ecx=ecx-1;			//
			while (ecx>0) {
				if (a[eaxPtr]<a[ebxSmallest]) {
					ebxSmallest=eaxPtr;
				}
				eaxPtr=eaxPtr+1;	//increment pointer
			ecx=ecx-1;
			}
		ecx=stack.pop();
		int temp = a[ebxSmallest];
		a[ebxSmallest]=a[edx-ecx];
		a[edx-ecx]=temp;
		ecx=ecx-1;
		}
		
	}
}
