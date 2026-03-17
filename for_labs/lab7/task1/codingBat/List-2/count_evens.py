def count_evens(nums):
    count = 0
    for n in nums:
        if n % 2 == 0:   # проверяем, делится ли на 2 без остатка
            count += 1
    return count