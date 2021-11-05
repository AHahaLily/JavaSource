"""
有时抓取单级界面无法成功提取数据，需要抓取多级界面

一级界面：提供获取二级界面的访问链接
二级界面: 作为详情页提取所需的数据

一级界面以<a>标签的形式链接到二级界面，只有在二级界面才能提取到所需数据

"""

from typing import Pattern
from urllib import request
import re
import random
import time
import pymysql
from hashlib import md5
from ua_pool_exam import ua_list
import sys

class MovieSpider(object):
    def __init__(self):
        self.url='https://www.dytt8.net/html/gndy/dyzz/list_23_{}.html'
        self.db=pymysql.connect(host='localhost',username="RootAdmin",password="Password01!",database="movieskydb",charset='utf8')
        self.cursor=self.db.cursor()

    # 请求函数
    def get_html(self,url):
        headers={'User-Agent':random.choice(ua_list)}
        req=request.Request(url=url,headers=headers)
        res=request.urlopen(req)
        html=res.read().decode('gb2312','ignote')

        return html

    # 正则解析函数
    def re_func(self,re_dbs,html):
        pattern=re.compile(re_dbs,re.S)
        rlist=pattern.findall(html)
        return rlist

    
