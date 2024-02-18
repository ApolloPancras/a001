package p001;

import java.util.Scanner;

public class Arraytest {
    public static void main(String[] args) {
        // test3();
        // testCalc();
        // testPai();
        // testArrReverse();
        tSearch2();
    }

    public static void tSearch(){
        int[] arr = {4,5,6,1,9};
        int value = 1;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]) {
                index = i;
            }
        }
        System.out.println(index);
    }
    public static void tSearch2(){
        int[] arr = new int[]{-99,-54,-2,0,2,33,43,256,999};
        boolean isFlag = true;
        int value = 256;
        int head = 0;
        int end = arr.length -1;
        while (head <= end ) {
            int middle = (head+end)/2;
            if (arr[middle]==value) {
                System.out.println("找到指定的元素，索引为：" + middle);
                isFlag=false;
                break;
            } else if(arr[middle] > value){
                end = middle - 1;
            } else{
                head = middle + 1;
            }
        }
        if(isFlag){
            System.out.println("未找打指定的元素");
        }
    }
    public static void testArrReverse(){
        // int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int[] arr = new int[100000000];
        // System.out.println("反转之前：");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i;
            // System.out.print(arr[i]);
        }
        // System.out.println("");
        long start = System.currentTimeMillis();
        arr = tAR2(arr);
        long d1 = System.currentTimeMillis() - start;
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        start = System.currentTimeMillis();
        arr = tAR1(arr);
        long d2 = System.currentTimeMillis() - start;
        System.out.println("位运算："+d2 + "; 变量交换：" + d1);
    }
    public static int[] tAR1(int[] arr){
        for (int i = 0; i < arr.length/2; i++) {
            arr[i] = arr[i] ^ arr[arr.length-1-i];
            arr[arr.length-1-i] = arr[i] ^ arr[arr.length-1-i];
            arr[i] = arr[i] ^ arr[arr.length-1-i];
        }
        return arr;
    }
    public static int[] tAR2(int[] arr){
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        return arr;
    }

    public static void testPai(){
        String [][] pai = {{"黑桃","红桃","梅花","方片"},{"A","2","3","4","5","6","7","8","9","10","J","Q","K"}};
        for (int i = 0; i < pai[0].length; i++) {
            String p = "";
            for (int j = 0; j < pai[1].length; j++) {
                p += pai[0][i] + pai[1][j] + " ";
            }
            System.out.println(p);
        }
    }
    public static void testCalc(){
        int[] arr = {4,5,6,1,9};
        //求arr的最大值
        int max = arr[0];
        int min = arr[0];
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
            sum += arr[i];
        }
        System.out.println("max="+ max + "; min=" + min + "; sum=" + sum);
    }
    public static void test3(){
       int[][] arr = new int[10][];
       for (int i = 0; i < arr.length; i++) {
           arr[i] = new int[i+1];
           StringBuilder sb = new StringBuilder();
           sb.append("["+i+"] ");
           for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    arr[i][j] = 1;
                }else{
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j]; 
                }
                sb.append(arr[i][j] + " " );
           }
            System.out.print(sb.toString() + "\n");
       } 
    }
    public static void test2(){
        System.out.print("输入一个整数，作为学生数量: ");
        //读取键盘输入作为学生数量
        Scanner sc = new Scanner(System.in);
        //创建一个数组记录学生成绩
        int [] scores = new int[sc.nextInt()];
        //读取键盘输入作为成绩
        for (int i = 0; i < scores.length; i++) {
            System.out.print("输入第" + (i+1) + "个学生的成绩: ");
            scores[i] = sc.nextInt();
        }
        //求最好成绩
        int max = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        //最好成绩减每个人的成绩，差小于10为A，小于20为B，小于30为C，小于40为D，小于50为E
        for (int i = 0; i < scores.length; i++) {
            int level = max - scores[i];
            if (level < 10) {
                System.out.println("第" + (i+1) + "个学生的成绩为" + scores[i] + "，成绩为A");
            } else if (level < 20) {
                System.out.println("第" + (i+1) + "个学生的成绩为" + scores[i] + "，成绩为B");
            } else if (level < 30) {
                System.out.println("第" + (i+1) + "个学生的成绩为" + scores[i] + "，成绩为C");
            } else if (level < 40) {
                System.out.println("第" + (i+1) + "个学生的成绩为" + scores[i] + "，成绩为D");
            } else {
                System.out.println("第" + (i+1) + "个学生的成绩为" + scores[i] + "，成绩为E");
            }
        }
        sc.close();
    }

    public static void test1(){
        String [] arr = new String[]{"Mon","Tues","Wednes","Thurs","Fri","Satur","Sun"};
        //读取键盘输入
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        switch (input) {
            case 1:
                System.out.println(arr[0]);
                break;
            case 2:
                System.out.println(arr[1]);
                break;
            case 3:
                System.out.println(arr[2]);
                break;
            case 4:
                System.out.println(arr[3]);
                break;
            case 5:
                System.out.println(arr[4]);
                break;
            case 6:
                System.out.println(arr[5]);
                break;
            case 7:
                System.out.println(arr[6]);
                break;
        }
        sc.close();
    }

}
