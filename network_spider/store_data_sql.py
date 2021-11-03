"""
Python连接并操作MySQL数据库主要通过Pymysql模块实现

基本使用：
1 连接数据库
db=pymysql.connect('localhost',username,password,database)

参数：
localhost--本地MySQL服务端地址，也可以是远程数据库的IP地址
root--连接数据库使用时使用的用户名
password--连接数据库时使用的密码
db--连接的数据库名称

2 创建cursor对象
cursor=db.cursor()

3 执行sql命令
execute()方法用于执行sql语句

4 提交数据
db.commit()

5 关闭数据库
cursor.close()
db.close()
"""

import pymysql

# 创建数据库对象
db = pymysql.connect(host='localhost', user='***', password='***', database='filmtab',charset='utf8')

cursor = db.cursor()

# 单句sql语句执行
info_list = ('你好，李焕英', '贾玲', '2021-2-12')

sql = "insert into filmtab values(%s,%s,%s)"

# 列表传参
res=cursor.execute(sql,info_list)

db.commit()

# 关闭
cursor.close()

db.close()
