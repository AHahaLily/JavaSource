"""
除了自定义UA池，还可以使用专门的第三方模块随机获取浏览器UA信息
模块需通过以下方式单独安装：pip install fake-useragent
"""
from fake_useragent import UserAgent
import ua_pool_exam
import random

# 实例化一个对象
# 会进行网络读取，需要翻墙
# 如果无法翻墙可能得到 fake_useragent.errors.FakeUserAgentError: Maximum amount
# of retries reached的错误
# ua = UserAgent()
# 通过使用本地存储ua信息的文件来解决此问题
ua = UserAgent(path=r"E:\pythongram\1028\Spider\agent.json")

# 随机获取一个浏览器
print(ua.random)

# 从自定义UA池获取一个浏览器
len = len(ua_pool_exam.ua_list)-1
rand = random.randint(0, len)
print(ua_pool_exam.ua_list[rand])
