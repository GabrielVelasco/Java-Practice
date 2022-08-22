FROM postgres
ENV POSTGRES_USER postgres
ENV POSTGRES_PASSWORD 123
ENV POSTGRES_DB contactmng
COPY contactManager.sql /docker-entrypoint-initdb.d/
