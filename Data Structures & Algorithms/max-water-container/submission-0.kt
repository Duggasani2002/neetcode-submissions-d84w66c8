class Solution {
    fun maxArea(heights: IntArray): Int {
        var maxArea = 0
        for (l in heights.indices) {
            for (r in l + 1 until heights.size) {
                val area = min(heights[r],heights[l]) * (r - l)
                maxArea = max(maxArea, area)
            }
        }
        return maxArea
    }
}