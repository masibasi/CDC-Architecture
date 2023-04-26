# CDC-Architecture
# Overlook

![image](https://user-images.githubusercontent.com/60805546/234344933-f8e42995-2cc6-484b-bd82-a940e7ea57d4.png)
![image](https://user-images.githubusercontent.com/60805546/234344976-2b2dc457-96f4-4bcd-8b55-7f23c7347880.png)

## 목적 및 개요

> **1. Docker, Kafka, Debezium Engine을 기반으로 CDC 구현.**
기반 CDC 구조를 구축한 뒤 Source Database조작과 변동사항이 적용된SInk Database 확인의 접근이 가능하도록
**2. Front & Back End 연결 : React → Spring → DB 구조를 구축하는 것.
3. Source DB에 두개의 테이블을 생성. 각각의 변동사항을 각각Target DB 두개로 전송하도록 CDC구현하였음
4. 각각의 DB는 각각의 Spring Server를 통해 JPA로 접근이 가능하도록 구현
5. 각 Spring Server에는 REST API로 접근하도록 React Front-page를 구현**

**CDC :** 
**MySQL** → kafka Connect(Source Connector, Debezium) → **Kafka** → kafka Connect(JDBC Sink Connector) → **Mysql

Front & Back :
React**(Axios) → **Spring1**, **Spring2, Spring3**(JPA) → **MySQL1**(SourceDB), **MySQL2**(SinkDB1) ,**MySQL3**(SinkDB2)
>

## 목차

### 1. SourceDB → Connector → Kafka

### 2. Kafka → JDBC connector → SinkDB1

### 2-1. Kafka → JDBC connector → SinkDB2

### 3. Spring → MySQL 연동

### 4. React → Spring 연동

### 5. TroubleShooting

# 0. 진행 환경

- Macbook Air (M1) Docker



# 느낀점

CDC, 카프카, 데베지움, JDBC등 **개념이 확실치 않은 상태**에서 실습을 진행해보니 한줄 집어넣을 떄 마다 에러가 생겼다

**실습환경의 문제인 줄 알고** 로컬 (mac m1), VM(Ubuntu 20.04)등 환경을 옮겨가며 진행해봤는데 계속 에러가 나고 고쳐지지 않아 4번정도 엎은 것 같다.

무지성으로 따라가기보다 **천천히 해보자는 생각으로 공식문서**를 읽으며 공식문서에서 제공하는 실습을 해본 뒤, OCI 환경에서 성공을 해냈다.

문서화를 위해 마지막으로 Local에서 천천히 다시 시도하는데 귀신같이 에러가 나지 않았고 CDC 구축을 성공적으로 마무리 해냈다.

기본적인 것 인데, **공식문서를 잘 읽어보고 차근차근 모르는 부분은 시간을 들여 검색해가며 이해하고 실행하는것을 잊어먹고 있었다.**

파일럿 프로그램을 작성하면서 React, Sprinng,이 결합되어 어떻게 데이터베이스와 통신하는지 조금이나마 이해한 것 같아 기분이 좋았다.

작은 구조이지만 **CDC의 의미와 카프카가 필요한 이유**에 대해서도 얕게나마 이해할 수 있었다.

# Github

[https://github.com/masibasi/CDC-Architecture](https://github.com/masibasi/CDC-Architecture)

[https://github.com/masibasi/CDC-Front](https://github.com/masibasi/CDC-Front)



See more in Link : https://www.notion.so/7eec01b9bdcc49e3a79188c3bfb96483?pvs=4
