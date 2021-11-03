import mysql.connector


try:
    connection = mysql.connector.connect(host='localhost',
                                         database='filmtab',
                                         user='RootAdmin',
                                         password='Password01!')
    if connection.is_connected():
        db_Info = connection.get_server_info()
        print("Connected to MySQL Server version ", db_Info)
        cursor = connection.cursor()
        cursor.execute("select database();")
        record = cursor.fetchone()
        print("You're connected to database: ", record)

finally:
    if connection.is_connected():
        cursor.close()
        connection.close()
        print("MySQL connection is closed")