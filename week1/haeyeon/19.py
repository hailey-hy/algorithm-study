def solution(new_id):
    id = []
        
    for i in new_id:
        if i.isalpha() and i.isupper():
            id.append(i.lower())
        elif i.islower() or i.isdigit() or (i == '-') or (i == '_') or (i == '.'):
            id.append(i)
        else:
            pass
    
    id_checking = []
        
    for i in range(len(id)):
        if i == 0:
            id_checking.append(id[i])    
        elif i > 0:
            if id[i] == '.' and id[i - 1] == '.':
                pass
            else:
                id_checking.append(id[i])       
    
    if len(id_checking) > 0 and id_checking[0] == '.':
        del id_checking[0]
    
    if len(id_checking) > 0 and id_checking[-1] == '.':
        del id_checking[-1]

    
    length = len(id_checking)
    
    if length == 0:
        id_checking.append('a')
    if length >= 16:
        for i in range(15, length):
            del id_checking[-1]
    if length <= 2:
        while len(id_checking) < 3:
            id_checking.append(id_checking[-1])
            
    if len(id_checking) > 0 and id_checking[0] == '.':
        del id_checking[0]
    
    if len(id_checking) > 0 and id_checking[-1] == '.':
        del id_checking[-1]
            
    answer = ''.join(str(s) for s in id_checking)
    return answer