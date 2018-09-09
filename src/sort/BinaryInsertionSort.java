package sort;


import java.util.Arrays;

/**
 * 折半插入排序：折半查找位置插入
 * 性能：减少了比较次数，但元素移动次数不变，时间复杂度仍为O(n2)
 * */
public class BinaryInsertionSort {

    public static void main(String[] args) {
        int[] arr = {3,2,1,5,4,6,9,3,8,7};
        binaryInsertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    private static void binaryInsertionSort(int[] a){
        if (a.length==0||a.length==1){//数组空或元素个数为1，直接返回
            return;
        }
        for (int i = 1 ; i < a.length ; i++){
            int low = 0;
            int hight = i-1;
            int key = a[i];//待排元素
            while (low<=hight){
                int mid = (low+hight)/2;
                if (key>a[mid]) low=mid+1;
                else hight=mid-1;
            }
            for (int j = i-1 ; j>=hight+1;j--){
                a[j+1] = a[j];//记录后移
            }
            a[hight+1]=key;//把待排元素放在找到的位置上
        }
    }
}
