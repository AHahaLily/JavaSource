# 一个简单的爬虫程序

"""
使用Python内置的urllib模块获取网页html信息
urllib库属于Python的标准库模块，无需单独安装，是python爬虫常用模块
"""

# 获取网页信息
# 导入发起请求所需要使用到的urllib库的request模块
import urllib.request

# urlopen()向URL发起请求，返回响应对象
# URL必须完整，必须带有http或https协议
# urlopen()打开一个网页地址
response = urllib.request.urlopen('https://bing.com/')

# print(response)
# 输出urlopen方法返回的响应对象
# 响应对象值为<http.client.HTTPResponse object at 0x01C55490>

# 通过调用response对象的read()方法提取html信息，该方法返回结果为字节串类型（bytes）
# 需要使用decode()方法将字节串转换为字符串
html = response.read().decode('utf-8')

# 返回响应对象url
print(response.geturl())

print(html)

"""
常用方法：
1 urlopen()
向网页发送请求并获取响应对象

urllib.request.urlopen(url,timeout)

参数：
url--表示要爬取数据的url地址
timeout--设置等待超时时间，指定时间内若未得到响应则抛出超时异常

2 Request()
用于创建请求对象、包装请求头，如重构UA
UA，User Agent（用户代理），指用户使用的浏览器

urllib.request.Request(url,hearders)

参数：
url--请求的url地址
headers--重构请求头

3 html响应对象方法
bytes=response.read()   #返回结果为bytes数据类型
string=response.read().decode() #返回结果为string类型
url=response.geturl()   #返回响应对象的url地址
code=response.getcode() #返回请求时的http响应码

4 编码解码操作
# 字符串转换为字节码
string.encode('utf-8')

# 字节码转换为字符串
bytes.decode('utf-8')
"""
