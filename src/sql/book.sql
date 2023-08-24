CREATE TABLE book
(
    bookid serial NOT NULL,
    bookname character varying,
    author character varying,
    genre character varying,
    PRIMARY KEY (bookid)
)

insert into book(bookname, author, genre)
values('Harry Potter and the Philosopher’s Stone', 'J.K. Rowling', 'Fantasy')

insert into book(bookname, author, genre)
values('The Odyssey', 'Homer', 'Poetry')

insert into book(bookname, author, genre)
values('Harry Potter and the Chamber of Secrets', 'J.K. Rowling', 'Fantasy')

insert into book(bookname, author, genre)
values('Harry Potter and the Goblet of Fire', 'J.K. Rowling', 'Fantasy')