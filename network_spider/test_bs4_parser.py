from bs4 import BeautifulSoup

html_doc="""
<html><head><title>"c语言中文网"</title></head>
<body>
<p class="title"><b>c.biancheng.net</b></p>
<p class="website">一个学习编程的网站
<a href="http://c.biancheng.net/python/" id="link1">python教程</a>
<a href="http://c.biancheng.net/c/" id="link2">c语言教程</a>
"""

# 创建beatiful soup对象
soup=BeautifulSoup(html_doc,'lxml')

# prettify()方法格式化输出html/xml文档
print(soup.prettify())
