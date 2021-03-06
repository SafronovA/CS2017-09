package by.it.sc04_evening_tue_thu.bayramova.lesson11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Scanner;

/*
Реализуйте сортировку слиянием для одномерного массива.
Сложность алгоритма должна быть не хуже, чем O(n log n)

Первая строка содержит число 1<=n<=10000,
вторая - массив A[1…n], содержащий натуральные числа, не превосходящие 10E9.
Необходимо отсортировать полученный массив.

Sample Input:
5
2 3 9 2 9
Sample Output:
2 2 3 9 9
*/

public class B_MergeSort {

    int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int ai = 0;
        int bi = 0;
        int i = 0;
        while( ai<a.length && bi<b.length){
            if(a[ai] <= b[bi]){
                result[i]=a[ai];
                ai++;
            }
            else{
                result[i]=b[bi];
                bi++;
            }
            i++;
        }
        System.arraycopy(a,ai,result,i,a.length-ai);
        System.arraycopy(b,bi,result,i,b.length-bi);
        return result;
    }

    int[] mergeSort(int a[]) {
        if (a.length==1) return a;

        int mid=a.length/2;
        int al[]=mergeSort(Arrays.copyOfRange(a,0,mid));
        int ar[]=mergeSort(Arrays.copyOfRange(a,mid,a.length));
        return merge(al, ar);


    }





      int[] getMergeSort(InputStream stream) throws FileNotFoundException {
        //подготовка к чтению данных
        Scanner scanner = new Scanner(stream);
        //!!!!!!!!!!!!!!!!!!!!!!!!!     НАЧАЛО ЗАДАЧИ     !!!!!!!!!!!!!!!!!!!!!!!!!
        //размер массива
        int n = scanner.nextInt();
        //сам массив
        int[] a=new int[n];
        for (int i = 0; i < n; i++)
            a[i] = scanner.nextInt();
        System.out.println("Прочитан массив a="+ Arrays.toString(a));
        // тут реализуйте сортировку слиянием
        // https://ru.wikipedia.org/wiki/Сортировка_слиянием
        //!!!!!!!!!!!!!!!!!!!!!!!!     тут ваше решение   !!!!!!!!!!!!!!!!!!!!!!!!

        return  mergeSort(a);



        //!!!!!!!!!!!!!!!!!!!!!!!!!     КОНЕЦ ЗАДАЧИ     !!!!!!!!!!!!!!!!!!!!!!!!!
    }



    public static void main(String[] args) throws FileNotFoundException {
        String root = System.getProperty("user.dir") + "/src/";
        InputStream stream = new FileInputStream(root + "by/it/akhmelev/lesson11/dataB.txt");
        B_MergeSort instance = new B_MergeSort();
        //long startTime = System.currentTimeMillis();
        int[] result=instance.getMergeSort(stream);
        System.out.println("Отсортированный массив "+ Arrays.toString(result));
        //long finishTime = System.currentTimeMillis();
    }

}

