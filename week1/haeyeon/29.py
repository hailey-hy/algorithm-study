
k = int(input())
array = []

for i in range(6):
    array.append(list(map(int, input().split())))

width = max(array, key=lambda x: x[1])

if width[0] > 2:
    height = max(array, key=lambda x: (x[0] == width[0] - 2))
else:
    height = max(array, key=lambda x: (x[0] == width[0] + 2))

total = width[1] * height[1]

blank = 1

for i in range(6):
    if i == 0:
        if array[i] in [width, height] or array[-1] in [width, height] or array[i + 1] in [width, height]:
            continue
        else:
            blank *= array[i][1]
    elif i == 5:
        if array[i] in [width, height] or array[0] in [width, height] or array[i - 1] in [width, height]:
            continue
        else:
            blank *= array[i][1]
    elif array[i] in [width, height] or array[i - 1] in [width, height] or array[i + 1] in [width, height]:
        continue
    else:
        blank *= array[i][1]

print((total - blank) * k)