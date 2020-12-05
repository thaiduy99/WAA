INSERT INTO ROLE(id, role) VALUES (1, 'ROLE_USER');
INSERT INTO ROLE(id, role) VALUES (2, 'ROLE_ADMIN');

INSERT into USER (id, username, password, enable) values (1, 'user', '$2a$10$EblZqNptyYvcLm/VwDCVAuBjzZOI7khzdyGPBr08PpIi0na624b8.', 1);
INSERT into USER (id, username, password, enable) values (2, 'admin', '$2a$12$Pdn2Mxp1c7loJguhLtfzp.RRSHREL8Sp.bsasHnQzCLt8TSJzqiE6', 1);

insert into user_roles(user_id, role_id) values (1, 1);
insert into user_roles(user_id, role_id) values (2, 2);
