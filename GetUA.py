from urllib import request

#response=urllib.request.urlopen('https://httpbin.org/get')

#html=response.read().decode()

#print(html)

"""
返回的User Agent是：Python-urllib/3.7，表明是爬虫程序在访问网站
因此需要重构User Agent，将其伪装为浏览器访问网站

"""

#重构爬虫UA信息
url='http://httpbin.org/get'

headers={
    'user-Agent':'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.81 Safari/537.36'
}

req=request.Request(url=url,headers=headers)

res=request.urlopen(req)

html=res.read().decode('UTF-8')

print(html)

"""
通过重构UA解决了网站通过识别User Agent封杀爬虫程序的问题
重构UA也可以通过其他模块实现，如request模块
"""