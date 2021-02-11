### 데이터베이스 생성
```
create database project_b;
```

<br>

### 권한 부여
```
grant all privileges on project_b.* to 'projectuser'@'%' with grant option;
flush privileges;
```

<br>

### 스키마 생성
```
mysql -u projectuser -p project_b < ddl.sql
```

<br>

### 스키마 수정
```
alter table guestbook add name varchar(100) not null after id;
```

<br>

![생성된 스키마](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FrxuLP%2FbtqWX5DYF41%2FLyr5CGObghoBCQHX0kYbX1%2Fimg.png)
