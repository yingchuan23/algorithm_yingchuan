package com.codechen.highfrequency;

public class NC02 {


    public int[] MySort(int[] arr) {
        // write code here
        quicksort(arr, 0, arr.length - 1);
        return arr;
    }

    private void quicksort(int[] arr, int L, int R) {
        if (L > R) {
            return;
        }
        int pivot = arr[L];
        int left = L;
        int right = R;

        while (left < right) {
            /*看右边的数字是否大于 pivot*/
            while (left < right && arr[right] >= pivot) {
                right--;
            }
            /*这个地方就是  上面的地方执行截至了   这里的右边right  就一顶是   比pivot小的   所有让pivot赋值到左边*/
            if (left < right) {
                arr[left] = arr[right];
            }
            /*上面的判断完成之后  我们就判断左边的看左边的指针是否小于等于  pivot   如果是 小于的话 这个指针当前所在的位置 就++
             * 当然  当然如果是大于的话  我们就替换到右指针所在位置了   哈哈哈*/
            while (left < right && arr[left] <= pivot) {
                left++;
            }
            /*这个地方就是替换 哈哈哈哈*/
            if (left < right) {
                arr[right] = arr[left];
            }
            /*这个地方就是 做右指针相等的时候 就不用判断了  那个位置就是这一轮pivot该在的位置*/
            if (left >= right) {
                arr[left] = pivot;
            }
        }
        /*这个地方就是   循环往复  快排的操作  我们可以再写一遍*/
        quicksort(arr, L, right - 1);
        quicksort(arr, right + 1, R);
    }


}
