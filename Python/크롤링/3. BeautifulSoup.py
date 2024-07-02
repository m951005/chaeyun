# BeautifulSoup: 웹 페이지 내의 데이터를 쉽게 추출할 수 있도록 도와주는 라이브러리

import requests
from bs4 import BeautifulSoup

url = 'https://www.google.com'
response= requests.get(url)
html = response.text
print(html)
soup = BeautifulSoup(html, 'html.parser')

print(soup.title)   # <title> 태그 전체 내용을 가져온다.
print(soup.title.name)  # <title> 태그의 이름을 가져온다.
print(soup.title.string)  # <title> 태그의 내용을 가져온다.

print(soup.img) # 첫 번째 img 태그 정보를 가져온다.
print(soup.img['id'])
print(soup.img['width'])

# find(): HTML의 해당 태그에 대한 첫번째 정보를 가져온다.
print(soup.find('a'))
print(soup.find(id='hplogo'))

# find_all(): HTML의 해당 태그에 대한 모든 정보를 리스트 형식으로 가져온다.
print(soup.find_all_next('a'))
print(len(soup.find_all('a')))  # a태그 갯수
print(soup.find_all('a', limit=2))  # 가져올 갯수 지정 limit
print(soup.find_all('a')[0])    # 인덱스 지정

# css 속성으로 필터링
print(soup.find_all('span'))
print(soup.find_all('span', class_='gbi'))
print(soup.find_all('span', attrs={'class': 'gbi'}))

# select_one(), select(): CSS 선택자를 이용해서 원하는 정보를 가져옴
print(soup.select_one('a'))
print(soup.select_one('body a'))
print(soup.select('a'))
print(soup.select('div > a'))

# get_text(): 검색 결과에서 태그를 제외하고 텍스트만 출력
data = soup.find('a')
print(data)
print(data.get_text())