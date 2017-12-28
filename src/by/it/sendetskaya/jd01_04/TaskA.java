package by.it.sendetskaya.jd01_04;

import java.util.Scanner;

public class TaskA {

    public static void main(String[] args) {
        printMulTable();
         Scanner sc=new Scanner(System.in);
         String line=sc.nextLine();
         buildOneDimArray(line);
    }

    static void printMulTable()
    {
        for (int i = 2; i < 10; i++){
            for (int j = 2; j < 10; j++) {

                System.out.printf("%1d*%1d=%-2d ",i,j,i*j);
        }
        System.out.println();
        }
    }

    static int find (double[]arr,double value)
    {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==value)
                return  i;
        }
        return -1;
    }

    static void buildOneDimArray(String line)
    {
        double[]arr=InOut.getArray(line);
        InOut.printArray(arr,"v", 5);
        System.out.println();
        double first =arr[0];
        double last=arr[arr.length-1];

        Helper.sort(arr);
        System.out.println("Отсортированный массив:");
        InOut.printArray(arr,"V", 4);
        int indexFirst=find(arr,first);
        int indexLast=find(arr,last);
        System.out.printf("Index of first element=%d\n",indexFirst);
        System.out.printf("Index of last element=%d\n",indexLast);
    }
}
