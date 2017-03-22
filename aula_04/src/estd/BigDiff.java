package estd;

public class BigDiff {

	public int bigDiff(int[] nums) {
		int max = nums[0];
		int min = nums[0];

		for (int num : nums) {
			max = Math.max(max, num);
			min = Math.min(min, num);
		}

		return max - min;
	}

}
