create sequence hibernate_sequence start with 1 increment by 1
create table authors (id bigint not null, name varchar(255), primary key (id))
create table books (id bigint not null, description varchar(255), price float, title varchar(255), author_id bigint, primary key (id))
create table topics (id bigint not null, title varchar(255), primary key (id))
alter table books add constraint FKfjixh2vym2cvfj3ufxj91jem7 foreign key (author_id) references authors
