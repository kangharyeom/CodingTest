-- 코드를 입력하세요
SELECT PT_NAME,	PT_NO,	GEND_CD,	AGE,IFNULL	(TLNO, 'NONE') as TLNO
from PATIENT
where AGE <= 12 AND GEND_CD ="w"
order by age desc, PT_NAME
