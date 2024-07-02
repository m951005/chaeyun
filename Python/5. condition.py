a = 3
b = 5
c = 4
if a < b < c:
    print(f"{a}는 {b}보다 작고 {b}는 {c}보다 작다.")
elif a < b and b > c:
    # pass
    print(f"{a}는 {b}보다 작고 {b}는 {c}보다 크다.")
else:
    print("else 실행")

print("프로그램 종료")


str1 = "abcdef"
if "a" in str1:
    print("있음")
else:
    print("없음")

list = ["홍길동", "김개똥", "이말똥"]
if "홍길동" in list:
    print("있음")
else:
    print("없음")
