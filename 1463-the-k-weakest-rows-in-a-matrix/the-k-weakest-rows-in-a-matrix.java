class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int[][] arr = new int[m][2];

        for (int i = 0; i < m; i++) {
            int low = 0;
            int high = mat[i].length;

            while (low < high) {
                int mid = low + (high - low) / 2;

                if (mat[i][mid] == 1) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }

            arr[i][0] = low;
            arr[i][1] = i;
        }
        Arrays.sort(arr, (a, b) -> {

            if (a[0] == b[0]) {
                return a[1] - b[1];
            }

            return a[0] - b[0];
        });
        
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = arr[i][1];
        }

        return ans;
    }
}