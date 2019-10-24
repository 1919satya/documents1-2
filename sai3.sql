create table AgentPolicy
(
   AgentID INT REFERENCES Agent(AgentID),
   PolicyID INT REFERENCES Policy(PolicyID),
   IsSplitAgent INT,
   constraint pk_agp primary Key(AgentID,PolicyID)
)

INSERT INTO AGENTPOLICY(AGENTID,POLICYID,IsSplitAgent)
VALUES(1,1,2),
					(1,3,1),
					(2,3,1),
					(2,1,1),
					(2,4,1),
					(2,5,1),
					(4,1,2),
					(4,3,1),
					(5,1,2),
					(5,2,1)
                    
select * from AgentPolicy              


select  
a.agentid,firstname,lastname,city,
p.policyid,annualpremium

 from  agent a right join agentpolicy ap on a.agentid=ap.agentid    
right join policy p on p.policyid=ap.policyid   

 

select appnumber from policy where annualpremium=(select max(annualpremium) from policy