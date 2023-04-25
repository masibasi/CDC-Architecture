# CDC-Architecture
# Overlook

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ece687e4-e35c-4c22-885e-cf206f9c9f4b/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/74eff083-c659-4a04-a7ea-e735d5c2e2f6/Untitled.jpeg)

## 목적

> **1. Docker, Kafka, Debezium Engine을 기반으로 CDC 구현.**
기반 CDC 구조를 구축한 뒤 Source Database조작과 변동사항이 적용된SInk Database 확인의 접근이 가능하도록
**2. Front & Back End 연결 : React → Spring → DB 구조를 구축하는 것.**

**CDC :** 
**MySQL** → kafka Connect(Source Connector, Debezium) → **Kafka** → kafka Connect(JDBC Sink Connector) → **Mysql

Front & Back :
React**(Axios) → **Spring1**, **Spring2, Spring3**(JPA) → **MySQL1**(SourceDB), **MySQL2**(SinkDB1) ,**MySQL3**(SinkDB2)
> 

### CDC란?

> Change Data Capture. 데이터베이스에서 데이터 변경 발생 시 변경된 데이터를 사용하여 동작을 취할 수 있도록 지원하는 기능
[https://m0rph2us.github.io/mysql/cdc/debezium/2020/05/23/mysql-cdc-with-debezium-1.html](https://m0rph2us.github.io/mysql/cdc/debezium/2020/05/23/mysql-cdc-with-debezium-1.html)
`// CDC가 필요한 이유`
> 

### Debezium

> Apache Kafka를 기반으로 구축되었으며, 
특정 DBMS를 모니터링하는 Kafka Connect 호환 커넥터를 제공하기 위해 시작된 프로젝트
다양한 DBMS의 변경 사항을 캡쳐하고 유사한 구조의 변경 이벤트를 produce 하는 커넥터 라이브러리를 구축
> 

### Kafka

> - **아파치 카프카**는 빠르고 확장 가능한 작업을 위해 데이터 피드의 분산 스트리밍, 파이프 라이닝 및 재생을 위한 `실시간 스트리밍 데이터를 처리하기 위한 목적으로 설계`된 오픈 소스 분산형 게시-구독 메시징 플랫폼이다

**Kafka 용어 정리**
> 
> - **Broker** : 카프카 애플리케이션이 설치되어 있는 서버 또는 노드
> - **Topic** : 프로듀서와 컨슈머들이 카프카로 보낸 자신들의 메세지를 구분하기 위한 네임으로 사용
> - **Partition** : 병렬처리가 가능하도록 토픽을 나눌 수 있f고, 많은 양의 메세지 처리를 위해 파티션의 수를 늘려줄 수 있다.
> - **Producer** : 메세지를 생산하여 브로커의 토픽 이름으로 보내는 서버 또는 애플리케이션 등을 말한다.
> - **Consumer** : 브로커의 토픽 이름으로 저장된 메세지를 가져가는 서버 또는 애플리케이션 등을 말한다.
> - kafka 이해 : [https://velog.io/@shinmj1207/Apache-Kafka-메세징-시스템과-Kafka의-작동-방식](https://velog.io/@shinmj1207/Apache-Kafka-%EB%A9%94%EC%84%B8%EC%A7%95-%EC%8B%9C%EC%8A%A4%ED%85%9C%EA%B3%BC-Kafka%EC%9D%98-%EC%9E%91%EB%8F%99-%EB%B0%A9%EC%8B%9D)
