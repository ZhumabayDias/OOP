package task5;

import java.util.Arrays;

public class Sort {
	static <E> void swap(E [] array,int i,int j) {
		E e = array[i];
		array[i] = array[j];
		array[j] = e;
	}
	
	static <E extends Comparable<E>> void bubbleSort(E[] array) {
		int size = array.length;
		
		for(int i=0;i<size-1;i++) {
			for(int j=0;j<size-i-1;j++) {
				if(array[j].compareTo(array[j+1])==1) {
					swap(array,j,j+1);
				}
			}
		}
	}
	
	static <E extends Comparable<E>>void merge( E [] arr,int left,int m,int right) {
		int size1 = m-left+1;
		int size2 = right-m;
		
		E[] arr1 = Arrays.copyOfRange(arr,left,m+1);
		E[] arr2 = Arrays.copyOfRange(arr, m+1, right+1);
		
		int i=0,j=0,k=left;
		while(i<size1 || j<size2) {
			if(i<size1 && j<size2) {
				if(arr1[i].compareTo(arr2[j])==-1) {
					arr[k] = arr1[i];
					i++;
				}
				else {
					arr[k] = arr2[j];
					j++;
					
				}
				k++;
			}
			else if(i<size1) {
				arr[k]=arr1[i];
				i++;
				k++;
			}
			else if(j<size2) {
				arr[k]=arr2[j];
				j++;
				k++;
			}
		}
	}
	
	
	static <E extends Comparable<E>> void mergeSort(E[] array,int left,int right) {
		if(left<right) {
		int m = (left+right)/2;
		mergeSort(array,left,m);
		mergeSort(array,m+1,right);
		
		merge(array,left,m,right);
		}
	}
}
