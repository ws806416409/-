"""
@Time       ：2022/2/15 23:18 
@File       ：LC121.py 
@Author     ：DizzyLime 
@Blog       ：https://lemonws.top
@Annotation : " "
"""


class Solution(object):
    def maxProfit(self, prices):
        max_profit = 0
        min_price = int(1e9)
        for price in prices:
            max_profit = max(price - min_price, max_profit)
            min_price = min(min_price, price)
        return max_profit


if __name__ == '__main__':
    prices = [7, 1, 5, 3, 6, 4]
    s = Solution()
    res = s.maxProfit(prices)
    print(res)

