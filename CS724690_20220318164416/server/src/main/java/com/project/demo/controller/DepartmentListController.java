package com.project.demo.controller;

import com.project.demo.entity.DepartmentList;
import com.project.demo.service.DepartmentListService;
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
 *部门列表：(DepartmentList)表控制层
 *
 */
@RestController
@RequestMapping("/department_list")
public class DepartmentListController extends BaseController<DepartmentList,DepartmentListService> {

    /**
     *部门列表对象
     */
    @Autowired
    public DepartmentListController(DepartmentListService service) {
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
