package com.example.testsetting.domains.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired
    private BoardMapper boardMapper;

    public BoardVO updateFindBySeq(int seq) {
        boardMapper.updateViewCount(seq);
        return boardMapper.findBySeq(seq);
    }

}
