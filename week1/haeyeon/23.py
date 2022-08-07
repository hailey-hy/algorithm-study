def solution(dartResult):
    
    dartResult_list = []
    word = ''
    dartResult = [i for i in dartResult]
    
    while dartResult:
        digit = dartResult.pop(0)
        
        if digit.isdigit():
            word += digit
        elif digit.isalpha():
            word += digit
            dartResult_list.append(word)
            word = ''
        else:
            dartResult_list.append(digit)
            
    previous = [0, 0]
    answer = 0
    for i in range(len(dartResult_list)):
        
        if len(dartResult_list[i]) > 1:
            if dartResult_list[i][-1] == 'S':
                previous.append(int(dartResult_list[i][:-1]))
                # return 'good'
            elif dartResult_list[i][-1] == 'D':
                previous.append(int(dartResult_list[i][:-1]) ** 2)
                
            else:
                previous.append(int(dartResult_list[i][:-1]) ** 3)
            
            if previous[0] != 0:
                answer += previous.pop(0)
            else:
                previous.pop(0)
                
        elif dartResult_list[i] == '*':
            previous.append(previous.pop(0) * 2)
            previous.append(previous.pop(0) * 2)
            
        else:
            previous.append(0 - previous.pop())
            
        
        
    return answer + sum(previous)