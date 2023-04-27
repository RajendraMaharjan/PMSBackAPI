select 1;

INSERT INTO Address(address_id, street, city, state, zip, country)
VALUES (1, '451 Springview Avenue', 'Texas', 'San Antonio', 1, 'United States'),
       (2, '04 Nancy Plaza', 'California', 'Los Angeles', 4, 'United States'),
       (3, '916 Iowa Crossing', 'Wisconsin', 'Madison', 141, 'United States'),
       (4, '3132 Riverside Lane', 'Virginia', 'Roanoke', 42, 'United States'),
       (5, '5 Cordelia Place', 'Michigan', 'Detroit', 2, 'United States'),
       (6, '34222 Grayhawk Place', 'Iowa', 'Des Moines', 70190, 'United States'),
       (7, '34222 Grayhawk Place', 'Iowa', 'Des Moines', 70190, 'United States'),
       (8, '34222 Grayhawk Place', 'Iowa', 'Des Moines', 70190, 'United States'),
       (9, '34222 Grayhawk Place', 'Iowa', 'Des Moines', 70190, 'United States'),
       (10, '34222 Grayhawk Place', 'Iowa', 'Des Moines', 70190, 'United States');

INSERT INTO users(user_id, contact_number, email, first_name, last_name, password, user_status)
VALUES (1, '694-976-8005', 'hpaiton0@pen.io', 'Horten', 'Paiton', '7V6UJ2', 'ACTIVE'),
       (2, '605-943-3250', 'cpoundsford1@msn.com', 'Claresta', 'Poundsford', 'lDIzDLLs9C', 'ACTIVE'),
       (3, '372-499-7644', 'ejosey2@ucla.edu', 'Erin', 'Josey', 'q0dUG3', 'DEACTIVE'),
       (4, '649-948-9215', 'sseden3@nydailynews.com', 'Siana', 'Seden', 'BcE6h3uovr', 'ACTIVE'),
       (5, '563-404-4228', 'imorris4@accuweather.com', 'Ivette', 'Morris', 'jKmsyrOeGeie', 'DEACTIVE'),
       (6, '863-760-9818', 'bmcghie5@gizmodo.com', 'Brinn', 'McGhie', '89hTYBbVZI', 'DEACTIVE'),
       (7, '686-126-5099', 'bmarriott6@uol.com.br', 'Brina', 'Marriott', 'TgcAhRYSfoe', 'ACTIVE'),
       (8, '496-624-6698', 'fnary7@soup.io', 'Fairfax', 'Nary', '79x89P2bNS', 'DEACTIVE'),
       (9, '983-436-2347', 'bmereweather8@patch.com', 'Bard', 'Mereweather', '1mUFOIeyksw', 'DEACTIVE'),
       (10, '322-939-3416', 'lhilley9@miibeian.gov.cn', 'Lana', 'Hilley', 'LFcKQWBO', 'ACTIVE');
INSERT INTO roles
VALUES (1, 'Owner'),
       (2, 'Customer'),
       (3, 'Admin'),
       (4, 'Viewer'),
       (5, 'Owner'),
       (6, 'Customer'),
       (7, 'Admin'),
       (8, 'Admin'),
       (9, 'Customer'),
       (10, 'Owner');

INSERT INTO users_role
VALUES (1, 1),
       (2, 2),
       (3, 3),
       (4, 4),
       (5, 5),
       (6, 6),
       (7, 7),
       (8, 8),
       (9, 9),
       (10, 10);



insert into property_detail (pd_id, full_bathroom_num, has_tenant, home_condition, home_size, lot_size,
                             mortgage_balance, partial_bathroom_num, property_price, property_type, room_num,
                             year_build, address_address_id)
values (1, 1, true, 'PERFECT', 40.0, 92.0, 7800.0, 1, 260000.0, 'SINGLE_FAMILY', 1, '1993-05-30', 1),
       (2, 2, false, 'EXCELLENT', 31.0, 15.0, 7100.0, 2, 260000.0, 'MULTI_FAMILY', 2, '1995-05-23', 2),
       (3, 3, true, 'GOOD', 25.0, 7.0, 5600.0, 3, 190000.0, 'CONDO', 2, '2002-01-18', 3),
       (4, 4, false, 'NEED_MINOR_WORK', 78.0, 27.0, 5700.0, 4, 800000.0, 'MOBILE', 4, '1999-05-16', 4),
       (5, 5, true, 'NEED_MAJOR_WORK', 53.0, 69.0, 8000.0, 5, 100000.0, 'LAND', 5, '1999-11-12', 5),
       (6, 6, false, 'PERFECT', 99.0, 16.0, 4300.0, 6, 970000.0, 'FARM', 6, '2002-03-23', 6),
       (7, 6, false, 'PERFECT', 99.0, 16.0, 4300.0, 6, 970000.0, 'FARM', 6, '2002-03-23', 7),
       (8, 6, false, 'PERFECT', 99.0, 16.0, 4300.0, 6, 970000.0, 'FARM', 6, '2002-03-23', 8),
       (9, 6, false, 'PERFECT', 99.0, 16.0, 4300.0, 6, 970000.0, 'FARM', 6, '2002-03-23', 9),
       (10, 6, false, 'PERFECT', 99.0, 16.0, 4300.0, 6, 970000.0, 'FARM', 6, '2002-03-23', 10);



