"""
以类的形式编写爬虫程序
"""

from urllib import request, parse
import time
import random
from ua_pool_exam import ua_list


# 定义一个爬虫类
class TieBaSpider(object):
    # 初始化url属性
    def __init__(self):
        self.url = 'http://tieba.baidu.com/f?{}'

    def get_html(self, url):
        req = request.Request(url=url, headers={
            'User-Agent': random.choice(ua_list)
            })
        res = request.urlopen(req)

        html = res.read().decode("gbk", "ignore")
        return html

    def parse_html(self):
        pass

    def save_html(self, filename, html):
        with open(filename, 'w') as f:
            f.write(html)

    def run(self):
        name = '爬虫吧'
        begain = 2
        stop = 4

        for page in range(begain, stop+1):
            pn = (page-1)*50
            params = {
                'kw': name,
                'pn': str(pn)
            }

            params = parse.urlencode(params)
            url = self.url.format(params)

            html = self.get_html(url)

            filename = '{}-{}页.html'.format(name, page)

            self.save_html(filename, html)

            print('第%d页抓取成功' % page)

            time.sleep(random.randint(1, 2))


if __name__ == '__main__':
    start = time.time()
    spider = TieBaSpider()
    spider.run()
    end = time.time()

    print('执行时间:%.2f' % (end-start))
