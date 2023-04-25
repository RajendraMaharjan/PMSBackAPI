INSERT INTO Address(address_id, street, city, state, zip, country) VALUES
(1, '451 Springview Avenue','Texas','San Antonio',1,'United States'),
(2,'04 Nancy Plaza','California','Los Angeles',4,'United States'),
(3,'916 Iowa Crossing','Wisconsin','Madison',141,'United States'),
(4, '3132 Riverside Lane','Virginia','Roanoke',42,'United States'),
(5, '5 Cordelia Place','Michigan','Detroit',2,'United States'),
(6,'34222 Grayhawk Place','Iowa','Des Moines',70190,'United States');

INSERT INTO PROPERTY_IMAGE(p_image_id, image_location, image_name) VALUES
(1, 'c:/INwWK6QAAABl0RVh0U29mdHdhcmUAQWRvYmUgSW1hZ2VSZWFkeXHJZTwAAABjSURBVCjPY/zPgB8wMVCqgAVElP', 'Quis.tiff'),
(2, 'c:/INwWK6QAAABl0RVh0U29mdHdhcmUAQWRvYmUgSW1hZ2VSZWFkeXHJZTwAAAJ5SURBVDjLpZPNS1RhFMaff2EWLW', 'NisiNam.avi'),
(3, 'c:/INwWK6QAAABl0RVh0U29mdHdhcmUAQWRvYmUgSW1hZ2VSZWFkeXHJZTwAAAIiSURBVBgZpcHfa81hHMDx9/l+n8', 'SedJusto.jpeg'),
(4, 'c:/INwWK6QAAABl0RVh0U29mdHdhcmUAQWRvYmUgSW1hZ2VSZWFkeXHJZTwAAAMoSURBVDjLndPLb5RVHMbx5515px', 'IntegerAcLeo.tiff'),
(5, 'c:/INwWK6QAAABl0RVh0U29mdHdhcmUAQWRvYmUgSW1hZ2VSZWFkeXHJZTwAAAJDSURBVDjLxVNdSFNhGH7OD3Nmua', 'Auctor.xls'),
(6, 'c:/INwWK6QAAABl0RVh0U29mdHdhcmUAQWRvYmUgSW1hZ2VSZWFkeXHJZTwAAAGsSURBVDjLpZIxixNRFIW/kVHQQl', 'MorbiNonQuam.xls'),
(7, 'c:/INwWK6QAAABl0RVh0U29mdHdhcmUAQWRvYmUgSW1hZ2VSZWFkeXHJZTwAAAJFSURBVDjLpZPNS1RhFMZ/5733zk', 'PosuereNonummy.avi'),
(8, 'c:/INwWK6QAAABl0RVh0U29mdHdhcmUAQWRvYmUgSW1hZ2VSZWFkeXHJZTwAAAJfSURBVDjLpZNrSFNhGMelD34op6', 'Id.mp3'),
(9, 'c:/INwWK6QAAABl0RVh0U29mdHdhcmUAQWRvYmUgSW1hZ2VSZWFkeXHJZTwAAAMGSURBVBgZpcFNaJt1HMDx7/Mkbd', 'Tristique.mp3'),
(10,'c:/INwWK6QAAABl0RVh0U29mdHdhcmUAQWRvYmUgSW1hZ2VSZWFkeXHJZTwAAAJwSURBVDjLjVNdSJNhFH62fWbNWb', 'Magna.xls');



INSERT INTO users(user_id, contact_number, email, first_name, last_name, password, user_status) VALUES
(1, '694-976-8005', 'hpaiton0@pen.io', 'Horten', 'Paiton', '7V6UJ2', '1'),
(2, '605-943-3250', 'cpoundsford1@msn.com', 'Claresta', 'Poundsford', 'lDIzDLLs9C', '1'),
(3, '372-499-7644', 'ejosey2@ucla.edu', 'Erin', 'Josey', 'q0dUG3', '0'),
(4, '649-948-9215', 'sseden3@nydailynews.com', 'Siana', 'Seden', 'BcE6h3uovr', '1'),
(5, '563-404-4228', 'imorris4@accuweather.com', 'Ivette', 'Morris', 'jKmsyrOeGeie', '0'),
(6, '863-760-9818', 'bmcghie5@gizmodo.com', 'Brinn', 'McGhie', '89hTYBbVZI', '0'),
(7, '686-126-5099', 'bmarriott6@uol.com.br', 'Brina', 'Marriott', 'TgcAhRYSfoe', '1'),
(8, '496-624-6698', 'fnary7@soup.io', 'Fairfax', 'Nary', '79x89P2bNS', '0'),
(9, '983-436-2347', 'bmereweather8@patch.com', 'Bard', 'Mereweather', '1mUFOIeyksw', '0'),
(10, '322-939-3416', 'lhilley9@miibeian.gov.cn', 'Lana', 'Hilley', 'LFcKQWBO', '1');

INSERT INTO user_role VALUES
                          (1,'Owner'),
                          (2,'Customer'),
                          (3,'Admin'),
                          (4,'Viewer'),
                          (5,'Owner'),
                          (6,'Customer'),
                          (7,'Admin'),
                          (8,'Admin'),
                          (9,'Customer'),
                          (10,'Owner');

INSERT INTO users_user_role VALUES
(1,1),
(2,2),
(3,3),
(4,4),
(5,5),
(6,6),
(7,7),
(8,8),
(9,9),
(10,10);

insert into property_detail (pd_id, full_bathroom_num, has_tenant, home_condition, home_size, lot_size, mortgage_balance, partial_bathroom_num, property_price, property_type, room_num, year_build, address_address_id) values
(1, 1, true, 'Perfect', 40, 92, 7800, 1, 260000, 'SINGLE FAMILY', 1, 1993, 1),
(2, 2, false, 'Excellent', 31, 15, 7100, 2, 260000, 'Multi FAMILY', 2, 1995, 2),
(3, 3, true, 'Good', 25, 7, 5600, 3, 190000, 'Condo', 2, 2002, 3),
(4, 4, false, 'Need Minor Work', 78, 27, 5700, 4, 800000, 'Mobile', 4, 1999, 4),
(5, 5, true, 'Need Major Work', 53, 69, 8000, 5, 100000, 'Land', 5, 1999, 5),
(6, 6, false, 'Perfect', 99, 16, 4300, 6, 970000, 'Farm', 6, 2002, 6);


insert into Property (property_id, status_enum, address_address_id, property_detail_pd_id) values
(1, '264-975-7172', 1, 1),
(2, '615-241-1257', 2, 2),
(3, '985-771-0887', 3, 3),
(4, '687-297-2999', 4, 4),
(5, '595-981-5530', 5, 5),
(6, '174-912-0393', 6, 6);