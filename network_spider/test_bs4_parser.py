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

# 获取p标签的html代码
print(soup.p)

# 获取b标签代码
print(soup.p.b)

# 获取p标签内容
print(soup.p.text)

# 返回属性和值组成的字典
print(soup.p.attrs)

# 返回数据类型
print(type(soup.p))

# 根据属性返回属性值，返回值为列表
print(soup.p['class'])

# 给class属性赋值，属性值由列表转换为字符串
soup.p['class']=['Web','Site']
print(soup.p)