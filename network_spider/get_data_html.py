import re

html = """
<div class="movie-item-info">
<p class="name">
<a title="你好，李焕英">你好，李焕英</a>
</p>
<p class="star">
主演：贾玲,张小斐,沈腾
</p>
</div>
<div class="movie-item-info">
<p class="name">
<a title="刺杀，小说家">刺杀，小说家</a>
</p>
<p class="star">
主演：雷佳音,杨幂,董子健,于和伟
</p>

</div>
"""

# 寻找html规律，使用正则表达式分组提取信息
pattern = re.compile(r'<div.*?<a title="(.*?)".*?star">(.*?)</p.*?div>', re.S)

re_list = pattern.findall(html)

print(re_list)

# 整理数据
if re_list:
    for info in re_list:
        print("影片名称：", info[0])
        print("影片主演：", info[1].strip())
        print(20 * "*")
