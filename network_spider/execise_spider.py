"""
编写爬虫程序前需要确定页面类型：静态或动态、找出页面url规律、通过分析网页元素结构确定正则表达式、提取信息
"""
# 1 确定页面类型
# 点击右键查看页面源码，确定要抓取的数据是否包含在页面内
# 若要抓取的信息全部存在于源码中，则页面属于静态页面

# 2 确定url规律
# 要确定url规律，需要多浏览几页，才能总结url规律

# 3 确定正则表达式
# 编写正则表达式时需要提取的信息用(.*?)代替，而不需要内容包括元素标签使用.*?

from urllib import request
import time
import re
import csv
import random
from ua_pool_exam import ua_list


class MaoyanSpider(object):
    def __init__(self):
        self.url = 'https://maoyan.com/board/4?offset={}'

    def get_html(self, url):
        headers = {'User-Agent': random.choice(ua_list)}

        req = request.Request(url=url, headers=headers)

        res = request.urlopen(req)

        html = res.read().decode()

        self.parse_html(html)

    def parse_html(self, html):
        regex = '<div class="movie-item-info">.*?title="(.*?)".*?<p class="star">(.*?)</p>.*?class="releasetime">(.*?)</p>'

        pattern = re.compile(regex, re.S)

        rlist = pattern.findall(html)

        self.save_html(rlist)

    def save_html(self, rlist):
        with open('maoyan.csv', 'w', newline='', encoding='utf-8') as f:
            writer = csv.writer(f)

            for r in rlist:
                name = r[0].strip()
                star = r[1].strip()[3:]
                time = r[2].strip()[5:15]
                L = [name, star, time]

                writer.writerow(L)

                print(name, time, star)

    def run(self):
        for offset in range(0, 11, 10):
            url = self.url.format(offset)
            self.get_html(url)
            time.sleep(random.uniform(1, 2))


if __name__ == '__main__':
    try:
        spider = MaoyanSpider()
        spider.run()
    except Exception as e:
        print("Error:", e)
