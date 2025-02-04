import psycopg2
from psycopg2 import sql
from psycopg2.extensions import ISOLATION_LEVEL_AUTOCOMMIT # <-- ADD THIS LINE

def create_database():
    con = psycopg2.connect(dbname='postgres',
        user='postgres', host='localhost',
        password= 'postgres')

    con.set_isolation_level(ISOLATION_LEVEL_AUTOCOMMIT) # <-- ADD THIS LINE

    cur = con.cursor()

    # Use the psycopg2.sql module instead of string concatenation 
    # in order to avoid sql injection attacks.
    cur.execute(sql.SQL("CREATE DATABASE {}").format(
            sql.Identifier('meu_coelho_mq_database'))
        )

##CREDITOS https://stackoverflow.com/questions/34484066/create-a-postgres-database-using-python

