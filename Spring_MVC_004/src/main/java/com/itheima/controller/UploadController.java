package com.itheima.controller;

import com.itheima.service.UplaodService;
import com.itheima.service.impl.UploadServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/file")
public class UploadController {


    @Autowired
    private UplaodService uplaodService;


    @RequestMapping(value="/upload",method = RequestMethod.POST)
    @ResponseBody
    public String  upload(@RequestParam(value="excel",required = false)MultipartFile file,HttpServletRequest request, HttpServletResponse response){
        System.out.println("controller......");
        String result = uplaodService.readExcelFile(file);
        return result;
    }


}


