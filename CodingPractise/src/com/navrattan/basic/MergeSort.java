package com.navrattan.basic;

public class MergeSort {
	void merge(int[] arr, int l, int m, int r)
	{
		int j=0,k=0,z=l;
		int a=m-l+1;
		int b=r-m;
		int n1[]=new int[a];
		int n2[]=new int[b];
		for(int i=0;i<a;i++)
			n1[i]=arr[l+i];
		for(int i=0;i<b;i++)
			n2[i]=arr[m+1+i];
		while(j<a && k<b)
		{
			if(n1[j]<=n2[k])
			{
				arr[z]=n1[j];
				j++;
			}
			else
			{
				arr[z]=n2[k];
				k++;
			}
			z++;
		}
		while(j<a)
		{
			arr[z]=n1[j];
			j++;
			z++;
		}
		while(k<b)
		{
			arr[z]=n2[k];
			k++;
			z++;
		}
			
		
	}
	void sort(int[] arr, int l, int r)
	{
		int m=0;
		if(l<r)
		{
		m=(l+r)/2;
		sort(arr,l,m);
		sort(arr,m+1,r);
		merge(arr,l,m,r);
		}
	}
	
	static void printArray(int[] arr)
	{
          
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"  ");
		System.out.println();
		
	}

	public static void main(String[] args) {
		int arr[]= {7,8,9,3,1,4,2};
		printArray(arr);
		MergeSort ob=new MergeSort();
		ob.sort(arr,0,arr.length-1);
		printArray(arr);
		// TODO Auto-generated method stub

	}

}
