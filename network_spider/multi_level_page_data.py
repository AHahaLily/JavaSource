"""
有时抓取单级界面无法成功提取数据，需要抓取多级界面

一级界面：提供获取二级界面的访问链接
二级界面: 作为详情页提取所需的数据

一级界面以<a>标签的形式链接到二级界面，只有在二级界面才能提取到所需数据

"""

from urllib import request
import re
import random
import time
import pymysql
from hashlib import md5
from ua_pool_exam import ua_list
import sys
