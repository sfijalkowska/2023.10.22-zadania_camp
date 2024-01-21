/*

Return the sum of the numbers in the array, returning 0 for an empty array.
Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.


sum13([1, 2, 2, 1]) → 6
sum13([1, 1]) → 2
sum13([1, 2, 2, 1, 13]) → 6
 */

public class Dwa {
    public static void main(String[] args) {
        Dwa dwa = new Dwa();
        System.out.println(dwa.sum13(new int[]{1, 2, 2, 1}));
        System.out.println(dwa.sum13(new int[]{1, 1}));
        System.out.println(dwa.sum13(new int[]{1, 2, 2, 1, 13}));
    }

    public int sum13(int[] nums) {
        int suma = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                i++;
            } else {
                suma += nums[i];
            }
        }
        return suma;
    }
}
