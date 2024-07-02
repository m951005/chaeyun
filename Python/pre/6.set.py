# 순서가 없다.
# 중복값을 허용하지 않는다.

a = {1,2,3}
print(a)
print(type(a))

a = set()
print(a)
print(type(a))

# set은 중복을 허용하지 않음
a = [1,2,3,4,3,3,3,3]
b = set(a) # 리스트 타입인 a가 set타입으로 바뀜.
print(b) # 중복되는 값 삭제 후 출력

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

# 요소 추가 add()
print(a)
a.add(6)
print(a)
a.add(7)
print(a)

# 요소 삭제 remove()
a.remove(3)
print(a)