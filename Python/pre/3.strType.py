a = "Hello Python"
print(a)
print(type(a))

# 이스케이프 문자
# \n 줄바꿈 문자
print("Hello \nPython")
#  \t tab
print("Hello\tPython")
# \\ 역슬래쉬
print("\\Hello Python\\")
# \",\'
print("\"Hello Python\'")

a = "hello"
b = "python"
c = 10
print(a + b)
# print(a + c) 문자열과 정수 연산 불가
print("*" * 40) # 문자열 * 정수 곱하기 연산은 가능

# 문자열 인덱싱
a = "test python string"
print(a)
print(a[0])
print(a[5])
print(a[-1]) # 맨 뒤에서 부터 -1

# 문자열 슬라이싱
# [:] : 처음부터 끝까지
# [start:] : start부터 끝까지
# [:end] : 처음부터 end-1까지
# [start:end] : start 부터 end-1 까지
# [start:end:step] : step만큼 건너뛰면서 start부터 end-1까지
print(a[0:2])
print(a[0:11])
print(a[0:1000]) # 범위를 넘어도 오류가 나지 않음
print(a[:12]) # 앞에 숫자를 생략하면 제일 처음부터
print(a[5:]) # 뒤에 숫자를 생략하면 제일 마지막까지
print(a[::2])

# 포메팅 : 문자열 내에 {} 입력하고 format 함수의 인수로 삽입할 변수 또는 값을 입력하면 {} 자리에 차례로 인수 값이 전달된다.
name = "홍길동"
age = 25
a = "제 이름은 {}이고 나이는 {}살입니다.".format(name,age)
print(a)
# 문자열 포메팅
# %s : 문자열
# %c : 문자 1개
# %d : 정수
# %f : 실수
# %o : 8진수
# %x : 16진수

a = "제 이름은 %s입니다."%name
print(a)
a = "제 이름은 %s이고 나이는 %d살입니다."%(name, age)
print(a)

a = "숫자 {}, {}, {}".format(3, 2, 1)
print(a)
# {} 안에 0부터 시작하는 순서값을 지정할 수 있다.
a = "숫자 {2}, {0}, {1}".format(3, 2, 1)
print(a)

print(f"제 이름은 {name}이고 나이는{age}살입니다.")

# 문자열 관련 함수
test = "abcd 가나다라마바사"
print(test)
# find(), index()는 인덱스 값을 리턴
print(test.find("가"))
# find()는 없으면 -1을 리턴
print(test.find("abdc")) 
print(test.index("나"))
# index()는 없으면 오류 발생
# print(test.index("하"))

path = "c:\\test\\abcd\\abcde.jpg"
print(path)

print(path.rfind("\\"))
# 경로를 제외한 파일명 찾기
print(path[path.rfind("\\")+1:])

# split (토큰을 기준으로 나누어 리스트 형태로 반환)
print(path.split("\\"))

# replace : 문자열 치환
a = "Hello World"
print(a)
print(a.replace("World", "Python"))

# strip : 공백 제거
a = "   test    "
print(a)
print(a.strip())

a = "abcd"
print(a.upper()) # 소문자를 대문자로 변경
a = "ABcd"
print(a.lower()) # 대문자를 소문자로 변경

a = "aaaaaaaabbbbbbbcccccccdddddddd"
print(a.count("aa")) # "a"가 포함된 문자열의 갯수 반환
print(len(a)) # 문자열 전체 길이

print(a.isalpha()) # 알파벳이면 True, 중간에 숫자 등이 섞이면 False

a = "1234"
print(a.isdecimal()) # 10진수인지 판단 함수
print(a.isdigit()) # 아라비아숫자인지 판단
print(a.isnumeric()) # 수 자체인지 판단(로마숫자)

print(dir(str)) # str 클래스의 함수 목록
print(dir(int))


