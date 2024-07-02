# 튜플 생성 1
a = ()
print(a)
print(type(a))

# 튜플 생성 2
a = tuple()
print(a)
print(type(a))

a = [1,2,3,4,5]
b = (1,2,3,4,5)
print(type(a), type(b))
a[0] = 9
print(a)
# b[0] = 9 튜플은 요소 값을 변경하거나 삭제할 수 없음 (읽기 전용)
print(b[0])

# 변수 하나에 여러 개의 값을 넣으면 튜플로 생성된다.
b = 1,2,3,4,5
print(b)

b = 1, # 원소가 하나짜리 인 튜플생성
print(b)

# 패킹 : 튜플로 만드는 작업
a = 1,2,3,4
print(a)

# 언패킹 : 튜플에서 값을 꺼내는 작업
a1, a2, a3, a4 = a
print(a1, a2, a3, a4)

a = 1,2,3
print(a[1])
print(a[0:2])
