# import
# 모듈은 파이썬 코드를 작성해 놓은 스크립트 파일
# 스크립트 파일에는 클래스, 함수, 변수 등이 정의되어 있다.
# 외부 모듈을 가져와서 사용할 때는 import 명령을 사용한다.

import math
print(math.sqrt(2))     # 제곱근을 구하는 함수
print(math.pow(2, 3))   # 2의 3승
# 주요함수
# ceil(x): 올림
# floor(x): 내림
# fabs(x): 절대값
# trunc(x): 소수점 이하 버림

import os
print(os.getcwd())  # 현 경로정보 출력
os.system("clear")
# print(os.listdir(""))

import time
before = time.time()
print(before)
# time.sleep(1)
after = time.time()
print(after - before)

import datetime
now = datetime.datetime.now()
print(now)
print(now.year)
print(now.month)
print(now.date())

import calendar
print(calendar.calendar(2024))
print(calendar.month(2024, 1))

import random
print(random.random())
print(random.randint(1, 5)) # 1 ~ 5사이의 정수값을 랜덤하게 생성

a = ["가위", "바위", "보"]
print(random.choice(a))
random.shuffle(a)
print(a)