# 사용자로부터 데이터 입력 받기
# name = input("이름을 입력하세요: ")
# print(name)

# input()로 받은 데이터는 기본적으로 문자열, 형변환해서 연산가능
num1 = int(input("숫자1: "))
num2 = int(input("숫자2: "))
# print(num1, type(num1))
print(f"{num1} + {num2} = {num1 + num2}")