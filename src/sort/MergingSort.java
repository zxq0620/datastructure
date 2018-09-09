package sort;


import java.util.Arrays;

/**
 * 归并排序：将一维数组前后相邻的有序序列归并为一个有序序列，分而治之的思想
 * */
public class MergingSort {

    public static void main(String[] args) {
        int[] arr = {5,2,1,5,4,6,9,3,7,10,8,1};
        System.out.println(Arrays.toString(arr));
        mergeSort(arr,new int[arr.length],0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] a,int[] b,int from,int to){
        if(from<to) {
            int mid = (from + to) / 2;
            mergeSort(a, b, from, mid);
            mergeSort(a, b, mid + 1, to);
            merge(a, b, from, mid, to);
        }
    }

    private static void merge(int[] arr,int[] temp,int left,int mid,int right){
        int i = left;//左序列指针
        int j = mid+1;//右序列指针
        int t = 0;//临时数组指针
        while (i<=mid && j<=right){
            if(arr[i]<=arr[j]){
                temp[t++] = arr[i++];
            }else {
                temp[t++] = arr[j++];
            }
        }
        while(i<=mid){//将左边剩余元素填充进temp中
            temp[t++] = arr[i++];
        }
        while(j<=right){//将右序列剩余元素填充进temp中
            temp[t++] = arr[j++];
        }
        t = 0;
        //将temp中的元素全部拷贝到原数组中
        while(left <= right){
            arr[left++] = temp[t++];
        }
    }
}
