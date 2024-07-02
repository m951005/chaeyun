# 사용자 입력 데이터 받기
name = input("이름을 입력하세요. : ")
print(name)

num1 = input("숫자를 입력하세요. : ") # input으로 데이터를 받으면 모두 str타입이므로 형변환 활용
print(num1)
print(type(num1))
num2 = int(num1) # 형 변환
print(type(num2))