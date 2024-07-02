# 클래스
# 변수와 함수를 둘 다 가질 수 있다.
# 클래스의 선언
# class 클래스명:
#   변수 및 함수를 지정

class Person:
    def __init__(self, name, age): # 기본 생성자 -> 모든 class는 기본 생성자를 가지지만 생략 가능(단, 인수값을 받지 않을 경우만 생략. self는 생략X)
        print("Person 생성")
        self.name = name
        self.age = age

    def show(self):
        print(f"이름 : {self.name}, 나이 : {self.age}")


p = Person("홍길동", 25)
print(p)
print(type(p))
print(p.name)
print(p.age)
p.show()