"""
使用re模块解析网页实现信息提取

re模块常用方法：
1 re.complile()方法用于生成正则表达式对象，语法格式：
regex=re.compile(pattern,flags=0)

pattern--正则表达式对象
flags--代表功能的标志位，扩展正则表达式的匹配

2 re.findall()方法用于根据正则表达式匹配目标字符串内容，语法格式：
re.findall(pattern,string,flags=0)
函数返回值是匹配到的内容列表，如果正则表达式有子组，则只能获取到子组对应的内容

pattern--正则表达式对象
string--目标字符串
flags--代表功能的标志位，扩展正则表达式的匹配

3 regex.findall()函数根据正则表达式对象匹配目标字符串内容，语法格式：
regex.findall(string,pos,endpos)

string--目标字符串
pos--截取目标字符串的开始匹配位置
endpos--截取目标字符串的结束匹配位置

4 re.split()函数使用正则表达式匹配内容，切割目标字符串，返回值是切割后的内容列表，语法如下：
re.split(pattern,string,flags=0)

pattern--正则表达式
string--目标字符串
flags--功能标志位，扩展正则表达式的匹配

5 re.sub()函数使用一个字符串替换正则表达式匹配到的内容，返回值是替换后的字符串，语法格式如下：
re.sub(pattern,replace,string,max,flags=0)

pattern--正则表达式
replace--替换的字符串
string--目标字符串
max--最多替换几处，默认替换全部
flags--功能标志位，扩展正则表达式的匹配

5 re.search()函数匹配目标字符串第一个符合的内容，返回值为匹配对象，语法如下：
re.search(pattern,string,flags=0)

pattern--正则表达式
string--目标字符串

flags功能标志位：
缩写元字符A--元字符只能匹配ASCII码
缩写元字符I--匹配忽略大小写
缩写元字符S--使得.元字符可以匹配换行符
缩写元字符M--使^$可以匹配每一行的开头和结尾

可以同时使用多个功能标志位，如flags=re.I|re.S

"""

import re

html = """<div><p>www.baidu.com</p></div>
<div><p>百度</p></div>"""

# 创建正则表达式对象，以贪婪模式进行匹配
pattern = re.compile('<div><p>.*</p></div>', re.S)

# 匹配HTML元素并提取信息
re_list = pattern.findall(html)

print(re_list)

# 创建正则表达式对象，以非贪婪模式进行匹配
pattern_less = re.compile('<div><p>.*</p></div>', flags=0)

re_list_less = pattern_less.findall(html)

print(re_list_less)

# 正则表达式分组
website = '编程帮 www.biancheng.net'

# 提取信息
pat_ret = re.compile('\\w+\\s+\\w+\\.\\w+\\.\\w+')

print(pat_ret.findall(website))

# 提取匹配信息的第一项
pat_one = re.compile('(\\w+)\\s+\\w+\\.\\w+\\.\\w+')

print(pat_one.findall(website))

# 有两个以上的()，则以元组形式显示
pat_two = re.compile('(\\w+)\\s+(\\w+\\.\\w+\\.\\w+)')

print(pat_two.findall(website))
