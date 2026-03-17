def centered_average(nums):
    total = sum(nums)
    smallest = min(nums)
    largest = max(nums)
    
    return (total - smallest - largest) // (len(nums) - 2)