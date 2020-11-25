FROM mysql:latest
ENV MYSQL_ROOT_PASSWORD password
ENV MYSQL_DATABASE Regalia_Ordering_System
ENV MYSQL_USER steve
ENV MYSQL_PASSWORD password
ADD db.sql /docker-entrypoint-initdb.d
EXPOSE 3306
