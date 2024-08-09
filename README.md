# Projeto da disciplina MCTA025-13-Sistemas Distribuidos UFABC - 2024
## Autores: 
- Paulo Alexandre Pizará Hayashida RA: 11201722652
- Igor Ladeia de Freitas

### Comandos
####
```
 sudo apt install protobuf-compiler
```
#### Comando para instalar gRPC tools
 ```
 pip install grpcio-tools 
 ```
#### Comando para instalar psycopg2
 ```
 pip install psycopg2-binary
  ```
#### Comando para gerar arquivos do protocol buffer: 
#### Python
```
  python3 -m grpc_tools.protoc -I. --python_out=python  --grpc_python_out=python  protos/meu_coelho_mq.proto
```
#### Java
```
  protoc -I=. --java_out=java  protos/meu_coelho_mq.proto

  protoc --java_out=java \
       --grpc-java_out=java \
       -I=. \
       protos/meu_coelho_mq.proto
```
#### Comandos PostgreSQL
- Iniciar PostgreSQL
 ```
 sudo systemctl start postgresql
 ```
- Entrar no PostgreSQL
 ```
psql -h localhost -U postgres
 ```
- Listar databases (dentro do terminal psql)
```
\l
 ```
- Entrar no database 
 ```
\c meu_coelho_mq_database
 ```
- Estrutura do database
```
 \dt 
```
- Entrar em uma tabela
```
`\d
```



# grpc-netty-shaded
wget https://repo1.maven.org/maven2/io/grpc/grpc-netty-shaded/1.58.0/grpc-netty-shaded-1.58.0.jar

# grpc-stub
wget https://repo1.maven.org/maven2/io/grpc/grpc-stub/1.58.0/grpc-stub-1.58.0.jar

# grpc-protobuf
wget https://repo1.maven.org/maven2/io/grpc/grpc-protobuf/1.58.0/grpc-protobuf-1.58.0.jar

# grpc-api
wget https://repo1.maven.org/maven2/io/grpc/grpc-api/1.58.0/grpc-api-1.58.0.jar

# protobuf-java
wget https://repo1.maven.org/maven2/com/google/protobuf/protobuf-java/3.24.0/protobuf-java-3.24.0.jar

# protobuf-java-util
wget https://repo1.maven.org/maven2/com/google/protobuf/protobuf-java-util/3.24.0/protobuf-java-util-3.24.0.jar

# guava
wget https://repo1.maven.org/maven2/com/google/guava/guava/32.1.2-jre/guava-32.1.2-jre.jar