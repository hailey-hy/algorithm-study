total = int(input())
goods = int(input())

sum_price = 0

for i in range(goods):
    price, num = map(int, input().split())
    sum_price += price * num

if sum_price == total:
    print('Yes')
else:
    print('No')