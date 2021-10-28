"""
python爬虫实例：抓取网页，并将其保存至本地计算机

爬虫程序分三个部分：
拼接url地址
发送请求
将照片保存至本地
"""

from urllib import request
from urllib import parse

# 拼接url地址
url = 'http://www.baidu.com/s?wd={}'

word = "玫瑰"

params = parse.quote(word)

full_url = url.format(params)

print(full_url)

# 向url发送请求
"""
发送请求步骤：
创建请求对象-Request
获取响应对象-urlopen
获取响应内容-read
"""

headers = {
    'User-Agent': 'Mozilla/5.0 (Windows NT 6.1; WOW64; rv:6.0) Gecko/20100101\
    Firefox/6.0'
}

req = request.Request(url=full_url, headers=headers)

res = request.urlopen(req)

html = res.read().decode('utf-8')

# 保存为本地文件
# 将爬取的照片存至本地需要使用python的文件IO操作
filename = word + '.html'

with open(filename, 'w', encoding='utf-8') as f:
    f.write(html)
