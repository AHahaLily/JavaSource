from urllib import request
from ua_pool_exam import ua_list
import re
import pymysql
import random
import time


class StoreSpider(object):
    def __init__(self):
        self.url = 'https://maoyan.com/board/4?offest={}'
        # 数据库连接对象
        self.db = pymysql.connect(
            host='localhost',
            user='root',
            password='root',
            database='python db')
        # 创建游标对象
        self.cursor = self.db.cursor()

    def get_html(self, url):
        headers = {'User-Agent': random.choice(ua_list)}
        req = request.Request(url=url, headers=headers)
        res = request.urlopen(req)
        html = res.read().decode()
        self.parse_html(html)

    def parse_html(self, html):
        print(html)

        r = '<div class="movie-item-info">.*?title="(.*?)".*?<p\
                  class="star">(.*?)</p>.*?class="releasetime">(.*?)</p>'

        pattern = re.compile(r, re.S)

        rlist = pattern.findall(html)

        print(rlist)

        self.save_html(rlist)

    def save_html(self, rlist):
        List = []
        sql = 'insert into filmtab values(%s,%s,%s)'

        # 整理数据
        for r in rlist:
            res = (r[0].strip(), r[1].strip()[3:], r[2].strip()[5:15])
            List.append(res)
            print(List)

        self.cursor.executemany(sql, List)
        self.db.commit()

        # 发生错误则回滚
        self.db.rollback()

    def run(self):
        for offset in range(0, 11, 10):
            url = self.url.format(offset)
            self.get_html(url)
            time.sleep(random.uniform(1, 3))

        # 断开游标与数据库的连接
        self.cursor.close()
        self.db.close()


if __name__ == '__main__':
    start = time.time()
    spider = StoreSpider()
    spider.run()
    end = time.time()
    print("执行时间:%.2f" % (end - start))
