package insertionSort;

public class InsertionSort {
	public static void main(String[] args) {
		
	}
	
	public int[] insertionSort(int[] array)
	{
		int key;
		int i;
		int j;
		
		for (j=1; j<array.length; j++)
		{
			key=array[j];
			for (i=j-1; i>=0 && array[i] < key; i--)
			{
				array[i+1] = array[i];
			}
			array[i+1] = key;
		}
		return array;		
	}

}
