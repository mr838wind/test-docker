-- SET foreign_key_checks = 0;


-- Board
drop table if exists tb_board;
create table tb_board
(
    seq int auto_increment comment 'SEQ',
    board_code varchar(10) comment '게시판코드',

    category varchar(10) comment '카테고리',
    title varchar(1000) null comment '제목',
    contents text null comment '내용',
    view_count int default 0 comment '조회수',

    author varchar(256) not null comment '작성자',
    passwd varchar(256) null comment '글 비밀번호',

    register_dtm datetime default now(),
    update_dtm datetime  default now(),

    PRIMARY KEY (seq)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8 COLLATE=utf8_unicode_ci;


drop table if exists tb_board_file;
create table tb_board_file
(
    seq int auto_increment comment 'SEQ',
    board_code varchar(10) comment '게시판코드',

    board_seq int comment '게시판시퀀스',
    field_name varchar(100) not null comment '',

    stored_path varchar(1000) null comment '',
    stored_name varchar(100) null comment '',
    origin_name varchar(100) null comment '',

    contents_type varchar(256) null comment '',
    contents_length int null comment '',

    register_dtm datetime default now(),
    update_dtm datetime  default now(),

    PRIMARY KEY (seq)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8 COLLATE=utf8_unicode_ci;

