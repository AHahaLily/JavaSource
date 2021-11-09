"""
BS4支持大部分CSS选择器，如标签选择器、类选择器、id选择器及层级选择器
Beautiful Soup提供了一个select()方法，通过向该方法添加选择器，可以在HTML文档中搜索到与之对应的名称

"""
from bs4 import BeautifulSoup

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
<p class="introduce">介绍:
<a href="http://c.biancheng.net/view/8066.html" id="link5">关于网站</a>
<a href="http://c.biancheng.net/view/8092.html" id="link6">关于站长</a>
</p>
"""

soup=BeautifulSoup(html_doc,'lxml')

print(soup.select('title'))

print(soup.select('a[href]'))

print(soup.select('p+a'))

print(soup.select('.vip'))

print(soup.select('p ~#link3'))

print(soup.select('p>a'))