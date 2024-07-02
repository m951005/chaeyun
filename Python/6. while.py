# 반복문 while

num = 1
while num < 10:
    print(num)
    num = num + 1

# 1~100사이의 정수 중 홀수의 합과 짝수의 합을 각각 구하세요
num = 1
sum1, sum2 = 0, 0
while num <= 100:
    if num % 2 == 0:
        sum1 += num
    else:
        sum2 += num
    num += 1

print(f"짝수 : {sum1}, 홀수 : {sum2}")