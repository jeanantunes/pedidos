INSERT INTO Produto (gtin, nome) VALUES ('7894900011517', 'REFRIGERANTE COCA-COLA 2LT');
INSERT INTO Produto (gtin, nome) VALUES ('7891910000197', 'AÇÚCAR REFINADO UNIÃO 1KG');
INSERT INTO Produto (gtin, nome) VALUES ('7892840222949', 'SALGADINHO FANDANGOS QUEIJO');
INSERT INTO Produto (gtin, nome) VALUES ('7891910007110', 'AÇÚCAR DE CONFEITEIRO UNIÃO GLAÇÚCAR');
INSERT INTO Produto (gtin, nome) VALUES ('7891000053508', 'ACHOCOLATADO NESCAU 2.0');
INSERT INTO Produto (gtin, nome) VALUES ('7891000100103', 'LEITE CONDENSADO MOÇA');
INSERT INTO Produto (gtin, nome) VALUES ('7891991010856', 'CERVEJA BUDWEISER');

INSERT INTO Fornecedor (id, cnpj, nome) VALUES (3, '56.918.868/0001-20', 'Fornecedor 1');
INSERT INTO Fornecedor (id, cnpj, nome) VALUES (4, '37.563.823/0001-35', 'Fornecedor 2');

INSERT INTO Precos (id, cnpj, preco, quantidade_minima) VALUES (3, '56.918.868/0001-20', 6.89, 1);
INSERT INTO Precos (id, cnpj, preco, quantidade_minima) VALUES (2, '56.918.868/0001-20', 5.89, 10);

INSERT INTO Precos (id, cnpj, preco, quantidade_minima) VALUES (4, '37.563.823/0001-35',6.8,1);
INSERT INTO Precos (id, cnpj, preco, quantidade_minima) VALUES (5, '37.563.823/0001-35',6,10);