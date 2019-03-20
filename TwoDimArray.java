public class TwoDimArray
{
    public static void printArr(int[][] nums) {
        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col < nums[0].length; col++) {
                System.out.print(nums[row][col] + " ");
            }
            System.out.println();
        }
    }
    
    public static int sum2d(int[][] nums) {
        int sum = 0;
        
        for (int[] row: nums) {
            for (int n: row) {
                sum += n;
            }
        }
        
        return sum;
    }
    
    public static int countNs(int[][] nums, int n) {
        int count = 0;
        
        for (int[] row: nums) {
            for (int num: row) {
                if (num == n) {
                    count++;
                }
            }
        }
        
        return count;
    }
    
    public static int max2d(int[][] nums) {
        int biggest = nums[0][0];
        
        for (int[] row: nums) {
            for (int num: row) {
                if (num > biggest) {
                    biggest = num;
                }
            }
        }
        
        return biggest;
    }
    
    public static void changeValues(int[][] nums, int before, int after) {
        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col < nums[0].length; col++) {
                if (nums[row][col] == before) {
                   nums[row][col] = after; 
                }
            }
        }        
    }
    
    public static void main(String[] args) {
     
        int[][] arr = { {1, 2, 3, 4}, 
                        {5, 9, 2, 2}, 
                        {4, 8, 7, 1} };
        
        System.out.println(arr.length);
        System.out.println(arr[0].length);
        System.out.println(arr[1][3]);
        System.out.println(arr[2][0]);
        
        printArr(arr);
        System.out.println(sum2d(arr));
        changeValues(arr, 2, 0);
        printArr(arr);
        
        System.out.println(countNs(arr, 0));
        System.out.println(max2d(arr));
    }
}