-- 코드를 입력하세요
SELECT truncate(price, -4) as PRICE_GROUP,	count(PRICE) as PRODUCTS
from PRODUCT
GROUP BY PRICE_GROUP
ORDER BY PRICE_GROUP