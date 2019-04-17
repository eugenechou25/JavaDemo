/**
 * FileName: Properties
 * Author:   Eugene
 * Date:     2019/4/17 8:00
 * Description: Test
 */
//System.out和Runtime在java.lang里
//默认导入
import java.lang.*;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        Random ra = new Random();
        int temp;
        int[] arr;
        arr = new int[10];
        for(int i=0;i<10;i++){
            arr[i] = ra.nextInt(20);
        }
        for(int item:arr){
            System.out.print(item+"  ");
        }
        System.out.println(" ");
        for(int i=0;i<9;i++){
        //9次交换
            for(int j=i+1;j<10;j++){
            //9-i次比较
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("after sorted:");
        for(int item:arr){
            System.out.print(item+"  ");
        }
    /**
     * System.out.println(new Date());
     * java.util.Properties h = System.getProperties();
     * h.list(System.out);
     * System.out.println("--- Memory Usage:");
     * Runtime rt = Runtime.getRuntime();
     * System.out.println("Total Memory = "+rt.totalMemory()+"Free Memory = "+rt.freeMemory());
     */
    }
}

