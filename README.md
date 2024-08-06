# Projeto da disciplina MCTA025-13-Sistemas Distribuidos UFABC - 2024
## Autores: 
- Paulo Alexandre Pizará Hayashida RA: 11201722652
- Igor Ladeia de Freitas

### Comandos
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
  protoc -I=. --java_out=. protos/meu_coelho_mq.proto
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
-Entrar no database 
 ```
\c meu_coelho_mq_database
 ```
- Estrutura do database
```
 \dt 
```
