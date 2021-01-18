### 데이터베이스 생성
```
create database project_a;
```

<br>

### 계정 생성
```
create user 'projectuser'@'%' identified by 'projuser123!@#';
```

<br>

### 권한 부여
```
grant all privileges on project_a.* to 'projectuser'@'%' with grant option;
flush privileges;
```

<br>

### 스키마 생성
```
mysql -u projectuser -p project_a < ddl.sql
```
