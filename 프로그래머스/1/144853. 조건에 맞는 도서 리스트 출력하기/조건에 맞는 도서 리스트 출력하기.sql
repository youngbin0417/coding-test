-- 코드를 입력하세요
select BOOK_ID, DATE_FORMAT(PUBLISHED_DATE,"%Y-%m-%d") as DATE_FORMAT from book where Year(PUBLISHED_DATE) = 2021 and category='인문'
order by PUBLISHED_DATE asc;