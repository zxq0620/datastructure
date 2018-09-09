package search;

import java.util.Scanner;


/**
 * 二分查找：先确定待查记录所在范围，然后逐步缩小范围直到找到或找不到
 * 性能：O(logn)
 * 只适用于有序表，且仅限于顺序存储结构
 * */
public class BinarySearch {

    public static void main(String[] args) {
        int a[] = new int[]{5,13,19,21,37,56,64,75,80,90};
        Scanner scanner = new Scanner(System.in);
        System.out.println(binarySearch(a,scanner.nextInt()));
    }

    private static int binarySearch(int[] a , int key){
        int low = 0 ;
        int hight = a.length-1;
        while (low<hight){
            int mid = (low+hight)/2;
            if (a[mid]==key) return mid;//找到，返回
            if (key>a[mid]) low = mid+1;//key比中间的大，在右半部分查找
            if (key<a[mid]) hight=mid-1;//key比中间的小，在左半部分查找
        }
        return -1;//找不到
    }

}
