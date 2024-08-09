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

def create_user(user_id, password_hash):
    try:
        # Get a connection from the pool
        conn = get_connection()
        with conn.cursor() as cur:
            query = '''    
            INSERT INTO users (user_id, password_hash) 
            VALUES (%s, %s);
            '''
            cur.execute(query, (user_id, password_hash))
            conn.commit()
            return {"status": 0}

    except psycopg2.DatabaseError as error:
        return {"status": 1}
    finally:
        if conn:
            release_connection(conn)

def insert_message(data, channel, subscribers):
    try:
        # Get a connection from the pool
        conn = get_connection()
        with conn.cursor() as cur:
            query = '''
            INSERT INTO message (message, channel, subscribers) 
            VALUES (%s, %s, %s);
            '''
            cur.execute(query, (data, channel, subscribers))
            conn.commit()
            return {"status": 0}
    except psycopg2.DatabaseError as error:
        return {"status": 1}
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
            return {"status": 0}
    except psycopg2.DatabaseError as error:
        return {"status": 1}
    finally:
        if conn:
            release_connection(conn)

def insert_subscribers(user_id, channel):
    try:
        # Get a connection from the pool
        conn = get_connection()
        with conn.cursor() as cur:
            query = '''
            INSERT INTO subscribers (user_id, channel_id) 
            VALUES (%s, %s);
            '''
            cur.execute(query, (user_id, channel))
            conn.commit()
            return {"status": 0}
    except psycopg2.DatabaseError as error:
        return {"status": 1}
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
            return {"status": 0}
    except psycopg2.DatabaseError as error:
        return {"status": 1}
    finally:
        if conn:
            release_connection(conn)

def delete_message(message_id):
    try:
        # Get a connection from the pool
        conn = get_connection()
        with conn.cursor() as cur:
            query = ''' DELETE FROM message WHERE id = %s;'''
            cur.execute(query, [message_id])
            conn.commit()
            return {"status": 0}
    except psycopg2.DatabaseError as error:
        return {"status": 1}
    finally:
        if conn:
            release_connection(conn)

def update_message_subscribers(message_id, subscribers):
    try:
        # Get a connection from the pool
        conn = get_connection()
        with conn.cursor() as cur:
            query = '''
            UPDATE message
            SET subscribers = %s
            WHERE id = %s
            ;'''
            cur.execute(query, (subscribers, message_id))
            conn.commit()
            return {"status": 0}
    except psycopg2.DatabaseError as error:
        return {"status": 1}
    finally:
        if conn:
            release_connection(conn)

def update_subscribers_in_messages(subscribers, channel_):
    try:
        # Get a connection from the pool
        conn = get_connection()
        with conn.cursor() as cur:
            query = '''
            UPDATE message
            SET subscribers = %s
            WHERE subscribers = '{}' AND channel = %s;
            '''
            cur.execute(query, (subscribers, channel_))
            conn.commit()
    except psycopg2.DatabaseError as error:
        return {"status": 1}
    finally:
        if conn:
            release_connection(conn)

def consult_number_of_message_in_channel(channel):
    try:
        # Get a connection from the pool
        conn = get_connection()
        with conn.cursor() as cur:
            query = '''SELECT COUNT(*) 
            FROM channel 
            JOIN message ON message.channel = channel.name
            WHERE channel.name = %s;'''
            cur.execute(query, (channel,))
            subs = cur.fetchone()
            return subs[0]

    except psycopg2.DatabaseError as error:
        print(f"Error: {error}")

    finally:
        if conn:
            release_connection(conn)

def consult_subscribers(channel):
    try:
        # Get a connection from the pool
        conn = get_connection()
        with conn.cursor() as cur:
            query = '''SELECT COUNT(*) 
            FROM channel 
            JOIN subscribers ON subscribers.channel_id = channel.name 
            WHERE channel.name = %s;'''
            cur.execute(query, [channel])
            subs = cur.fetchone()
            return {"subs": subs[0], "status": 0}
    except psycopg2.DatabaseError as error:
        return {"status": 1}
    finally:
        if conn:
            release_connection(conn)

def consult_channel(channel):
    try:
        # Get a connection from the pool
        conn = get_connection()
        with conn.cursor() as cur:
            query = '''SELECT * FROM channel WHERE name = %s;'''
            cur.execute(query, [channel])
            channel_ = cur.fetchone()
            return {"channel": channel_, "status": 0}
    except psycopg2.DatabaseError as error:
        return {"status": 1}
    finally:
        if conn:
            release_connection(conn)

def consult_credentials(user_i):
    try:
        # Get a connection from the pool
        conn = get_connection()
        with conn.cursor() as cur:
            query = '''SELECT password_hash FROM users WHERE user_id = %s;'''
            cur.execute(query, [user_i])
            password_hash = cur.fetchone()
            return password_hash[0]
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

def list_subscribers_to_channels(channel):
    try:
        # Get a connection from the pool
        conn = get_connection()
        with conn.cursor() as cur:
            query = '''SELECT user_id FROM subscribers
            WHERE channel_id = %s
            ;'''
            cur.execute(query,(channel,))
            subs = cur.fetchall()
            return subs
    except psycopg2.DatabaseError as error:
        print(f"Error: {error}")
    finally:
        if conn:
            release_connection(conn)

def list_message_in_channel(channel):
    try:
        # Get a connection from the pool
        conn = get_connection()
        with conn.cursor() as cur:
            query = '''SELECT * 
            FROM message
            WHERE channel = %s;'''
            cur.execute(query, (channel,))
            subs = cur.fetchall()
            return subs
    except psycopg2.DatabaseError as error:
        print(f"Error: {error}")
    finally:
        if conn:
            release_connection(conn)

