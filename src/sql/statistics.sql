CREATE TABLE statistic
(
    userid integer,
    bookid integer,
    hours double precision,
    date date,
    media character varying
)


insert into statistic
values(9, 12, 2, '2023-05-23', 'ebook')

insert into statistic
values(9, 12, 2, '2023-05-24', 'ebook')

insert into statistic
values(9, 15, 2, '2023-05-26', 'ebook')

insert into statistic
values(9, 16, 1.5, '2023-05-27', 'ebook')

insert into statistic
values(6, 14, 1.5, '2023-05-28', 'paper')
