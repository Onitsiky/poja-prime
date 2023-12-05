create extension if not exists "uuid-ossp";

create table "prime_number" (
    id varchar default uuid_generate_v4()
                            constraint prime_number_pk primary key ,
    prime varchar not null,
    created_at timestamp without time zone default current_date
);