insert into Property (property_id, status_enum, address_address_id, owner_user_id, property_detail_pd_id)
values (1, 'AVAILABLE', 1, 1, 1),
       (2, 'CONTINGENT', 2, 2, 2),
       (3, 'PENDING', 3, 3, 3),
       (4, 'AVAILABLE', 4, 4, 4),
       (5, 'AVAILABLE', 5, 5, 5),
       (6, 'PENDING', 6, 6, 6),
       (7, 'AVAILABLE', 7, 4, 7),
       (8, 'AVAILABLE', 8, 6, 8),
       (9, 'AVAILABLE', 9, 3, 9),
       (10, 'CONTINGENT', 10, 3, 10)
;



INSERT INTO PROPERTY_IMAGE(p_image_id, image_location, image_name)
VALUES (1, 'c:/INwWK6QAAABl0RVh0U29mdHdhcmUAQWRvYmUgSW1hZ2VSZWFkeXHJZTwAAAJ5SURBVDjLpZPNS1RhFMaff2EWLW', 'NisiNam.avi'),
       (2, 'c:/INwWK6QAAABl0RVh0U29mdHdhcmUAQWRvYmUgSW1hZ2VSZWFkeXHJZTwAAAJ5SURBVDjLpZPNS1RhFMaff2EWLW', 'NisiNam.avi'),
       (3, 'c:/INwWK6QAAABl0RVh0U29mdHdhcmUAQWRvYmUgSW1hZ2VSZWFkeXHJZTwAAAIiSURBVBgZpcHfa81hHMDx9/l+n8',
        'SedJusto.jpeg'),
       (4, 'c:/INwWK6QAAABl0RVh0U29mdHdhcmUAQWRvYmUgSW1hZ2VSZWFkeXHJZTwAAAMoSURBVDjLndPLb5RVHMbx5515px',
        'IntegerAcLeo.tiff'),
       (5, 'c:/INwWK6QAAABl0RVh0U29mdHdhcmUAQWRvYmUgSW1hZ2VSZWFkeXHJZTwAAAJDSURBVDjLxVNdSFNhGH7OD3Nmua', 'Auctor.xls'),
       (6, 'c:/INwWK6QAAABl0RVh0U29mdHdhcmUAQWRvYmUgSW1hZ2VSZWFkeXHJZTwAAAGsSURBVDjLpZIxixNRFIW/kVHQQl',
        'MorbiNonQuam.xls'),
       (7, 'c:/INwWK6QAAABl0RVh0U29mdHdhcmUAQWRvYmUgSW1hZ2VSZWFkeXHJZTwAAAJFSURBVDjLpZPNS1RhFMZ/5733zk',
        'PosuereNonummy.avi'),
       (8, 'c:/INwWK6QAAABl0RVh0U29mdHdhcmUAQWRvYmUgSW1hZ2VSZWFkeXHJZTwAAAJfSURBVDjLpZNrSFNhGMelD34op6', 'Id.mp3'),
       (9, 'c:/INwWK6QAAABl0RVh0U29mdHdhcmUAQWRvYmUgSW1hZ2VSZWFkeXHJZTwAAAMGSURBVBgZpcFNaJt1HMDx7/Mkbd',
        'Tristique.mp3'),
       (10, 'c:/INwWK6QAAABl0RVh0U29mdHdhcmUAQWRvYmUgSW1hZ2VSZWFkeXHJZTwAAAJwSURBVDjLjVNdSJNhFH62fWbNWb', 'Magna.xls');

INSERT INTO property_propimage (prop_id, prop_image_id)
VALUES (2, 1),
       (3, 2),
       (4, 3),
       (5, 4),
       (6, 5),
       (7, 6),
       (8, 7),
       (9, 8),
       (10, 9);