package sort;


import java.util.Arrays;

/**
 * 直接插入排序：将一个记录插入到已排好序的有序表中，得到一个新的，记录+1的有序表
 *性能：时间复杂度O(n2)
 * */
public class StraightInsertionSort {

    public static void main(String[] args) {
        int[] arr = {3,2,1,5,4,6,9,3,8,7};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] a){
        if (a.length==0||a.length==1){//数组空或元素个数为1，直接返回
            return;
        }
        for (int i = 1 ; i < a.length ; i++){
            int j = i-1;
            int key = a[i];//待排元素
            while (j>=0&&key<a[j]){//待排元素从后往前扫描，key小则把元素后移，key大则找到了位置，退出循环
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;//把待排元素放在找到的位置上
        }
    }
}
