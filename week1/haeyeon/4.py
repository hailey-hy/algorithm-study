def solution(genres, plays):
    answer = []
    temp = []
    total_genre_d = {}

    temp = [[genres[i], plays[i], i] for i in range(len(genres))]   # [장르, 재생횟수, 고유 번호] 리스트
    temp = sorted(temp, key=lambda x: (x[0], -x[1], x[2]))  # 많이 재생될수록, 같다면 고유번호가 낮을수록

    for g in temp:  # {장르 : 총 재생횟수} 딕셔너리 생성
        if g[0] not in total_genre_d:
            total_genre_d[g[0]] = g[1]
        else:
            total_genre_d[g[0]] += g[1]
    
    total_genre_d = sorted(total_genre_d.items(), key = lambda x: -x[1])    # 재생횟수가 많은 순서로 장르 정렬
    
    for i in total_genre_d: # 같은 장르 내에서는 최대 2곡까지 조건대로 수록
        count = 0
        for j in temp:
            if i[0] == j[0]:
                count += 1
                if count > 2:
                    break
                else:
                    answer.append(j[2])

    return answer