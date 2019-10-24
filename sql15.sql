use bank

select
case
  when max(accountNo) is null then 1
  else max(accountno)+1
  end accon
  from accounts 