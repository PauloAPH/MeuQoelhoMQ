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

def insert_message(data, channel):
    try:
        # Get a connection from the pool
        conn = get_connection()
        with conn.cursor() as cur:
            query = '''
            INSERT INTO message (message, channel) 
            VALUES (%s, %s);
            '''
            cur.execute(query, (data, channel))
            conn.commit()
    except psycopg2.DatabaseError as error:
        print(f"Error: {error}")

    finally:
        if conn:
            release_connection(conn)

def insert_channel(name, type):
    try:
        # Get a connection from the pool
        conn = get_connection()
        with conn.cursor() as cur:
            query = '''
            INSERT INTO channel (name, type) 
            VALUES (%s, %s);
            '''
            cur.execute(query, (name, type))
            conn.commit()
    except psycopg2.DatabaseError as error:
        print(f"Error: {error}")

    finally:
        if conn:
            release_connection(conn)

def delete_channel(name):
    try:
        # Get a connection from the pool
        conn = get_connection()
        with conn.cursor() as cur:
            query = ''' DELETE FROM channel WHERE name = %s;'''
            cur.execute(query, [name])
            conn.commit()
    except psycopg2.DatabaseError as error:
        print(f"Error: {error}")

    finally:
        if conn:
            release_connection(conn)

def list_channels():
    try:
        # Get a connection from the pool
        conn = get_connection()
        with conn.cursor() as cur:
            query = '''SELECT * FROM channel;'''
            cur.execute(query)
            channels = cur.fetchall()
            return channels

    except psycopg2.DatabaseError as error:
        print(f"Error: {error}")

    finally:
        if conn:
            release_connection(conn)


