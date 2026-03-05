-- Ensure the 'patient' table exists
CREATE TABLE IF NOT EXISTS patient
(
    id              UUID PRIMARY KEY,
    name            VARCHAR(255)        NOT NULL,
    gender          VARCHAR(10)         NOT NULL,
    age             INTEGER             NOT NULL,
    email           VARCHAR(255) UNIQUE NOT NULL,
    address         VARCHAR(255)        NOT NULL,
    date_of_birth   DATE                NOT NULL,
    registered_date DATE                NOT NULL
    );

-- Insert well-known UUIDs for specific patients
INSERT INTO patient (id, name, gender, age, email, address, date_of_birth, registered_date)
VALUES ('9c3d6d10-1f24-4c3a-b8e1-1a6d7f0a0001', 'Liam Anderson', 'MALE', 37, 'liam.anderson@example.com',
        '12 Oak Street, Springfield', '1987-04-12', '2024-01-10'),
       ('9c3d6d10-1f24-4c3a-b8e1-1a6d7f0a0002', 'Olivia Martin', 'FEMALE', 32, 'olivia.martin@example.com',
        '45 Pine Avenue, Shelbyville', '1992-09-03', '2023-12-15'),
       ('9c3d6d10-1f24-4c3a-b8e1-1a6d7f0a0003', 'Noah Thompson', 'MALE', 39, 'noah.thompson@example.com',
        '78 Maple Road, Capital City', '1985-11-22', '2024-02-01'),
       ('9c3d6d10-1f24-4c3a-b8e1-1a6d7f0a0004', 'Emma Garcia', 'FEMALE', 29, 'emma.garcia@example.com',
        '34 Cedar Lane, Springfield', '1995-07-19', '2023-11-30'),
       ('9c3d6d10-1f24-4c3a-b8e1-1a6d7f0a0005', 'William Martinez', 'MALE', 46, 'william.martinez@example.com',
        '90 Birch Blvd, Shelbyville', '1978-02-14', '2022-10-05'),
       ('9c3d6d10-1f24-4c3a-b8e1-1a6d7f0a0006', 'Sophia Robinson', 'FEMALE', 34, 'sophia.robinson@example.com',
        '22 Walnut St, Capital City', '1990-12-01', '2024-03-12'),
       ('9c3d6d10-1f24-4c3a-b8e1-1a6d7f0a0007', 'James Clark', 'MALE', 41, 'james.clark@example.com',
        '67 Cherry Street, Springfield', '1983-06-30', '2023-09-21'),
       ('9c3d6d10-1f24-4c3a-b8e1-1a6d7f0a0008', 'Isabella Lewis', 'FEMALE', 26, 'isabella.lewis@example.com',
        '15 Willow Drive, Shelbyville', '1998-01-05', '2024-04-01'),
       ('9c3d6d10-1f24-4c3a-b8e1-1a6d7f0a0009', 'Benjamin Walker', 'MALE', 43, 'benjamin.walker@example.com',
        '56 Cypress Ave, Capital City', '1981-03-17', '2023-07-14'),
       ('9c3d6d10-1f24-4c3a-b8e1-1a6d7f0a0010', 'Mia Hall', 'FEMALE', 30, 'mia.hall@example.com',
        '101 Redwood St, Springfield', '1994-08-26', '2024-02-20'),
       ('9c3d6d10-1f24-4c3a-b8e1-1a6d7f0a0011', 'Lucas Allen', 'MALE', 38, 'lucas.allen@example.com',
        '29 Spruce Street, Shelbyville', '1986-05-09', '2023-06-11'),
       ('9c3d6d10-1f24-4c3a-b8e1-1a6d7f0a0012', 'Charlotte Young', 'FEMALE', 31, 'charlotte.young@example.com',
        '88 Palm Blvd, Capital City', '1993-10-13', '2024-01-28'),
       ('9c3d6d10-1f24-4c3a-b8e1-1a6d7f0a0013', 'Henry Hernandez', 'MALE', 45, 'henry.hernandez@example.com',
        '40 Aspen Way, Springfield', '1979-12-24', '2023-05-17'),
       ('9c3d6d10-1f24-4c3a-b8e1-1a6d7f0a0014', 'Amelia King', 'FEMALE', 28, 'amelia.king@example.com',
        '73 Magnolia Rd, Shelbyville', '1996-02-02', '2024-03-05'),
       ('9c3d6d10-1f24-4c3a-b8e1-1a6d7f0a0015', 'Alexander Wright', 'MALE', 40, 'alexander.wright@example.com',
        '11 Poplar Street, Capital City', '1984-09-09', '2023-12-09');