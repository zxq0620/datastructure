import java.util.Arrays;


/**
 * Arrays工具类的一些方法
 * */
public class ArraysDemo {

    public static void main(String[] args) {

        //fill方法：给数组元素赋值
        int[] a = new int[10];
        Arrays.fill(a,10);//所有
        Arrays.fill(a,0,4,9);//从0到4，不包括4
        output(a);

        int[] arr = {3,2,1,5,4};
        Arrays.sort(arr);//数组排序
        output(arr);

        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};
        System.out.println(Arrays.equals(arr1,arr2));

        //二分查找法找指定元素的索引值（下标）：binarySearch
        //数组一定是排好序的，否则会出错。找到元素，只会返回最后一个位置
        int[] b = {10,20,30,40,50};
        System.out.println(Arrays.binarySearch(b, 20));

        int[] c = Arrays.copyOf(b,b.length);
        output(c);
    }

    public static void output(int []a) {
        for(int i=0;i<a.length;i++) {
            System.out.printf(a[i]+" ");
        }
        System.out.println();
        System.out.println("--------------------------------------");
    }
}
