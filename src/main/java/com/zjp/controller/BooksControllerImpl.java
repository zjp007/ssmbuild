package com.zjp.controller;

import com.zjp.pojo.Books;
import com.zjp.service.BooksService;
import com.zjp.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RestController
public class BooksControllerImpl implements BooksController{

    @Autowired
    private BooksService booksService;

    @Override
    @RequestMapping(value = "/book/save",
            produces = "application/json;charset=UTF-8")
    public Books save(Books books) {
        return booksService.save(books);
    }

    @Override
    @RequestMapping(value = "/book/get",
            produces = "application/json;charset=UTF-8")
    public Books getById(@RequestParam("booksId") Integer booksId) {
        return booksService.getById(booksId);
    }

    @Override
    @RequestMapping(value = "/book/deletes",
            produces = "application/json;charset=UTF-8")
    public Integer deletes(HttpServletRequest request) {
        String ids = request.getParameter("ids");
        List<Integer> idList = PageUtils.toIntegerList(ids, ",");
        return booksService.deletes(idList);
    }

    @Override
    @RequestMapping(value = "/book/getList",
            produces = "application/json;charset=UTF-8")
    public List<Books> getByPageList(HttpServletRequest request) {
        Map<String, Object> map = PageUtils.getHttpMap(request);
        return booksService.getByPageList(map);
    }

    @Override
    @RequestMapping(value = "/book/getCount",
            produces = "application/json;charset=UTF-8")
    public Integer getCountByPageList(HttpServletRequest request) {
        Map<String, Object> map = PageUtils.getHttpMap(request);
        return booksService.getCountByPageList(map);
    }
}
