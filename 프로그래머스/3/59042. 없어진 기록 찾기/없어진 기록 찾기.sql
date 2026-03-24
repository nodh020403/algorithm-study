-- 코드를 입력하세요
SELECT o.ANIMAL_ID, o.name from animal_outs o 
left join animal_ins i on i.ANIMAL_ID=o.ANIMAL_ID 
where i.ANIMAL_ID is null order by o.ANIMAL_ID;