def two_sum(self, nums: list[int], target: int) -> list[int]:
    d = {}
    for i, n in enumerate(nums):
        complement = target - n
        if complement in d:
            j = d[complement]
            return [i, j]
        else:
            d[n] = i

nums = [2,7,13,11]
two_sum(nums, 9)