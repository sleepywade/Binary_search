package binary_search;

import java.util.Scanner;

public class Main {

    static int BinarySearch(int[] s, int x, int low, int high) {
        if (low > high) return -1;
        int middle = (low + high) / 2;
        if (x == s[middle]) return middle;
        else if (x > s[middle])
            return BinarySearch(s, x, middle + 1, high);
        else
            return BinarySearch(s, x, low, middle - 1);
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in );
        String[]nums;
        int x,target;
        nums=sc.nextLine().split(" ");
        int []num=new int [nums.length];
        x=sc.nextInt();
        for(int i=0;i<num.length;i++){
            num[i]=Integer.parseInt(nums[i]);
        }
        target=BinarySearch(num,x,0,num.length-1);
        System.out.println(target);
    }

}


