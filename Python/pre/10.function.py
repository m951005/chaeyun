# def 함수명():
#   수행할 문장
def f():
    print("함수 호출")
    return True

a = f() # 함수는 호출을 해야 실행 됨
print(a)

def add(a, b):
    c = a + b
    return c

result = add(1, 3)
print(result)

def func1(a):
    if a % 2 == 0:
        return "짝수"
    else:
        return "홀수"
    
n = input("숫자를 입력하세요 : ")
print(func1(int(n)))