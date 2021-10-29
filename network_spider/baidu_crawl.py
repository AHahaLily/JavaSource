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

    # 重构请求头并向发送请求
    def get_html(self, url):
        req = request.Request(
            url=url, headers={'User-Agent': random.choice(ua_list)})
        res = request.urlopen(req)

        html = res.read().decode("gbk", "ignore")
        return html

    # 解析
    def parse_html(self):
        pass

    # 保存至本地
    def save_html(self, filename, html):
        with open(filename, 'w') as f:
            f.write(html)

    def run(self):
        name = '爬虫吧'
        begain = 2
        stop = 4

        for page in range(begain, stop + 1):
            pn = (page - 1) * 50

            # 查询字符串字典
            params = {'kw': name, 'pn': str(pn)}

            # 编码查询字符串字典
            params = parse.urlencode(params)

            # 使用format拼接url
            url = self.url.format(params)

            # 调用get_html发送请求
            html = self.get_html(url)

            filename = '{}-{}页.html'.format(name, page)

            # 调用save_html方法保存抓取结果
            self.save_html(filename, html)

            print('第%d页抓取成功' % page)

            # 每爬取一个页面会随机休眠1-2秒，模拟真人访问网站
            time.sleep(random.randint(1, 2))


# 程序运行的入口
if __name__ == '__main__':
    start = time.time()

    spider = TieBaSpider()

    spider.run()

    end = time.time()

    print('执行时间:%.2f' % (end - start))
