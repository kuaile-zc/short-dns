FROM majiajue/jdk1.8
ENV JAVA_OPTS=""
ENV JAR="short-dns-1.0-SNAPSHOT.jar"
ENV envFile="dev"

#将当前client.jar 复制到容器根目录下
ADD camel-engine-core/target/$JAR $JAR

#暴露容器端口
EXPOSE 8090
#容器启动时执行的命令
CMD java -jar $JAVA_OPTS -jar $JAR --spring.profiles.active=$envFile
