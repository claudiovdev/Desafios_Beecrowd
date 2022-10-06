select prod.name, prov.name
from products prod JOIN providers prov
on prod.id_providers = prov.id
where prod.id_categories = 6;
