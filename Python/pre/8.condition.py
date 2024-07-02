# if
a = 5
print("if 실행 전")
if a > 5 :
    print(a) # 들여쓰기 필수, 들여쓰기가 된 부분까지가 if문의 범위가 됨
    print("a는 5보다 큽니다.")
elif 1 < a < 5 :
    print("a는 1보다 크고 5보다 작습니다.")
else :
    print("a는 5와 같다.")
print("if 실행 후")

# while
a = 1
while a < 11 :
    print(a)
    a += 1

# 1 ~ 100사이의 정수 중 홀수의 합과 짝수의 합을 구하세요
a = 1
sum1 = 0
sum2 = 0
while a <= 100 :
    if a % 2 == 0 :
        sum1 += a
    else :
        sum2 += a
    a += 1
print(f"짝수의 합 : {sum1}")
print(f"홀수의 합 : {sum2}")

# for
# for 변수 in 리스트(튜플, 문자열) :
#   수행할 문장...
a = ["one", "two", "three"]
for s in a :
    print(s)

# range(start, end, step) : start 부터 end-1 까지 숫자를 컬렉션으로 만든다.
# start와 step은 생략 가능
for i in range(10):
    print(i)

# break
n = 0
while True:
    print(n)
    n += 1
    if n == 10:
        break

# continue
n = 0
while n < 10:
    n += 1
    if n % 2 > 0:
        continue
    print(n)