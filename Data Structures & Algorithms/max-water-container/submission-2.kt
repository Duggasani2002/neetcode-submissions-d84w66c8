class Solution {
    fun maxArea(heights: IntArray): Int {
        var l = 0
        var r = heights.size - 1
        var maxArea = 0
        while (l < r) {
            maxArea = maxOf(maxArea, minOf(heights[l], heights[r]) * (r - l))
            // Move the pointer of the shorter height
            if (heights[l] < heights[r]) l++ else r--
        }
        return maxArea
    }
}