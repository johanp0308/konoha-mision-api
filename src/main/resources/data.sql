INSERT INTO `konoha_mision_db`.`ninja` (`aldea`, `nombre_ninja`, `rango_ninja`) VALUES ('Hoja', 'Pachon', 'Senin');
INSERT INTO `konoha_mision_db`.`ninja` (`aldea`, `nombre_ninja`, `rango_ninja`) VALUES ('Campus', 'Juan', 'Hokage');
INSERT INTO `konoha_mision_db`.`ninja` (`aldea`, `nombre_ninja`, `rango_ninja`) VALUES ('Lol', 'Kevin', 'Master');

INSERT INTO `konoha_mision_db`.`habilidad` (`descripcion_habilidad`, `nombre_habilidad`) VALUES ('Machetazo Limpio', 'Machete Jutsu');
INSERT INTO `konoha_mision_db`.`habilidad` (`descripcion_habilidad`, `nombre_habilidad`) VALUES ('Espiral de Chakra', 'RasenFiltro');

INSERT INTO `konoha_mision_db`.`mision` (`descripcion_mison`, `rango_mision`, `recompensa_mision`) VALUES ('Matar y Pelar el Diablo', 'Solo pachon', '1');
INSERT INTO `konoha_mision_db`.`mision` (`descripcion_mison`, `rango_mision`, `recompensa_mision`) VALUES ('Filtrar a muchos campers', 'Hokage', '156165');

INSERT INTO `konoha_mision_db`.`mision_ninja` (`fecha_fin`, `fecha_inicio`, `mision_id`, `ninja_id`) VALUES ('2023-02-01', '2023-02-01', '1', '1');
INSERT INTO `konoha_mision_db`.`mision_ninja` (`fecha_fin`, `fecha_inicio`, `mision_id`, `ninja_id`) VALUES ('2024-02-01', '2024-02-01', '2', '2');

INSERT INTO `konoha_mision_db`.`ninja_habilidad` (`ninja_id`, `habilidad_id`) VALUES ('1', '1');
INSERT INTO `konoha_mision_db`.`ninja_habilidad` (`ninja_id`, `habilidad_id`) VALUES ('2', '2');
