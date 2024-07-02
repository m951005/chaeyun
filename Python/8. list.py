# 리스트의 생성
a = []
print(a, type(a))

a = list()
print(a, type(a))

a = [1, 2, 3, 4, 5]
print(a)

# 리스트는 요소의 타입이 같지 않아도 된다.
a = ["Hello", 100, 3.14]
print(a)

# 리스트 인덱싱과 슬라이싱
a = [1, 2, 3, 4, 5]
print(a[0])     # 리스트의 요소만 출력
print(a[0:1])   # 슬라이싱된 리스트를 출력
print(a[::2])

# 리스트 추가: append()
a = [1,2,3]
a.append(4)
print(a)

# 리스트 삽입: insert()
a.insert(0,0)
print(a)

# 삭제: del 인덱스
del a[0]
print(a)

del a[0:2]
print(a)

# 삭제: remove(요소)
a.remove(4)
print(a)

# 삭제 및 값 리턴: pop(인덱스)
print(a.pop(0))
print(a)

# 리스트의 확장: extend()
a = [1,2,3]
b = [4,5,6]
print(a + b)
a.extend(b)
print(a)

a = [4,5,6,3,2,1]
# 오름차순 정렬: sort()
a.sort()
print(a)

# 내림차순 정렬: reverse()
a.reverse()
print(a)

# 특정 요소 포함 여부
print(1 in a)
print(10 in a)