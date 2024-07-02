# 튜플의 생성
a = ()
print(a, type(a))

a = tuple()
print(a, type(a))

a = [1,2,3,4,5]
b = (1,2,3,4,5)
print(type(a), type(b))
print(a[0])
a[0] = 9
print(a)

print(b[0])
# b[0] = 9
print(b)

# 변수 하나에 여러개의 값을 넣으면 튜플로 생성 된다.
b = 1, 2, 3, 4, 5
print(b)
# 요소 1개의 튜플 생성
b = 1,
print(b)

# 패킹: 튜플로 만드는 작업
a = 1,2,3,4
print(a)

# 언패킹: 튜플에서 값을 꺼내는 작업
a1, a2, a3, a4 = a
print(a1, a2, a3, a4)

# 인덱싱, 슬라이싱
a = 1,2,3
print(a[0])
print(a[0:2])




