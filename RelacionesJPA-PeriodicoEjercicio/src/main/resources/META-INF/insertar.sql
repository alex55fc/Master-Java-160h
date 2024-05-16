INSERT INTO Noticias (titulo, autor, fecha) VALUES
('Huracán', 'Juan Perez', '2024-05-16'),
('Terremoto', 'Carlos Abdul', '2024-05-15'),
('Concierto', 'Jose Maria', '2024-05-14');
INSERT INTO Comentarios (id, titulo, texto, noticias_titulo) VALUES
(1, 'Impactante', 'Las imágenes del huracán son impactantes.', 'Huracán'),
(2, 'Preocupación', 'Espero que todos estén a salvo después del terremoto.', 'Terremoto'),
(3, 'Gran experiencia', 'El concierto fue una experiencia increíble.', 'Concierto'),
(4, 'Ayuda para afectados', '¿Dónde se puede donar para ayudar a los afectados por el huracán?', 'Huracán'),
(5, 'Concierto inolvidable', 'Nunca olvidaré ese concierto.', 'Concierto');
