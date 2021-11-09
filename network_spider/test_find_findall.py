from bs4 import BeautifulSoup
import re

html_doc="""
<html><head><title>"c语言中文网"</title></head>
<body>
<p class="title"><b>c.biancheng.net</b></p>
<p class="website">一个学习编程的网站</p>
<a href="http://c.biancheng.net/python/" id="link1">python教程</a>
<a href="http://c.biancheng.net/c/" id="link2">c语言教程</a>
<a href="http://c.biancheng.net/django/" id="link3">django教程</a>
<p class="vip">加入我们阅读所有教程</p>
<a href="http://vip.biancheng.net/?from=index" id="link4">成为vip</a>
"""

# 创建Beautiful Soup对象
soup=BeautifulSoup(html_doc,'lxml')

# 查找并返回所有a标签
print(soup.find_all("a"))

# 只返回两条a标签
print(soup.find_all("a",limit=2))

# 按照标签属性及属性值查找html文档
print(soup.find_all("p",class_="website"))

# 测试find方法
soup=BeautifulSoup(html_doc,'lxml')

# 查找第一个a并直接返回结果
print(soup.find('a'))

# 查找title
print(soup.find('title'))

# 匹配指定href属性的a标签
print(soup.find('a',href='http://c.biancheng.net/python/'))

# 根据属性值正则匹配
print(soup.find(class_=re.compile('tit')))

# attrs参数值
print(soup.find(attrs={'class':'vip'}))
