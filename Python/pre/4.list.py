# 리스트의 생성 1
a = []
print(a)
print(type(a))

# 리스트 생성 2
a = list()
print(a)
print(type(a))

a = [1, 2, 3, 4, 5]
print(a)

# 리스트의 요소는 타입이 같을 필요는 없다.
a = ["글자", 123, 123.0]
print(a)

# 리스트의 인덱싱, 슬라이싱
print(a[1])
print(a[0:1])
print(a[:])
print(a)

# 리스트에 요소 추가
# append(요소) : 제일 마지막 인덱스에 요소를 추가
a = [1, 2, 3]
a.append(4)
print(a)

# insert(인덱스, 요소) : 인덱스를 지정해서 요소를 추가
a.insert(0, 0)
print(a)

# del 인덱스 : 삭제
del a[1]
print(a)

# 삭제 및 값 리턴 pop(인덱스)
print(a.pop(0))
print(a)

# 리스트의 확장 extend()
a = [1,2,3]
b = [4,5,6]
# print(a + b)
# print(a)
# print(b)
a.extend(b)
print(a) # 리스트 a의 값은 변화
print(b)
