package view;

import builder.BoardBuilder;
import model.BoardDto;
import service.BoardService;
import service.UtilService;
import serviceImpl.UtilServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class BoardView {
    public static void main(String[] args) {
        List<BoardDto> articles = new ArrayList<>();
        UtilService util = UtilServiceImpl.getInstance();

        for(int i=0;i<5;i++){
            articles.add(new BoardBuilder()
                    .title(util.createRandomTitle())
                    .content(util.createRandomContent())
                    .writer(util.createRandomName()).build());
            System.out.println(articles.get(i));
        }

        for(BoardDto i :articles) {
            System.out.println(i.toString());
        }
        articles.forEach(i -> {
            System.out.println(i.toString());
        });
    }
}
