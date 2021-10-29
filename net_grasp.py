"""
爬虫程序可以由三个部分组成：
拼接url地址
发送请求
保存爬取内容至本地
"""

# 导入需要的模块
from urllib import request
from urllib import parse

# 拼接URL地址
base_url = 'http://www.baidu.com/s?wd={}'

word = '苹果'

params = parse.quote(word)

url = base_url.format(params)

# 向URL发送请求
headers = {
    'User-Agent':
    'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like\
         Gecko) Chrome/94.0.4606.81 Safari/537.36'
}

req = request.Request(url=url, headers=headers)

html = request.urlopen(req)

res = html.read().decode('utf-8')

# 保存结果至本地
filename = word + '.html'

with open(filename, 'w', encoding='utf-8') as f:
    f.write(res)
