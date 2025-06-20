package com.project.demo.controller;

import com.project.demo.entity.DepartmentHead;
import com.project.demo.service.DepartmentHeadService;
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
 *部门主管：(DepartmentHead)表控制层
 *
 */
@RestController
@RequestMapping("/department_head")
public class DepartmentHeadController extends BaseController<DepartmentHead,DepartmentHeadService> {

    /**
     *部门主管对象
     */
    @Autowired
    public DepartmentHeadController(DepartmentHeadService service) {
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
