import requests
from bs4 import BeautifulSoup
import datetime
import pandas


def get_news(start_date, end_date):

    s_date = start_date.strftime('%Y%m%d')
    e_date = end_date.strftime('%Y%m%d')
    day = end_date - start_date

    result = []

    for i in range((day.days)):
        date = start_date + datetime.timedelta(days=i)
        reg_date = date.strftime('%Y%m%d')

        url = 'https://news.daum.net/newsbox'
        for j in range(1, 500):
            page = j
            response = requests.get(url=url, params={'regDate': reg_date, 'page': page})
            bs = BeautifulSoup(response.text, 'html.parser')

            trs = bs.select('.list_arrange li')
            if len(trs) < 1:
                break

            for tr in trs:
                # print(tr)
                # 제목
                title = tr.select_one('strong > a').text
                # print(title)
                
                # 링크
                link = tr.find('a').get('href')
                # print(link)

                # 언론사
                info_news = tr.find('span').text
                # print(info_news)

                print([reg_date, page, title, link, info_news])
                result.append([reg_date, page, title, link, info_news])
        
    return result


start = datetime.datetime(2024, 1, 1)
end = datetime.datetime(2024, 1, 2)
# print(today.strftime('%Y%m%d'))
news = get_news(start, end)

column = ['등록일', '페이지', '제목', '링크', '언론사']
dataframe = pandas.DataFrame(news)
# print(dataframe)
dataframe.to_excel('news.xlsx', sheet_name='다음 뉴스')