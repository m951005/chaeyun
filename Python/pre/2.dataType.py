# 1. 논리형(bool) : True, False
a = True
print(a)
b = False
print(b)
print(type(a))
print(type(b))
a = 1 < 2
print(type(a))

a = bool(True)
print(a)
a = bool(1)
print(a)
a = bool(0) # 0만 False, 0이 아닌 값은 True
print(a)

# 2. 정수형 (int)
a = 10
print(a)
print(type(a))
a = int(5)
print(a)

# 3. 실수형 (float)
a = 3.14
print(a)
print(type(a))

# 4. 복소수 (complex)
a = 2+3j
print(a)
print(type(a))

# 5. 문자열 (str)
a = "'Hello'"
print(a)
a = '"World"'
print(a)
print(type(a))
a = """Hello World
안녕하세요
제 이름은 ooo입니다."""
print(a)

# 산술 연산자
a = 10
b = 2

print(a + b)
print(a - b)
print(a * b)
print(a / b)  # 나눗셈 값은 실수로만 출력됨
print(a // b) # 나눗셈의 몫만 출력 (소수점 아래는 버림)
print(a % b)  # 나머지 값
print(a ** b) # 누승 (a의 b승)




