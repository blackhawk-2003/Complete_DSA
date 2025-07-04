public class Kth_Smallest_Product_Of_Two_Sorted_Arrays {
    public static void main(String[] args) {
        int[] nums1 = { 2, 5 };
        int[] nums2 = { 3, 4 };
        int k = 2;
        System.out.println(kthSmallestProduct(nums1, nums2, k));
    }

    static int kthSmallestProduct(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        int m = nums2.length;
        int[] pos = new int[n];
        int[] neg = new int[m];
        int p = 0, q = 0;
        for (int i = 0; i < n; i++) {
            if (nums1[i] >= 0) {
                pos[p++] = nums1[i];
            } else {
                neg[q++] = nums1[i];
            }
        }
        for (int i = 0; i < m; i++) {
            if (nums2[i] >= 0) {
                pos[p++] = nums2[i];
            } else {
                neg[q++] = nums2[i];
            }
        }
        int ans = 0;
        if (k <= p * q) {
            ans = findKthSmallest(neg, pos, k, true);
        } else {
            ans = findKthSmallest(pos, neg, k - p * q, false);
        }
        return ans;
    }

    static int findKthSmallest(int[] nums1, int[] nums2, int k, boolean isNeg) {
        int low = -1000000000;
        int high = 1000000000;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (countPairs(nums1, nums2, mid, isNeg) >= k) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    static int countPairs(int[] nums1, int[] nums2, int mid, boolean isNeg) {
        int n = nums1.length;
        int m = nums2.length;
        int count = 0;
        int j = m - 1;
        for (int i = 0; i < n; i++) {
            while (j >= 0 && (long) nums1[i] * nums2[j] > mid) {
                j--;
            }
            count += j + 1;
        }
        return count;
    }

    static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
