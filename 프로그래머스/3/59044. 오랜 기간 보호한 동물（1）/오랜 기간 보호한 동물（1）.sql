-- 코드를 입력하세요
SELECT i.NAME,i.DATETIME
from ANIMAL_INS as i left join ANIMAL_OUTS as o
on i.ANIMAL_ID = o.ANIMAL_ID
WHERE O.ANIMAL_ID IS NULL
order by i.DATETIME
limit 3