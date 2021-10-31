import csv
"""
CSV文件又称逗号分隔值文件，是一种通用的、简单的文件格式
CSV可以用于存储表格数据，包括数字或字符
CSV文件是电子表格和数据库中最常见的输入、输出文件格式

将爬虫爬取的数据保存在文件或数据库中的过程称为数据的持久化存储

"""
"""
csv模块中csv.write()可用于读写序列化的数据，语法如下:
writer(csvfile,dialect='excel',**fmtparam)

csvfile--支持迭代的对象，可以是文件(file)对象或列表(list)对象
dialect--编码风格，默认为excel的风格，使用,分隔
fmtparam--格式化参数，用于覆盖dialect对象指定的编码风格
"""

# CSV文件写入
# 操作文件对象，添加newline参数逐行写入，否则会出现空行现象
with open('net.csv', 'w', newline='') as csvfile:
    # delimiter参数指定分隔符，默认为逗号
    # quoterchar表示引用符
    spamwriter = csv.writer(csvfile, delimiter=' ', quotechar='|')
    spamwriter.writerow(['www.baidu.com'] * 5 + ['hello world'])
    spamwriter.writerow(['hello', 'website', 'Just a little test'])

with open('net.csv', 'w', newline='') as f:
    writer = csv.writer(f)

    writer.writerows([('hello', 'world'), ('I', 'love', 'you')])
"""
也可使用DictWriter类以字典形式读写数据
"""
with open('name.csv', 'w', newline='') as csv_file:
    fieldnames = ['firstname', 'middlename', 'lastname']

    writer = csv.DictWriter(csv_file, fieldnames=fieldnames)

    # 写入字段名称作为表头
    writer.writeheader()

    writer.writerows([{
        'firstname': 'Baked',
        'middlename': 'I',
        'lastname': 'Beans'
    }, {
        'firstname': 'Lovely',
        'middlename': 'H',
        'lastname': 'Spam'
    }])

# CSV文件读取
"""
csv.reader()可用于读取文件，reader()语法如下：
csv.reader(csvfile,dialect='execl',**fmtparam)
"""
with open('name.csv', 'r', newline='') as ff:
    reader = csv.reader(ff, delimiter=' ', quotechar='|')
    for r in reader:
        print(','.join(r))

# csv.DictReader()读取文件
with open('name.csv', 'r', newline='') as fff:
    reader = csv.DictReader(fff)
    for r in reader:
        print(r['firstname'], r['middlename'], r['lastname'])
