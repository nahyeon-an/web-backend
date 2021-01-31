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

![생성된 스키마](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2Flq3pJ%2FbtqVe74wMfv%2FbeqcSq7pmZ9pOCXvZPMvmk%2Fimg.png)
