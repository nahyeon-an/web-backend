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
```
