package sort;


import java.util.Arrays;

/**
 * 快排：
 * */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {5,2,1,5,4,6,9,3,7,10,8,1};
        System.out.println(Arrays.toString(arr));
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //判断一下数组
    private static void quickSort(int[] a){
        if (a.length==0||a.length==1){
            return;
        }
        quickSort(a,0,a.length-1);
    }

    //快速排序，递归调用
    private static void quickSort(int[] a, int low, int high) {
        if (low<high){
            int mid = paitition(a,low,high);//把数组分成两部分，返回分界下标
            quickSort(a,low,mid-1);//递归排序左边部分
            quickSort(a,mid+1,high);//递归排序右边部分
        }else return;
    }

    private static int paitition(int[] a,int low, int high){
        int i = low;//保存，后面要拿这个位置的元素跟中间元素交换
        int key = a[low];
        while (low<high){
            while (low<high&&a[high]>key) high--;//从右往左找第一个小于key的元素
            while (low<high&&a[low]<=key) low++;//从左往右找第一个大于key的元素
            if (low<high){//元素交换
                int tmp = a[low];
                a[low] = a[high];
                a[high] = tmp;
            }
        }
        a[i] = a[low];
        a[low] = key;
        return low;
    }

}
