package com.springMvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

@Controller
public class FileUploadController {

    @RequestMapping("/fileform")
    public String showFileForm(){

        return "fileUploaderForm";
    }


    @RequestMapping(value = "/uploadimage", method = RequestMethod.POST)
    public String FileUpload(@RequestParam("uploadedImage") CommonsMultipartFile file, HttpSession s){
        System.out.println("Go");
        System.out.println(file.getSize());
        System.out.println(file.getContentType());
        System.out.println(file.getName());
        System.out.println(file.getOriginalFilename());
        System.out.println(file.getStorageDescription());

//        String path = s.getServletContext().getRealPath("/")+ file.getOriginalFile();
        String path = s.getServletContext().getRealPath("/")+ "resources"+ File.separator+"image"+File.separator+file.getOriginalFilename();
        byte[] data = file.getBytes();
        System.out.println(path);

        try {
            FileOutputStream fos = new FileOutputStream(path);
            fos.write(data);
            fos.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }


        return "uploadSuccess";
    }
}
