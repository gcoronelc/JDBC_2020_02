
select * from moneda;


insert into moneda values('46','abc 123');

create or replace procedure usp_sumar(
    p_n1 in number,
    p_n2 in number,
    p_suma out number
)
as
begin
    p_suma := p_n1 + p_n2;
end;
/

set serveroutput on

declare 
    v_suma number;
begin
    usp_sumar( 56, 54, v_suma );
    dbms_output.put_line( 'suma: ' || v_suma );
end;
/

select dec_cuensaldo, int_cuencontmov from cuenta where chr_cuencodigo = '00100001';


select * from eureka.cuenta where chr_cuencodigo = '00100001';
select * from eureka.movimiento where chr_cuencodigo = '00100001';

desc movimiento;

select sysdate from dual;

select * from tipomovimiento;


select * from v$session where username='EUREKA';

ALTER SYSTEM KILL SESSION '160,1279' IMMEDIATE;


