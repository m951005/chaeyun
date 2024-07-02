import urllib.request

# urllib 모듈을 URL파싱, HTTP 요청과 응답 관련 작업을 할 수 있다.
# request: URL을 열고 읽는 모듈
# error: request 모듈에서 발생하는 에러를 포함하는 모듈
# parse: URL을 파싱하는 모듈(URL을 해석 및 조작)
# robotparser: robots.txt 파일을 파싱

url = 'https://www.naver.com'
request = urllib.request.Request(url)
# print(request)
# print(request.full_url)
# print(request.type)
# print(request.host)

response1 = urllib.request.urlopen(request)
# print(response1)
# print(dir(response1))
# print(response1.getheaders())   # 헤더 정보를 튜플의 리스트 형식으로 반환

# read()L urlopen()그로 연 객체르 읽고, 인자로 전달하는 숫자만큼 데이터를 읽는다.(바이트 형색의 데이터)
response2 = urllib.request.urlopen(url)
data = response2.read(20)
# print(data)

# decode(): 바이트 형식의 데이터를 원하는 방식으로 변환(기본 utf-8)
text_data =  data.decode()
# print(text_data)

# urlretrieve: 웹 상의 이미지를 다운로드
img_src = 'https://www.google.com/imgres?imgurl=https%3A%2F%2Fdemo.ycart.kr%2Fshopboth_farm_max5_001%2Fdata%2Feditor%2F1612%2Fcd2f39a0598c81712450b871c218164f_1482469221_493.jpg&tbnid=_JfWdKcmkKMcZM&vet=12ahUKEwjjuuq-8vSDAxX8mlYBHZJUDTQQMygiegQIARB3..i&imgrefurl=https%3A%2F%2Fdemo.ycart.kr%2Fshopboth_farm_max5_001%2Fbbs%2Fview_image.php%3Ffn%3Dhttp%253A%252F%252Fdemo.ycart.kr%252Fshopboth_cosmetics_001%252Fdata%252Feditor%252F1612%252Fcd2f39a0598c81712450b871c218164f_1482469221_493.jpg&docid=0wCjHiGFEzBDqM&w=1024&h=768&q=%EC%9D%B4%EB%AF%B8%EC%A7%80&ved=2ahUKEwjjuuq-8vSDAxX8mlYBHZJUDTQQMygiegQIARB3'
new_name = 'img.jpeg'
# urllib.request.urlretrieve(img_src, new_name)

import urllib.parse

url = 'https://n.news.naver.com/mnews/article/277/0005370493?sid=105'
parse = urllib.parse.urlparse(url)
# urlparse(): URL을 6개로 분리하여 반환
# scheme: 프로토콜
# netloc: 호스트
# path: 경로
# params: 사용하지 않음
# query: 쿼리파라미터
# fragment: #, 프래그먼트 식별자
# print(parse)

# urlsplit(): URL을 5개로 분리하여 튜플로 반환
parse2 = urllib.parse.urlsplit(url)
# print(parse2)

# urlunparse(), urlunsplit(): 분리된 URL을 다시 합친다.
unparse = urllib.parse.urlunparse(parse)
# print(unparse)
unsplit = urllib.parse.urlunsplit(parse2)
# print(unsplit)

# print(type(parse.query))  # 쿼리파라미터 (str class 타입)

# query을 파싱하여 딕셔너리 형태로 반환
qs = urllib.parse.parse_qs(parse.query)
# print(qs)

# query을 파싱하여 튜플의 리스트 형태로 반환
qsl = urllib.parse.parse_qsl(parse.query)
# print(qsl)

# urljoin(a, b): a와 b URL을 합쳐주는 기능
url = 'https://www.naver.com/a/b'
print(urllib.parse.urljoin(url, 'c'))   # 상대경로 방식으로 붙음
print(urllib.parse.urljoin(url, '/c'))  # 절대경로 방식으로 붙음

url = 'https://search.naver.com/search.naver?query=%EC%95%84%EC%9D%B4%ED%8F%B0'

response = urllib.request.urlopen(url)
byte_data = response.read()
text_data = byte_data.decode()
print(text_data)
# print(urllib.parse.quote('아이폰'))   # 한글을 퍼센트문자로 변환