from collections import deque
def bfs(start,visitied,graph):
    queue = deque([start])
    result = 1
    visitied[start] = True
    while queue:
        now = queue.popleft()
        
        for i in graph[now]:
            if visitied[i] == False:
                result += 1
                queue.append(i)
                visitied[i] = True
                
    return result
        

def solution(n, wires):
    answer = n
    graph = [[] for _ in range(n+1)]
    
    for v1,v2 in wires:
        graph[v1].append(v2)
        graph[v2].append(v1)
            
    for start,not_visit in wires:
        visitied = [False]*(n+1)
        visitied[not_visit] = True
        result = bfs(start,visitied,graph)
        if abs(result - (n-result)) < answer:
            answer = abs(result - (n-result))
        
    return answer