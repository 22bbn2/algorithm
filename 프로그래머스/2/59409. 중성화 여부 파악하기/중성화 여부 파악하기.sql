-- 코드를 입력하세요
SELECT ANIMAL_ID, NAME, 
    if(SEX_UPON_INTAKE like '%Neutered%' or SEX_UPON_INTAKE like '%Spayed%' , 'O','X') as 중성화
FROM ANIMAL_INS
ORDER BY ANIMAL_ID


    # (CASE
    #  WHEN SEX_UPON_INTAKE like '%Neutered%' THEN 'O'
    #  WHEN SEX_UPON_INTAKE like '%Spayed%' THEN 'O'
    #  ELSE 'X' END) as '중성화'