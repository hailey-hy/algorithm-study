def solution(priorities, location):
    priorities = [(v, idx) for idx, v in enumerate(priorities)]
    count = 0
    while True:
        if priorities[0][0] == max(priorities)[0]:
            count += 1
            if priorities[0][1] == location:
                break
            priorities.pop(0)
        else:
            priorities.append(priorities.pop(0))
    return count