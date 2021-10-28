from urllib import parse

"""
当url路径或查询参数中带有中文或特殊字符时，需要对url进行编码（采用十六进制编码格式）
url编码原则为使用安全字符去表示不安全字符

安全字符：没有特殊用途或特殊意义的字符
"""
"""
URL基本组成：
url由一些简单组件构成，如协议、域名、端口号、路径、查询字符串等
路径和查询字符串之间使用问号?隔开

URL中规定了一些具有特殊意义的字符，常用来分隔两个不同的url组件，这些字符称为保留字符
冒号: 用于分隔协议和主机组件
斜杠/用于分隔主机和路径
?用于分隔路径和查询参数
=用于表示查询参数中的键值对
&用于分隔查询多个键值对
其余常用保留字符：/  .  ... # @ $ +  ; %
"""

# Python的标准库urllib.parse模块中提供了用来编码和解码的方法
# urlencode()--实现对url地址的编码操作
# unquote()--将编码后的url地址进行还原，被称为解码

# 构建查询字符串字典
query_string = {
    'wd': '爬虫'
}

# 调用parse模块urlencode()进行编码
result = parse.urlencode(query_string)

# 使用format函数格式化字符串，拼接url地址
url = 'http://www.baidu.com/s?{}'.format(result)

print(url)
# 编码后的url: http://www.baidu.com/s?wd=%E7%88%AC%E8%99%AB

# 也可以使用quote(string)方法实现编码
# 使用quote()方法时，url的书写方式有些不同
url = 'http://www.baidu.com/s?wd={}'

# word = input("输入搜索内容：")
word = '熊猫'

# quote()只能对字符串进行编码
query_str = parse.quote(word)

print(url.format(query_str))

# 解码是对编码后的URL进行还原的一种操作
string = '%E7%88%AC%E8%99%AB'

result = parse.unquote(string)

print(result)

"""
三种拼接URL地址的方法
"""
# 1 字符串相加
baseurl = 'http://www.baidu.com/s?'
params = 'wd=%E7%88%AC%E8%99%AB'
url = baseurl + params
print(url)

# 2 字符串格式化(占位符)
params = 'wd=%E7%88%AC%E8%99%AB'
url = 'http://www.baidu.com/s?%s' % params
print(url)

# 3 format方法
url = 'http://www.baidu.com/s?{}'
params = 'wd=%E7%88%AC%E8%99%AB'
url = url.format(params)
print(url)
