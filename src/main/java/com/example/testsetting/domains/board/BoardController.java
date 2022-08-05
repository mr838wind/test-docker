package com.example.testsetting.domains.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {

    @Autowired
    BoardService boardService;

    @RequestMapping(value = "/api/board/{seq}", method = RequestMethod.GET)
    public BoardVO findByTitle(@PathVariable("seq") int seq) {
        return boardService.updateFindBySeq(seq);
    }

}
