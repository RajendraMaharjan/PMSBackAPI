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
VALUES (1, '694-976-8005', 'hpaiton0@pen.io', 'Horten', 'Paiton', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2', 'ACTIVE'),
       (2, '605-943-3250', 'cpoundsford1@msn.com', 'Claresta', 'Poundsford', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2', 'ACTIVE'),
       (3, '372-499-7644', 'ejosey2@ucla.edu', 'Erin', 'Josey', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2', 'DEACTIVE'),
       (4, '649-948-9215', 'sseden3@nydailynews.com', 'Siana', 'Seden', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2', 'ACTIVE'),
       (5, '563-404-4228', 'imorris4@accuweather.com', 'Ivette', 'Morris', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2', 'DEACTIVE'),
       (6, '863-760-9818', 'bmcghie5@gizmodo.com', 'Brinn', 'McGhie', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2', 'DEACTIVE'),
       (7, '686-126-5099', 'bmarriott6@uol.com.br', 'Brina', 'Marriott', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2', 'ACTIVE'),
       (8, '496-624-6698', 'fnary7@soup.io', 'Fairfax', 'Nary', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2', 'DEACTIVE'),
       (9, '983-436-2347', 'bmereweather8@patch.com', 'Bard', 'Mereweather', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2', 'DEACTIVE'),
       (10, '322-939-3416', 'lhilley9@miibeian.gov.cn', 'Lana', 'Hilley', '$2a$12$IKEQb00u5QpZMx4v5zMweu.3wrq0pS7XLCHO4yHZ.BW/yvWu1feo2', 'ACTIVE');
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
VALUES (1, 'https://images.unsplash.com/photo-1628133287836-40bd5453bed1?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=2340&q=80', 'NisiNam.avi'),
       (2, 'https://images.unsplash.com/photo-1592595896551-12b371d546d5?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=3570&q=80', 'NisiNam.avi'),
       (3, 'https://images.unsplash.com/photo-1558036117-15d82a90b9b1?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=2340&q=80',
        'SedJusto.jpeg'),
       (4, 'https://images.unsplash.com/photo-1494526585095-c41746248156?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=2340&q=80',
        'IntegerAcLeo.tiff'),
       (5, 'https://images.unsplash.com/photo-1570129477492-45c003edd2be?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=2340&q=80', 'Auctor.xls'),
       (6, 'https://images.unsplash.com/photo-1613490493576-7fde63acd811?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=2342&q=80',
        'MorbiNonQuam.xls'),
       (7, 'https://images.unsplash.com/photo-1613977257363-707ba9348227?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=2340&q=80',
        'PosuereNonummy.avi'),
       (8, 'https://images.unsplash.com/photo-1592595896616-c37162298647?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=2340&q=80', 'Id.mp3'),
       (9, 'https://images.unsplash.com/photo-1605146769289-440113cc3d00?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=2340&q=80',
        'Tristique.mp3'),
       (10, 'https://images.unsplash.com/photo-1605276374104-dee2a0ed3cd6?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=2340&q=80', 'Magna.xls');

INSERT INTO property_propimage (prop_id, prop_image_id)
VALUES (2, 1),
       (3, 2),
       (4, 3),
       (5, 4),
       (6, 5),
       (7, 6),
       (8, 7),
       (9, 8),
       (1, 8),
       (10, 9);
