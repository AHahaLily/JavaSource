#最简单和初级的爬虫程序

import urllib.request
#from urllib import request

#使用urllib打开百度网页地址，返回响应对象
response=urllib.request.urlopen("https://www.baidu.com")

#提取响应内容
#调用response响应对象的read()方法提取HTML信息，返回的结果是字节串类型
#使用decode()可以将字节串转换为字符串
html=response.read().decode('utf-8')

print(html)


"""
总结：
1 urlopen()方法表示向网站发起请求并获取响应对象
urllib.request.urlopen(url,timeout)

参数：
    url--表示要爬取数据的url地址
    timeout--设置等待超时时间，指定时间内未得到响应则抛出超时异常

2 Request()方法用于创建请求对象、包装请求头，如重构User-Agent(用户代理，即用户使用的浏览器)
urllib.request.Request(url,headers)
参数：
    URL--请求的URL地址
    headers--重构请求头

3 html响应对象方法
bytes=response.read()   返回bytes数据类型
string=response.read().decode()     将返回的字节串转换为string类型
url=response.geturl()   返回响应对象的URL地址
code=response.getcode() 

4 编码解码操作
#字符串转换为字节码
string.encode("utf-8")

#字节码转换为字符串
bytes.decode("utf-8")

"""