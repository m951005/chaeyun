# 클래스의 선언
class 클래스명:
    pass
test = 클래스명()
print(type(test))

# 클래스의 생성자
# 두 개 이상의 생성자를 가질 수 없다.
# 생성자의 작성 방법
# __init__()
# self: 클래스 내부에서 __init__() 함수의 첫 매개변수로 지정, 객체명을 받는 용도로 사용하며 생략이 불가능
# def __init__(self): 기본 생성자
# def __init__(self, a, b): 전달인자 2개를 받는 생성자

class Person:
    # def __init__(self): # 기본 생성자는 필수는 아니다.
    #     # print("Person 생성자 호출")
    #     pass
    def __init__(self, name, age):
        self.name = name
        self.age = age
    
    # print()가 실행될 때 호출되는 함수
    def __str__(self):
        return f"Person - name: {self.name}, age: {self.age}"
    
    # 프로그램이 종료될 때 자동으로 호출
    def __del__(self):
        print("삭제 되었습니다.")

    # 크기비교 함수
    def __lt__(self, other):
        return self.age < other.age
    def __le__(self, other):
        return self.age <= other.age
    def __gt__(self, other):
        return self.age > other.age
    def __ge__(self, other):
        return self.age >= other.age
    def __eq__(self, other):
        return self.age == other.age
    def __ne__(self, other):
        return self.age != other.age
    
    def show(self):
        print("name: ", self.name, ", age: ", self.age)
    

p1 = Person('홍길동', 25)
print(p1.name, p1.age)
print(p1)

p2 = Person("김개똥", 30)
print(p2)

print(p1.age < p2.age)
print(p1 < p2)
p1.show()

# 상속
class Student(Person):
    def __init__(self, std_no, name, age):
        super().__init__(name, age)
        self._std_no = std_no
    
    def __str__(self):
        return f"Student - std_no: {self._std_no}, name: {self.name}, age: {self.age}"

s = Student(100, "홍길동", 30)
print(s)