-- 코드를 입력하세요
SELECT A.FLAVOR
from FIRST_HALF A
join ICECREAM_INFO B on A.FLAVOR = B.FLAVOR
where (A.TOTAL_ORDER > 3000) and (b.INGREDIENT_TYPE = 'fruit_based')
order by A.TOTAL_ORDER desc