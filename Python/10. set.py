# set 의 생성
a = set()
print(a, type(a))

a = {1,2,3}
print(a, type(a))

# set은 요소의 중복을 허용하지 않음
a = set([0,0,0,1,2,3])
print(a)

a = set([1,2,3,4])
b = set([3,4,5,6])
print(a)
print(b)

# a와 b의 교집합
print(a & b)

# a와 b의 합집합
print(a | b)

# a와 b의 차집합
print(a - b)

# 요소 추가: add()
a.add(6)
print(a)

# 요소 삭제: remove()
a.remove(3)
print(a)

# 집합 수정: update()
a.update([5,6,7,8])
print(a)

# 형 변환
a = [1,2,3,4,5,5,5]
b = list(set(a))
print(b)