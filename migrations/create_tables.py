import psycopg2
from psycopg2 import sql, DatabaseError

def create_tables():
    # Database connection parameters
    dbname = 'meu_coelho_mq_database'
    user = 'postgres'
    password = 'postgres'
    host = 'localhost'

    # SQL commands to create tables
    create_channel_table = '''
    CREATE TABLE IF NOT EXISTS channel (
        id SERIAL PRIMARY KEY,
        name VARCHAR(255) NOT NULL,
        type VARCHAR(100) NOT NULL,
        auto_insert_time TIMESTAMPTZ DEFAULT CURRENT_TIMESTAMP,
        UNIQUE (name)
    );
    '''

    create_subscribers_table = '''
    CREATE TABLE IF NOT EXISTS subscribers (
        id SERIAL PRIMARY KEY,
        channel_id INT,
        CONSTRAINT fk_channel
            FOREIGN KEY (channel_id)
            REFERENCES channel(id)
            ON DELETE CASCADE
    );
    '''

    create_message_table = '''
    CREATE TABLE IF NOT EXISTS message (
        id SERIAL PRIMARY KEY,
        message TEXT NOT NULL,
        channel TEXT NOT NULL,
        CONSTRAINT fk_channel
            FOREIGN KEY (channel)
            REFERENCES channel(name)
            ON DELETE CASCADE
    );
    '''

    try:
        # Connect to the PostgreSQL server
        with psycopg2.connect(
            dbname=dbname,
            user=user,
            password=password,
            host=host,
        ) as conn:
            # Create a cursor object
            with conn.cursor() as cur:
                # Execute the SQL commands
                cur.execute(create_channel_table)
                cur.execute(create_subscribers_table)
                cur.execute(create_message_table)

        print("Tables created successfully")

    except DatabaseError as error:
        print(f"Error: {error}")

# Call the function to create tables
create_tables()

### Referencia: https://www.geeksforgeeks.org/postgresql-create-table-using-python/ e ChatGPT