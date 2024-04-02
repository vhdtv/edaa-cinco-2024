public class BinarySearchTester {
    public static void main(String[] args) {
        int[] arrayEx1 = { 242, 243, 255, 268, 270, 275, 285, 289, 293, 296,
                306, 307, 310, 315, 318, 323, 334, 337, 350, 351,
                355, 359, 361, 369, 373, 376, 379, 383, 387, 390,
                391, 392, 394, 399, 401, 403, 415, 417, 421, 423,
                429, 433, 436, 440, 447, 459, 463, 464, 477, 481,
                483, 484, 486, 487, 490, 495, 496, 499, 500, 501,
                511, 513, 518, 526, 530, 531, 534, 545, 551, 553,
                554, 558, 561, 565, 572, 591, 592, 600, 605, 609,
                613, 616, 623, 624, 625, 626, 632, 643, 645, 647,
                652, 654, 655, 662, 667, 671, 673, 674, 695, 696 };
        int[] targetsEX1 = { 415, 545, 390, 609, 296 };
        System.out.println("-- Exercício I --");
        for (int target : targetsEX1) {
            int result = binarySearch(arrayEx1, target);
            if (result != -1) {
                System.out.println("O número " + target + " está no índice " + result);
            } else {
                System.out.println("O número " + target + " não foi encontrado no array");
            }
        }

        int[] arrayEX2 = { 42, 43, 45, 72, 124, 143, 149, 150, 167, 168,
                178, 186, 188, 192, 212, 221, 228, 230, 233, 238,
                243, 248, 251, 265, 267, 269, 303, 306, 309, 311,
                317, 326, 335, 336, 348, 351, 354, 365, 385, 394,
                396, 404, 411, 413, 415, 420, 424, 428, 432, 441,
                443, 453, 464, 472, 482, 483, 488, 506, 512, 524,
                525, 539, 565, 584, 585, 589, 599, 606, 611, 624,
                626, 628, 634, 644, 662, 688, 691, 700, 703, 711,
                723, 738, 741, 750, 754, 759, 765, 775, 780, 783,
                824, 826, 832, 848, 854, 856, 858, 867, 873, 880 };
        int[] targetsEX2 = { 824, 599, 700, 858, 269, 351, 42, 317, 525, 550, 143, 421, 422 };
        System.out.println("-- Exercício II --");
        for (int target : targetsEX2) {
            int result = binarySearch(arrayEX2, target);
            if (result != -1) {
                System.out.println("O número " + target + " está no índice " + result);
            } else {
                System.out.println("O número " + target + " não foi encontrado no array");
            }
        }
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            }

            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
