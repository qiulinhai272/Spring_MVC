package com.itheima.service.impl;

import com.itheima.dao.impl.UploadDaoImpl;
import com.itheima.domain.User;
import com.itheima.service.UplaodService;
import com.itheima.utils.ReadExcel;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public class UploadServiceImpl implements UplaodService {


    @Override
    public String readExcelFile(MultipartFile file) {
        String result = "";
        //创建处理EXCEL的类
        ReadExcel readExcel = new ReadExcel();
        //解析excel，获取上传的事件单
        List<User> useList = readExcel.getExcelInfo(file);
        //至此已经将excel中的数据转换到list里面了,接下来就可以操作list,可以进行保存到数据库,或者其他操作,
        //和你具体业务有关,这里不做具体的示范
        System.out.println(useList);
        if (useList != null && !useList.isEmpty()) {
            result = "上传成功";
        } else {
            result = "上传失败";
        }
        return result;

    }

    public void setUploadDao(UploadDaoImpl uploadDao) {

    }
}
