T = int(input())
for test_case in range(1, T + 1):
    n = int(input())
    n_list = list(map(int, input().split()))
    n_list_reverse = reversed(n_list)

    large_value = n_list[n-1]
    buy_price = 0
    sell_price = 0
    benefit = 0

    for i in range(n-2, -1, -1):
        if n_list[i] > large_value: # 현재값이 다음값보다 크면
            large_value = n_list[i]
            benefit += (sell_price - buy_price)
            sell_price = 0
            buy_price = 0
            continue
        elif n_list[i] == large_value:
            continue
        elif n_list[i] < large_value:
            # 사재기
            buy_price += n_list[i]
            sell_price += large_value
    benefit += (sell_price - buy_price)
    print(f'#{test_case} {benefit}')






   

# t = int(input())

# for p in range(t):
#     n = int(input())
    

#     buy = 0
#     buy_price = 0

#     prices = list(map(int, input().split()))
#     benefit = 0
#     sorted_prices = sorted(prices, reverse=True)

#     j = 0
#     for i in range(n):
#         if prices[i] < sorted_prices[j]:
#             buy += 1
#             buy_price += prices[i]
#         elif prices[i] == sorted_prices[j]:
#             benefit += prices[i] * buy - buy_price  
#             j += 1
#             buy = 0
#             buy_price = 0

#     print(f"#{p+1} {benefit}")
        
    

        