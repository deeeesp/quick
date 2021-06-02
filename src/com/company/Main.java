package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        int[] x = { 140, 95, 443, 400, 215, 294, 353, 360, 371, 210, 103, 15, 393, 425, 123,
                394, 402, 377, 499, 454, 19, 236, 104, 430, 281, 17, 408, 185, 256, 82, 275,
                396, 176, 218, 296, 391, 12, 148, 250, 382, 357, 352, 396, 250, 277, 19, 144,
                178, 396, 143, 131, 414, 378, 235, 344, 159, 251, 251, 343, 7, 332, 117, 402,
                8, 335, 197, 398, 346, 344, 148, 227, 201, 500, 123, 450, 276, 141, 93, 453,
                36, 235, 84, 450, 113, 319, 293, 271, 70, 43, 114, 76, 375, 231, 478, 382, 65,
                174, 280, 410, 18 };
        System.out.println("Было");
        System.out.println(Arrays.toString(x));
        quickSortFirst(x, 0, x.length - 1);
        System.out.println("Стало");
        System.out.println(Arrays.toString(x));
        int[]last = {392, 405, 262, 461, 258, 24, 494, 128, 486, 472, 95, 110, 103, 127, 53, 41,
                137, 132, 263, 283, 257, 406, 325, 165, 316, 71, 244, 54, 265, 311, 373, 156, 216,
                135, 116, 473, 158, 110, 101, 143, 82, 195, 252, 184, 322, 305, 225, 458, 437, 487,
                241, 194, 393, 65, 358, 208, 136, 101, 261, 400, 412, 134, 56, 127, 268, 172, 100,
                426, 282, 200, 68, 363, 395, 320, 46, 216, 125, 271, 174, 61, 257, 414, 255, 149,
                479, 112, 356, 115, 213, 117, 15, 125, 251, 70, 251, 18, 242, 351, 443, 23};
        System.out.println("Было");
        System.out.println(Arrays.toString(last));
        quickSortLast(last, 0, last.length - 1);
        System.out.println("Стало");
        System.out.println(Arrays.toString(last));
        int [] r={310, 447, 58, 177, 391, 274, 311, 205, 333, 341, 308, 93, 466, 384, 168, 408, 143,
                163, 370, 222, 299, 394, 180, 341, 13, 498, 395, 373, 168, 235, 402, 478, 181, 460,
                155, 72, 233, 465, 276, 66, 305, 84, 158, 270, 468, 325, 177, 110, 488, 46, 332, 286,
                440, 11, 126, 452, 9, 20, 325, 177, 255, 227, 154, 436, 187, 308, 7, 419, 272, 283, 485,
                76, 367, 142, 346, 334, 467, 22, 444, 455, 68, 275, 240, 8, 285, 366, 460, 294, 386, 285,
                470, 140, 11, 123, 76, 197, 431, 83, 116, 202};
        System.out.println("Было");
        System.out.println(Arrays.toString(r));
        quickSortRandom(r, 0, r.length - 1);
        System.out.println("Стало");
        System.out.println(Arrays.toString(r));
        int [] median ={253, 139, 444, 484, 184, 372, 415, 2, 18, 496, 330, 185, 224, 451, 474, 466, 66, 284, 445,
                202, 238, 276, 39, 442, 110, 289, 268, 38, 478, 160, 221, 230, 299, 164, 214, 482, 36, 128, 483, 53,
                124, 313, 237, 347, 263, 210, 312, 329, 493, 257, 30, 231, 32, 68, 172, 141, 357, 439, 179, 335, 99,
                399, 65, 397, 62, 278, 379, 97, 406, 362, 149, 29, 174, 386, 376, 437, 96, 188, 265, 89, 444, 295, 319,
                476, 363, 491, 117, 220, 430, 295, 54, 28, 193, 118, 425, 254, 396, 303, 351, 301};
        System.out.println("Было");
        System.out.println(Arrays.toString(median));
        quickSortMedian(median, 0, median.length - 1);
        System.out.println("Стало");
        System.out.println(Arrays.toString(median));
        }


    public static void quickSortFirst(int[] array, int low, int high) {
        if (array.length == 0)
            return;
        if (low >= high)
            return;
        int middle = low;
        int opora = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }
            while (array[j] > opora) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSortFirst(array, low, j);
        if (high > i)
            quickSortFirst(array, i, high);
    }

    public static void quickSortLast(int[] array, int low, int high) {
        if (array.length == 0)
            return;
        if (low >= high)
            return;
        int middle = high;
        int opora = array[middle];
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }
            while (array[j] > opora) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSortLast(array, low, j);
        if (high > i)
            quickSortLast(array, i, high);
    }

    public static void quickSortRandom(int[] array, int low, int high) {
        if (array.length == 0)
            return;
        if (low >= high)
            return;

        int middle = (int) (low + Math.random()*(high-low));
        int opora = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }
            while (array[j] > opora) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSortRandom(array, low, j);
        if (high > i)
            quickSortRandom(array, i, high);
    }

    public static void quickSortMedian(int[] array, int low, int high) {
        if (array.length == 0)
            return;
        if (low >= high)
            return;
        int middle = (int) (low + Math.random()*(high-low));
        int opora = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }
            while (array[j] > opora) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSortMedian(array, low, j);
        if (high > i)
            quickSortMedian(array, i, high);
    }

}
