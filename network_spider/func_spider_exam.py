"""
函数式编程：网络爬虫实例
"""
from urllib import request
from urllib import parse


def get_url(word):
    url = 'http://www.baidu.com/s?{}'
    params = parse.urlencode({'wd': word})
    url = url.format(params)
    return url


def request_url(url, filename):
    headers = {
        'User-Agent': 'Mozilla/5.0 (Windows NT 6.1; WOW64; rv:6.0) Gecko/\
            20100101 Firefox/6.0'
    }

    req = request.Request(url=url, headers=headers)

    res = request.urlopen(req)

    html = res.read().decode('utf-8')

    with open(filename, 'w', encoding='utf-8') as f:
        f.write(html)


# 主程序入口
if __name__ == '__main__':
    word = '天空'
    url = get_url(word)
    filename = word + '.html'
    request_url(url, filename)
