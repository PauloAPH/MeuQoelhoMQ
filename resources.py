import psycopg2
from psycopg2 import pool

# Initialize a connection pool
connection_pool = psycopg2.pool.SimpleConnectionPool(
    1,  # Minimum number of connections
    10, # Maximum number of connections
    dbname = 'meu_coelho_mq_database',
    user = 'postgres',
    password = 'postgres',
    host = 'localhost'
)

def get_connection():
    return connection_pool.getconn()

def release_connection(conn):
    connection_pool.putconn(conn)

def insert_channel(name, type):
    conn = None
    try:
        # Get a connection from the pool
        conn = get_connection()
        with conn.cursor() as cur:
            insert_query = '''
            INSERT INTO channel (name, type) 
            VALUES (%s, %s);
            '''
            cur.execute(insert_query, (name, type))
            conn.commit()
        
    
    except psycopg2.DatabaseError as error:
        print(f"Error: {error}")

    finally:
        if conn:
            release_connection(conn)

