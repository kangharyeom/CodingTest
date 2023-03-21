-- 코드를 입력하세요
SELECT count(*) as Users
from USER_INFO
where 20<= age and 29>=age and year(joined) = 2021
