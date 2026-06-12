class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val n = nums.size
    val set = HashSet<List<Int>>()
    for (i in 0 until n) {
        for (j in i + 1 until n) {
            for (k in j + 1 until n) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    val triplet = listOf(nums[i], nums[j], nums[k]).sorted()
                    set.add(triplet)
                }
            }
        }
    }
    return set.toList()
    }
}
