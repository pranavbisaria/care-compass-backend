package com.carecompass.service;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
public interface FileServices {
    String uploadImage(String path, MultipartFile file) throws IOException;
}
