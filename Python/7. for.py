# for문
# for 변수 in range(start, end, step):
#   수행할 문장...
# for 변수 in 리스트(또는 튜플, 문자열):

for i in range(1, 6):
    print(i)

a = "abcdefg"
for s in a:
    print(s)

test = ['one', 'two', 'three']
for i in test:
    print(i)

test = [(1,2), (3,4), (5,6)]
for i in test:
    for j in i:
        print(j)

# enumerate() 함수를 이용한 순회
# 순서값과 요소값을 한번에 구해주는 내장함수
# 리스트의 순서값과 요소값을 튜플로 묶은 컬렉션을 리턴
student = [{"홍길동": 100}, {"김개똥": 200}, {"이말똥": 300}]
for s, i in enumerate(student, start=1):
    # print(s, i)
    # print(i.items())
    data = list(i.items())[0]
    name = data[0]
    value = data[1]
    print(f"{s} 이름: {name}, 학번: {value}")

# 컴프리헨션: 하나 이상의 iterator로부터 파이썬의 자료구조를 만드는 방법
# 1. 리스트 컴프리헨션
# [표현식 for 항목 in 순회 가능한 객체]
# [표현식 for 항목 in 순회 가능한 객체 if 조건]
    
# ex) 1 ~ 5 사이의 정수에 5를 더해서 리스트를 생성
result = []
for num in range(1, 6):
    # print(num)
    result.append(num + 5)
print(result)

result = [num + 5 for num in range(1, 6)]
print(result)

# 1 ~ 5 사이의 정수 중 짝수인 숫자에 3을 곱해서 리스트를 생성
result = [i * 3 for i in range(1, 6) if i % 2 == 0]
print(result)

# 1 ~ 9 사이의 정수를 1 ~ 9까지 반복하며 서로 곱한 값을 리스트로 생성
result = [i * j for i in range(1, 10) for j in range(1, 10)]
print(result)

# 구구단 출력
gugudan = [f"{i} * {j} = {i*j}" for i in range(2, 10) for j in range(1, 10)]
print(gugudan)