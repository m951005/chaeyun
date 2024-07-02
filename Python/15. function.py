# 사용자 정의 함수

def 함수명():
    print("함수호출")
    return True

a = 함수명()
print(a)

# 위치 인자를 이용한 함수의 호출
def restaurant(food, drink, dessert):
    return {'food':food, 'drink':drink, 'dessert':dessert}

first = restaurant('스테이크', '와인', '치즈 케익')
print(first)

# 호출 시 매개변수의 이름을 함께 지정해서 순서에 상관없이 호출 가능
second = restaurant(drink='막걸리', dessert='잔치국수', food='파전')
print(second)

# 기본 파라미터 : 매개변수의 초기값을 지정하는 것
def rest(food='초밥', drink='사케', dessert='아이스크림'):
    return {'food':food, 'drink':drink, 'dessert':dessert}

print(rest())
print(rest(food='돈부리'))
print(rest('돈까스', '맥주'))
print(rest('피자', '소주', '과일'))

c = 10
print(c)
def add(a, b):
    global c    # 전역변수를 사용 선언
    c = a + b   # 전역변수 사용 선언을 하지 않으면, 지역변수이므로 전역변수 c에 영향 X
    return c
print(add(1, 2))
print(c)

# 매개변수를 튜플의 형태로 전달 (*)
def save_names(*args):
    print(args)

# 매개변수를 딕셔너리 형태로 전달 (**)
def save_names2(**kwargs):
    print(kwargs)

save_names('홍길동')
save_names('홍길동', '김개똥')

save_names2(name1 = '홍길동', name2 = '김개똥')

def myfunc1(a, b, *args):
    print(a, b, args)


myfunc1(1, 2)
myfunc1(1, 2, 'a', 'b')

def myfunc2(a, b, **kwargs):
    print(a, b, kwargs)

myfunc2('a', 'b')
myfunc2(1, 2, name = '홍길동', age = 20)

def myfunc3(a, b, *args, **kwargs):     # 튜플, 딕셔너리 순서 주의(어디까지가 튜플인지 알 수 없으므로 마지막에 위치)
    print(a, b, args, kwargs)

myfunc3('a', 10, 'Hello', 20, name='홍길동', age=20)

def hi():
    print('Hello')

hello = hi
print(type(hello))
hello()

def mul(a, b):
    return a * b

def calc(func, a, b):
    print("결과 {}".format(func(a,b)))

calc(mul, 2, 3)
calc(add, 2, 5)