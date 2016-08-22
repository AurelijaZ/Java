package dayOne.primitives;

/**
 * Created by student on 22-Aug-16.
 */
public class ArraysTasks {

    public static void main (String[] args) {


       int[] test = {4,5};
      //  int[] testTwo = {2,3,1};
      //  int[] testThree = {2,3,1};
        System.out.println(hasTwoThree(test));
    }
    static boolean firstLast6 (int[] nums) {
        return (nums[0] == 6 || (nums [nums.length -1] == 6));
    }

    static boolean sameFirstLast (int[]nums) {
        return (nums.length >=1 && nums[0] == nums[nums.length -1]);
    }

    static boolean commonEnd(int[] numberOne, int[] numberTwo) {
        return (numberOne[0] == numberTwo [0] || numberOne[numberOne.length -1] == numberTwo[numberTwo.length -1]);
    }

   // static int maxEndThree(int[] numbers) {
  //      if( numOne[0] == numOne[numOne.length -1]) {
   //         numOne

   //     }

static boolean hasTwoThree (int[] nums) {
    return (nums[0] == 2 || nums[0] ==3 || nums[1] ==2 || nums[1] ==3);

}
}