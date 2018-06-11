CREATE TABLE `authorities_qa` (
  `id` varchar(100) NOT NULL,
  `name` varchar(200) NOT NULL,
  `parent_id` varchar(100) DEFAULT NULL,
  `category` varchar(100) DEFAULT NULL,
  `description` varchar(300) DEFAULT NULL,
  `url` varchar(300) DEFAULT NULL,
  `url_pattern` varchar(300) DEFAULT NULL,
  `sort_order` int(11) NOT NULL,
  `has_game_yn` char(1) NOT NULL DEFAULT 'N',
  `use_yn` char(1) NOT NULL,
  `show_yn` char(1) NOT NULL,
  `icon` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

