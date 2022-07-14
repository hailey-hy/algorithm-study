def solution(jobs):
    answer, now = 0, 0
    jobs = sorted(jobs, key=lambda x: x[1]) 
    length = len(jobs)
    
    while jobs:
        for j in jobs:
            if j[0] <= now :
                now += j[1]
                answer += now - j[0]
                jobs.pop()
                break
            else:
                now += 1
        
    return answer // length