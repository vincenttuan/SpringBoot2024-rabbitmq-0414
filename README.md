<pre>
# 下載安裝與設定:
安裝 erlang 語言執行環境
https://www.erlang.org/downloads

安裝 rabbitmq    
https://www.rabbitmq.com/docs/install-windows
下載: rabbitmq-server-3.13.1.exe.asc 並安裝

# 環境變數
在 path 加入 C:\Program Files\RabbitMQ Server\rabbitmq_server-3.13.1\sbin

# 開啟 RabbitMQ Web Manager
指令: rabbitmq-plugins enable rabbitmq_management
透過 http://localhost:15672/ 可以看到管理者頁面

# 啟動 RabbitMQ
指令: rabbitmq-service start

# 關閉 RabbitMQ
指令: rabbitmq-service stop

RabbitMQ Server : 5672
RabbitMQ Management Portal : 15672
帳號: guest 
密碼: guest

# pom.xml
&lt;dependency&gt;
    &lt;groupId&gt;org.springframework.boot&lt;/groupId&gt;
    &lt;artifactId&gt;spring-boot-starter-amqp&lt;/artifactId&gt;
&lt;/dependency&gt;

</pre>
