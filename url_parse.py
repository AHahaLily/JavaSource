"""
当URL路径或查询参数中，带有中文或特殊字符时，需要进行编码（采用十六进制编码格式）
URL编码原则：使用安全的字符表示那些不安全的字符

安全字符：没有特殊用途或特殊意义的字符

URL基本组成：
URL由协议、域名、端口号、路径、查询参数等组件构成

URL中规定了一些具有特殊意义的字符，用于分隔两个不同的URL组件，这些字符称为保留字符。
冒号--用于分隔协议和主机
斜杆--用于分隔主机和路径
?--用于分隔路径和查询参数
=--用于分隔查询参数中的键和值
&--用于连接多个查询参数

字符编码：
为了避免URL中的某些字符引起歧义，组要对URL进行编码
URL采用ASCII字符集而非Unicode字符集，对于URL中的任何非ASCII字符都需要编码

URL使用RFC3986作为编码协议：URL中只允许使用ACSII字符集可以显示的字符，如字母、数字、-_~.!*

除了非ASCII字符集中可显示字符外，还需要对URL中的保留字和不安全字符进行编码

部分字符编码:
+   URL中+号表示空格，十六进制编码为%2B
空格 URL中空格可以编码为+或者%2B，十六进制编码为%20
/   分隔目录和子目录，十六进制编码为%2F
?   分隔路径和参数，十六进制编码为%3F
%   指定特殊字符，十六进制编码为%25
#   表示书签，十六进制编码为%23
&   URL中指定的参数间的分隔符，十六进制编码为%26
=   URL中指定参数的值，十六进制编码为%3D

总结，以下三种情况字符需要编码：
ASCII表中没有对应的可显示字符，如汉字
不安全字符，包括#"%<>[]{}|\^`
部分保留字符，即&/:'=?@

"""
"""
Python标准库urllib.parse模块提供urlencode和unquote方法进行编码和解码/还原
"""
from urllib import parse

# 构建查询字符串字典
query_string={
    'wd':'爬虫'
}

# 调用urlencode方法进行编码
result =parse.urlencode(query_string)

print(result)

# 编码的另一种方法quote
url='http://baidu.com/s?wd={}'

word = '爬虫'

# quote方法只能对字符串进行编码
str=parse.quote(word)

print(url.format(str))

# 使用unquote进行解码
string ="%E7%88%AC%E8%99%AB'"

decode_res=parse.unquote(string)

print(decode_res)

# 三种拼接URL地址的方式
# 方式1 字符串相加
baseurl='http://baidu.com/s?'

params="wd=%E7%88%AC%E8%99%AB"

url=baseurl+params

print(url)

# 方式2 字符串格式化（占位符）
str_url='http://baidu.com/s?%s'%params

print(str_url)

# 方式3 format方法
formt_url='http://baidu.com/s?{}'

format_res=formt_url.format(params)

print(format_res)