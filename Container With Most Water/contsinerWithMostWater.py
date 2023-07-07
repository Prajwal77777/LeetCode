class Solution:
    def maxArea(self, height: List[int]) -> int:
        area = 0
        i = 0
        j = len(height) - 1

        while i < j:
            cur_area = min(height[i], height[j]) * (j - i)
            area = max(area, cur_area)

            if height[i] < height[j]:
                i += 1
            else:
                j -= 1
        return area
