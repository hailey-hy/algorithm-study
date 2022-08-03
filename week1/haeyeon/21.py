def solution(sizes):
    
    for i in sizes:
        i.sort()
        
    x = 0
    y = 0
    
    for i in sizes:
        if x <= i[0]:
            x = i[0]
        if y <= i[1]:
            y = i[1]
        
    return x * y