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

def add(a, b):
    return a + b