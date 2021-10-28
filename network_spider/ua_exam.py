"""
User-Agent即用户代理，是一个特殊字符串头
网站服务器通过识别UA确定用户操作系统、CPU类型、浏览器版本等信息
网站服务器在通过判断UA给客户端发送不同页面

网站服务器也会通过识别请求头中UA判断是否是爬虫访问网站
如果判断是爬虫，网站首先对IP进行预警，对其进行重点监控
当发现该IP超过短时间内的访问次数，将在一段时间内禁止其再次访问
"""
# tips:可以通过在线识别工具获取本机浏览器版本及UA信息
# https://useragent.buyaocha.com/

# 通过向http测试网站发送get请求查看请求头信息，从而获取爬虫程序UA
from urllib import request

# response = request.urlopen('http://httpbin.org/get')

# html = response.read().decode()

# print(html)
"""
执行结果：
{
  "args": {},
  "headers": {
    "Accept-Encoding": "identity",
    "Host": "httpbin.org",
    "User-Agent": "Python-urllib/3.6",  #UA是爬虫程序
    "X-Amzn-Trace-Id": "Root=1-6173784b-382a4fdf7418c15117476cf0"
  },
  "origin": "49.80.222.8",
  "url": "http://httpbin.org/get"
}
"""

"""
注意事项：
httpbin.org网站可以测试http请求和响应的各种信息，如cookie、ip、headers和登录验证
支持get、post等多种方法
"""

# 使用urllib.request.Request()方法重构UA
# 通过重构UA字符串信息，解决了网站通过识别UA封杀爬虫请求的问题
# 重构UA仅是应对反爬策略的第一步
url = 'http://httpbin.org/get'

headers = {
    'User-Agent': 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10.12; rv:65.0) \
    Gecko/20100101 Firefox/65.0'
}

req = request.Request(url=url, headers=headers)

res = request.urlopen(req)

html = res.read().decode('utf-8')

print(html)
