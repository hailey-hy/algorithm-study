def solution(lottos, win_nums):
    answer = []
    result = 0
    
    for i in lottos:
        if i in win_nums:
            result += 1
    
    first = 7 - result
    if first == 7:
        first = 6
        
    answer.append(first)
    
    result += lottos.count(0)
    
    second = 7 - result
    if second == 7:
        second = 6 
        
    answer.append(second)
    
    answer.sort()
    
    return answer