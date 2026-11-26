import java.util.*;
class SelectionSort
{
    static void sort(int arr[],int n)
    {
        int minIndex,temp;
        for(int i=0;i<n-1;i++)
        {
            minIndex=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[minIndex]>arr[j])
                minIndex=j;
            }
            temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
        System.out.println();
        for(int nums:arr)
        System.out.print(nums+" ");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array size");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        sort(arr,n);        
    }  
}