# 문자열 슬라이싱
# [:]: 처음부터 끝까지
# [start:]: start 부터 끝까지
# [:end]: 처음부터 end-1까지
# [start:end]: start부터 end-1까지
# [start:end:step]: step 만큼 건너뛰면서 start부터 end-1까지

test = "abcd 가나다라마바사 하하하"
print(test[0])
print(test[5:12])
# find(), index()는 인덱스 값을 리턴
print(test.find("가"))
print(test.find("카")) # 값이 없으면 -1을 리턴
print(test.index("나"))
# print(test.index("카")) # 값이 없으면 오류 발생

path = "c:\\test\\abcd\\abcde.jpg"
print(path)
print(path.rfind("\\")) # rfind(): 문자열을 오른쪽부터 찾는다.

# 경로를 제외하고 파일명을 출력
print(path[path.rfind("\\") + 1:])

# split (리스트 형식으로 리턴)
print(path.split("\\"))

# replace
greet = "안녕하세요. 파이썬 입니다."
print(greet.replace("안녕하세요", "Hello"))

# strip: 공백제거
a = "    test    "
print(a.strip())

a = "abcd"
print(a.upper()) # 대문자 변환
a = "ABcd"
print(a.lower()) # 소문자 변환
a = "aaaaaaabbbbbbbcccccccccccddddddddddd"
print(a.count("aa")) # aa가 포함된 문자열의 갯수를 반환
print(len(a)) # 문자열의 길이를 반환

print(a.isalpha()) # 알파벳이면 True (전부 알파벳일 경우만)
a = "abcd"
print(a.islower()) # 소문자이면 True
print(a.isupper()) # 대문자이면 True
a = "1234"
print(a.isdecimal()) # 10진수인지 판단
print(a.isdigit()) # 아라비아 숫자인지 판단
print(a.isnumeric()) # 수 자체인지 판단

print(dir(str)) # str의 모든 함수를 출력
print(dir(int))









