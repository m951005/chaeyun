a = {}
print(type(a))

a = dict()
print(type(a))

# {key:value}
a = {"name":"홍길동","age":30}
print(a)
# key : 순서를 가지지 않고 중복값을 허용하지 않음
# value : 중복 가능

# 원소 추가, 바꾸기
print(a["name"])
a["name"] = "홍길순" # 이미 key값이 존재하는 경우는 value값을 변경
print(a)
a["addr"] = "부산시" # 없는 key값은 추가
print(a)

# 원소 삭제
del a["name"]
print(a)
a.pop("addr")
print(a)

# 딕셔너리 합치기
a = {"name" : "홍길동"}
b = {"age" : 25}
c = {"addr" : "대전시"}
a.update(b)
print(a)
a.update(c)
print(a)