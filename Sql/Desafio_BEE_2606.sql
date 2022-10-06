SELECT prod.id, prod.name
FROM products prod JOIN categories cat
on prod.id_categories = cat.id
WHERE cat.name LIKE 'super%'