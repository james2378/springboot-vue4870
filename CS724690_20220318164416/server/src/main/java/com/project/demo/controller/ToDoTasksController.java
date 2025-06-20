package com.project.demo.controller;

import com.project.demo.entity.ToDoTasks;
import com.project.demo.service.ToDoTasksService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 *待办任务：(ToDoTasks)表控制层
 *
 */
@RestController
@RequestMapping("/to_do_tasks")
public class ToDoTasksController extends BaseController<ToDoTasks,ToDoTasksService> {

    /**
     *待办任务对象
     */
    @Autowired
    public ToDoTasksController(ToDoTasksService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        return success(1);
    }

}
