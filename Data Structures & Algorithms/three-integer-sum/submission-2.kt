class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
         val set = HashSet<List<Int>>()
    val n = nums.size
    for (i in 0 until n) {
        val seen = HashSet<Int>()
        for (j in i + 1 until n) {
            val complement = -nums[i] - nums[j]
            if (seen.contains(complement)) {
                val triplet = listOf(nums[i], nums[j], complement).sorted()
                set.add(triplet)
            }
            seen.add(nums[j])
        }
    }
    return set.toList()
    }
}
