"""
使用Pyhton内置模块md5生成加密指纹
"""

from hashlib import md5

# 待加密的url
url='https://www.runoob.com/python/python-mysql.html'

# 生成MD5对象
secret=md5()

# 加密url
secret.update(url.encode())

# 提取十六进制加密串
finger=secret.hexdigest()

print(finger)