'''
장르 별로 가장 많이 재생된 노래를 두 개씩
장르 순서: 재생 수 많은 장르부터
곡 순서: 많이 재생, 같을시에 더 앞에 위치한거 (고유번호 낮은거)
'''
def solution(genres, plays):
    album = []
    
    total_genres={}
    total_plays={}
    relations={}
    
    for i in range(len(plays)):
        if genres[i] not in total_genres:
            total_genres[genres[i]]=0
            relations[genres[i]]=[]
        total_genres[genres[i]]+=plays[i]
        total_plays[i]=plays[i]
        relations[genres[i]].append(i)
    sorted_genres = sorted(total_genres, key = lambda x : total_genres[x], reverse=True)
    
    
    for genre in sorted_genres:
        top_id={}
        temp_index=relations.get(genre)
        print(temp_index)
        for index in temp_index:
            top_id[index]=total_plays.get(index)
        top_id=sorted(top_id, key = lambda x: (top_id[x],-x), reverse=True)
        
        print(top_id)
        
        if len(top_id) == 1:
            album.append(top_id[0])
        else:
            for i in range(2):
                album.append(top_id[i])
            
        
    return album