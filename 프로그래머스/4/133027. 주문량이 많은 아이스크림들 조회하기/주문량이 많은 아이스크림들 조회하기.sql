with jj as (select FLAVOR, SUM(TOTAL_ORDER) as ord
from JULY
group by JULY.FLAVOR
)

select h.FLAVOR
from FIRST_HALF as h
join jj
on h.FLAVOR=jj.FLAVOR
order by (h.TOTAL_ORDER + jj.ord) desc
limit 3