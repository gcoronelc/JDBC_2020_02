----------------------------------------------------
-- Autor:   ALDER FLORES GUTIERREZ Y HARRY MINAYA
-- Email:   softanik2017@gmail.com
----------------------------------------------------


create or replace view sisuni.v_movimientos(
CLICODCLI, CLINOMCLI, CLIDIRECCLI, CLICELUCLI)
as
select 
CHR_CLICODCLI CLICODCLI,
VCH_CLINOMCLI CLINOMCLI,
VCH_CLIDIRECCLI CLIDIRECCLI,
VCH_CLICELUCLI CLICELUCLI  
from sisuni.Cliente;


select * from sisuni.v_movimientos;

select CLICODCLI,CLINOMCLI,CLIDIRECCLI,CLICELUCLI from sisuni.v_movimientos where CLICODCLI='001';
