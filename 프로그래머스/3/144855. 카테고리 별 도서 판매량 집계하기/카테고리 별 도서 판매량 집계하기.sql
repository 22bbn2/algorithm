-- 코드를 입력하세요
SELECT category,sum(s.sales) as total_sales
from book b join book_sales s
on S.BOOK_ID = B.BOOK_ID
where s.sales_date like '%2022-01%'
group by category
order by category