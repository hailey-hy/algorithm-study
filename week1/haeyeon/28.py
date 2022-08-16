
t = int(input())

for i in range(t):
    x1, y1, x2, y2 = map(int, input().split())
    n = int(input())
    answer = 0
    for i in range(n):
        cx, cy, r = map(int, input().split())

        if (cx - x1) ** 2 + (cy - y1) ** 2 <= r ** 2 and (cx - x2) ** 2 + (cy - y2) ** 2 > r ** 2:
            answer += 1
        elif (cx - x1) ** 2 + (cy - y1) ** 2 > r ** 2 and (cx - x2) ** 2 + (cy - y2) ** 2 <= r ** 2:
            answer += 1
            
    print(answer)