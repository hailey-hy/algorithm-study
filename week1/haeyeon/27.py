w, h, x, y, p = map(int, input().split())
answer = 0


for i in range(p):
    xp, yp = map(int, input().split())
    if (x <= xp <= x + w and y <= yp <= y + h) or ((xp - x)**2 + (yp - y - h/2)**2 <= (h/2)**2) or ((xp - x - w)**2 + (yp - y - h/2)**2 <= (h/2)**2):
        answer += 1

print(answer)